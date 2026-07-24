package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.Scanner;
import java.io.*;

public class Main {

    private static final String API_KEY = "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";
    private static final String API_URL = "https://openrouter.ai/api/v1/chat/completions";

    static class AIService {

        public String getResponse(String userInput) {
            try {

                // JSON body (safe for all Java versions)
                String jsonBody =
                        "{"
                                + "\"model\":\"openai/gpt-4o-mini\","
                                + "\"messages\":[{"
                                + "\"role\":\"user\","
                                + "\"content\":\"" + escape(userInput) + "\""
                                + "}]"
                                + "}";

                URL url = new URL(API_URL);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("Authorization", "Bearer " + API_KEY);
                conn.setDoOutput(true);

                OutputStream os = conn.getOutputStream();
                os.write(jsonBody.getBytes());
                os.flush();
                os.close();

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(conn.getInputStream())
                );

                StringBuilder response = new StringBuilder();
                String line;

                while ((line = br.readLine()) != null) {
                    response.append(line);
                }

                br.close();

                return parse(response.toString());

            } catch (Exception e) {
                return "Error: " + e.getMessage();
            }
        }

        // Extract AI response safely
        private String parse(String body) {
            try {
                int startKey = body.indexOf("\"content\":\"");
                if (startKey == -1) return "No response from AI";

                int start = startKey + 11;
                int end = body.indexOf("\"", start);

                return body.substring(start, end)
                        .replace("\\n", "\n")
                        .replace("\\\"", "\"");

            } catch (Exception e) {
                return "Parse error";
            }
        }

        // escape user input
        private String escape(String text) {
            return text.replace("\\", "\\\\")
                    .replace("\"", "\\\"");
        }
    }

    static class ChatBot {
        AIService service = new AIService();

        void chat(String msg) {
            System.out.println("Bot: " + service.getResponse(msg));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("=== AI CHATBOT STARTED ===");
        System.out.println("Type 'exit' to stop\n");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            bot.chat(input);
        }

        sc.close();
        URL url = null;
        try {
            url = new URL("https://www.google.com");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Authorization", "Bearer" + API_KEY);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
{
idx -> val
"s1" : "www.google.com"
sdfsdf:sfsdfsd
sdfsdf:fsfsdfs
}
 */

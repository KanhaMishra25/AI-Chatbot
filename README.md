# 🤖 AI Chatbot using Java & OpenRouter API

A simple yet powerful **console-based AI chatbot** built in **Java** that communicates with a Large Language Model (LLM) using the **OpenRouter Chat Completions API**. The project demonstrates how to integrate AI capabilities into a Java application using only the standard Java libraries, without relying on third-party HTTP or JSON frameworks.

---

## 📌 Overview

This project enables users to interact with an AI assistant directly from the command line. It accepts user input, sends it to the OpenRouter API as a JSON request, receives the AI-generated response, and displays it in real time.

The application is designed to demonstrate fundamental concepts of **REST API integration**, **HTTP communication**, **JSON handling**, **object-oriented programming**, and **exception handling** in Java.

---

## ✨ Features

* 💬 Interactive console-based chatbot
* 🌐 Integration with the OpenRouter Chat Completion API
* 🚀 Real-time AI-generated responses
* 📡 HTTP POST requests using `HttpURLConnection`
* 📄 Manual JSON request construction
* 🔍 JSON response parsing
* 🔐 API authentication using Bearer Token
* 🛡️ Exception handling for network and input errors
* 🏗️ Clean object-oriented design
* 📚 Built entirely using Java Standard Library

---

## 🛠️ Tech Stack

* Java
* Object-Oriented Programming (OOP)
* REST API
* HTTP Protocol
* JSON
* HttpURLConnection
* Java I/O Streams
* OpenRouter API

---

## 📂 Project Structure

```text
AI-ChatBot/
│
├── src/
│   └── org/
│       └── example/
│           └── Main.java
│
└── README.md
```

---

## ⚙️ How It Works

```text
User Input
     │
     ▼
Console Application
     │
     ▼
Create JSON Request
     │
     ▼
HTTP POST Request
     │
     ▼
OpenRouter API
     │
     ▼
AI Model
     │
     ▼
JSON Response
     │
     ▼
Extract AI Response
     │
     ▼
Display Output
```

---

## 🚀 Getting Started

### Prerequisites

* Java 8 or later
* An OpenRouter API Key
* Internet connection

### Clone the Repository

```bash
git clone https://github.com/your-username/AI-ChatBot.git

cd AI-ChatBot
```

### Add Your API Key

Replace the following line in `Main.java`:

```java
private static final String API_KEY = "YOUR_API_KEY";
```

with your own OpenRouter API key.

---

### Compile

```bash
javac Main.java
```

### Run

```bash
java Main
```

---

## 💻 Example

```text
=== AI CHATBOT STARTED ===

Type 'exit' to stop

You: What is Artificial Intelligence?

Bot:
Artificial Intelligence (AI) is the simulation of human intelligence by machines...
```

---

## 📖 Concepts Demonstrated

* REST API Integration
* HTTP Networking
* JSON Serialization
* JSON Parsing
* Java I/O Streams
* Exception Handling
* Object-Oriented Programming
* Console Applications
* String Manipulation

---

## 🎯 Learning Outcomes

This project helped in understanding:

* How AI APIs can be integrated into Java applications.
* Sending authenticated HTTP requests.
* Constructing and processing JSON manually.
* Handling network communication using Java's built-in libraries.
* Designing modular applications using object-oriented principles.
* Managing exceptions in real-world applications.

---

## 🔮 Future Enhancements

* Maintain conversation history.
* Support streaming responses.
* GUI using JavaFX or Swing.
* Voice input and text-to-speech.
* Markdown response rendering.
* Improved JSON parsing using Jackson or Gson.
* Secure API key management using environment variables.
* Support multiple AI models.

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository.
2. Create a feature branch.

```bash
git checkout -b feature-name
```

3. Commit your changes.

```bash
git commit -m "Add new feature"
```

4. Push to your branch.

```bash
git push origin feature-name
```

5. Open a Pull Request.

---

## 📄 License

This project is released under the **MIT License**. You are free to use, modify, and distribute it in accordance with the licence terms.

---

## 👨‍💻 Author

**Kanha Mishra**

If you found this project useful, consider giving it a ⭐ on GitHub!

# 🔐 LoginApp - Java Web Application

A simple session-based login system built with Java Servlets, JSP, and Tomcat, demonstrating core Java EE (Jakarta EE) web development concepts.

## Tech Stack

- **Java 17**
- **Jakarta Servlet API 6.0.0**
- **Jakarta JSP API 3.1.0**
- **Apache Tomcat 10.1**
- **Maven** (build & dependency management)
- **HTML/CSS** (frontend)

## Project Structure
LoginApp/
├── src/main/java/com/example/
│   ├── LoginServlet.java      # Handles login authentication logic
│   ├── LogoutServlet.java     # Handles session invalidation/logout
│   └── User.java              # User model class
│
├── src/main/webapp/
│   ├── login.jsp              # Login form page
│   ├── welcome.jsp            # Post-login landing page
│   ├── error.jsp              # Error display page
│   ├── index.jsp              # Entry point / redirect page
│   ├── css/
│   │   └── style.css          # App styling
│   └── WEB-INF/
│       └── web.xml            # Deployment descriptor
│
├── pom.xml                    # Maven build configuration
└── README.md
## Features

- **Session-based authentication** using `HttpSession`
- **Servlet-based routing** with `@WebServlet` annotations
- **Route protection** — unauthenticated users are automatically redirected to the login page
- **Clean logout flow** with session invalidation
- **Error handling** with a dedicated error page

## How It Works

1. User submits credentials via `login.jsp`
2. `LoginServlet` validates the credentials and creates a session (`HttpSession`)
3. On success, user is redirected to `welcome.jsp`, which displays their session data
4. `LogoutServlet` invalidates the session and redirects back to login
5. Any protected page checks `session.getAttribute("username")` — if null, redirects to login

## Running Locally

### Prerequisites
- JDK 17+
- Apache Tomcat 10.x (required — Tomcat 9 and below use the older `javax.servlet` namespace and won't work with Jakarta EE dependencies)
- IntelliJ IDEA (or any Maven-compatible IDE)

### Steps
1. Clone the repo:https://github.com/luna27N/LoginApp.git
2. 2. Open in IntelliJ IDEA as a Maven project
3. Let Maven download dependencies (Reload/Sync Project)
4. Configure a Tomcat 10.x server:
   - Run/Debug Configurations → Add New → Tomcat Server → Local
   - Set Tomcat Home to your Tomcat 10 installation
5. Run the app
6. Visit:http://localhost:8080/LoginApp_war_exploded/welcome.jsp

3.## Future Improvements

- [ ] Add password hashing (currently plain-text for demo purposes)
- [ ] Connect to a real database (currently in-memory/hardcoded user check)
- [ ] Add form validation (client + server side)
- [ ] Add "Remember Me" functionality
- [ ] Add unit tests for servlets

## Author

**Naviya K** — B.Tech Information Technology 
Built as part of hands-on Java/Servlet practice for placement preparation.

GitHub: [@luna27N](https://github.com/luna27N)

## License

This project is for educational/portfolio purposes. 

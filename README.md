# Gadgets Shop

A Spring MVC web application for a gadgets e-commerce storefront. The app features a login page with an image carousel, user authentication via a DAO layer, and pages for browsing gadgets (consoles, laptops, phones). Includes About Us, Contact Us, and Sign Up views with Bootstrap styling.

## Tech Stack

- **Java 8**
- **Spring MVC 4.3.2**
- **JSP** with Bootstrap 3 (CDN)
- **Maven** (WAR packaging)
- **Servlet API 3.1**

## Project Structure

```
Gadgets/
├── pom.xml
├── src/main/java/
│   ├── com/gadgets/
│   │   └── LoginController.java      # Handles login and form submission
│   └── com/logindao/
│       └── LoginDAO.java             # Repository for credential validation
├── src/main/webapp/WEB-INF/
│   ├── dispatcher-servlet.xml        # Spring DispatcherServlet config
│   └── views/
│       ├── web.xml                   # Deployment descriptor
│       ├── Login.jsp                 # Login page with carousel
│       ├── index.jsp                 # Home page with gadget images
│       ├── SignUp.jsp                # User registration form
│       ├── AboutUs.jsp
│       ├── ContactUs.jsp
│       ├── Common-Header.jsp         # Shared navbar header
│       └── Common-Footer.jsp         # Shared footer
└── WebContent/META-INF/MANIFEST.MF
```

## Build & Deploy

```bash
cd Gadgets
mvn clean package
```

Deploy the generated `target/springmvc.war` to a servlet container such as Apache Tomcat 8+.

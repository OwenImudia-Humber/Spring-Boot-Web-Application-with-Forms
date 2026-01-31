# Spring Boot Registration Form

This project is a simple Spring Boot web application with a registration form for courses. It does not have any database to store the input but demonstrates **Java MVC with Thymeleaf** and includes basic **CSS stylings**.


**src/**
├─ main/
│ ├─ java/com/example/Assignment1/
│ │ ├─ Assignment1Application.java # Spring Boot entry point
│ │ ├─ User.java # Model class for form data
│ │ └─ Controller/RegisterController.java # Controller handling form GET/POST
│ ├─ resources/
│ │ ├─ templates/
│ │ │ ├─ register.html # Registration form page
│ │ │ └─ confirmation.html # Confirmation page after submission
│ │ └─ static/
│ │ └─ style.css # CSS styling for the form

## How to Run 
1. Make sure you have **Java 17** as that was used and also **Maven** installed
2. Clone the repo:  
```bash
git clone https://github.com/yourusername/spring-registration-form.git
cd spring-registration-form
mvn spring-boot: run

open your browser at http://localhost:8080/register to see the form

# GestionContacts

**GestionContacts** is a simple Java EE application designed to manage a list of contacts. This project demonstrates the structure of a Java EE application using **Servlets** and **JSP**.

## Features

- Add a contact (name and email) through a form.
- Display a list of added contacts.
- Store contact data in the session for persistence during the user's session.

## Project Structure

The project follows this structure:
- **src/main/java**:
  - `Contact.java`: Model representing contact information.
  - `ContactServlet.java`: Controller for handling requests related to adding and displaying contacts.
- **src/main/webapp**:
  - `index.html`: Form for adding a contact.
  - `contactList.jsp`: View for displaying the list of contacts.
- **WEB-INF**:
  - `web.xml`: Deployment descriptor configuration file.

## Technologies Used

- **Java EE**: For Servlets and JSP.
- **Apache Tomcat**: Application server.
- **Eclipse**: IDE for development.
- **HTML/CSS**: For the basic frontend.

## Installation and Execution

### Prerequisites
- Java 8 or higher.
- Apache Tomcat (version 9 or higher).
- Eclipse IDE with the Java EE plugin installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/GestionContacts.git

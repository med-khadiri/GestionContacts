<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Com.Example.GestionContacts.Contact" %>
<%
    List<Contact> contacts = (List<Contact>) session.getAttribute("contacts");
    if (contacts == null) {
        contacts = new ArrayList<>();
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Liste des Contacts</title>
</head>
<body>
    <h2>Liste des Contacts</h2>
    <table border="1">
        <tr>
            <th>Nom</th>
            <th>Email</th>
        </tr>
        <%
            for (Contact contact : contacts) {
        %>
        <tr>
            <td><%= contact.getName() %></td>
            <td><%= contact.getEmail() %></td>
        </tr>
        <%
            }
        %>
    </table>
    <br>
    <a href="index.html">Ajouter un nouveau contact</a>
</body>
</html>

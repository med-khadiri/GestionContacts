package Com.Example.GestionContacts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddContact")
public class ContactServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @SuppressWarnings("unchecked")
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Créer un nouvel objet Contact
        Contact newContact = new Contact(name, email);

        // Récupérer ou créer la liste de contacts dans la session
        HttpSession session = request.getSession();
        List<Contact> contacts = (List<Contact>) session.getAttribute("contacts");
        if (contacts == null) {
            contacts = new ArrayList<>();
            session.setAttribute("contacts", contacts);
        }

        // Ajouter le contact à la liste
        contacts.add(newContact);

        // Rediriger vers la page de liste des contacts
        response.sendRedirect("contactList.jsp");
    }
}
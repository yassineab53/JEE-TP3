package net.yassine.tp3;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletTraitement")
public class ServletTraitement extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>\n" +
                "        <style>\n" +
                "                body {\n" +
                "            background-color: linen;\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            text-align: center;\n" +
                "            color: maroon;\n" +
                "            margin-left: 40px;\n" +
                "        }\n" +
                "        </style>");


        out.println("<h1>" + "Bonjour g" + nom + " " + prenom + "</h1>");
        out.println("</body></html>");

        out.close();
    }
}

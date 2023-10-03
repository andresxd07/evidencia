import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class CursoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Formulario de Inscripción</title></head><body>");
        out.println("<h1>¡Bienvenido al Formulario de Inscripción!</h1>");
        out.println("<p>Complete el formulario para inscribirse en un curso de programación.</p>");
        out.println("<form action='/ProyectoModulos/inscripcion' method='post'>");
        out.println("Nombre: <input type='text' name='nombre' required><br>");
        out.println("Curso: <select name='curso'><option value='java'>Java</option><option value='python'>Python</option><option value='javascript'>JavaScript</option></select><br>");
        out.println("<input type='submit' value='Inscribirse'>");
        out.println("</form></body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String curso = request.getParameter("curso");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>¡Inscripción Exitosa!</title></head><body>");
        out.println("<h1>¡Inscripción Exitosa!</h1>");
        out.println("<p>Nombre: " + nombre + "</p>");
        out.println("<p>Curso: " + curso + "</p>");
        out.println("</body></html>");
    }
}


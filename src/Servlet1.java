import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Игорь on 10.07.2017.
 */
@WebServlet(name = "Servlet1")
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='utf-8'>");
        out.println("<link rel='stylesheet' href='first.css'>");
        out.println("<title>First</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='classHead'>");
        out.println("<h1>555Моя фича для примера</h1>");
        out.println("</div>");
       // out.println("<div class='classPicture'>");
        out.println("<img src='java.png'>");
        //out.println("</div>");
        out.println("<div class='classText'>");
        out.println("Эта фигня показыват, что мои мозги еще не полностью превратились в говно");
        out.println("</div>");
        out.println("</body>");
        out.println("<html>");

       /* Enumeration en = request.getParameterNames();

        while (en.hasMoreElements()){
            String name = en.nextElement().toString();
            String val = request.getParameter(name);
            out.println("Parametr= " + name + " value= " + val);
        }*/
        out.close();
    }
    }


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


public class FS extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html; charset=utf-8");
        //resp.setContentType("image/png");

        PrintWriter out = resp.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<link rel='stylesheet' href='first.css'>");
            out.println("<title>First</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='classHead'>");
            out.println("<h1>Моя фича для примера</h1>");
            out.println("</div>");
            out.println("<div class='classPicture'>");
            out.println("<img src='java.png'>");
            out.println("</div>");
            out.println("<div class='classText'>");
            out.println("Эта фигня показыват, что мои мозги еще не полностью превратились в говно");
            out.println("</div>");
            out.println("</body>");
            out.println("<html>");

        Enumeration en = req.getParameterNames();

        while (en.hasMoreElements()){
            String name = en.nextElement().toString();
            String val = req.getParameter(name);
            out.println("<h2> Parametr= " + name + " value= " + val + "</h2>");
        }
    }
}

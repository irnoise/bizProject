package ne.jp.noise.bizProject.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Noise on 2015/11/18.
 *
 */
@WebServlet(name = "SampleServlet", urlPatterns = "/sampleServlet")
public class SampleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("Shift_JIS");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("Shift_JIS");

        String name = request.getParameter("name");
        String message = "Hello," + name + " !!";

        /* XMLテキストの出力 */
        response.getWriter().println("<?xml version=\"1.0\" encoding=\"Shift_JIS\"?>");
        response.getWriter().println("<APP-INFO>");
        response.getWriter().println("<SERVLET_NAME>SampleServlet</SERVLET_NAME>");
        response.getWriter().println("<MESSAGE>" + message + "</MESSAGE>");
        response.getWriter().println("</APP-INFO>");
    }
}

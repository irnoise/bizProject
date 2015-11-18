package ne.jp.noise.bizProject.servlet;

import com.sun.deploy.xml.XMLParser;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by mgt on 2015/11/18.
 */
@WebServlet(name = "SampleServlet", urlPatterns = "/sampleServlet")
public class SampleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("SampleServlet#doPost()");

        request.setCharacterEncoding("UTF-8");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        System.out.println("SampleServlet#doGet()");

        String name = request.getParameter("name");
        System.out.println("name : " + name);

        String message = "Hello," + name + " !!";
        System.out.println("message : " + message);

        response.getWriter().println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        response.getWriter().println("<APP-INFO>");
        response.getWriter().println("<SERVLET_NAME>SampleServlet</SERVLET_NAME>");
        response.getWriter().println("<MESSAGE>" + message + "</MESSAGE>");
        response.getWriter().print("</APP-INFO>");

    }
}

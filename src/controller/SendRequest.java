package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SendRequest")
public class SendRequest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpURLConnectionExample ex = new HttpURLConnectionExample();
        PrintWriter out = resp.getWriter();

        try {
            String result = ex.sendGet();
            out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

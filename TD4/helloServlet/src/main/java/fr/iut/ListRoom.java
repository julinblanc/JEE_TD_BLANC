package fr.iut;

import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "list", urlPatterns = {"/list"})
public class ListRoom extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Room r1 = new Room("r1", 0, 10);
        Room r2 = new Room("r2", 0, 20);
        Room r3 = new Room("r3333", 0, 30);

        Template freemarkerTemplate = null;
        freemarker.template.Configuration freemarkerConfiguration = new freemarker.template.Configuration();
        freemarkerConfiguration.setClassForTemplateLoading(this.getClass(), "/");
        freemarkerConfiguration.setObjectWrapper(new DefaultObjectWrapper());
        try {
            freemarkerTemplate = freemarkerConfiguration.getTemplate("templates/listRoom.ftl");
        } catch (IOException e) {
            System.out.println("Unable to process request, error during freemarker template retrieval.");
        }
        Map<String, Object> root = new HashMap<String, Object>();
        ArrayList<Room> fakeRooms = new ArrayList<Room>();
        fakeRooms.add(r1); fakeRooms.add(r2); fakeRooms.add(r3);
        // navigation data and links
        root.put("title", "list fake");
        root.put("h2", "list of FakeRooms");
        root.put("fakeRooms", fakeRooms);
        PrintWriter out = response.getWriter();
        assert freemarkerTemplate != null;
        try {
            freemarkerTemplate.process(root, out);
            out.close();
        }
        catch (TemplateException e) {
            e.printStackTrace();
        }
        // set mime type
        response.setContentType("text/html");
    }
}

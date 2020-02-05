package web.Servlet;

import Service.RoomsService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/RoomsServlet")
public class RoomsServlet extends HttpServlet {
     RoomsService roomsService=new RoomsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("application/json;charset=utf-8");
          List<String> list= roomsService.findTypes();
        Gson gson=new Gson();
        PrintWriter out=response.getWriter();
        out.print(gson.toJson(list));
        out.close();
    }
}

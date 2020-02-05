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

@WebServlet("/RoomIdServlet")
public class RoomIdServlet extends HttpServlet {
    private RoomsService roomsService=new RoomsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        String roomtype=request.getParameter("roomtype");
        List<String>list= roomsService.findstate(roomtype);
        Gson gson=new Gson();
        PrintWriter printWriter=response.getWriter();
        printWriter.print(gson.toJson(list));
        printWriter.close();
    }
}

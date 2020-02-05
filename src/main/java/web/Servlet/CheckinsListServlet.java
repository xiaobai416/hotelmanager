package web.Servlet;

import Service.CheckinsService;
import com.google.gson.Gson;
import domain.Checkins;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/checkinsList")
public class CheckinsListServlet extends HttpServlet {
    private CheckinsService checkinsService=new CheckinsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("application/json;charset=utf-8");
     request.setCharacterEncoding("utf-8");
     List<Checkins>list=checkinsService.checkinsList();
        Gson gson=new Gson();
        PrintWriter printWriter=response.getWriter();
        printWriter.print(gson.toJson(list));
        printWriter.close();
    }
}

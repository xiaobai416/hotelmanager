package web.Servlet;

import Service.CheckinsService;
import com.google.gson.JsonObject;
import domain.Checkins;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

@WebServlet( "/checkins")
public class CheckinsServlet extends HttpServlet {
   private CheckinsService checkinsService=new CheckinsService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("application/json;charset=utf-8");
    request.setCharacterEncoding("utf-8");
        Checkins checkins=new Checkins();
        try {
            BeanUtils.populate(checkins, request.getParameterMap());
            int rows=checkinsService.addCheckins(checkins);
            JsonObject jsonObject=new JsonObject();
            if(rows>0){
                jsonObject.addProperty("suc",true);
            }
            PrintWriter out=response.getWriter();
            out.print(jsonObject);
            out.close();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

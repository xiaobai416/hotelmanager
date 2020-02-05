import Service.CheckinsService;
import domain.Checkins;
import org.junit.Test;

import java.util.List;

public class CheckinsListTest {
    @Test
    public  void list(){
        CheckinsService checkinsService=new CheckinsService();
        List<Checkins> list=checkinsService.checkinsList();
        list.forEach(checkins -> {
            System.out.println(checkins.getCheckintime()+" "+checkins.getNum()+" "+checkins.getPrice()+" "+checkins.getRoomid());
        });
    }
}

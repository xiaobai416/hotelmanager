package mapper;

import domain.Checkins;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CheckinsMapper {
    @Insert("insert into checkins values (null,#{name},#{gender},#{cardtype},#{cardno},#{roomid},#{num},null,1,now(),null)")
    int addCheckins(Checkins checkins);
    @Select("select c.roomid,name,checkintime,num,price,cstate From checkins c left join rooms r on c.roomid=r.roomid where cstate=1 ")
    List<Checkins>CheckinsList();
}

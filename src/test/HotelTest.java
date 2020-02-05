import mapper.RoomsMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import util.SqlSessionUtil;

public class HotelTest {

    @Test
    public void testFind(){
        SqlSession sqlSession= SqlSessionUtil.getSqlSession();
        RoomsMapper roomsMapper=sqlSession.getMapper(RoomsMapper.class);
        roomsMapper.findstate("双人间").forEach(ro ->System.out.println(ro));
    }

}

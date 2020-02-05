package Service;

import mapper.RoomsMapper;
import org.apache.ibatis.session.SqlSession;
import util.SqlSessionUtil;

import java.util.List;

public class RoomsService {
    private RoomsMapper roomsMapper;
    private SqlSession sqlSession;

    private  void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        roomsMapper=sqlSession.getMapper(RoomsMapper.class);
    }

    public List<String> findTypes(){
       init();
       List<String > list=roomsMapper.findTyes();
       SqlSessionUtil.close(sqlSession);
       return list;
    }
    public List<String> findstate(String roomtype){
        init();
        List<String>list=roomsMapper.findstate(roomtype);
        SqlSessionUtil.close(sqlSession);
        return list;
    }

}

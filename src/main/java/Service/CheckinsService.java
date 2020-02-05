package Service;

import domain.Checkins;
import mapper.CheckinsMapper;
import org.apache.ibatis.session.SqlSession;
import util.SqlSessionUtil;

import java.util.List;

public class CheckinsService {
    private SqlSession sqlSession;
    private CheckinsMapper checkinsMapper;
    private  void init(){
        sqlSession= SqlSessionUtil.getSqlSession();
        checkinsMapper=sqlSession.getMapper(CheckinsMapper.class);
    }
    public int addCheckins(Checkins checkins){
        init();
        int rowa=checkinsMapper.addCheckins(checkins);
        sqlSession.commit();
        SqlSessionUtil.close(sqlSession);
        return rowa;
    }
    public List<Checkins> checkinsList(){
        init();
        List<Checkins>list= checkinsMapper.CheckinsList();
        SqlSessionUtil.close(sqlSession);
        return list;
    }
}

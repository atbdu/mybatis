import mapper.DayMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Day;
import utils.MybatisUtils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

/**
 *
 */
public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        DayMapper mapper = sqlSession.getMapper(DayMapper.class);
        Day day = mapper.getDay();
        System.out.println(day);
        Day day1 = new Day();
        day1.setDay(new Date(System.currentTimeMillis()));
        day1.setCode(1);
        int i = mapper.updateDay(day1);
        System.out.println(i);
        //提交
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}

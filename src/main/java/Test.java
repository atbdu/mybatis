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
//        //查询
//        Day day = mapper.getDay();
//        System.out.println(day);
//        //修改
//        Day day1 = new Day();
//        day1.setDay(new Date(System.currentTimeMillis()));
//        day1.setCode(1);
//        int i = mapper.updateDay(day1);
//        System.out.println(i);
        //增加
//        Day day2 = new Day();
//        day2.setCode(3);
//        day2.setDay(new Date(System.currentTimeMillis()));
//        int m = mapper.insertDay(day2);
//        System.out.println(m);
        //删除
        mapper.deleteDay(3);
        //提交
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        mapper.deleteDay(3);
        //map传多个参数
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("day_day","2021-05-20");
//        map.put("day_code","1");
//        int i = mapper.updateDay2(map);
//        System.out.println(i);
        //模糊查询
        List<Day> days = mapper.getDayByDay(1);
        for (Day day:days) {
            System.out.println(day);
        }
        //提交
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}

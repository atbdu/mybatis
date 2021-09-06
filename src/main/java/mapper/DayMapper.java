package mapper;

import pojo.Day;

import java.util.List;
import java.util.Map;

public interface DayMapper {
    public Day getDay();
    public int updateDay(Day day);
    public void deleteDay(int code);
    public int insertDay(Day day);
    public int updateDay2(Map<String,String> map);
    //模糊查询
    public List<Day> getDayByDay(Integer code);
}


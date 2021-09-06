package mapper;

import pojo.Day;

public interface DayMapper {
    public Day getDay();
    public int updateDay(Day day);
    public void deleteDay(int code);
    public int insertDay(Day day);

}


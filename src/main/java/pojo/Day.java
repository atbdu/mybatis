package pojo;

import java.sql.Date;

public class Day {
    private int code;
    private Date day;

    public Day() {
    }

    public Day(int code, Date day) {
        this.code = code;
        this.day = day;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Day{" +
                "code=" + code +
                ", day=" + day +
                '}';
    }
}

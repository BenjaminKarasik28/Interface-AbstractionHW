package GA.homework.InheritenceAndAbstraction;

import java.util.Date;

public abstract class Lunch {

    public Lunch(Date date, int time) {
        this.date = date;
        this.time = time;
    }
    public Lunch(){};

    protected Date date;
    protected int time;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public abstract String menu();
}

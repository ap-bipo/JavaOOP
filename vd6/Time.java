package models.vd6;

public class Time {
    protected int hour;
    protected int minute;
    protected int second;
    public Time()
    {
        hour=0;
        minute=0;
        second=0;
    }
    public Time(int hour, int minute, int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    @Override
    public String toString() {
        return "hour: "+hour+" minute: "+minute+" second: "+second;

    }
    protected int ConvSecond()
    {
        return this.hour*3600+this.minute*60+this.second;
       
    }
    protected void ConvTime(int second)
    {
        this.hour=second/3600;
        second=second%3600;
        this.minute=second/60;
        second=second%60;
        this.second=second;
    }
    public void nextSecond()
    {
        int Tmp=ConvSecond();
        Tmp++;
        ConvTime(Tmp);
    }
    
    public void nextMinute()
    {
        int Tmp=ConvSecond();
        Tmp+=60;
        ConvTime(Tmp);
    }
    public void nextHour()
    {
        int Tmp=ConvSecond();
        Tmp+=60*60;
        ConvTime(Tmp);
    }

}

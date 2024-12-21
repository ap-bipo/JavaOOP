package models.vd6;
public class DateTime extends Time {
   protected int day;
   protected int month;
   protected int year;
   public DateTime()
   {
    super();
    day=0;
    month=0;
    year=0;
   }
   public DateTime(int second, int minute, int hour,int day,int month,int year)
   {
    super(second,minute,hour);
    this.day=day;
    this.month=month;
    this.year=year;
   }
   public int getDay() {
       return day;
   }
   public int getMonth() {
       return month;
   }
   public int getYear() {
       return year;
   }
   @Override
   public String toString() {
       return super.toString()+" day: "+day+" month: "+month+" year: "+year;
    }
    @Override
    public void nextHour()
    {
        int Tmp=ConvSecond();
        Tmp+=60*60;
        ConvTime(Tmp);
        if(super.hour==23)
        {
            super.hour=0;
            day++;
        }
        
    }
    protected int ConvDay()
    {
        return year*365+month*30+day;
    }
    protected void ConvDate(int day)
    {
        year=day/365;
        day%=365;
        month=day/30;
        day%=30;
        this.day=day;
    }
    public void nextDay()
    {
        int Tmp=ConvDay();
        Tmp++;
        ConvDate(Tmp);
    }
    public void nextMonth()
    {
        int Tmp=ConvDay();
        Tmp+=30;
        ConvDate(Tmp);
    }
    public void nextYear()
    {
        int Tmp=ConvDay();
        Tmp+=365;
        ConvDate(Tmp);
    }
}

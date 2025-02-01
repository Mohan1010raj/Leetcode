import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date=LocalDate.of(year,month,day);
        DayOfWeek wd= date.getDayOfWeek();
        String str=wd.name().charAt(0)+wd.name().substring(1).toLowerCase();
        return str;      
    }
}
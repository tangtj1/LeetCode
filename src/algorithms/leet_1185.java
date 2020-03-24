package algorithms;

import java.util.Calendar;

public class leet_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] data = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int c = year / 100;
        year = year % 100;
        int w = (c / 4 - 2 * c + year + year / 4 + 13 * (month + 1) / 5 + day - 1) % 7;
        return data[(w + 7) % 7];
    }
}

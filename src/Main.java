import java.util.Arrays;

public class Main {
    public enum Lunile {IANUARIE, FEBRUARIE, MARTIE, APRILIE, MAI, IUNIE}

    public static void main(String[] args) {

        //       .values() возвращает массив из всех хранящихся в Enum значений:
        System.out.println(Arrays.toString(Lunile.values()));


        for (Lunile i : Lunile.values()) {
            System.out.println(i);
        }
        for (Lunile i : Lunile.values()) {
            System.out.println(i.name());
        }

        for (Weekday i : Weekday.values()) {
            System.out.println(i);
        }
        for (Weekday i : Weekday.values()) {
            System.out.println(i.name());
        }

        Boolean b;
        b = Weekday.FRIDAY.isWeekDay();
        System.out.println(b);
        b = Weekday.MONDAY.isHoliday();
        System.out.println(b);
        b = Weekday.SUNDAY.isHoliday();
        System.out.println(b);
        System.out.println(Weekday.MONDAY.isWeekDay());

    }
}



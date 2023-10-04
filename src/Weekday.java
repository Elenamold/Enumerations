public enum Weekday {


    SUNDAY("Воскресенье"),
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");
    final String descr;

    Weekday(String descr) {
        this.descr = descr;
    }


    public Boolean isWeekDay()  {

        return (this != Weekday.SUNDAY) && (this != Weekday.SATURDAY);

    }
    public Boolean isHoliday() {

        return  (this == Weekday.SUNDAY) || (this == Weekday.SATURDAY) ;
    }

    @Override
    public String toString() {
        return "WeekDay{" +
                "title='" + descr + '\'' +
                '}';
    }
}



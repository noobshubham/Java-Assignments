public class EnumDays {
    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day);
        }
    }
}

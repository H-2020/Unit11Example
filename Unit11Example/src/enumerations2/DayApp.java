package enumerations2;

public class DayApp {

    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day.name());

        }


        for (Day day : Day.values()) {
            if (day.isWorkDay()) {
                System.out.println(day);
            }
        }

    }
}

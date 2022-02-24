package java12.switch_;

public class SwitchExample {

    public static void main(String[] args) {
        String dayOfWeek = "MONDAY";
        switch (dayOfWeek) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("Working Day");
            case "SATURDAY", "SUNDAY" -> System.out.println("Day Off");
        }
    }

}

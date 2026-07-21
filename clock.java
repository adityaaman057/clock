import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class clock {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime.format(formatter));
    }
}

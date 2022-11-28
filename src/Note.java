import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Note {
    String text;
    String time;

    public String getTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

}

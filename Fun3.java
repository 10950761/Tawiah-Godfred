
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Fun3 {
    public static void main(String[] args) {
LocalDateTime dateTime = LocalDateTime.now();
DateTimeFormatter dateTime1 = DateTimeFormatter.ofPattern("E MM dd yyyy HH:mm:ss");
String dateTime2 = dateTime.format(dateTime1);
     System.out.println(dateTime2);
    
}
}
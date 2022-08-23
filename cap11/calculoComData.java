package cap11;

import java.time.Duration;
import java.time.LocalDateTime;

public class calculoComData {
    public static void main (String[] args){

        LocalDateTime d1 = LocalDateTime.now(); 
        LocalDateTime d2 = LocalDateTime.of(2000, 10, 18, 12, 00, 51);

        Duration t1 = Duration.between(d1, d2);
        
        LocalDateTime result = LocalDateTime.
    


        System.out.println(t1);

    }
}

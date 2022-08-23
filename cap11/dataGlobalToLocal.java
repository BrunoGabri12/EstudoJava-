package cap11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class dataGlobalToLocal {
    public static void main (String[] args) {



        LocalDateTime r1  =LocalDateTime.now(ZoneId.of("GMT+2"));
        
        System.out.println(r1);
    
    
    }
}

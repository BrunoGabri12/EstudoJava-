package cap11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_instanciacao {
    
    public static void main(String[] args){
         
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now(); 
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T12:40:50.45673");
        //Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        
        LocalDate d08 = LocalDate.parse("20/10/2022 12:30", fmt2);
       
        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d08);
        



    }  

}

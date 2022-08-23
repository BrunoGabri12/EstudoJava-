package cap11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class dataHora_formatação {
    //*transforamação de data e hora em um formato customizado */
    public static void main(String[] args){
         
        LocalDateTime d02 = LocalDateTime.now(); 
        Instant d03 = Instant.now();
     
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Z"));
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.of("GMT-3"));      
        System.out.println("d02  = " + d02.format(dtf1));
        System.out.println("d03 = " + dtf1.format(d02));
        System.out.println("d06= "+ dtf2.format(d03));
        System.out.println("d07= "+ dtf4.format(d03));

    }  



}

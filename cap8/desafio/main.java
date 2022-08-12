package cap8.desafio;

import java.util.Locale;
import java.util.Scanner;

public class main {
    

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("What is the doller price ?");
        double dollar = sc.nextDouble(); 

        System.out.println("How many dollars will be bought? ");
        int amountBoughtDollar = sc.nextInt();

        double valueInReals = CurrencyConverter.ToDollar(amountBoughtDollar,dollar);

        System.out.printf("Amouiint to be pai in reais = %.2f", valueInReals );
        

        sc.close();
    }

}

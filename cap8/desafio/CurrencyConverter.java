package cap8.desafio;

public class CurrencyConverter {
    
    private static final double IOF = 0.06;


    public static double ToDollar(int amountBoughtDollar, double dollarPrice ){
        return amountBoughtDollar * (dollarPrice * (1 +IOF)) ;
    }

}

package cap8.ex3;

public class circle {
    
    public static final double Pi = 3.1415; 

    public static double circunferencia(float raio){
        
        return (2* Pi * raio);

    }

    public  static double volume(float raio){
        
        return 4/3 * Pi * Math.pow(raio,3); 
    }

   
}

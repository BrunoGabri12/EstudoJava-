package cap8;


public class ex1 {

    public static void main () { 
      
        
        
        triangulo triangulo1 = new triangulo();
        triangulo triangulo2 = new triangulo();

        triangulo1.setMetrics(0, 4, 5);
        triangulo2.setMetrics(0,3,4);


        triangulo1.areaCalculator();
        triangulo2.areaCalculator();

        System.out.println(triangulo1.area);
        System.out.println(triangulo2.area);

    }

}


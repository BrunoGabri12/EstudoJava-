package cap10.exer1;

import cap8.ex3.circle;

public class boxing {
    Object[] vetorObj;

    boxing(){
        vetorObj = new Object[3]; 

        product p1 = new product("name", 10);
        circle c1 = new circle();
        String stg = new String("Teste");

        vetorObj[0] = p1; 
        vetorObj[1] = c1; 
        vetorObj[2] = stg;


    }

    void viewBox(){
        for(int i = 0 ; i< vetorObj.length ; i++){
            System.out.println(vetorObj);
        }
    }



    
}

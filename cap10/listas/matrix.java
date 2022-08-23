package cap10.listas;
import java.util.Scanner;

public class matrix {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int[][] mat = new int[n][m];    //todos elementos por padrão inicializados com 0 


        for(int i = 0 ; i<mat.length ; i++){
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();               
            }
        }

        int element = sc.nextInt(); 

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j]== element){ 
             
                    System.out.println("Position = " + i + " " + j);
                    
                    if(j-1 > 0)    System.out.println("Lefth = " + mat[i][j-1]);
                    if(j+1 < mat[0].length)    System.out.println("Rigth = " + mat[i][j+1]);
                    if(i-1 > 0)    System.out.println("Top = " + mat[i-1][j]);
                    if(i+1  < mat.length)    System.out.println("Dowm = " + mat[i+1][j]);
                }
            }
        }


        
        sc.close();

    }


}

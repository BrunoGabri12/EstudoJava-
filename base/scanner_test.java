import java.util.Scanner;

import java.util.Scanner;

public class scanner_test {
    
    public static void main(){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int result = min(a,b,c);

        System.out.println(result);
        sc.close();
    }


    public static int min (int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if (b<a && b<c){
            return b;
        }
        else if (c<a && c<b){
            return c;
        }

        return -1;
    }
}

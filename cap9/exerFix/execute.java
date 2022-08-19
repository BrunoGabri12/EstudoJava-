package cap9.exerFix;

import java.util.Scanner;

public class execute {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        String user;
        String cpf; 
        String contaNumber; 
        int initialDeposit; 

      

        System.out.println("Enter account holder = ");
        user = sc.nextLine();
        System.out.println("Enter CPF holder= ");
        cpf = sc.nextLine(); 
        System.out.println("Enter account number= ");
        contaNumber = sc.nextLine(); 
        System.out.println("Enter initial deposit value= ");
        initialDeposit = sc.nextInt();

        registration user1 = new registration(user,cpf, contaNumber, initialDeposit);
        
        
        System.out.println( 
            user1.toString());
            user1.listWithdrawss();
            
        sc.close();
    }
}

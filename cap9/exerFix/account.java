package cap9.exerFix;

import java.util.ArrayList;
import java.util.Date;


public class account {
    int value;
    
    ArrayList <String> Deposits = new ArrayList<String>(); 
    ArrayList <String> Withdraws = new ArrayList<String>(); 

    account(int valueDeposit){
        this.value = valueDeposit;
        if(valueDeposit > 0 )
           addDateDeposit(valueDeposit);
    }

    public void depositValue(int value){
            this.value+= value;     
           addDateDeposit(value);
    }

    public void withdrawValue(int value){
        if(this.value - value < 0){
            System.out.println("Saldo insuficiente");
        }   

        else{
            this.value -= value; 
            addWithdraw(value);
        }
    
    }
    
    private void addDateDeposit(int valuedeposit){
        Date deposit = new Date();
        int value = valuedeposit;
        
        String DeposiInsert = deposit.toString() + value; 

        Deposits.add(DeposiInsert); 

    }


    private void addWithdraw(int valueWithdraw){
        Date deposit = new Date();
        int value = valueWithdraw;
        
        String WithdrawInsert = deposit.toString() + value; 

        this.Withdraws.add(WithdrawInsert); 

    }

    public String listRelatoryDeposit(){
        return Deposits.toString();
    }

    public String listRelatoryWithdrawn(){
        return Withdraws.toString();
    }
    
    public int getValue(){
        return value; 
    }
    


}

package cap9.exerFix;

public class registration {
 
    private String titular; 
    private String CPF; 
    private String contaNumber; 
    private account accountUser; 

    registration(String titular,String CPF, String contaNumber, int initialDeposit ){
        this.titular = titular; 
        this.CPF = CPF; 
        this.contaNumber = contaNumber; 

        this.accountUser = new account(initialDeposit);
    }

    public void insertValue(int value){
        accountUser.depositValue(value);
        
    }

    public void removeValue(int value){
        accountUser.withdrawValue(value);
    }

    public void listDeposits(){
        System.out.println(accountUser.listRelatoryDeposit());
    }


    public void listWithdrawss(){
        System.out.println(accountUser.listRelatoryWithdrawn());
    }

    public String toString(){
        
        return titular + "\t"
        + CPF + "\t"  
        + contaNumber + "\t" 
        + accountUser.getValue() ; 
    
    }


}

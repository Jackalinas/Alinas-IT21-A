package AbstractionDemo;
abstract class Payment {
    
    abstract void processPayment();
    
    void showMessage(){
        System.out.println("welcome to the online payment system");
    }
}
class CashPayment extends Payment{
  
    @Override
    void processPayment(){
        System.out.println("payment completed using cash");
    }
}
class CardPayment extends Payment{
    @Override
    void processPayment(){
        System.out.println("Payment completed using card");
    }
}

public class AbstractionDemo {
    
   public static void main(String[]args){
    
       Payment payment1 = new CashPayment();
       Payment payment2 = new CashPayment();
       
       payment1.showMessage();
       payment2.processPayment();
       
       payment2.showMessage();
       payment2.processPayment();
       
       
       
   }
    
}

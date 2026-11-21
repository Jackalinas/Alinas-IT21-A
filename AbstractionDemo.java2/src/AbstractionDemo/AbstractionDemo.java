package AbstractionDemo;
abstract class Payment {
    
    abstract void processPayment();
    
    void showMessage(){
        System.out.println("welcome to the online payment system");
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
    
       
       
       
   }    
    
}

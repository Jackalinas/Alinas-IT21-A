package polymorphismdemo.java;
class Vehicle {
    void move (){
        System.out.println("the vehicle is moving");
    }
}
class car extends Vehicle{
    @Override
    void move(){
        System.out.println("the car is driving on the road");
    }
}
class motorcycle extends Vehicle{
    @Override
    void move(){
        System.out.println("the motor is riding on the road"); 
    }
}

public class PolymorphismDemoJava {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle1 = new car();
        Vehicle vehicle2 = new motorcycle();
        
        System.out.println("vihicle Demostration");
        
        vehicle1.move();
        vehicle2.move();
    }
    
}

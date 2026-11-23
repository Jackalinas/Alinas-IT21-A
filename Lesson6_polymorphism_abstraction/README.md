Lesson 6: Polymorphism and Abstraction

This activity demonstrates two important Object-Oriented Programming (OOP) concepts: Polymorphism and Abstraction.
Both concepts are implemented using Java through real-world scenarios.

1. Polymorphism
PolymorphismDemoJava.java – This program demonstrates polymorphism through a simple vehicle system. It has one parent class named Vehicle and two child classes named Car and Motorcycle.

Both child classes inherit from the parent class using the extends keyword.

Polymorphism is demonstrated through method overriding. The parent class contains a method called move(), which is overridden by both child classes.

The Car class provides its own implementation of the move() method by displaying that the car is driving on the road, while the Motorcycle class provides its own implementation by displaying that the motorcycle is riding on the road.

In the main method, parent-class references named vehicle1 and vehicle2 are used to hold different child-class objects. Although both references call the same move() method, they produce different outputs depending on which child object is assigned to them.

This demonstrates how polymorphism allows one method to perform different behaviors depending on the actual object.

2. Abstraction
AbstractionDemo.java – This program demonstrates abstraction through an online payment system. It contains an abstract parent class named Payment and two child classes named CashPayment and CardPayment.

The Payment class contains an abstract method named processPayment() and a concrete method named showMessage().

The abstract method does not contain an implementation in the parent class. Instead, each child class provides its own implementation of the processPayment() method.

The CashPayment class implements processPayment() by displaying that the payment was completed using cash, while the CardPayment class implements it by displaying that the payment was completed using a card.

Meanwhile, both child classes inherit the showMessage() method from the parent class, which displays a welcome message for the online payment system.

In the main method, parent-class references are used to create and access child-class objects. The program calls the showMessage() and processPayment() methods to demonstrate how common features can be inherited while allowing each payment type to have its own implementation.

This allows the program to establish a common structure for payments while hiding the specific implementation details of each payment method.

3. Difference Between Polymorphism and Abstraction
Polymorphism focuses on allowing the same method or instruction to produce different behaviors depending on the object using it.

Abstraction focuses on establishing a general structure while hiding implementation details that do not need to be exposed.

In my programs, polymorphism is demonstrated when the same move() method produces different outputs for the Car and Motorcycle objects.

On the other hand, abstraction is demonstrated when the Payment class requires its child classes to implement the processPayment() method without defining exactly how each payment method works.


-------- REFLECTION QUESTIONS -------


1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Method overriding is important because it allows child classes to have their own behavior while using the same method from the parent class. If a child class does not override the parent's method, it will use the inherited method instead.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

We cannot create an object directly from an abstract class because it is designed to serve as a blueprint for other classes. It may contain abstract methods that do not have implementations. 

3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

I can add another child class such as Bus using extends Vehicle.I can override the move() method to give the Bus its own behavior.The program can handle the new class by creating a Vehicle reference that points to a Bus object. 

4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes, polymorphism and abstraction can work together in one program. Abstraction hides unnecessary implementation details and the polymorphism allows different child classes to have different behaviors using the same method.

For example an abstract class called Vehicle can have an abstract method called move(). Car and Motorcycle can extend Vehicle and provide their own implementations. We can use Vehicle references to call the methods of Car and Motorcycle objects.

5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

for me as a future programmer I would use polymorphism when I want different classes to perform the same action in different ways. I would use abstraction when I want to hide unnecessary details and create a common structure for related classes. Both concepts help make programs organized, reusable, and easier to maintain.
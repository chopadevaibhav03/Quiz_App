package Abstraction;
/*
 ABSTRACTION AND ABTRSACT KEYWORD

 NOTE :- 1) There is no need to create abstract methods in abstarct class .it is by choice.
         2) but if you have abstract method then you must have to create class as abstract.
         3) you have to implement all the abstract methods in extended class which is not abstarct class
            because we can't create object of abstract class.
            
 Abstraction is a process in java to only show the essential details/functionality to the user.
 and hiding the non-essential details from user..

 ABTRSACT KEYWORD

 abstract keyword in java is use to create abstract class and method .whisch is not to instantiated.
 an abstract class is mostly use to provide a base to subclass to extend the impliment 
 the abstract method and override  or use the implimented methods in abstract class.
 */

abstract class Car {

    public abstract void drive();
    public abstract void fly();
    // {
    //     System.out.println("drive car");
    // }

    public void playMusic(){
        System.out.println("palying music...");
    }
}

abstract class gVagoan extends Car {

   
    public void drive(){
        System.out.println("Driving........");
    }
}

/**
 * InnerDemo
 */
class updatedCar extends gVagoan {

    public void fly(){
        System.out.println("flying.........");
    }

    
}

public class Demo {
    public static void main(String[] args) {

        Car obj = new updatedCar();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

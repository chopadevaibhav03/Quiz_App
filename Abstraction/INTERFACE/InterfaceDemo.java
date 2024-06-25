package Abstraction.INTERFACE;
/*
 ***** INTERFACE ****
    
    
 */
interface A {

    int age= 10;
    String name = "Vaibhav";

    void show();
    void config();
}
class B implements A{

    public void show (){
        System.out.println("class B impliments interface A show method");
    }
    public void config() {
        System.out.println("config method of interface A implemented by class A");
    }

}
public class InterfaceDemo {
    public static void main(String[] args) {

        A obj = new B();
        obj.config();
        obj.show();

        System.out.println("Age : "+ A.age +" || "+"Name : "+ B.name);


        
        
    }
    
}

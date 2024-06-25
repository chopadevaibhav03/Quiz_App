package Inner_Class;

/*
    INNER class and STATIC class

    Inner Class means class inside the class. we can say Nested class
Note - Private methods of the outer class can be accessedd. 

Static class - it means we dont have to create an object of class to accessed the methods/fuctions or for implimentation..

-Static keyword in java is mainly use to memory managment.
-Static is use to share same variable or method of a given class.
-We can aplly staic on variable,methods,blocks nested class or inner class.
-The static keword is used for a constant variable and methods that the same for every instance of a class.

NOTE-we cant make outer class is static.
 */
class A {
    public void show() {
        System.out.println("showing class A method.......");
    }

    class B {
        public void config() {
            System.out.println("class B is an iner class of A....");
        }
    }
}

public class Inner {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}

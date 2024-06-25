package Inner_Class;

/**
 ANONYMOUS INNER CLASS

 -It is an iiner class which has no  (class with no name) and for which only a single object is created.
 -It is useful for making an instance of an object with certain "Extras"such as overriding of method
 of a class or interface, withput having actually a subclass a class.
 NOTE- This classes is useful for writing implimentionclasses for listener interfaces
        in grafics programming.

-we can also use Anonymous inner class for abstract class.

abstract class A {

    public abstract void show();
    public abstract void config();
    
}
class AnonymousInnerClass {
    public static void main(String[] args) {

        A in = new A ()
        {
            public void show(){
                System.out.println("in B show......."); 
            }

            public void config(){
                System.out.println("in B config...."); 
            }


        };
        in.show();

    }
}
 */

class A {

    public void show(){
        System.out.println("in A show");
    }
    
}
class AnonymousInnerClass {
    public static void main(String[] args) {

        A in = new A ()
        {
            public void show(){
                System.out.println("in B show"); 
            }

        };
        in.show();

    }
}
public class OOPS_Abstract {
    
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
            c.eat();
            c.walk();
        
    }
    
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal contructor called");
    }
    void eat(){
        System.out.println("animal eats");      
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}


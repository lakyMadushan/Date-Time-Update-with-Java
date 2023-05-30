class Animal {
    void eat(){
        System.out.println("Eating!!!");
    }
}
class Dog extends Animal{
    void run(){
        System.out.println("Running!!!");
    }
}
public class Inheritence02{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.run();
        d.eat();
    }
}

abstract class Check{
    public abstract void abstractMethod();
    public void regularMethod(){
        System.out.println("regular method");
    }
}
public class Abstraction01 {
    public static void main(String[] args) {
        //Check myObj = new Check(); //will generate an error , Can not create object from super class

    }
}

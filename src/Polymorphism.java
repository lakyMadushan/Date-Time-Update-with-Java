class Shape{
    public void drawing(){
        System.out.println("Drawing Shapes");
    }
}
class Rectangle extends Shape{
    public void drawing(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    public void drawing(){
        System.out.println("Drawing Circle");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shape sha = new Shape(); //down casting
        Shape rect = new Rectangle();
        Shape cir = new Circle();

        sha.drawing();
        rect.drawing();
        cir.drawing();
    }
}

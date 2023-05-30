public class Car {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+ maxSpeed);
    }
}
class Run {
    public static void main(String[] args) {
        Car c1 = new Car();
        //Car c2 = new Car();
        c1.fullThrottle();
        c1.speed(200);
    }
}
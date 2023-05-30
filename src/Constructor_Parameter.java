public class Constructor_Parameter {
    int x;
    public Constructor_Parameter(int y){
        x=y;
    }

    public static void main(String[] args) {
        Constructor_Parameter ob = new Constructor_Parameter(5);
        System.out.println(ob.x);
    }
}

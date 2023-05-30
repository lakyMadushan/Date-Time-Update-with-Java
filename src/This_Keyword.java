public class This_Keyword {
    String name;
    This_Keyword(){ //constructor - same class name
        this.name="Hello";
    }
    public static void main(String[] args) {
        This_Keyword ob = new This_Keyword();
        System.out.println(ob.name);
    }
}

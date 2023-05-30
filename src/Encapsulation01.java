 class University{ //public class University (when you next class - "Encapsulation01" must create another class field)
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
public class Encapsulation01 {
    public static void main(String[] args) {
        University u = new University();
        //u.name = "SUSL"; //error
        //System.out.println(u.name);//error

        u.setName("SUSL");
        System.out.println(u.getName());

    }
}

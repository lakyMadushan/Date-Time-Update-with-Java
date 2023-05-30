 class Inheritance01 {
    String designation = "Lecturer";
    String subject = "ICT";

    void does(){
        System.out.println("Lecturing");
    }
}
 class Lecturer extends Inheritance01{
    String mainString = "Java";

    public static void main(String[] args) {
        Lecturer obj = new Lecturer();
        System.out.println(obj.designation);
        System.out.println(obj.subject);
        System.out.println(obj.mainString);
        obj.does();
    }
}

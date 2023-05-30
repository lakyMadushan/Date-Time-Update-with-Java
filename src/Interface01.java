interface Bank02{
    public abstract void accountPW();
    public void deposit();
}
class Branch02 implements Bank02{
    public void accountPW(){
        System.out.println("Account Password");
    }
    public void deposit(){
        System.out.println("Deposit Money");
    }
}
public class Interface01 {
    public static void main(String[] args) {
        Branch02 b1 = new Branch02();
        b1.accountPW();
        b1.deposit();
    }
}

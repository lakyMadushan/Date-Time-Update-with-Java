abstract class Bank{
    public abstract void accountPW();
    public void deposit(){
        System.out.println("Deposit money");
    }
}
class Branch extends Bank{
    public void accountPW(){
        System.out.println("Account Password");
    }
}
public class Abstraction02 {
    public static void main(String[] args) {
        Branch b = new Branch();
        b.accountPW();
        b.deposit();
    }
}

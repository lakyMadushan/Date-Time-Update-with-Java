import java.io.*;
public class BufferWriter {
    public static void main(String[] args) throws Exception {

        //we can type texts to text file using java code.

        FileWriter writer = new FileWriter("C:\\Users\\DELL\\Desktop\\ICT325 JAVA\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to Java!!!");
        buffer.write("\nWelcome to ICT!!!");
        buffer.close();
        System.out.println("Done");
    }
}

import java.io.*;
public class BufferReader {
    //we can read texts in text files
    public static void main(String[] args) throws Exception {
        FileReader exfour = new FileReader("C:\\Users\\DELL\\Desktop\\ICT325 JAVA\\testout.txt");
        BufferedReader br = new BufferedReader(exfour);

        int i;
        while((i= br.read()) !=-1){
            System.out.print((char)i);
        }
        br.close();
        exfour.close();
    }
}

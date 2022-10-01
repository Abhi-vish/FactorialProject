import java.net.Socket;
import java.io.*;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            System.out.println("Client Started");
            Socket soc = new Socket("localhost",554);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a number : ");
            int number = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(number);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

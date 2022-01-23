import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 9090;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new
                     PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            //in
            String start = in.readLine();
            System.out.println(start);
            //out
            Scanner sc = new Scanner(System.in);
            out.println(sc.nextLine());

            //in
            String hello = in.readLine();
            System.out.println(hello);
            //in
            String guns = in.readLine();
            System.out.println(guns);
            //out
            out.println(sc.nextLine());
            //in
            String gunsRes = in.readLine();
            System.out.println(gunsRes);
            //in
            String money = in.readLine();
            System.out.println(money);
            //out
            out.println(sc.nextLine());
            //in
            String moneyRes = in.readLine();
            System.out.println(moneyRes);
            //in
            String pas1 = in.readLine();
            String pas2 = in.readLine();
            String pas3 = in.readLine();
            System.out.println(pas1 + "\n" + pas2 + "\n" + pas3);

            out.println(sc.nextLine());

            String pasRes = in.readLine();
            System.out.println(pasRes);

            String fin = in.readLine();
            System.out.println(fin);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

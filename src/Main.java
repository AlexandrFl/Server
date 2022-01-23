import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Server started");
        int port = 9090;
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.printf("New connection accepted. Port: %d%n", clientSocket.getPort());
            // out
            out.println("Введите пароль для входа в систему");
            //in
            final String start = in.readLine();

            //out
            if (!start.equalsIgnoreCase("")) {
                // out
                out.println("\uD83D\uDE31 Jesus Christ, That's Jason Bourne! \uD83D\uDE31");
            } else {
                serverSocket.close();
            }

            //out
            out.println("Хотите получить оружие? (y/n)");
            //in
            final String guns = in.readLine();
            //out
            if (guns.equalsIgnoreCase("y")) {
                out.println("Магическим образом оружие получено");
            } else if (guns.equalsIgnoreCase("n")) {
                out.println("Нет так нет");
            }
            //out
            out.println("Хотите получить $ ? (y/n)");
            //in
            final String money = in.readLine();
            //out
            if (money.equalsIgnoreCase("y")) {
                out.println("*звук уведомления о начислении средств на счет*");
            } else if (money.equalsIgnoreCase("n")) {
                out.println("Целее будут");
            } else {
                out.println("Будем считать что этого вопроса не было (неверно введена буква)");
            }
            //out
            out.println("Хотите получить паспорт другой страны?\nВ наличии паспорта России, Германии и Италии\nВведите (R/G/I) or N если паспорт не нужен");

            //in
            final String pas = in.readLine();
            //out
            if (pas.equalsIgnoreCase("R")) {
                out.println("Ваше новое имя Ащьф Фома. Дата рождения 21.08.1969.");
            } else if (pas.equalsIgnoreCase("G")) {
                out.println("Ваше новое имя Тиль Швайгер. Дата рождения 19.12.1963.");
            } else if (pas.equalsIgnoreCase("I")) {
                out.println("Ваше новое имя Андриано Челентано. Дата рождения 6.01.1938.");
            } else if (pas.equalsIgnoreCase("N")) {
                out.println("Понял принял");
            } else {
                out.println("Будем считать что этого вопроса не было (неверно введена буква)");
            }

            //out
            out.println("Дата следующего выхода на связь будет ровно через неделю. Удачи!");
            serverSocket.close();
        }
    }
}

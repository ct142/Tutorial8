package Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserDataCollection {
    public static void main(String[] args) throws IOException {
        // Exercise 1
        String name, address;
        int age;
        Scanner scanner = new Scanner(System.in);

        PrintWriter pw = new PrintWriter(new FileWriter("src/Ex1/users.txt",true));

        System.out.println("Enter name : ");
        name = scanner.nextLine();

        System.out.println("Enter age : ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter address:");
        address = scanner.nextLine();

        pw.println(name + "," + age + "," + address);


        pw.flush();
        pw.close();
    }
}

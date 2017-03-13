import com.pamokos.db.atvaizdavimas.Atvaizdavimas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    ""
            );

        Atvaizdavimas objektas = new Atvaizdavimas();

        while (true) {
            System.out.println("Sveiki, įveskite skaičių operacijos pasirinkimui:");
            System.out.println("'1' - ...   '2' - ....    '3' - ..... ");
            Scanner sc = new Scanner(System.in);
            int operacija = sc.nextInt();


            switch (operacija) {
                case (1):
                    System.out.println("Pirmas");
                    break;
                case (2):
                    System.out.println("Antras");
                    break;
                case (3):
                    System.out.println("Trecias");
                    break;

            }

        }

    }
}

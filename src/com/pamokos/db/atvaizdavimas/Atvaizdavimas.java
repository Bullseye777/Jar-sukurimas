package com.pamokos.db.atvaizdavimas;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by A on 2017.03.13.
 */
public class Atvaizdavimas {
    private Connection connection;

    public Atvaizdavimas() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    ""
            );
            //Statement statementnt = connection.createStatement();
        } catch (Exception klaida) {
            System.out.println(klaida);

        }

    }

    public void pasisveikinimas() {
        System.out.println("Sveiki, iveskite skaiciu norimos lenteles pasirinkimui:");

    }

    public void pakalausti() {
        System.out.println("'1' - Studentai   '2' - Adresai    '3' - Pazymiai ");
    }

    public void sprendimas() {
        Scanner sc = new Scanner(System.in);
        int operacija = sc.nextInt();
        switch (operacija) {
            case 1:
                lentele_1();
                break;
            case 2:
                lentele_2();
                break;
            case 3:
                lentele_3();
                break;
            default:
                System.out.println("Ivedete bloga skaiciu, tokios lenteles nera");

        }
    }

    private void lentele_1() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `students`;");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print("|");
                System.out.print(resultSet.getString("name"));
                System.out.print("|");
                System.out.print(resultSet.getString("surname"));
                System.out.print("|");
                System.out.print(resultSet.getInt("phone"));
                System.out.print("|");
                System.out.print(resultSet.getString("email"));
                System.out.println("");


            }
        } catch (Exception klaida) {
            System.out.println(klaida);
        }

    }

    private void lentele_2() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_address`;");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("student_id"));
                System.out.print("|");
                System.out.print(resultSet.getString("country"));
                System.out.print("|");
                System.out.print(resultSet.getString("city"));
                System.out.print("");
                System.out.print(resultSet.getString("street"));
                System.out.println("");


            }
        } catch (Exception klaida) {
            System.out.println(klaida);
        }

    }

    private void lentele_3() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_marks`;");
            while (resultSet.next()) {
                System.out.print(resultSet.getInt("student_id"));
                System.out.print("|");
                System.out.print(resultSet.getString("title"));
                System.out.print("|");
                System.out.print(resultSet.getInt("mark"));
                System.out.println("");


            }
        } catch (Exception klaida) {
            System.out.println(klaida);
        }

    }

}

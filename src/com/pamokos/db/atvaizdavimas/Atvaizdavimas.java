package com.pamokos.db.atvaizdavimas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by A on 2017.03.13.
 */
public class Atvaizdavimas {

    public Atvaizdavimas() {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    ""
            );
            Statement statemant = connection.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pasisveikinimas() {
        System.out.println("Sveiki, įveskite skaičių norimos lentelės pasirinkimui:");

    }

    public void pakalausti() {
        System.out.println("'1' - Studentai   '2' - ....    '3' - ..... ");
    }

    public void sprendimas() {
        Scanner sc = new Scanner(System.in);
        int operacija = sc.nextInt();
        switch (operacija) {
            case (1):
                lentele_1();
                break;
            case (2):
                lentele_2();
                break;
            case (3):
                lentele_3();
                break;
            default:
                System.out.println("Ivedėte blogą skaičių, tokios užduoties nėra");

        }
    }

    private void lentele_1() {
        ResultSet resultSet = statemant.executeQuery("SELECT * FROM `students`;");
    }

    private void lentele_2() {

    }

    private void lentele_3() {

    }
}

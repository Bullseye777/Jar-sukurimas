import com.pamokos.db.atvaizdavimas.Atvaizdavimas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

               Atvaizdavimas objektas = new Atvaizdavimas();
               objektas.pasisveikinimas();
               while (true){
                   objektas.pakalausti();
                   objektas.sprendimas();
               }

        }

    }




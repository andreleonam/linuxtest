package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("ola mundo");
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}

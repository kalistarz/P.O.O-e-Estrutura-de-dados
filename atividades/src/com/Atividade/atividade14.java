package com.Atividade;
import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        double y = leitor.nextDouble();
        double media = x / y;
        System.out.println(String.format("%.3f km/l", media));
    }
}

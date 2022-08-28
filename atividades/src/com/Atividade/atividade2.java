package com.Atividade;
import java.util.Scanner;

public class atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double r = leitor.nextDouble();
        double a = 3.14159 * (r * r);
        System.out.println(String.format("A=%.4f", a));
    }

}

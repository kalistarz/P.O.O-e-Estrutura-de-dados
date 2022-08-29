package com.Atividade;
import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();
        double pi = 3.14159;
        double volume = (4.0 / 3) * pi * Math.pow(raio, 3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}

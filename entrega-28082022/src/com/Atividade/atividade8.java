package com.Atividade;
import java.util.Scanner;

public class atividade8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int funcionarios = leitor.nextInt();
        int horas = leitor.nextInt();
        double valorPorHora = leitor.nextDouble();
        double salario = horas * valorPorHora;
        System.out.println("NUMBER = " + funcionarios);
        System.out.println(String.format("SALARY = U$ %.2f" , salario));
    }
}

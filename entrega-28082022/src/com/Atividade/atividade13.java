package com.Atividade;
import java.util.Scanner;

public class atividade13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int v1 = leitor.nextInt();
        int v2 = leitor.nextInt();
        int v3 = leitor.nextInt();
        if (v1 > v2 && v1 > v3) {
            System.out.println(v1 + " eh o maior");
        } else if (v2 > v3) {
            System.out.println(v2 + " eh o maior");
        } else {
            System.out.println(v3 + " eh o maior");
        }
    }
}

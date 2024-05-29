package Conteudos;

import java.util.Scanner;

public class Exercicio2Unidade4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Digite um número: ");
        number = Integer.parseInt(sc.nextLine());

        if (number > 0) {
            System.out.print("A raiz quadrada de " + number + " é " + Math.sqrt(number));
        } else {
            System.out.println("O número " + number + " é inválido.");

        }
        sc.close();
    }
}



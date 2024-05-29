package Conteudos.Unidade4;

import java.util.Scanner;

public class Exercicio3Unidade4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print(" Insira um número inteiro: ");
        number = Integer.parseInt(sc.nextLine());

        if (number % 2 == 0){
            System.out.println(" O número digitado " + number + " é par.");
        }else{
            System.out.println("O número digitado " + number + " é ímpar.");
        }
    }
}

package Conteudos;

import java.util.Scanner;

public class ExerciciosUnidade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1, number2;

        System.out.print("Digite um número: ");
        number1 = Integer.parseInt(sc.nextLine());

        System.out.print("Digite outro número: ");
        number2 = Integer.parseInt(sc.nextLine());

        if (number1 > number1) {
            System.out.println("O número maior é " + number1);
        }else if(number1 == number2){
            System.out.println("Os números são iguais " );
        }
        else {
            System.out.println("O número maior é " + number2);
        }
        sc.close();
    }
}

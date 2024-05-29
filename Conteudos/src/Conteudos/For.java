package Conteudos;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        int idade;
        String nome;

        Scanner sc = new Scanner(System.in);
        // for tem uma condição de parada, ou seja, vai fazer o loop até a condição acabar
        // variável de controle; condição de parada; forma de incremento
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o seu nome: ");
            nome = sc.nextLine();

            System.out.print("Informe a sua idade: ");

            idade = Integer.parseInt(sc.nextLine());

            if (idade > 0) {
                System.out.println(nome + " tem " + idade + " anos.");
            }
        }
            sc.close();

        }



}

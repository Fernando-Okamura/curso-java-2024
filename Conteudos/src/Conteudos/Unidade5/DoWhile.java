package Conteudos.Unidade5;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        //aprendendo while e do while
        //Recebe dados do usuário via teclado
        int idade = 0;
        String nome;


        Scanner sc = new Scanner(System.in);
        //do while primeiro executa o bloco, depois faz a checagem
        //while checa primeiro e só roda se for verdadeiro, para o loop funcionar
        // tem que ajeitar para que seja verdadeiro
        do {
            System.out.print("Informe o seu nome: ");
            nome = sc.nextLine();
            //next sozinho funcion, mas só pega um dado da pessoa, já o nextLine pega sobrenomes

            System.out.print("Informe a sua idade: ");
            //idade = sc.nextInt(); BUG aparece as duas infos

            idade = Integer.parseInt(sc.nextLine());
            //aqui o parse recebe uma string do usuário e converte em número inteiro, caso não de pra converter,
            // ocorre erro de compilação(teria que fazer tratamento do erro)

            System.out.println(nome + " tem " + idade + " anos. ");

        }
        while (idade > 0);


        sc.close();
    }
}




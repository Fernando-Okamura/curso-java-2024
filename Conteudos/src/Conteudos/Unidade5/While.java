package Conteudos.Unidade5;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        //aprendendo while e do while
        //Recebe dados do usuário via teclado
        int idade = 1;
        String nome;


        Scanner sc = new Scanner(System.in);
        //while só entra nele se for verdadeiro(checa o valor  antes de executar o bloco
        while (idade > 0) {
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


        sc.close();
    }
}

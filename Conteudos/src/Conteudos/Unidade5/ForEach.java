package Conteudos.Unidade5;


public class ForEach {
    public static void main(String[] args) {
        String nome = "Geek University";

        //Para cada um dos caracteres da string , imprima o caractere
       // for (String string : args){

        for (char letra : nome.toCharArray()){
            System.out.println(letra);

        }
    }
}

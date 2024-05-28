package Conteudos;

public class OperadorTernario {
    public static void main(String[] args) {
        int number, valor = -3;

       /* if (valor > 0) {
            number = valor;
        }else{
          number = 7;
        }

        */
        //operador ternario(usado para quando tem verdadeiro e falso... apenas um if  e else simples
        number = (valor > 0) ? valor : 7;
        System.out.println(number);

    }

}

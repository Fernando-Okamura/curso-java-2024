package Conteudos;

public class Switch {

    public static void main(String[] args) {
        int number = 33;
        // Control + Alt + L (faz indentação/ deixa organizado, formatado)
        //condição chamada switch
        // Nela colocamos os casos e um break para interromper após dar certo. Se não der, ele vai para o próximo
        //default é opcional, mas é bom para resolver problemas caso digitem algo diferente dos casos.
        switch (number) {
            case 1:
                System.out.println("The number is 1 ");
                break;
            case 3:
                System.out.println("The number is 3 ");
                break;
            case 5:
                System.out.println("The number is 5 ");
                break;
            default:
                System.out.println("The number is " + number);
                break;

        }

    }
}

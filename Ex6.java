import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        // variaveis double: número 1, número 2, logaritmo.
        double number1, number2, logaritmo;
        //abrindo q classe scanner 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número:");
        number1 = scanner.nextFloat();

        System.out.println("Escreva o segundo número: ");
        number2 = scanner.nextFloat();
        //fechando a classe Scanner 
        scanner.close();
        //Calculo do logaritmo. number1 = valor, number 2 = base
        logaritmo =  Math.log(number1) / Math.log(number2);

        System.out.printf("O logaritmo do número " + number1 + " é: " + "%.5f", logaritmo);





    }




}
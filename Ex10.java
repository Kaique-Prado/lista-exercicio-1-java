//importando a classe Scanner 
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        //variaveis(em ordem): numero 1, numero 2, numero 3, média aritmetica, média harmônica, média geométrica. 
        double n1, n2, n3, arit, har, geo;
        //abrindo a classe Scanner dentro do método
        Scanner scanner = new Scanner(System.in);
        //Pedindo ao teclado escrever os números.
        System.out.println("Escreva o primeiro número: ");
        n1 = scanner.nextFloat();

        System.out.println("Escreva o segundo número: ");
        n2 = scanner.nextFloat();

        System.out.println("Escreva o terceiro número: ");
        n3 = scanner.nextFloat();
        //fechando a classe Scanner.
        scanner.close();
        //Calculos das médias aritméticas, harmônica, e geométrica
        arit = (n1 +n2 +n3) /3;
        har = 3 / ((1/n1) + (1/n2) + (1/n3));
        geo = Math.cbrt(n1 * n2 * n3);
        //escrevendo as médias na tela
        System.out.println("A média aritmetica é: " + arit);
        System.out.println("A média harmônica é é: " + har);
        System.out.println("A média geométrica é é: " + geo);

    }
}

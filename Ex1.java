//importando a classe Scanner
import java.util.Scanner;

public class Ex1 {
//abrindo um metodo(main)
    public static void main(String[] args) {
        // variaveis da média aritmética 
        float n1, n2, answer;
        
        //abertura da classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Perguntando para o teclado escrever os números
        System.out.println("Por favor escreva o primeiro número: ");
        n1=scanner.nextFloat(); // escaneando o teclado e atribuindo a variavel n1

        System.out.println("Por favor escreva o segundo número: ");
        n2=scanner.nextFloat();

        scanner.close(); //fechando a classe Scanner

        answer= (n1 + n2) /2; //Conta média aritmética

        System.out.println("A média dos números colocados é: " + answer); //resposta final

    }
}

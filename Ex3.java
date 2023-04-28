import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        double F,C;
        //abrindo o Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("MEDIDOR DE TEMPERATURAS \n" );
        System.out.printf("Escreva sua temperatura em fahrenheit: ");
        F= scanner.nextFloat();
        //fechando o Scanner
        scanner.close();
        //Calculo para a conversão de Fahrenheit para Celsius
        C= (F-32)/1.8;

            System.out.println("A temperatura em Celsius é: " + C);
        
  
    }
    
}

//Importando a classe Scanner 
import java.util.Scanner;

public class Ex9 {
    
    public static void main(String[] args) {
        
        int segundos, horas, minutos;
        int seg;
        //abrindo a classe Scanner
        Scanner scanner = new Scanner(System.in);
        //pedindo ao teclado escrever os segundos totais
        System.out.println("Escreva um número de segundos:");
        seg = scanner.nextInt();
        
        scanner.close();
        // 1 hora equivale a 3600 segundos
       horas = seg/3600;
       //resto de seundos por 3600 segundos dividido por 60 
       minutos = (seg % 3600) / 60;
       //resto de 3600 pelo resto de 60
       segundos = (seg % 3600) % 60;

       //escrevendo o empo na tela
       System.out.println("O tempo é: "+ horas +"h ,"+ minutos +"min ,"+ segundos +"seg");


    }
}

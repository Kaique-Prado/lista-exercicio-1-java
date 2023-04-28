//importando a biblioteca Scanner para o sistema java
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        //declarando as variavéis do método
        int veiculos, rodas, totalCarros, totalMotos,rodasCarros, rodasMotos;
       
        //abrindo o Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o número total de veículos: ");
        veiculos = scanner.nextInt();

        System.out.println("Qual é o número total de rodas: ");
        rodas = scanner.nextInt();
        
        //fechando o Scanner
        scanner.close();
        
        //rodas dos carros e motos
        rodasCarros=4;
        rodasMotos=2;
       
        //calculo para dar o total de carros e motos
        totalCarros = rodas - (rodasMotos * veiculos ) / (rodasCarros - rodasMotos);
        totalMotos = veiculos - totalCarros;

        System.out.printf("Número total de carros é "+ totalCarros +" e o número total de motos é "+ totalMotos);
        
    }
}

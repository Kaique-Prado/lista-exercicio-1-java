//importando a classe Scanner
import java.util.Scanner;

public class Ex4{

    public static void main(String[] args) {
    
        double capital, taxa , prazo, montante, taxaPorcentagem;

        Scanner scanner = new Scanner(System.in);
        //pedindo ao teclado o valor inicial para aplicação
        System.out.println("Escreva o valor do Capital a ser aplicado: ");
        capital = scanner.nextDouble();

        System.out.println("Coloque o prazo da aplicação(em meses): ");
        prazo = scanner.nextDouble();

        System.out.println("Escreva a taxa de juros: ");
        taxa = scanner.nextDouble();

        scanner.close();
        //transformando a taxa em porcentagem
        taxaPorcentagem = taxa/100;
        //Calculo do juros compostos
        montante = capital * Math.pow((1 + taxaPorcentagem), prazo);
    
        System.out.printf("O valor da montante final é: $ %.2f", montante);
    

    }
    
}

//importando a classe scanner 
import java.util.Scanner;

public class Ex2 {
//abrindo um metodo(main)
public static void main(String[] args) {
    
    float valorProduto, novoValor;
    //abrindo a classe Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Coloque o valor do seu produto: ");
    valorProduto= scanner.nextFloat();
    //Fechando o Scanner
    scanner.close();
    //regra de três para achar o novo valor do produto
    novoValor =(valorProduto*110)/100;

    System.out.println("O novo valor do produto é: " + novoValor);

 }

}

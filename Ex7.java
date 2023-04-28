import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args) {
        // variaveis: salario bruto, percentual de vendas, salario liquido
        float salarioVendedor, valorVendas, percentual, salarioTotal;
        //abrindo a classe scanner 
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Salário do vendedor antes das bonificações: ");
        salarioVendedor = scanner.nextFloat();

        System.out.println("Coloque o valor total das vendas do vendedor no mês: ");
        valorVendas = scanner.nextFloat();

        System.out.println("coloque o percentual que o vendedor recebe sobre as vendas");
        percentual = scanner.nextFloat();
        //fechando a classe Scanner 
        scanner.close();
        //transformando percentual em porcentagem
        percentual  =  percentual/100;
        salarioTotal = salarioVendedor + (percentual * valorVendas);

        System.out.println("O salario total do vendedor é: " + salarioTotal);




    }
}

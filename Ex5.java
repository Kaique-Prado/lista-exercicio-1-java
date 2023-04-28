import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        //Variaveis float: hora, salario da família, e o salário Bruto. Int: horas trabalhadas mensalmente, e filhos menores de 14 anos.
        float valorHora, salarioFamilia, salarioBruto;
        int horasMensais, filhosMenores;
        //Abrindo a classe Scanner
        Scanner scanner = new Scanner(System.in);
        //pedindo ao teclado as horas trabalhadas mensalmente
        System.out.println("Coloque as horas mênsais trabalhadas: ");
        horasMensais = scanner.nextInt();
        //pedindo ao teclado o valor da hora 
        System.out.println("Coloque o valor da hora trabalhada: ");
        valorHora = scanner.nextFloat();
        //pedindo ao teclado o valor do salário da família
        System.out.println("Coloque o valor do salário da família: ");
        salarioFamilia = scanner.nextFloat();
        //pedindo ao eclado quantos filhos menores de 18 anos tem
        System.out.println("Coloque quantos filhos menores de 14 anos você tem: ");
        filhosMenores = scanner.nextInt();
        //fechando a classe scanner
        scanner.close();
        //Calculo do salario bruto
        salarioBruto = (valorHora * horasMensais) + salarioFamilia * filhosMenores;

        System.out.println("O valor do salário bruto é" + salarioBruto);









    }




}
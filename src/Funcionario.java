import java.util.Scanner;

public class Funcionario {
    public String nome;
    public String matricula;
    public String cargo;
    public double salarioHora;
    public double quantidadeHoras;
    // Criar um método que permita ao usuário
    // fazer a entrada dos dados do funcionário via teclado
     public void entradaDados(){
         Scanner leia = new Scanner(System.in);
         System.out.println("Informe sua matrícula: ");
         matricula = leia.nextLine();
         System.out.println("Informe seu nome: ");
         nome = leia.nextLine();
         System.out.println("Informe seu cargo: ");
         cargo = leia.nextLine();
         System.out.println("Informe o valor da hora-base: ");
         salarioHora = leia.nextDouble();
         System.out.println("Informe a quantidade de horas trabalhadas: ");
         quantidadeHoras = leia.nextDouble();
    }
    public void mostrarDados(){
        System.out.println("Matrícula: " + matricula
            + "\nNome: " + nome
            + "\nCargo:" + cargo
            + "\nTotal de Horas Trabalhadas: " + quantidadeHoras
            + "\nSalário Base: " + salarioHora
            + "\nSalário Calculado:" + calcularSalario());
    }
    public double calcularSalario(){
        return (quantidadeHoras * salarioHora);
    }
}

// Criar um classe chamada Funcionario
// com os atributos: matricula, nome, cargo,
// salarioHora, quantidadeHoras
// E os métodos: mostrarDados e calcularSalario
// sendo um deles void e outro com retorno
// Testar a aplicação

public class Main {
    public static void main(String[] args) {
        Funcionario F = new Funcionario();

        F.entradaDados();
        F.mostrarDados();
    }
}
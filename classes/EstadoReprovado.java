package classes;

public class EstadoReprovado implements iEstado {
    public void setNota(AlunoTurma alunoTurma, double nota) {
        System.out.println("Erro: Aluno reprovado! Não pode receber novas notas.");
    }
}

package classes;

public class EstadoAtivo implements iEstado{
    public void setNota(AlunoTurma alunoTurma, double nota) {
        alunoTurma.getNota().adicionarNota(nota);
 
}
}
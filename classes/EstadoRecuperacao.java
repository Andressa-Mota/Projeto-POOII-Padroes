package classes;

public class EstadoRecuperacao implements iEstado {

    public void setNota(AlunoTurma alunoTurma, double nota) {
        alunoTurma.getNota().setNotaRecuperacao(nota);
    
}
}
package classes;

public class AlunoTurma {
    private Aluno aluno;
    private Nota nota;
    private Nota notaRecuperacao;
    private iEstado estado;
    

    public AlunoTurma(){}
    
    public AlunoTurma(Aluno aluno){
        this.aluno = aluno;
        this.nota = new Nota();
        this.nota = notaRecuperacao;
        this.estado = new EstadoAtivo();
    }

    public void setEstado(iEstado novoEstado) {
        this.estado = novoEstado;
    }
    public iEstado getEstado() {
        return estado;
    }

    public AlunoTurma(Aluno aluno, Nota nota){
        this.aluno = aluno;
        this.nota =nota;
    }

    public Nota getNota(){
        return nota;
    }

    public void setNota(Nota nota){
        this.nota = nota;
    }

    public void adicionarNota(double nota) {
        estado.setNota(this, nota);
    }
    public Aluno getAluno(){
        return aluno;
    }

    public void setAluno(Aluno aluno){
        this.aluno = aluno;
    }

    public void notaRecuperacao(Nota notaRecuperacao){
        this.nota = notaRecuperacao;
    }
}

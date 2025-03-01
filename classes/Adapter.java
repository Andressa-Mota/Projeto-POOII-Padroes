package classes;

import java.util.ArrayList;

public class Adapter {

    public Adapter() {}

    public String exportarDadosEstudanteJSON() {
     
        DataBase db = DataBase.getInstance();
        ArrayList<Aluno> alunos = db.getAlunos();

        
        StringBuilder json = new StringBuilder();
        json.append("{ \"data\": {");

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            
            
            json.append("\"student" + (i + 1) + "\": {")
                .append("\"matricula\": \"").append(aluno.getMatricula()).append("\", ")
                .append("\"nome\": \"").append(aluno.getNome()).append("\", ")
                .append("\"cpf\": \"").append(aluno.getCpf()).append("\", ")
                .append("\"telefone\": \"").append(aluno.getTelefone()).append("\", ")
                .append("\"endereco\": \"").append(aluno.getEndereco()).append("\"")
                .append("}");

      
            if (i < alunos.size() - 1) {
                json.append(", ");
            }
        }

        json.append("} }"); 

        return json.toString();
    }
}

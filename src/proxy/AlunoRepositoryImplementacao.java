package proxy;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryImplementacao implements AlunoRepository {

    public AlunoRepositoryImplementacao(){
        System.out.println("Chegou no construtor de Implementação");
    }
    @Override
    public List<Aluno> getListAlunos() {
        var list = new ArrayList<Aluno>();

        list.add(new Aluno(10, "Silvio", "65465165"));
        list.add(new Aluno(15, "Bruno", "68541651968"));
        list.add(new Aluno(20, "Andre", "968546519816"));
        list.add(new Aluno(30, "Helio", "685465198986"));
        list.add(new Aluno(50, "Lais", "5419568716519"));
        list.add(new Aluno(60, "Anderlan", "6784651633216"));
        list.add(new Aluno(70, "Carlos", "5784897465"));

        return list;
    }
}

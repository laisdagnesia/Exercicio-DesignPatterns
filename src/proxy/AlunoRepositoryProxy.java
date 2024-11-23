package proxy;

import models.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoRepositoryProxy implements AlunoRepository {

    private AlunoRepository alunoRepository;

    private List<Aluno> alunoCache = new ArrayList<Aluno>();

    public AlunoRepositoryProxy(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    @Override
    public List<Aluno> getListAlunos() {
        if (alunoCache.isEmpty())
            alunoCache = this.alunoRepository.getListAlunos();

        return alunoCache;
    }
}

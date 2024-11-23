package proxy;

import models.Aluno;

import java.util.List;

public class AlunoService {

    public AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository){
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> retornarAlunos(){
        return alunoRepository.getListAlunos();
    }
}

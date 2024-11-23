package proxy;

import models.Aluno;

import java.util.List;

public interface AlunoRepository {
    List<Aluno> getListAlunos();
}

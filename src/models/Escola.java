package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Escola {

    private List<Aluno> alunos;

    private static Escola instancia;

    public Escola(){
        alunos = new ArrayList<Aluno>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(Integer matricula){
        alunos = alunos.stream().filter(alunoDaLista -> !Objects.equals(alunoDaLista.getMatricula(), matricula)).toList();
    }

    public void imprimirAlunosNaTela(){
        alunos.forEach(aluno -> System.out.println(
                "Matricula: "
                + aluno.getMatricula()
                + ", Nome: "
                        + aluno.getNome()
                        + ", Telefone: "
                        + aluno.getTelefone()));
    }

    public static Escola PegarInstanciaDoObjeto(){
        if (instancia != null)
            return instancia;

        instancia = new Escola();

        return instancia;
    }
}

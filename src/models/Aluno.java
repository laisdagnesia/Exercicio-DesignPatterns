package models;



public class Aluno {

    private Integer matricula;

    private String nome;

    private String telefone;

    public Aluno(Integer matricula, String nome, String telefone){
        this.matricula = matricula;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

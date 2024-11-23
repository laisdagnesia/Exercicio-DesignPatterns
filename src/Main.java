import models.Aluno;
import models.Escola;
import proxy.AlunoRepository;
import proxy.AlunoRepositoryImplementacao;
import proxy.AlunoRepositoryProxy;
import proxy.AlunoService;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * Aplicando a o padrão Proxy
         *
         **/
        AlunoRepository alunoRepository = new AlunoRepositoryImplementacao();

        var alunoProxy = new AlunoRepositoryProxy(alunoRepository);

        var alunoService = new AlunoService(alunoProxy);

        var alunos = alunoService.retornarAlunos();
        var alunosCached = alunoService.retornarAlunos();

        alunos.forEach(aluno -> {
            System.out.println("Matricula: " + aluno.getMatricula() + ", Nome: " + aluno.getNome());
        });

        /**
         *
         * Aplicando o padrão Singleton
         *
         */

        var instanciaDoObjetoEscola = Escola.PegarInstanciaDoObjeto();

        instanciaDoObjetoEscola.adicionarAluno(new Aluno(10, "Silvio", "65465165"));
        instanciaDoObjetoEscola.adicionarAluno(new Aluno(20, "Bruno", "8578527488"));
        instanciaDoObjetoEscola.adicionarAluno(new Aluno(40, "Carlos", "42452485234"));

        instanciaDoObjetoEscola.removerAluno(20);

        instanciaDoObjetoEscola.imprimirAlunosNaTela();
    }
}
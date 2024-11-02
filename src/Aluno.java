/**
 * Classe Aluno - {@link Pessoa} matriculada na escola.
 *
 * @author Alysson
 * @version 2024-10-31
 */
public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, Integer idade) {
        super(nome, idade);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void exibirInformacoes() {
        System.out.printf(
            "Nome: %s - Idade: %d - Matricula: %s\n",
            getNome(),
            getIdade(),
            getMatricula()
        );
    }
}

/**
 * Pessoa classe base para quaisquer pessoas físicas no sistema.
 * @author Alysson
 * @version 2024-10-31
 */
public class Pessoa {

    protected String nome;
    protected Integer idade;
    protected String CPF;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s - Idade: %d\n", nome, idade);
    }

    public boolean equals(Pessoa outraPessoa) {
        return this.CPF.equals(outraPessoa.getCPF());
    }
}

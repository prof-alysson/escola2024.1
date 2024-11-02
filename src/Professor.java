/**
 * <p>Esta subclasse de Pessoa mantém as informações sobre um
 * professor, seu salário e sua especialidade. O salário é
 * mantido como um valor <strong>Integer</strong>, pois como
 * se trata de valor monetário, o centavo não é divisível.</p>
 * <p>Contudo as pessoas costuma acessar salários como valores
 * em ponto flutuante (<strong>Double</strong> ou
 * <strong>Float</strong>), por isso, para todos os efeitos da
 * API o valor é convertido em Double.</p>
 *
 * @author Alysson
 * @version 2024-10-31
 */
public class Professor extends Pessoa {

    private Integer salario;
    private String especialidade;

    public Professor(String nome, Integer idade) {
        super(nome, idade);
    }

    public void setSalario(Double salario) {
        Double salarioEmCentavos = salario * 100;
        this.salario = salarioEmCentavos.intValue();
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return this.salario.doubleValue() / 100;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }
}

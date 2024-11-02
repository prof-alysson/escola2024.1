/**
 * Teste das classes do sistema WIP (<i>Work in Progress</i>,
 * ainda não está pronto).
 *
 * @author Alysson
 * @version 2024-10-31
 */
public class EscolaTester {

    public static void main(String[] arg) {
        Pessoa p1 = new Pessoa("João", 16);
        p1.setCPF("123");

        Pessoa p2 = new Pessoa();
        p2.setCPF("456");
        p2.setNome("Mateus");

        Pessoa p3 = new Pessoa();
        p3.setCPF("123");
        p3.setNome("joão");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        p1.exibirInformacoes();

        Aluno a1 = new Aluno("Mateus", 25);
        a1.setMatricula("1233");
        a1.setCPF("456");
        a1.exibirInformacoes();
    }
}

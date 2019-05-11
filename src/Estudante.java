public class Estudante extends Pessoa {
    private String escola;
    private int id_aluno;

    public Estudante(String nome, String cidade, int idade, String escola, int id) {
        super(nome, cidade, idade);
        this.escola = escola;
        this.id_aluno = id;
    }

    public String getEscola() {
        return escola;
    }

    public int getId_aluno() {
        return id_aluno;
    }
}

public class Professor extends Pessoa {
    private String escola;
    private int id_professor;

    public Professor(String nome, String cidade, int idade, String escola, int id) {
        super(nome, cidade, idade);
        this.escola = escola;
        this.id_professor = id;
    }

    public String getEscola() {
        return escola;
    }

    public int getId_professor() {
        return id_professor;
    }
}

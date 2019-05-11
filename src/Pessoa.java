public class Pessoa {
    private String nome;
    private String cidade;
    private int idade;

    public Pessoa(String nome, String cidade, int idade) {
        this.nome = nome;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getIdade() {
        return idade;
    }
}

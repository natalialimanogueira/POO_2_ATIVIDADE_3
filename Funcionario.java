package entities;

public class Funcionario {
    private String nome;
    private String numeroDocumento;
    private TipoDeDocumento documento;

    public Funcionario(String nome, TipoDeDocumento documento, String numeroDocumento) {
        this.nome = nome;
        this.documento = documento;
        this.numeroDocumento = numeroDocumento;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}

package entities;

import java.util.Date;

public class Projeto {
    private String nome;
    private Date id_inicio;
    private Date id_termino;

    public Projeto(String nome, Date id_inicio, Date id_termino) {
        this.nome = nome;
        this.id_inicio = id_inicio;
        this.id_termino = id_termino;
    }

    public Boolean adicionarContratacao (Contratacao contratacao){
        return false;
    }
    public Boolean removerContratacao (Contratacao contratacao){
        return false;
    }
    public void listarContratacao(){

    }

    public String getNome() {
        return nome;
    }
}

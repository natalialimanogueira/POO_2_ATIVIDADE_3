package entities;

public enum TipoDeDocumento {
    RG("Registro Geral"),
    CPF("Cadastro de Pessoa Fisica"),
    CNPJ("CAdastro de Pessoa Juridica");

    private String descricao;

    TipoDeDocumento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


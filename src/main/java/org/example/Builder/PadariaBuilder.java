package org.example.Builder;

import java.util.Date;

public class PadariaBuilder {

    private Padaria padaria;

    public PadariaBuilder() {
        padaria = new Padaria();
    }

    public Padaria build() {
        if (padaria.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        return padaria;
    }

    public PadariaBuilder setNome(String nome) {
        padaria.setNome(nome);
        return this;
    }

    public PadariaBuilder setDataCriacao(Date dataCriacao) {
        padaria.setDataCriacao(dataCriacao);
        return this;
    }

    public PadariaBuilder setNomeDono(String nomeDono) {
        padaria.setNomeDono(nomeDono);
        return this;
    }

    public PadariaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        padaria.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public PadariaBuilder setNumeroLogradouro(String numeroLogradouro){
        padaria.setNumeroLogradouro(numeroLogradouro);
        return this;
    }

    public PadariaBuilder setComplemento(String complemento) {
        padaria.setComplemento(complemento);
        return this;
    }

    public PadariaBuilder setBairro(String bairro) {
        padaria.setBairro(bairro);
        return this;
    }

    public PadariaBuilder setCidade(String cidade){
        padaria.setCidade(cidade);
        return this;
    }
}

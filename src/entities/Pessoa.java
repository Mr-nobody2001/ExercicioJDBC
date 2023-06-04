package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private Integer id;
    private String nome;
    private Profissao profissao;
    private final List<Telefone> telefones = new ArrayList<>();

    public Pessoa() {
    }

    public Pessoa(String nome, Profissao profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}

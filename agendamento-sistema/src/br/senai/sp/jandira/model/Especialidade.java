package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private static int contador;
    private Integer codigo;
    private String nome;
    private String descricao;

// Construtores de clase
    public Especialidade(String nome) {
        this.nome = nome;
        contador++;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        contador++;
    }

    public Especialidade() { // Construtor Default / Padrão
        contador++;
    }

// Métodos de acessos aos atributos
    public int getContador() {
        return contador;
    }

    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido!\\nDeve ter pelo menos 3 letras");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {

        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, "A descrição não é válida! Dever ter pelo menos 10 caracteres");
        }
    }

    public String getDescricao() {
        return this.descricao;
    }
}

package org.example;

public class Usuario {

    private int id;
    private String nome;
    private String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {return email;}

    public String getNome() {return nome;}
}

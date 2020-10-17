package com.claudino;

public class Aniversario {
    public String nome;
    public int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazAniversario(){
        this.idade = this.idade + 1;
    }
    public void imprimi(){
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("----------------------");
    }
}

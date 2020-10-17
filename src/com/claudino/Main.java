package com.claudino;

public class Main {

    public static void main(String[] args) {
        Aniversario pessoa = new Aniversario();
        pessoa.nome = "Thiago";
        pessoa.idade = 30;
        pessoa.fazAniversario();
        pessoa.imprimi();
        
        pessoa.nome = "Maria";
        pessoa.idade = 40;
        pessoa.fazAniversario();
        pessoa.imprimi();


    }
}

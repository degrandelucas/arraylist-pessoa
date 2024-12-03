package com.practice.arraylist.application;

import com.practice.arraylist.model.Pessoa;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Lucas", 31);
        Pessoa pessoa2 = new Pessoa("Danyelle", 30);
        Pessoa pessoa3 = new Pessoa("Petronilha", 62);


        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista completa: " + listaDePessoas);


    }
}
package com.rick.estruturadedados.pilha;

public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for (int i=1; i<=10; i++){
            pilha.empilha(i);
        }

        System.out.print(pilha);
        System.out.print(pilha.estaVazia());

    }
}

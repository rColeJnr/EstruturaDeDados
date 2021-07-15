package com.rick.estruturadedados.pilha;

public class Palindromo {

    public static void main(String[] args) {

        imprimeResultado("ADA");

        imprimeResultado("ABCD");

        imprimeResultado("ABCCBA");

        imprimeResultado("Maria");

    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " palindromo: " + testaPalidromo(palavra));
    }

    public static boolean testaPalidromo(String palavra){
        Pilha<Character> pilha = new Pilha<>();

        for (int i=0; i<palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilhar();
        }

        if (palavraInversa.equalsIgnoreCase(palavraInversa)){
            return true;
        }
        return false;
    }

}

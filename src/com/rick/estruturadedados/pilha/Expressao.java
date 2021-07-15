package com.rick.estruturadedados.pilha;

public class Expressao {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D)");
        imprimeResultado("{[()]}[](){()}");
        imprimeResultado("{[(]}[](){()}");
        imprimeResultado("A + B + C - D)");
    }

    public static void imprimeResultado(String expressao){
        System.out.print(expressao + "esta ok? " + verificaExpressao(expressao));
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static boolean verificaExpressao(String expressao){

        Pilha<Character> pilha = new Pilha<>();

        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1){
                if (pilha.estaVazia()) return false;
                else {
                    topo = pilha.desempilhar();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) return false;
                }
            }

            index++;
        }
        return true;
    }

}

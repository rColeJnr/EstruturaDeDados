package com.rick.estruturadedados.pilha;

import com.rick.estruturadedados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){super();}
    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()) return null;
        return this.elementos[getTamanho()-1];
    }

    public T desempilhar(){
        if(!this.estaVazia()) {
            --tamanho;
            return elementos[tamanho];
        } else {System.out.print("pilha vazia"); return null;}
    }

}

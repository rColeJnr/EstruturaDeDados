package com.rick.estruturadedados.fila;

import com.rick.estruturadedados.base.EstruturaEstatica;

import java.util.Queue;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila(int capacidade) {
        super(capacidade);
    }

    public Fila() {
    }

    public void enfileira(T elemento){
        super.adiciona(elemento);
    }

    public T desenfileira(){
        super.remove(0);
        return  super.elementos[0];
    }

    public T espiar(){
        if (estaVazia()) return null;
        return super.elementos[0];

    }
}

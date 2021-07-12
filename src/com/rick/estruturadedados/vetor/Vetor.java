package com.rick.estruturadedados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // esse algoritmo e pessimo, porque o algoritmo sempre vai iterar por cada elemento
    // para adicionar um novo

    /*public void adiciona(String elemento){
        for(int i=0; i< elementos.length; i++){
            if (elementos[i] == null){
                elementos[i] = elemento;
                break;
            }
        }
    }*/

    // this algoritm is more efficient since it remember the last index and adds upon
    // aqui inves de retornar um excepćão podemos retornar um boolean
    /*public void adiciona(String elemento) throws Exception{

        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar elemento");
        }
    }*/

    public boolean adiciona(String elemento) {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {

            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean adiciona(int posicao, String elemento) {
        aumentaCapacidade();
        if (!(this.tamanho < this.elementos.length)) {
            throw new NullPointerException("Posicao invalida");
        }

        // mover todos os elementos uma posicao
        for (int i=this.tamanho; i>=posicao; i--){
            this.elementos[i] = this.elementos[i--];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho>0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return Arrays.toString(elementos);
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public String busca(int posicao) {
        if (posicao < this.tamanho && posicao >= 0){
            return this.elementos[posicao];
        } else throw new NullPointerException("Index out of bounds");
    }

    public int busca (String elemento) {

        for (int i=0; i<tamanho; i++){
            if (elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;

    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length + 50];
            for (int  i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove(int posicao) {

        if (!(posicao >=0 && posicao<tamanho)) throw new NullPointerException();

        for (int i=posicao; i<tamanho-1; i++ ){
            elementos[i] = elementos[i++];
        }
        this.tamanho--;
        // isso em baixo parece que nao existe, fica considerado lixo.
        // mas acredito que envetualmente tambem vamos ver garbage colector.
//        elementos[tamanho] = null;
    }

    public void remove(String elemento) {
        remove(busca(elemento));
    }

}

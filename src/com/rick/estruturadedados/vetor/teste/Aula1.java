package com.rick.estruturadedados.vetor.teste;

import com.rick.estruturadedados.vetor.Lista;
import com.rick.estruturadedados.vetor.Vetor;
import com.rick.estruturadedados.vetor.Vetores;

import java.util.ArrayList;

public class Aula1 {

    public static void main(String[] args) {


        Vetor vetor = new Vetor(2);

        vetor.adiciona("elemento 1");
        vetor.adiciona("0, elemento 2");
        vetor.adiciona("elemento 3");

        System.out.println("Tamanho do vetor");
        System.out.println(vetor.getTamanho());
        System.out.println(vetor.toString());

        Vetores vetores = new Vetores(5);

        vetores.adiciona(3);
        vetores.adiciona(4);
        vetores.adiciona(5);

        System.out.println("Tamanho = " + vetores.getTamanho());
        System.out.print(vetores);

        Vetores conta = new Vetores(3);

        Contacto c1 = new Contacto("C1", "22341", "c!1mail.com");
        Contacto c2 = new Contacto("C2", "22342", "c!2mail.com");
        Contacto c3 = new Contacto("C3", "22343", "c!3mail.com");

        conta.adiciona(c1);
        conta.adiciona(c2);
        conta.adiciona(c3);

        System.out.println("Tamanho = " + conta.getTamanho());
        System.out.print(conta);

        Lista<String> lista = new Lista(5);

        lista.adiciona("Junior");

    }

}

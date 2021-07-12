package com.rick.estruturadedados.vetor.teste;

import com.rick.estruturadedados.vetor.Vetores;

import java.util.Objects;

public class Contacto {

   private String name;
   private String number;
   private String email;

   public Contacto(){}

    public Contacto(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(getName(), contacto.getName()) && Objects.equals(getNumber(), contacto.getNumber()) && Objects.equals(getEmail(), contacto.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getNumber(), getEmail());
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

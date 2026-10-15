import java.util.*;
import java.lang.*;
import java.io.*;

class Pet {
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    public Pet(String n, String e, int i, double p) {
        this.nome = n;
        this.especie = e;
        this.idade = i;
        this.peso = p;
    }

    public void setPeso(double novoPeso) {
        if (novoPeso > 0.0) {
            this.peso = novoPeso;
        }
    }

    public double getPeso() {
        return peso;
    }

    public String getNome() {
        return nome;
    }
}

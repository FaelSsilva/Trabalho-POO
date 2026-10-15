import java.util.*;
import java.lang.*;
import java.io.*;

class Procedimento {
    protected double valorBase;

    public Procedimento(double valor) { this.valorBase = valor; }

    public double calcularCustoTotal() { return valorBase; }
}

class Cirurgia extends Procedimento {
    private double taxaAnestesia;

    public Cirurgia(double valor, double anestesia) {
        super(valor);
        this.taxaAnestesia = anestesia;
    }

    @Override
    public double calcularCustoTotal() {
        return valorBase + taxaAnestesia;
    }
}

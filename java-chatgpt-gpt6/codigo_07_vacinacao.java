import java.util.*;
import java.lang.*;
import java.io.*;

class CartaoVacinacao {
    private String nomePet;
    private List<String> vacinasAplicadas;

    public CartaoVacinacao(String pet) {
        this.nomePet = pet;
        this.vacinasAplicadas = new ArrayList<>();
    }

    public void aplicarVacina(String vacina) {
        vacinasAplicadas.add(vacina);
    }

    public boolean possuiVacina(String vacina) {
        for (String v : vacinasAplicadas) {
            if (v.equals(vacina)) return true;
        }
        return false;
    }
}

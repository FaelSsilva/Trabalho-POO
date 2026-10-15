import java.io.*;
import java.lang.*;
import java.util.*;

class CartaoVacinacao {
    private String nomePet;
    private List<String> vacinasAplicadas = new ArrayList<String>();

    public CartaoVacinacao(String pet) {
        this.nomePet = pet;
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

import java.io.*;
import java.lang.*;
import java.util.*;

interface IAgendavel {
    boolean agendar(String data, String hora);
}

class Consulta implements IAgendavel {
    private String veterinario;
    private boolean confirmada;

    public Consulta(String vet) {
        this.veterinario = vet;
        this.confirmada = false;
    }

    @Override
    public boolean agendar(String data, String hora) {
        if (!data.isEmpty() && !hora.isEmpty()) {
            confirmada = true;
            return true;
        }
        return false;
    }
}

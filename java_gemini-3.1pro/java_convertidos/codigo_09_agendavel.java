import java.util.*;
import java.lang.*;
import java.io.*;

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
        if (data != null && !data.isEmpty() && hora != null && !hora.isEmpty()) {
            confirmada = true;
            return true;
        }
        return false;
    }
}

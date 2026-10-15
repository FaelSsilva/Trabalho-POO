import java.util.*;
import java.lang.*;
import java.io.*;

class Triagem {
    public void avaliarEmergencia(int nivelNivelDor) {
        if (nivelNivelDor < 1 || nivelNivelDor > 10) {
            throw new IllegalArgumentException("Nivel de dor invalido! Deve estar entre 1 e 10.");
        }
        if (nivelNivelDor >= 8) {
            System.out.println("Atendimento Imediato Necessario!");
        }
    }
}

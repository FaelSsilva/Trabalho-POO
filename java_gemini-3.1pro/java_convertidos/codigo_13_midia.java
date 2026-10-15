import java.util.*;
import java.lang.*;
import java.io.*;

abstract class MidiaAudio {
    protected String titulo;

    public MidiaAudio(String t) {
        this.titulo = t;
    }

    public abstract void tocar();
}

class Podcast extends MidiaAudio {
    private int episodio;

    public Podcast(String t, int ep) {
        super(t);
        this.episodio = ep;
    }

    @Override
    public void tocar() {
        System.out.println("A tocar Podcast " + titulo + " Ep. " + episodio);
    }
}

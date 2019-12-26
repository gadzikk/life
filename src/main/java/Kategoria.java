/**
 * Created by gadzik on 26.12.19.
 */
public class Kategoria {
    TypKategoria nadKategoria;
    TypKategoria kategoria;
    TypKategoria podKategoria;

    public Kategoria(TypKategoria kategoria) {
        this.kategoria = kategoria;
    }

    public Kategoria(TypKategoria nadKategoria, TypKategoria kategoria) {
        this.nadKategoria = nadKategoria;
        this.kategoria = kategoria;
    }

    public Kategoria(TypKategoria nadKategoria, TypKategoria kategoria, TypKategoria podKategoria) {
        this.nadKategoria = nadKategoria;
        this.kategoria = kategoria;
        this.podKategoria = podKategoria;
    }
}

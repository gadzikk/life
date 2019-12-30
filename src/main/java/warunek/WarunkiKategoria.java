package warunek;

import z_inne.Kategoria;

import java.util.List;

/**
 * Created by gadzik on 26.12.19.
 */
public class WarunkiKategoria {
    Kategoria kategoria;
    List<Warunek> warunki;

    public WarunkiKategoria(Kategoria kategoria, List<Warunek> warunki) {
        this.kategoria = kategoria;
        this.warunki = warunki;
    }

    public Kategoria getKategoria() {
        return kategoria;
    }

    public List<Warunek> getWarunki() {
        return warunki;
    }
}

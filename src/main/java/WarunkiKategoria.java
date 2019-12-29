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
}

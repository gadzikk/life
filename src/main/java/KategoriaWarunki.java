import java.util.List;

/**
 * Created by gadzik on 26.12.19.
 */
public class KategoriaWarunki {
    Kategoria kategoria;
    List<Consts.Warunek> warunki;

    public KategoriaWarunki(Kategoria kategoria, List<Consts.Warunek> warunki) {
        this.kategoria = kategoria;
        this.warunki = warunki;
    }
}

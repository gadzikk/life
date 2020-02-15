package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 14.02.20.
 */
public class WW {
    W warunek;
    List<W> warunki;

    public WW(W warunek, List<W> warunki) {
        this.warunek = warunek;
        this.warunki = warunki;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

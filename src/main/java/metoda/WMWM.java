package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class WMWM {
    List<W> warunki;
    List<String> metody;
    List<W> dodatkoweWarunki;
    List<String> dodatkoweMetody;

    public WMWM(List<W> warunki, List<String> metody, List<W> dodatkoweWarunki, List<String> dodatkoweMetody) {
        this.warunki = warunki;
        this.metody = metody;
        this.dodatkoweWarunki = dodatkoweWarunki;
        this.dodatkoweMetody = dodatkoweMetody;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

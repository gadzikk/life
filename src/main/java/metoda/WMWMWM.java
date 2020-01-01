package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class WMWMWM {
    List<W> warunki;
    List<String> metody;
    List<W> dodatkoweWarunki;
    List<String> dodatkoweMetody;
    List<W> dodatkoweWarunki2;
    List<String> dodatkoweMetody2;

    public WMWMWM(List<W> warunki, List<String> metody, List<W> dodatkoweWarunki, List<String> dodatkoweMetody, List<W> dodatkoweWarunki2, List<String> dodatkoweMetody2) {
        this.warunki = warunki;
        this.metody = metody;
        this.dodatkoweWarunki = dodatkoweWarunki;
        this.dodatkoweMetody = dodatkoweMetody;
        this.dodatkoweWarunki2 = dodatkoweWarunki2;
        this.dodatkoweMetody2 = dodatkoweMetody2;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

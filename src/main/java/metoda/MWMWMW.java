package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class MWMWMW {

    List<String> metody;
    List<W> warunki;
    List<String> dodatkoweMetody;
    List<W> dodatkoweWarunki;
    List<String> dodatkoweMetody2;
    List<W> dodatkoweWarunki2;

    public MWMWMW(List<String> metody, List<W> warunki, List<String> dodatkoweMetody, List<W> dodatkoweWarunki, List<String> dodatkoweMetody2, List<W> dodatkoweWarunki2) {
        this.metody = metody;
        this.warunki = warunki;
        this.dodatkoweMetody = dodatkoweMetody;
        this.dodatkoweWarunki = dodatkoweWarunki;
        this.dodatkoweMetody2 = dodatkoweMetody2;
        this.dodatkoweWarunki2 = dodatkoweWarunki2;
    }
}

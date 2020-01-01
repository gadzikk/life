package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class MWMW {
    List<String> metody;
    List<W> warunki;
    List<String> dodatkoweMetody;
    List<W> dodatkoweWarunki;

    public MWMW(List<String> metody, List<W> warunki, List<String> dodatkoweMetody, List<W> dodatkoweWarunki) {
        this.metody = metody;
        this.warunki = warunki;
        this.dodatkoweMetody = dodatkoweMetody;
        this.dodatkoweWarunki = dodatkoweWarunki;
    }
}

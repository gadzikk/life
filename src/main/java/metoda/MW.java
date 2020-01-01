package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 27.12.19.
 */
public class MW {
    //    List<List<W>> wplyw;
    List<String> metody;
    List<W> warunki;

    public MW(List<String> metody, List<W> warunki) {
        this.metody = metody;
        this.warunki = warunki;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }

}

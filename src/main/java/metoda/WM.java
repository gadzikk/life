package metoda;

import warunek.Warunek;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class WM {
    List<Warunek> warunki;
    List<String> metody;

    public WM(List<Warunek> warunki, List<String> metody) {
        this.warunki = warunki;
        this.metody = metody;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

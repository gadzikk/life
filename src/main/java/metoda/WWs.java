package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 23.08.20.
 */
public class WWs {
    List<W> warunki1;
    String del;
    List<W> warunki2;

    public WWs(List<W> warunki1, String del, List<W> warunki2) {
        this.warunki1 = warunki1;
        this.del = del;
        this.warunki2 = warunki2;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

package metoda;

import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 01.09.20.
 */
public class WsWs {
    List<W> warunki1;
    String del;
    List<W> warunki2;
    String del2;
    List<W> warunki3;

    public WsWs(List<W> warunki1, String del, List<W> warunki2, String del2, List<W> warunki3) {
        this.warunki1 = warunki1;
        this.del = del;
        this.warunki2 = warunki2;
        this.del2 = del2;
        this.warunki3 = warunki3;
    }

    public static <T> List<T> of(T... elements) {
        return Arrays.asList(elements);
    }
}

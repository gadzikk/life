package z_inne;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 14.02.20.
 */
public class OH {
    List<OH> osoby;

    public OH() {
    }

    public OH(List<OH> osoby) {
        this.osoby = osoby;
    }

    public static <T> List<T> of(T... elements) { return Arrays.asList(elements); }
}

package db;

import metoda.CPU_UL;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DB {
    public static <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }
}

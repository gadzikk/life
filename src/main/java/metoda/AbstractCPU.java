package metoda;

import db.DB_Tematy;
import sytuacja.Sytuacja;
import temat.TT;
import typy_bazowe.TypT;
import z_inne.OsobaMetod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class AbstractCPU {
    List<MW> all = new ArrayList<>();
    Sytuacja sytuacja = new Sytuacja();
    List<TypT> prefixes = DB_Tematy.PREFIXES;
    List<TypT> pdstw = DB_Tematy.PDSTW;
    List<TT> tematy = DB_Tematy.TEMATY;
    List<TT> kombo = DB_Tematy.KOMBO;
    List<TT> codzienne = DB_Tematy.CODZIENNE;
    String coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

    public static <T> List<T> sof(T... elements){
        return Arrays.asList(elements);
    }
}

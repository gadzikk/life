package db;

import metoda.M;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class DBS extends DB {
    // SYTUACJE

    public static List<W> ZBIOR_CHCIANA_SYTUACJA() {
        return of(
                CHCIANA_SYTUACJA_TRAUTO(),
                CHCIANA_SYTUACJA_TRAUTO_WCHODZISZ(),
                CHCIANA_SYTUACJA_SKLEP(),
                CHCIANA_SYTUACJA_SKLEP_WYCHODZI(),
                CHCIANA_SYTUACJA_IDZIE(),
                CHCIANA_SYTUACJA_PARZONKO(),
                CHCIANA_SYTUACJA_WZIECIE_KONTAKTU()
        );
    }

    public static W CHCIANA_SYTUACJA_TRAUTO() {
        return on(
                W.SAMA, W.SIEDZI, W.MALO_OSOB, W.POPATRZYLA,
                M.MINUT(10),
                M.CEL(W.TRANSPORT)
        );
    }

    public static W CHCIANA_SYTUACJA_TRAUTO_WCHODZISZ() {
        return on(
                W.SAMA, W.SIEDZI, W.MALO_OSOB, W.POPATRZYLA, W.MIEJSCE_OBOK,
                M.MINUT(0),
                M.CEL(W.TRANSPORT)
        );
    }

    public static W CHCIANA_SYTUACJA_SKLEP() {
        return on(
                W.SAMA, W.STOI, W._II_, W.CHODZI, W.MALO_OSOB, W.POPATRZYLA,
                M.MINUT(10),
                M.CEL(W.KUPNO_PRODUKTOW)
        );
    }

    public static W CHCIANA_SYTUACJA_SKLEP_WYCHODZI() {
        return on(
                W.SAMA, W.IDZIE_WOLNO, W.MALO_OSOB, W.POPATRZYLA,
                M.MINUT(1),
                M.CEL(W.KUPNO_PRODUKTOW)
        );
    }

    public static W CHCIANA_SYTUACJA_IDZIE() {
        return on(
                W.SAMA, W.IDZIE_WOLNO, W.WZGL_IZOLACJA, W.POPATRZYLA,
                M.MINUT(0),
                M.CEL(W.PRZEMIESZCZANIE_SIE)
        );
    }

    public static W CHCIANA_SYTUACJA_PARZONKO() {
        return on(
                W.DOPUSZCZENIE, W.USMIECHA_SIE, W.EFEKTYWNA_GADKA, W.EMOCJE, W.ZART,
                M.MINUT(0),
                M.CEL(W.NA)
        );
    }

    public static W CHCIANA_SYTUACJA_WZIECIE_KONTAKTU() {
        return on(
                W.ZNASZ, W.KILKA_PARZONEK,
                M.MINUT(0),
                M.CEL(W.NA)
        );
    }

    public static W UNIKALNA_SYTUACJA() {
        return on(
                W.UNIKALNA_JEDNOSTKA, W.UNIKALNY_WARUNEK,
                M.MINUT(0),
                M.CEL(W.NA)
        );
    }
}

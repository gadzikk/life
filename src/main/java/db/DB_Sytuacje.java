package db;

import sytuacja.Sytuacja;
import sytuacja.TypSytuacja;
import warunek.W;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class DB_Sytuacje {
    public static Sytuacja CHCIANA_TRAUTO = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.SAMA, W.SIEDZI, W.MALO_OSOB, W.POPATRZYLA),
            LocalDateTime.now().plusMinutes(10L),
            W.TRANSPORT
    );
    public static Sytuacja CHCIANA_TRAUTO_WCHODZISZ = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.SAMA, W.SIEDZI, W.MALO_OSOB, W.POPATRZYLA, W.MIEJSCE_OBOK),
            LocalDateTime.now(),
            W.TRANSPORT
    );

    public static Sytuacja CHCIANA_SKLEP = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.SAMA, W.STOI, W._II_, W.CHODZI, W.MALO_OSOB, W.POPATRZYLA),
            LocalDateTime.now().plusMinutes(10L),
            W.KUPNO_PRODUKTOW
    );
    public static Sytuacja CHCIANA_SKLEP_WYCHODZI = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.SAMA, W.IDZIE_WOLNO, W.MALO_OSOB, W.POPATRZYLA),
            LocalDateTime.now().plusMinutes(1L),
            W.KUPNO_PRODUKTOW
    );
    public static Sytuacja CHCIANA_IDZIE = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.SAMA, W.IDZIE_WOLNO, W.WZGL_IZOLACJA, W.POPATRZYLA),
            LocalDateTime.now(),
            W.PRZEMIESZCZENIE_SIE
    );
    public static Sytuacja CHCIANA_PARZONKO = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.DOPUSZCZENIE, W.USMIECHA_SIE, W.EFEKTYWNA_GADKA, W.EMOCJE, W.ZART),
            LocalDateTime.now(),
            W.NA
    );

    public static Sytuacja CHCIANA_WZIECIE_KONTAKTU = new Sytuacja(
            of(TypSytuacja.CHCIANA),
            of(W.ZNASZ, W.KILKA_PARZONEK),
            LocalDateTime.now(),
            W.NA
    );

    public static List<Sytuacja> CHCIANA_SYTUACJA = Arrays.asList(
            CHCIANA_TRAUTO,
            CHCIANA_TRAUTO_WCHODZISZ,
            CHCIANA_SKLEP,
            CHCIANA_SKLEP_WYCHODZI,
            CHCIANA_IDZIE,
            CHCIANA_PARZONKO,
            CHCIANA_WZIECIE_KONTAKTU
    );

    public static <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

}

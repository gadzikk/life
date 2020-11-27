package db;

import typy_bazowe.TypT;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class DBT extends DB {

    public static List<W> ZBIOR_TEMATY() {
        return of(
                WSTEPNY_TEMAT(),
                PODSTAWA_TEMAT(),
                UTRZYMYWACZ_TEMAT(),
                NAD_TEMAT(),
                HIERARCHIA_TEMAT(),
                RZECZ_TEMAT(),
                MIEJSCE_TEMAT(),
                ZYWE_ISTOTY_TEMAT_TEMAT(),
                SPEDZANIE_CZASU_TEMAT(),
                RELACJE_TEMAT(),
                RODZINA_TEMAT(),
                MORALNOSC_PRZEKONANIA_RELIGIA_TEMAT(),
                ZDROWIE_TEMAT(),
                MIASTA_TEMAT(),
                MARZENIA_TEMAT(),
                MOMENT_W_HISTORII_TEMAT(),
                SPORT_TEMAT(),
                GOTOWANIE_TEMAT(),
                WAKACJE_TEMAT(),
                SWIETA_TEMAT()
        );
    }

    public static W WSTEPNY_TEMAT() {
        return on(
                W.UBRANIE_WYGLAD_SZCZEGOLY, W.CEL, W.PLANY_DZIS, W.DAILY_WORRIES, W.OTOCZENIE, W.POGODA);
    }

    public static W PODSTAWA_TEMAT() {
        return on(
                W.IMIE, W.MIESZKA, W.KONTEKST);
    }

    public static W UTRZYMYWACZ_TEMAT() {
        return on(
                W.PRZEWIDZENIE, W.WNIOSKI, W.GLEBOKO, W.KONTRA, W.ANGAZ, W.COMPARE, W.ZART, W.POTWIERDZENIE,
                W.JAKI_JAKA_JAKIE, W.DUZO_MALO);
    }

    public static W NAD_TEMAT() {
        return on(
                W.WYGLAD, W.CZAS, W.MIEJSCE, W.EMOCJE_UCZUCIA, W.RZECZY_POWIAZANE, W.OSOBY_POWIAZANE,
                W.PREFERENCJE, W.ZMYSLY,
                W.DOSWIADCZENIE, W.OSTATNIO_WIDZIANE, W.COS_NOWEGO, W.PRZED_PO, W.OCZEKIWANIA_RZECZYWISTOSC,
                W.POWSZECHNOSC, W.PLUSY_MINUSY, W.KROKI, W.CENA);
    }

    public static W HIERARCHIA_TEMAT() {
        return on(
                W.WAZNE_NAJBLIZSZA_PRZYSZLOSC, W.WAZNE_DLUGA_PERSPEKTYWA, W.WAZNE_OSTATNIA_PRZESZLOSC,
                W.WAZNE_PRZESZLOSC_WPLYW_TERAZNIEJSZOSC, W.DOTYCZY_WAZNYCH_OSOB, W.PRZEWAGA, W.DOMINACJA, W.DOBRA,
                W.HIERARCHIA, W.ZASADY, W.DOSTEP);
    }

    public static W RZECZ_TEMAT() {
        return on(
                W.POTRZEBA, W.KOLOR, W.TYP, W.ATRYBUTY, W.POROWNANIE, W.CENA, W.UZYTECZNOSC, W.WYTRZYMALOSC,
                W.OSTATNIO_WIDZIANY, W.POPULARNOSC, W.PROCES_POZYSKANIA, W.ZAKUPY
        );
    }

    public static W MIEJSCE_TEMAT() {
        return on(
                W.WYSTROJ, W.KOLEJKA, W.TLOK, W.POPULARNOSC, W.DOJAZD, W.ZALETY, W.WADY, W.OKOLICA
        );
    }
    public static W ZYWE_ISTOTY_TEMAT_TEMAT() {
        return on(
                W.CECHY_CHARAKTERU, W.PLEC, W.CECHY_FIZYCZNE, W.GENY, W.NAUKA, W.PRZYWIAZANIE, W.UCZUCIA, W.UMIEJETNOSCI
        );
    }

    public static W SPEDZANIE_CZASU_TEMAT() {
        return on(
                W.DZIALANIA, W.DAILY_WORRIES, W.PRACA, W.TRENING, W.PASJA
        );
    }

    public static W RELACJE_TEMAT() {
        return on(
                W.ZACHOWANIA, W.REAKCJE, W.GENEZA_ZNAJOMOSCI
        );
    }

    public static W RODZINA_TEMAT() {
        return on(
                W.DOM, W.DZIECI, W.RODZIENSTWO, W.RODZICE, W.DZIADKOWIE
        );
    }

    public static W MORALNOSC_PRZEKONANIA_RELIGIA_TEMAT() {
        return on(
                W.MORALNOSC_PRZEKONANIA_RELIGIA
        );
    }

    public static W ZDROWIE_TEMAT() {
        return on(
                W.CODZIENNY_MAINTENCE, W.LEKARSTWA, W.SPA
        );
    }

    public static W MIASTA_TEMAT() {
        return on(
                W.BLISKOSC, W.KLIMAT, W.KOMUNIKACJA, W.LUDZIE
        );
    }

    public static W MARZENIA_TEMAT() {
        return on();
    }

    public static W MOMENT_W_HISTORII_TEMAT() {
        return on(W.MOMENT_W_HISTORII, W.CYKL_W_ZYCIU);
    }

    public static W SPORT_TEMAT() {
        return on(W.DYSCYPLINY, W.TRENERZY, W.ZDOLNI_SPORTOWCY, W.HISTORIA_TRENINGOW);
    }

    public static W GOTOWANIE_TEMAT() {
        return on(W.PRZEPIS, W.SMAK, W.RESTAURACJE);
    }

    public static W WAKACJE_TEMAT() {
        return on(W.BASENY_WODA, W.PL_ZA, W.BEZPIECZENSTWO, W.ODLEGLOSC, W.SPECYFICZNY_KRAJOBRAZ);
    }

    public static W SWIETA_TEMAT() {
        return on();
    }

}

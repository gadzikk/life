package db;

import typy_bazowe.TypKategoria;
import warunek.W;
import warunek.WarunkiKategoria;
import z_inne.Kategoria;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DB_Patologia {

    public static WarunkiKategoria PATOLOGIE_ZWIAZKU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_ZWIAZKU),
            Arrays.asList(
                    W.STARY_MLODY, W.BURZUA_ULICA, W.NIESWIADOMY_SWIADOMY,
                    W.SLABY_MOCNY, W.UZYWKI_BRAKUZYWEK, W.ZLO_DOBRO,
                    W.LEKKOSC_TRUDNOSC, W.LATWOSC_ZERWANIA, W.ZDRADA, W.BRAK_CZASU, W.ODLEGLOSC,
                    W.NIESTARANIE_SIE, W.NIC_OD_SIEBIE, W.PRZYJSCIE_NA_GOTOWO, W.AGRESJA_W_DZIALANIU
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SWIAT),
            Arrays.asList(
                    W.SAMOTNOSC, W.ZWIAZEK_HOMOSEXUALNY, W.USZCZERBEK_NA_ZDROWIU, W.BIEDA
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_INFORMACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    W.BRAK_CZASU, W.BRAK_DOSTEPU_DO_PLANSZY, W.BRAK_LUDZI, W.NIEMOZLIWOSC_MATERIALNEGO_ZNALEZIENIA_SIE,
                    W.BRAK_MOZLIWOSCI_OCENY, W.OGOLNOSC
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    W.BRAK_INFORMACJI, W.BEZ_PRZYCZYNY, W.ZLE_SKUTKI, W.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_BRAK_WSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_BRAK_WSTYDU),
            Arrays.asList(
                    W.BRAK_WIEDZY, W.BRAK_DZIALANIA
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_REZULTAT),
            Arrays.asList(
                    W.OGROMNE_KONSEKWENCJE, W.BRAK_REZULTATOW
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_PRACA),
            Arrays.asList(
                    W.KARALNOSC, W.BRAK_WYKSZTALCENIA, W.BRAK_DOSWIADCZENIA, W.BRAK_UMIEJETNOSCI,
                    W.ZADNYCH_ZNAJOMOSCI
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_ZARABIANIE),
            Arrays.asList(
                    W.BRAK_PRACY, W.BRAK_PIENIEDZY
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SPORT),
            Arrays.asList(
                    W.NIESPRAWNOSC, W.NIEZDOLNOSC_DO_WYSILKU, W.BRAK_ZGODY_OTOCZENIA
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_OSIEDLE),
            Arrays.asList(
                    W.INNE_MIASTO, W.ZLE_WYGLADA, W.BRAK_ZNAJOMYCH_W_SRODOWISKU,
                    W.PRZECIWNY, W.KONFI
            )
    );

    public static WarunkiKategoria PATOLOGIE_WSTEPNE_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_DOPUSZCZENIE),
            Arrays.asList(
                    W.NIE_PATRZY, W.NIE_REAGUJE, W.NIE_USMIECHA, W.ZLO,
                    W.NIE_KOJARZY, W.WIDZI_PIERWSZY_RAZ, W.BRAK_WSPOLNYCH_ZNAJOMYCH, W.NIEBEZPIECZENSTWO,
                    W.ZAJECIE, W.NIE_PODOBA_SIE, W.BRZYDKA, W.WSTYDZI_SIE, W.BRAK_EMOCJI
            )
    );
    public static WarunkiKategoria PATOLOGIE_WSTEPNE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_KOBIETA),
            Arrays.asList(
                    W.NIE_STWORZENIE_POINTCUTA, W.NIEZLAPANIE_POINTCUTA, W.BRAK_POZNANIA, W.NIEDOPUSZCZENIE,
                    W.BRAK_PARZONKA, W.NIESPODOBANIE_SIE, W.MINUS_GT_PLUS, W.ZAJETA,
                    W.DZIECI, W.SZLAUF, W._100_CHLOPAKOW, W.WYJEZDZENIE, W.UZYWKI,
                    W.NIESWIADOMOSC, W.BRAK_SRODOWISKA, W._1_RANDKA_KONIEC
            )
    );
    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SWIAT),
            Arrays.asList(
                    W.BRAK_ZNAJOMYCH, W.BRAK_ZWIAZKU, W.ZAGROZENIA, W.BRAK_ZRODLA_ZAROBKU
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_INFORMACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_INFORMACJA),
            Arrays.asList(
                    W.ZNIKNIECIE_INFORMACJI, W.BRAK_REZULTATU_INFORMACJI, W.BRAK_POTWIERDZENIA,
                    W.NIEMOZLIWOSC_SPRAWDZENIA
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    W.ZAPOMNIENIE, W.REGRESS_WIEDZY, W.UKRYWANIE_WIEDZY
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_BRAK_WSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    W.NIEWYKORZYSTYWANIE_INFORMACJI, W.BRAK_DZIALANIA, W.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    W.NIE_PRZEWIDYWANIE, W.UTRACENIE
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_PRACA),
            Arrays.asList(
                    W.BRAK_WYSILKU, W.NIE_UZYTECZNOSC, W.NIE_OPLACA, W.MINUS_GT_PLUS,
                    W.NIE_PRZESTRZEGANIE_ZASAD, W.ZLA_ATMOSFERA, W.BRAK_REZULTATOW, W.ZLE_STOSUNKI1VS1,
                    W.REGRESS_UMIEJETNOSCI
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_ZARABIANIE),
            Arrays.asList(
                    W.BIEDNY_SEKTOR, W.BRAK_WIEDZY, W.DUZA_KONKURENCJA, W.BIEDNY_REGION
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SPORT),
            Arrays.asList(
                    W.REGRESS_UMIEJETNOSCI
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_OSIEDLE),
            Arrays.asList(
                    W.BRAK_CELU, W.NIE_DZIALA, W.NIE_KIBICUJE, W.NIELOJALNY, W.NIE_PRZESTRZEGA_ZASAD
            )
    );

    public static WarunkiKategoria PATOLOGIE_UTRZYMANIA_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_KOBIETA),
            Arrays.asList(
                    W.NIESPELNIENIE_OCZEKIWAN, W.NIEWSPIERANIE_PREFERENCJI, W.SPEDZANIE_CZASU_OSOBNO,
                    W.ZDRADA, W.BRAK_KONTROLI,
                    W.NUDA_W_ZWIAZKU, W.NIESWIADOMOSC, W.BRAK_SRODOWISKA, W.BRAK_CZASU, W.PROBLEMY_KAZDEJ_KOBIETY,
                    W.CHWIEJNOSC
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SWIAT),
            Arrays.asList(
                    W.NIESZCZESCIE, W.ZLE_DOSWIADCZENIA, W.ZLE_WSPOMNIENIA
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_PRACA),
            Arrays.asList(
                    W.BRAK_PIENIEDZY, W.BRAK_STABILIZACJI, W.ZMUSZONY_ZAGRANICA, W.BRAK_UMIEJETNOSCI,
                    W.BRAK_WIEDZY
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_ZARABIANIE),
            Arrays.asList(
                    W.BRAK_MOZLIWOSCI_WYBORU
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SPORT),
            Arrays.asList(
                    W.NIESPRAWNOSC, W.BRAK_UMIEJETNOSCI, W.BRAK_WIEDZY
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_OSIEDLE),
            Arrays.asList(
                    W.BRAK_ZNAJOMYCH, W.BRAK_SRODOWISKA, W.BRAK_KOBIETY, W.BRAK_DOSTEPU_SILNE_JEDNOSTKI,
                    W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U, W.MARNOWANIE_CZASU, W.BRAK_AKCEPTACJI,
                    W.BRAK_DOSTEPU_PRZEWAGI
            )
    );

    public static WarunkiKategoria PATOLOGIE_KONCOWE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_KOBIETA),
            Arrays.asList(
                    W.BRAK_CODZIENNEJ_BLISKOSCI, W.ZYCIE_W_SAMOTNOSCI, W.BRAK_DZIECI,
                    W.PRZERWANIE_GENU
            )
    );

    public static WarunkiKategoria PATOLOGIE_GLOBAL_PLANSZA_LUDZIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_LUDZIE),
            Arrays.asList(
                    W.MALA_DZIETNOSC, W.BLEDY_WYCHOWANIA, W.BRAK_MIESZKANIA
            )
    );

    public static WarunkiKategoria PATOLOGIE_GLOBAL_PLANSZA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_PRACA),
            Arrays.asList(
                    W.BRAK_FIRM_NWD, W.BRAK_FIRM_WD, W.ZABURZONY_RYNEK_PLAC, W.OGROMNE_ZASOBY_LUDZKIE
            )
    );

    public static WarunkiKategoria PATOLOGIE_THREAD_WHILE_LOOP = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_THREAD_WHILE_LOOP),
            Arrays.asList(
                    W.BRAK_THREAD_WHILE_LOOP_ZASIEG_WZROKU, W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U,
                    W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_K, W.BRAK_THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    public static List<WarunkiKategoria> PATOLOGIE = Arrays.asList(
            PATOLOGIE_ZWIAZKU,
            PATOLOGIE_WSTEPNE_SWIAT,
            PATOLOGIE_WSTEPNE_INFORMACJA,
            PATOLOGIE_WSTEPNE_WIEDZA,
            PATOLOGIE_WSTEPNE_BRAK_WSTYDU,
            PATOLOGIE_WSTEPNE_REZULTAT,
            PATOLOGIE_WSTEPNE_PRACA,
            PATOLOGIE_WSTEPNE_ZARABIANIE,
            PATOLOGIE_WSTEPNE_SPORT,
            PATOLOGIE_WSTEPNE_OSIEDLE,
            PATOLOGIE_WSTEPNE_DOPUSZCZENIE,
            PATOLOGIE_WSTEPNE_KOBIETA,
            PATOLOGIE_UTRZYMANIA_SWIAT,
            PATOLOGIE_UTRZYMANIA_INFORMACJA,
            PATOLOGIE_UTRZYMANIA_WIEDZA,
            PATOLOGIE_UTRZYMANIA_BRAK_WSTYDU,
            PATOLOGIE_UTRZYMANIA_REZULTAT,
            PATOLOGIE_UTRZYMANIA_PRACA,
            PATOLOGIE_UTRZYMANIA_ZARABIANIE,
            PATOLOGIE_UTRZYMANIA_SPORT,
            PATOLOGIE_UTRZYMANIA_OSIEDLE,
            PATOLOGIE_UTRZYMANIA_KOBIETA,
            PATOLOGIE_KONCOWE_SWIAT,
            PATOLOGIE_KONCOWE_PRACA,
            PATOLOGIE_KONCOWE_ZARABIANIE,
            PATOLOGIE_KONCOWE_SPORT,
            PATOLOGIE_KONCOWE_OSIEDLE,
            PATOLOGIE_KONCOWE_KOBIETA,
            PATOLOGIE_GLOBAL_PLANSZA_LUDZIE,
            PATOLOGIE_GLOBAL_PLANSZA_PRACA,
            PATOLOGIE_THREAD_WHILE_LOOP
    );
}
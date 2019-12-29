import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DB_Patologia {

    WarunkiKategoria PATOLOGIE_ZWIAZKU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_ZWIAZKU),
            Arrays.asList(
                    Warunek.STARY_MLODY, Warunek.BURZUA_ULICA, Warunek.NIESWIADOMY_SWIADOMY,
                    Warunek.SLABY_MOCNY, Warunek.UZYWKI_BRAKUZYWEK, Warunek.ZLO_DOBRO,
                    Warunek.LEKKOSC_TRUDNOSC, Warunek.LATWOSC_ZERWANIA, Warunek.ZDRADA, Warunek.BRAK_CZASU, Warunek.ODLEGLOSC
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SWIAT),
            Arrays.asList(
                    Warunek.SAMOTNOSC, Warunek.ZWIAZEK_HOMOSEXUALNY, Warunek.USZCZERBEK_NA_ZDROWIU, Warunek.BIEDA
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_INFORMACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    Warunek.BRAK_CZASU, Warunek.BRAK_DOSTEPU_DO_PLANSZY, Warunek.BRAK_LUDZI, Warunek.NIEMOZLIWOSC_MATERIALNEGO_ZNALEZIENIA_SIE,
                    Warunek.BRAK_MOZLIWOSCI_OCENY, Warunek.OGOLNOSC
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    Warunek.BRAK_INFORMACJI, Warunek.BEZ_PRZYCZYNY, Warunek.ZLE_SKUTKI, Warunek.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_BRAK_WSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_BRAK_WSTYDU),
            Arrays.asList(
                    Warunek.BRAK_WIEDZY, Warunek.BRAK_DZIALANIA
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_REZULTAT),
            Arrays.asList(
                    Warunek.OGROMNE_KONSEKWENCJE, Warunek.BRAK_REZULTATOW
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_PRACA),
            Arrays.asList(
                    Warunek.KARALNOSC, Warunek.BRAK_WYKSZTALCENIA, Warunek.BRAK_DOSWIADCZENIA, Warunek.BRAK_UMIEJETNOSCI,
                    Warunek.ZADNYCH_ZNAJOMOSCI
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_ZARABIANIE),
            Arrays.asList(
                    Warunek.BRAK_PRACY, Warunek.BRAK_PIENIEDZY
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SPORT),
            Arrays.asList(
                    Warunek.NIESPRAWNOSC, Warunek.NIEZDOLNOSC_DO_WYSILKU, Warunek.BRAK_ZGODY_OTOCZENIA
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_OSIEDLE),
            Arrays.asList(
                    Warunek.INNE_MIASTO, Warunek.ZLE_WYGLADA, Warunek.BRAK_ZNAJOMYCH_W_SRODOWISKU,
                    Warunek.PRZECIWNY, Warunek.KONFI
            )
    );

    WarunkiKategoria PATOLOGIE_WSTEPNE_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.NIE_PATRZY, Warunek.NIE_REAGUJE, Warunek.NIE_USMIECHA, Warunek.ZLO,
                    Warunek.NIE_KOJARZY, Warunek.WIDZI_PIERWSZY_RAZ, Warunek.BRAK_WSPOLNYCH_ZNAJOMYCH, Warunek.NIEBEZPIECZENSTWO,
                    Warunek.ZAJECIE, Warunek.NIE_PODOBA_SIE, Warunek.BRZYDKA, Warunek.WSTYDZI_SIE, Warunek.BRAK_EMOCJI
            )
    );
    WarunkiKategoria PATOLOGIE_WSTEPNE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_KOBIETA),
            Arrays.asList(
                    Warunek.NIE_STWORZENIE_POINTCUTA, Warunek.NIEZLAPANIE_POINTCUTA, Warunek.BRAK_POZNANIA, Warunek.NIEDOPUSZCZENIE,
                    Warunek.BRAK_PARZONKA, Warunek.NIESPODOBANIE_SIE, Warunek.MINUS_GT_PLUS, Warunek.ZAJETA
            )
    );
    WarunkiKategoria PATOLOGIE_UTRZYMANIA_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SWIAT),
            Arrays.asList(
                    Warunek.BRAK_ZNAJOMYCH, Warunek.BRAK_ZWIAZKU, Warunek.ZAGROZENIA, Warunek.BRAK_ZRODLA_ZAROBKU
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_INFORMACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_INFORMACJA),
            Arrays.asList(
                    Warunek.ZNIKNIECIE_INFORMACJI, Warunek.BRAK_REZULTATU_INFORMACJI, Warunek.BRAK_POTWIERDZENIA,
                    Warunek.NIEMOZLIWOSC_SPRAWDZENIA
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.ZAPOMNIENIE, Warunek.REGRESS_WIEDZY, Warunek.UKRYWANIE_WIEDZY
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_BRAK_WSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.NIEWYKORZYSTYWANIE_INFORMACJI, Warunek.BRAK_DZIALANIA, Warunek.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.NIE_PRZEWIDYWANIE, Warunek.UTRACENIE
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_PRACA),
            Arrays.asList(
                    Warunek.BRAK_WYSILKU, Warunek.NIE_UZYTECZNOSC, Warunek.NIE_OPLACA, Warunek.MINUS_GT_PLUS,
                    Warunek.NIE_PRZESTRZEGANIE_ZASAD, Warunek.ZLA_ATMOSFERA, Warunek.BRAK_REZULTATOW, Warunek.ZLE_STOSUNKI1VS1,
                    Warunek.REGRESS_UMIEJETNOSCI
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_ZARABIANIE),
            Arrays.asList(
                    Warunek.BIEDNY_SEKTOR, Warunek.BRAK_WIEDZY, Warunek.DUZA_KONKURENCJA, Warunek.BIEDNY_REGION
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SPORT),
            Arrays.asList(
                    Warunek.REGRESS_UMIEJETNOSCI
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_OSIEDLE),
            Arrays.asList(
                    Warunek.BRAK_CELU, Warunek.NIE_DZIALA, Warunek.NIE_KIBICUJE, Warunek.NIELOJALNY, Warunek.NIE_PRZESTRZEGA_ZASAD
            )
    );

    WarunkiKategoria PATOLOGIE_UTRZYMANIA_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_KOBIETA),
            Arrays.asList(
                    Warunek.NIESPELNIENIE_OCZEKIWAN, Warunek.NIEWSPIERANIE_PREFERENCJI, Warunek.SPEDZANIE_CZASU_OSOBNO,
                    Warunek.ZDRADA, Warunek.BRAK_KONTROLI
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SWIAT),
            Arrays.asList(
                    Warunek.NIESZCZESCIE, Warunek.ZLE_DOSWIADCZENIA, Warunek.ZLE_WSPOMNIENIA
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_PRACA),
            Arrays.asList(
                    Warunek.BRAK_PIENIEDZY, Warunek.BRAK_STABILIZACJI, Warunek.ZMUSZONY_ZAGRANICA, Warunek.BRAK_UMIEJETNOSCI,
                    Warunek.BRAK_WIEDZY
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_ZARABIANIE),
            Arrays.asList(
                    Warunek.BRAK_MOZLIWOSCI_WYBORU
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SPORT),
            Arrays.asList(
                    Warunek.NIESPRAWNOSC, Warunek.BRAK_UMIEJETNOSCI, Warunek.BRAK_WIEDZY
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_OSIEDLE),
            Arrays.asList(
                    Warunek.BRAK_ZNAJOMYCH, Warunek.BRAK_SRODOWISKA, Warunek.BRAK_KOBIETY, Warunek.BRAK_DOSTEPU_SILNE_JEDNOSTKI,
                    Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U, Warunek.MARNOWANIE_CZASU, Warunek.BRAK_AKCEPTACJI,
                    Warunek.BRAK_DOSTEPU_PRZEWAGI
            )
    );

    WarunkiKategoria PATOLOGIE_KONCOWE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_KOBIETA),
            Arrays.asList(
                    Warunek.BRAK_CODZIENNEJ_BLISKOSCI, Warunek.ZYCIE_W_SAMOTNOSCI, Warunek.BRAK_DZIECI,
                    Warunek.PRZERWANIE_GENU
            )
    );

    WarunkiKategoria PATOLOGIE_GLOBAL_PLANSZA_LUDZIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_LUDZIE),
            Arrays.asList(
                    Warunek.MALA_DZIETNOSC, Warunek.BLEDY_WYCHOWANIA, Warunek.BRAK_MIESZKANIA
            )
    );

    WarunkiKategoria PATOLOGIE_GLOBAL_PLANSZA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_PRACA),
            Arrays.asList(
                    Warunek.BRAK_FIRM_NWD, Warunek.BRAK_FIRM_WD, Warunek.ZABURZONY_RYNEK_PLAC, Warunek.OGROMNE_ZASOBY_LUDZKIE
            )
    );

    WarunkiKategoria PATOLOGIE_THREAD_WHILE_LOOP = new WarunkiKategoria(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.BRAK_THREAD_WHILE_LOOP_ZASIEG_WZROKU, Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_K, Warunek.BRAK_THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    List<WarunkiKategoria> PATOLOGIE = Arrays.asList(
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
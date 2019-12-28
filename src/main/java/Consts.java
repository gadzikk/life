import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 22.12.19.
 */
public class Consts {

    KategoriaWarunki WYMAGANIA_WSTEPNE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZWIAZEK_2_OSOB,
                    Warunek.URODZENIE_SIE,
                    Warunek.ZDROWIE,
                    Warunek.BYT_MATERIALNY)
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_INFORMACJA = new KategoriaWarunki(
            new Kategoria(
                    TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.DOSTEP_DO_PLANSZY,
                    Warunek.LUDZIE,
                    Warunek.MATERIALNE_ZNALEZIENIE_SIE,
                    Warunek.SONDA,
                    Warunek.SZCZEGOLY
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.PRZYCZYNA,
                    Warunek.SKUTEK,
                    Warunek.WNIOSKI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_BRAKWSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.WIEDZA,
                    Warunek.DZIALANIE
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.DZIALANIE,
                    Warunek.KONSEKWENCJE,
                    Warunek.WNIOSKI,
                    Warunek.REZULTAT
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.WYKSZTALCENIE,
                    Warunek.DOSWIADCZENIE,
                    Warunek.UMIEJETNOSCI,
                    Warunek.ZNAJOMOSCI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.STUDIA,
                    Warunek.KILKA_LAT_DOSWIADCZENIA,
                    Warunek.WIELE_UMIEJETNOSCI,
                    Warunek.Z_POLECENIA
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.UMOWA_PRACA,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.TO_SAMO_MIASTO,
                    Warunek.DOBRZE_WYGLADA,
                    Warunek.ZNAJOMY_W_SRODOWISKU,
                    Warunek.NIE_PRZECIWNY,
                    Warunek.NIE_KONFI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_DOPUSZCZENIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.PATRZY,
                    Warunek.REAGUJE,
                    Warunek.USMIECHA,
                    Warunek.DOBRO,

                    Warunek.KOJARZY,
                    Warunek.KTORYS_RAZ,
                    Warunek.WSPOLNI_ZNAJOMI,

                    Warunek.BEZPIECZENSTWO,
                    Warunek.NUDA,
                    Warunek.PODOBA_SIE,

                    Warunek.MUSI_DOPUSCIC
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.STWORZENIE_POINTCUTA,
                    Warunek.ZLAPANIE_POINTCUTA,
                    Warunek.POZNANIE,
                    Warunek.DOPUSZCZENIE,

                    Warunek.PARZONKO_XKILKA,
                    Warunek.SPODOBANIE_SIE,

                    Warunek.PLUS_GT_MINUS,
                    Warunek.WOLNA
            )
    );


    List<KategoriaWarunki> WYMAGANIA_WSTEPNE = Arrays.asList(
            WYMAGANIA_WSTEPNE_SWIAT,
            WYMAGANIA_WSTEPNE_INFORMACJA,
            WYMAGANIA_WSTEPNE_WIEDZA,
            WYMAGANIA_WSTEPNE_BRAKWSTYDU,
            WYMAGANIA_WSTEPNE_REZULTAT,
            WYMAGANIA_WSTEPNE_PRACA,
            WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA,
            WYMAGANIA_WSTEPNE_ZARABIANIE,
            WYMAGANIA_WSTEPNE_SPORT,
            WYMAGANIA_WSTEPNE_OSIEDLE,
            WYMAGANIA_WSTEPNE_DOPUSZCZENIE,
            WYMAGANIA_WSTEPNE_KOBIETA
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SWOJ_ZWIAZEK,
                    Warunek.UNIKANIE_ZAGROZEN,
                    Warunek.DBANIE_ZDROWIE,
                    Warunek.ZARABIANIE)
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_INFORMACJA = new KategoriaWarunki(
            new Kategoria(
                    TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.SLEDZENIE_INFORMACJI,
                    Warunek.REZULTAT_INFORMACJI,
                    Warunek.POTWIERDZENIE_Z_KIMS,
                    Warunek.SPRAWDZENIE_SAMEMU
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.ODSWIEZANIE,
                    Warunek.PAMIEC,
                    Warunek.ULEPSZANIE,
                    Warunek.DZIELENIE_SIE_WIEDZA
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_BRAKWSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.WNIOSKI
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.UNIKNIECIE_KONSEKWENCJI,
                    Warunek.PRZEWIDYWANIE,
                    Warunek.REZULTAT,
                    Warunek.UTRZYMANIE
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.OPLACA,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.PRZESTRZEGANIE_ZASAD,
                    Warunek.ATMOSFERA,
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.REZULTATY,
                    Warunek.OPLACA,
                    Warunek.STOSUNEK1VS1,
                    Warunek.ULEPSZANIE_UMIEJETNOSCI,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.BOGATY_SEKTOR,
                    Warunek.WIEDZA,
                    Warunek.NISZA,
                    Warunek.REGION
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.ULEPSZANIE_UMIEJETNOSCI,
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.CZESTO_Z_CELEM,
                    Warunek.DZIALANIE,
                    Warunek.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                    Warunek.STO_PRO_LOJALNY,
                    Warunek.PRZESTRZEGANIE_ZASAD
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.DOBRZE_ZNA,
                    Warunek.WSPOLNI_ZNAJOMI,
                    Warunek.BEZPIECZENSTWO,
                    Warunek.EMOCJE,
                    Warunek.PODOBA_SIE,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.SPELNIENIE_OCZEKIWAN,
                    Warunek.WSPIERANIE_PREFERENCJI,
                    Warunek.ODKRYWANIE_SWIATA,
                    Warunek.SPEDZANIE_CZASU,
                    Warunek.WIERNOSC,
                    Warunek.ZGODA_OTOCZENIA,

                    Warunek.PILNOWANIE,
                    Warunek.KONTROLA
            )
    );

    List<KategoriaWarunki> WYMAGANIA_UTRZYMANIA = Arrays.asList(
            WYMAGANIA_UTRZYMANIA_SWIAT,
            WYMAGANIA_UTRZYMANIA_INFORMACJA,
            WYMAGANIA_UTRZYMANIA_WIEDZA,
            WYMAGANIA_UTRZYMANIA_BRAKWSTYDU,
            WYMAGANIA_UTRZYMANIA_REZULTAT,
            WYMAGANIA_UTRZYMANIA_PRACA,
            WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA,
            WYMAGANIA_UTRZYMANIA_ZARABIANIE,
            WYMAGANIA_UTRZYMANIA_SPORT,
            WYMAGANIA_UTRZYMANIA_OSIEDLE,
            WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE,
            WYMAGANIA_UTRZYMANIA_KOBIETA
    );

    KategoriaWarunki WARUNKI_KONCOWE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.SZCZESCIE,
                    Warunek.DOSWIADCZENIA,
                    Warunek.WSPOMNIENIA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.PIENIADZE,
                    Warunek.STABILIZACJA,
                    Warunek.BEZPIECZENSTWO,
                    Warunek.POZOSTANIE_W_KRAJU,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.MOZLIWOSC_WYBORU
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.SPRAWNOSC,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SRODOWISKO,
                    Warunek.KOBIETA,
                    Warunek.SILNE_JEDNOSTKI,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.OSZCZEDNOSC_CZASU,
                    Warunek.AKCEPTACJA,
                    Warunek.LATWY_DOSTEP_PRZEWAGI
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.CODZIENNA_BLISKOSC,
                    Warunek.ZYCIE_RAZEM,
                    Warunek.DZIECI
            )
    );

    List<KategoriaWarunki> WARUNKI_KONCOWE = Arrays.asList(
            WARUNKI_KONCOWE_SWIAT,
            WARUNKI_KONCOWE_PRACA,
            WARUNKI_KONCOWE_ZARABIANIE,
            WARUNKI_KONCOWE_SPORT,
            WARUNKI_KONCOWE_OSIEDLE,
            WARUNKI_KONCOWE_KOBIETA
    );

    KategoriaWarunki PRZYCZYNY_ZLA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZYCZYNY_ZLA),
            Arrays.asList(
                    Warunek.ZLE_GENY,
                    Warunek.GLUPOTA,
                    Warunek.NIESWIADOMOSC,
                    Warunek.DZIALANIE_ZA_NAMOWA
            )
    );

    KategoriaWarunki PRZYCZYNY_DOBRA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZYCZYNY_DOBRA),
            Arrays.asList(
                    Warunek.MADROSC,
                    Warunek.WYCHOWANIE,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    KategoriaWarunki WARTOSC = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    Warunek.WYGODY,
                    Warunek.ROZRYWKI,
                    Warunek.PIENIADZE,
                    Warunek.SRODOWISKO,
                    Warunek.ZASADY,
                    Warunek.UMIEJETNOSCI
            )
    );

    KategoriaWarunki GLOBAL_PLANSZA_LUDZIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.LUDZIE),
            Arrays.asList(
                    Warunek.DZIETNOSC,
                    Warunek.WYCHOWANIE,
                    Warunek.MIESZKANIE
            )
    );

    KategoriaWarunki GLOBAL_PLANSZA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                    Warunek.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                    Warunek.RYNEK_PLAC,
                    Warunek.ZASOBY_LUDZKIE
            )
    );

    KategoriaWarunki OCENIA_WEDLUG = new KategoriaWarunki(
            new Kategoria(TypKategoria.OCENIA_WEDLUG),
            Arrays.asList(
                    Warunek.ZLO,
                    Warunek.DOBRO,
                    Warunek.PODOBIENSTWO,
                    Warunek.ZYSK,
                    Warunek.EKIPA,
                    Warunek.PRZEWAGA,
                    Warunek.UMIEJETNOSC
            )
    );

    KategoriaWarunki THREAD_WHILE_LOOP = new KategoriaWarunki(
            new Kategoria(TypKategoria.THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.THREAD_WHILE_LOOP_ZASIEG_WZROKU,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_K,
                    Warunek.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    KategoriaWarunki PRZEWAGI = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZEWAGI),
            Arrays.asList(
                    Warunek.ZNAJOMI, Warunek.OSIEDLOWE_SRD, Warunek.KOBIETA,
                    Warunek.SZANSA_ZNAJOMI, Warunek.SZANSA_OSIEDLOWE_SRD, Warunek.SZANSA_KOBIETA,
                    Warunek.INFORMACJA, Warunek.CZAS, Warunek.WIEDZA, Warunek.BRAK_WSTYDU,
                    Warunek.LUDZIE_ZA_TOBA, Warunek.WALKA_PIESCI, Warunek.WALKA_SPRZET,
                    Warunek.UMIEJETNOSC,
                    Warunek.PRACA, Warunek.PIENIADZE,
                    Warunek.WYSOKA_POZYCJA
            )
    );

    KategoriaWarunki ZAGROZENIA = new KategoriaWarunki(
            new Kategoria(TypKategoria.ZAGROZENIA),
            Arrays.asList(
                    Warunek.STRATA_WOLNOSCI, Warunek.STRATA_CZASU, Warunek.STRATA_INFORMACJI, Warunek.STRATA_WIEDZY,
                    Warunek.STRATA_DOSTEPU_PLANSZA, Warunek.STRATA_DOSTEPU_ZNAJOMI, Warunek.STRATA_MIEJSCA_W_HIERARCHII, Warunek.STRATA_POZYCJI,
                    Warunek.STRATA_ZDROWIA, Warunek.STRATA_HONORU,
                    Warunek.STRATA_PRACY, Warunek.STRATA_PIENIEDZY, Warunek.STRATA_ZARABIANIA, Warunek.STRATA_WYKSZTALCENIA,
                    Warunek.STRATA_KOBIETY
            )
    );

    KategoriaWarunki ZASADY = new KategoriaWarunki(
            new Kategoria(TypKategoria.ZASADY),
            Arrays.asList(
                    Warunek.PRAWO, Warunek.NIE_KONFI, Warunek.NIE_PRZECIWNA
            )
    );

    KategoriaWarunki POTRZEBY = new KategoriaWarunki(
            new Kategoria(TypKategoria.POTRZEBA),
            Arrays.asList(
                    Warunek.KONTAKTU, Warunek.AKCEPTACJI, Warunek.DOBRYCH_JEDNOSTKEK, Warunek.ZWIAZKU, Warunek.ZROZUMIENIA,
                    Warunek.HIGIENY, Warunek.UBRANIA, Warunek.RELIGII, Warunek.ROZRYWKI, Warunek.RUCHU
            )
    );

    KategoriaWarunki PRZYMUS = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZYMUS),
            Arrays.asList(
                    Warunek.JEDZENIE, Warunek.PICIE, Warunek.PRACA, Warunek.EDUKACJA, Warunek.PRZEMIESZCZANIE_SIE,
                    Warunek.TRANSPORT, Warunek.KUPNO_PRODUKTOW
            )
    );

    KategoriaWarunki NIESPRAWIEDLIWOSC = new KategoriaWarunki(
            new Kategoria(TypKategoria.NIESPRAWIEDLIWOSC),
            Arrays.asList(
                    Warunek.PRACA_XCZASU_BRAK_REZULATU, Warunek.WDUPCANIE_WYSILKU_DO_PIECA,
                    Warunek.NADUZYWANIE_WYSOKIEJ_POZYCJI, Warunek.GORZEJ_NA_STARCIE, Warunek.PRZEWAGA_NA_STARCIE,
                    Warunek.STRONNICZOSC, Warunek.WYKLUCZENIE
            )
    );

    KategoriaWarunki DOBRY = new KategoriaWarunki(
            new Kategoria(TypKategoria.DOBRY),
            Arrays.asList(
                    Warunek.ROBIENIE_PROGRESU, Warunek.ZDOBYWANIE_UMIEJETNOSCI, Warunek.ZDOBYWANIE_WIEDZY, Warunek.ZDOBYWANIE_SILY,
                    Warunek.USWIADAMIANIE, Warunek.WYCIAGANIE_ZE_ZLEJ_SYTUACJI, Warunek.ZMNIEJSZANIE_ZLA, Warunek.ROBIENIE_OPCJI,
                    Warunek.PRZEKONYWANIE_ZA, Warunek.POLECENIE,
                    Warunek.PRAWDA, Warunek.CIERPLIWOSC,
                    Warunek.TRZEZWOSC,
                    Warunek.MADROSC,
                    Warunek.NOWY_DEFAULT_DOBRA_OSOBA,
                    Warunek.NIEPOZWALA_NA_ZLO
            )
    );

    KategoriaWarunki ZLY = new KategoriaWarunki(
            new Kategoria(TypKategoria.ZLY),
            Arrays.asList(
                    Warunek.MARNOWANIE_CZASU, Warunek.POZBAWIANIE_UMIEJETNOSCI, Warunek.POZBAWIANIE_WIEDZY, Warunek.POZBAWIANIE_SILY,
                    Warunek.OGLUPIANIE, Warunek.WDUPCANIE_W_ZLE_WARUNKI, Warunek.ZAMYKANIE_OPCJI, Warunek.PRZEKONYWANIE_PRZECIW,
                    Warunek.PRZEKONYWANIE_ZA, Warunek.POLECENIE,
                    Warunek.KLAMSTWO, Warunek.AGRESJA,
                    Warunek.ODUZENIE,
                    Warunek.GLUPOTA,
                    Warunek.NOWY_DEFAULT_RYWAL,
                    Warunek.JEBIE_DOBRO, Warunek.WYMAGA_PRZEWAG_NA_ZLU
            )
    );

    KategoriaWarunki WYMUSZENIE_REAKCJI = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMUSZENIE_REAKCJI),
            Arrays.asList(
                    Warunek.KONTEKST, Warunek.OSKARZENIE, Warunek.ULTIMATUM, Warunek.CISNIECIE
            )
    );

    KategoriaWarunki REAKCJA = new KategoriaWarunki(
            new Kategoria(TypKategoria.REAKCJA),
            Arrays.asList(
                    Warunek.BRAK_ODPOWIEDZI, Warunek.PRZESTRASZENIE_SIE, Warunek.UCIECIE,
                    Warunek.ODPOWIEDZ_ODCZEP, Warunek.ODPOWIEDZ_NEUTRAL, Warunek.ODPOWIEDZ_ZAINTERESOWANIE,
                    Warunek.EKSCYTACJA, Warunek.PRZEJCIE_INICJATYWY
            )
    );

    KategoriaWarunki SONDA_GDY = new KategoriaWarunki(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_GDY),
            Arrays.asList(
                    Warunek.WIDZISZ, Warunek.MOWI, Warunek.ROBI, Warunek.POSIADA
            )
    );

    KategoriaWarunki SONDA_PO = new KategoriaWarunki(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_PO),
            Arrays.asList(
                    Warunek.OCZY, Warunek.REAGOWANIE, Warunek.CHODZENIE, Warunek.POSTURA, Warunek.ZACHOWANIE,
                    Warunek.MOWA, Warunek.ZNAJOMI
            )
    );

    KategoriaWarunki KRYTERIA_WROGA = new KategoriaWarunki(
            new Kategoria(TypKategoria.KRYTERIA_WROGA),
            Arrays.asList(
                    Warunek.PRZECIWNA_RASA, Warunek.PRZECIWNY_NAROD, Warunek.PRZECIWNA_KLASA, Warunek.PRZECIWNY_KLUB,
                    Warunek.PRZECIWNA_STRONA, Warunek.ZASZKODZIL
            )
    );

    List<KategoriaWarunki> INNE = Arrays.asList(
            PRZYCZYNY_ZLA,
            PRZYCZYNY_DOBRA,
            WARTOSC,
            GLOBAL_PLANSZA_LUDZIE,
            GLOBAL_PLANSZA_PRACA,
            OCENIA_WEDLUG,
            THREAD_WHILE_LOOP,
            PRZEWAGI,
            ZAGROZENIA,
            ZASADY,
            POTRZEBY,
            PRZYMUS,
            NIESPRAWIEDLIWOSC,
            DOBRY,
            ZLY,
            WYMUSZENIE_REAKCJI,
            REAKCJA,
            SONDA_GDY,
            SONDA_PO,
            KRYTERIA_WROGA
    );

    KategoriaWarunki PATOLOGIE_ZWIAZKU = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_ZWIAZKU),
            Arrays.asList(
                    Warunek.STARY_MLODY, Warunek.BURZUA_ULICA, Warunek.NIESWIADOMY_SWIADOMY,
                    Warunek.SLABY_MOCNY, Warunek.UZYWKI_BRAKUZYWEK, Warunek.ZLO_DOBRO,
                    Warunek.LEKKOSC_TRUDNOSC, Warunek.LATWOSC_ZERWANIA, Warunek.ZDRADA, Warunek.BRAK_CZASU, Warunek.ODLEGLOSC
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SWIAT),
            Arrays.asList(
                    Warunek.SAMOTNOSC, Warunek.ZWIAZEK_HOMOSEXUALNY, Warunek.USZCZERBEK_NA_ZDROWIU, Warunek.BIEDA
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_INFORMACJA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    Warunek.BRAK_CZASU, Warunek.BRAK_DOSTEPU_DO_PLANSZY, Warunek.BRAK_LUDZI, Warunek.NIEMOZLIWOSC_MATERIALNEGO_ZNALEZIENIA_SIE,
                    Warunek.BRAK_MOZLIWOSCI_OCENY, Warunek.OGOLNOSC
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_INFORMACJA),
            Arrays.asList(
                    Warunek.BRAK_INFORMACJI, Warunek.BEZ_PRZYCZYNY, Warunek.ZLE_SKUTKI, Warunek.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_BRAK_WSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_BRAK_WSTYDU),
            Arrays.asList(
                    Warunek.BRAK_WIEDZY, Warunek.BRAK_DZIALANIA
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_REZULTAT),
            Arrays.asList(
                    Warunek.OGROMNE_KONSEKWENCJE, Warunek.BRAK_REZULTATOW
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_PRACA),
            Arrays.asList(
                    Warunek.KARALNOSC, Warunek.BRAK_WYKSZTALCENIA, Warunek.BRAK_DOSWIADCZENIA, Warunek.BRAK_UMIEJETNOSCI,
                    Warunek.ZADNYCH_ZNAJOMOSCI
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_ZARABIANIE),
            Arrays.asList(
                    Warunek.BRAK_PRACY, Warunek.BRAK_PIENIEDZY
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_SPORT),
            Arrays.asList(
                    Warunek.NIESPRAWNOSC, Warunek.NIEZDOLNOSC_DO_WYSILKU, Warunek.BRAK_ZGODY_OTOCZENIA
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_OSIEDLE),
            Arrays.asList(
                    Warunek.INNE_MIASTO, Warunek.ZLE_WYGLADA, Warunek.BRAK_ZNAJOMYCH_W_SRODOWISKU,
                    Warunek.PRZECIWNY, Warunek.KONFI
            )
    );

    KategoriaWarunki PATOLOGIE_WSTEPNE_DOPUSZCZENIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.NIE_PATRZY, Warunek.NIE_REAGUJE, Warunek.NIE_USMIECHA, Warunek.ZLO,
                    Warunek.NIE_KOJARZY, Warunek.WIDZI_PIERWSZY_RAZ, Warunek.BRAK_WSPOLNYCH_ZNAJOMYCH, Warunek.NIEBEZPIECZENSTWO,
                    Warunek.ZAJECIE, Warunek.NIE_PODOBA_SIE, Warunek.BRZYDKA, Warunek.WSTYDZI_SIE, Warunek.BRAK_EMOCJI
            )
    );
    KategoriaWarunki PATOLOGIE_WSTEPNE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_WSTEPNE_KOBIETA),
            Arrays.asList(
                    Warunek.NIE_STWORZENIE_POINTCUTA, Warunek.NIEZLAPANIE_POINTCUTA, Warunek.BRAK_POZNANIA, Warunek.NIEDOPUSZCZENIE,
                    Warunek.BRAK_PARZONKA, Warunek.NIESPODOBANIE_SIE, Warunek.MINUS_GT_PLUS, Warunek.ZAJETA
            )
    );
    KategoriaWarunki PATOLOGIE_UTRZYMANIA_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SWIAT),
            Arrays.asList(
                    Warunek.BRAK_ZNAJOMYCH, Warunek.BRAK_ZWIAZKU, Warunek.ZAGROZENIA, Warunek.BRAK_ZRODLA_ZAROBKU
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_INFORMACJA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_INFORMACJA),
            Arrays.asList(
                    Warunek.ZNIKNIECIE_INFORMACJI, Warunek.BRAK_REZULTATU_INFORMACJI, Warunek.BRAK_POTWIERDZENIA,
                    Warunek.NIEMOZLIWOSC_SPRAWDZENIA
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.ZAPOMNIENIE, Warunek.REGRESS_WIEDZY, Warunek.UKRYWANIE_WIEDZY
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_BRAK_WSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.NIEWYKORZYSTYWANIE_INFORMACJI, Warunek.BRAK_DZIALANIA, Warunek.NIE_WYCIAGANIE_WNIOSKOW
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_WIEDZA),
            Arrays.asList(
                    Warunek.NIE_PRZEWIDYWANIE, Warunek.UTRACENIE
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_PRACA),
            Arrays.asList(
                    Warunek.BRAK_WYSILKU, Warunek.NIE_UZYTECZNOSC, Warunek.NIE_OPLACA, Warunek.MINUS_GT_PLUS,
                    Warunek.NIE_PRZESTRZEGANIE_ZASAD, Warunek.ZLA_ATMOSFERA, Warunek.BRAK_REZULTATOW, Warunek.ZLE_STOSUNKI1VS1,
                    Warunek.REGRESS_UMIEJETNOSCI
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_ZARABIANIE),
            Arrays.asList(
                    Warunek.BIEDNY_SEKTOR, Warunek.BRAK_WIEDZY, Warunek.DUZA_KONKURENCJA, Warunek.BIEDNY_REGION
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_SPORT),
            Arrays.asList(
                    Warunek.REGRESS_UMIEJETNOSCI
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_OSIEDLE),
            Arrays.asList(
                    Warunek.BRAK_CELU, Warunek.NIE_DZIALA, Warunek.NIE_KIBICUJE, Warunek.NIELOJALNY, Warunek.NIE_PRZESTRZEGA_ZASAD
            )
    );

    KategoriaWarunki PATOLOGIE_UTRZYMANIA_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_UTRZYMANIA_KOBIETA),
            Arrays.asList(
                    Warunek.NIESPELNIENIE_OCZEKIWAN, Warunek.NIEWSPIERANIE_PREFERENCJI, Warunek.SPEDZANIE_CZASU_OSOBNO,
                    Warunek.ZDRADA, Warunek.BRAK_KONTROLI
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SWIAT),
            Arrays.asList(
                    Warunek.NIESZCZESCIE, Warunek.ZLE_DOSWIADCZENIA, Warunek.ZLE_WSPOMNIENIA
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_PRACA),
            Arrays.asList(
                    Warunek.BRAK_PIENIEDZY, Warunek.BRAK_STABILIZACJI, Warunek.ZMUSZONY_ZAGRANICA, Warunek.BRAK_UMIEJETNOSCI,
                    Warunek.BRAK_WIEDZY
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_ZARABIANIE),
            Arrays.asList(
                    Warunek.BRAK_MOZLIWOSCI_WYBORU
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_SPORT),
            Arrays.asList(
                    Warunek.NIESPRAWNOSC, Warunek.BRAK_UMIEJETNOSCI, Warunek.BRAK_WIEDZY
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_OSIEDLE),
            Arrays.asList(
                    Warunek.BRAK_ZNAJOMYCH, Warunek.BRAK_SRODOWISKA, Warunek.BRAK_KOBIETY, Warunek.BRAK_DOSTEPU_SILNE_JEDNOSTKI,
                    Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U, Warunek.MARNOWANIE_CZASU, Warunek.BRAK_AKCEPTACJI,
                    Warunek.BRAK_DOSTEPU_PRZEWAGI
            )
    );

    KategoriaWarunki PATOLOGIE_KONCOWE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_KONCOWE_KOBIETA),
            Arrays.asList(
                    Warunek.BRAK_CODZIENNEJ_BLISKOSCI, Warunek.ZYCIE_W_SAMOTNOSCI, Warunek.BRAK_DZIECI,
                    Warunek.PRZERWANIE_GENU
            )
    );

    KategoriaWarunki PATOLOGIE_GLOBAL_PLANSZA_LUDZIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_LUDZIE),
            Arrays.asList(
                    Warunek.MALA_DZIETNOSC, Warunek.BLEDY_WYCHOWANIA, Warunek.BRAK_MIESZKANIA
            )
    );

    KategoriaWarunki PATOLOGIE_GLOBAL_PLANSZA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_GLOBAL_PLANSZA_PRACA),
            Arrays.asList(
                    Warunek.BRAK_FIRM_NWD, Warunek.BRAK_FIRM_WD, Warunek.ZABURZONY_RYNEK_PLAC, Warunek.OGROMNE_ZASOBY_LUDZKIE
            )
    );

    KategoriaWarunki PATOLOGIE_THREAD_WHILE_LOOP = new KategoriaWarunki(
            new Kategoria(TypKategoria.PATOLOGIA, TypKategoria.PATOLOGIE_THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.BRAK_THREAD_WHILE_LOOP_ZASIEG_WZROKU, Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_K, Warunek.BRAK_THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    List<KategoriaWarunki> PATOLOGIE = Arrays.asList(
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


    public enum HotSpot {
        PRZYSTANEK, TRAUTO,
        SKLEP, RESTAURACJA,
        KOLEJKA, UJSCIE, SCHODY,
        PARKING,
        OSIEDLE_MSC_SRODOWISKOWE
    }

    public enum HotTopic {
        POWIAZANE_Z_WYGLADEM_UBIOREM, WYWOLUJACE_EMOCJE, WYNIK, PRZEWIDYWANIE, POWIAZANE_Z_HOBBY, INTERESUJACE, POWIAZANE_Z_OSOBAMI,
        // todo
        GLEBOKIE, SENTYMENTALNE, HISTORIE,
    }


    public enum Warunek {
        // *** *** *** *** *** *** *** *** *** WSTEPNE *** *** *** *** *** *** *** ***

        // SWIAT
        ZWIAZEK_2_OSOB, URODZENIE_SIE, ZDROWIE, BYT_MATERIALNY,

        // INFORMACJA
        CZAS, DOSTEP_DO_PLANSZY, LUDZIE, MATERIALNE_ZNALEZIENIE_SIE, SONDA, SZCZEGOLY,

        // WIEDZA
        INFORMACJA, PRZYCZYNA, SKUTEK, WNIOSKI,

        // BRAK_WSTYDU
        /* INFORMACJA,*/  WIEDZA, DZIALANIE,

        // REZULTAT
        /* DZIALANIE,*/ KONSEKWENCJE, /*WNIOSKI,*/ REZULTAT,

        // PRACA
        NIEKARALNOSC, WYKSZTALCENIE, DOSWIADCZENIE, UMIEJETNOSCI, ZNAJOMOSCI,

        // PRACA RESTRYKCYJNA
        /*NIEKARALNOSC,*/ STUDIA, KILKA_LAT_DOSWIADCZENIA, WIELE_UMIEJETNOSCI, Z_POLECENIA,

        // ZARABIANIE
        UMOWA_PRACA, WYKONYWANIE_PRACY,

        // SPORT
        /*CZAS,*/ SPRAWNOSC, ZDOLNOSC_DO_WYSILKU, EKWIPUNEK, ZGODA_OTOCZENIA,

        // OSIEDLE
        TO_SAMO_MIASTO, DOBRZE_WYGLADA, ZNAJOMY_W_SRODOWISKU,
        NIE_PRZECIWNY, NIE_KONFI,

        // DOPUSZCZENIE
        PATRZY, REAGUJE, USMIECHA, DOBRO,
        KOJARZY, KTORYS_RAZ, WSPOLNI_ZNAJOMI,
        BEZPIECZENSTWO, NUDA, PODOBA_SIE,
        MUSI_DOPUSCIC,

        // KOBIETA
        STWORZENIE_POINTCUTA,
        ZLAPANIE_POINTCUTA,
        POZNANIE,
        DOPUSZCZENIE,
        PARZONKO_XKILKA, SPODOBANIE_SIE,
        PLUS_GT_MINUS, WOLNA,

        // *** *** *** *** *** *** *** *** *** WSTEPNE *** *** *** *** *** *** *** ***

        // *** *** *** *** *** *** *** *** *** UTRZYMANIA *** *** *** *** *** *** *** ***

        // SWIAT
        ZNAJOMI, SWOJ_ZWIAZEK, UNIKANIE_ZAGROZEN, DBANIE_ZDROWIE, ZARABIANIE,

        // INFORMACJA
        SLEDZENIE_INFORMACJI, REZULTAT_INFORMACJI, POTWIERDZENIE_Z_KIMS, SPRAWDZENIE_SAMEMU,

        // WIEDZA
        ODSWIEZANIE, PAMIEC, ULEPSZANIE, DZIELENIE_SIE_WIEDZA,

        // BRAK_WSTYDU
        LEPSZE_WYKORZYSTANIE_INFORMACJI, LEPSZE_DZIALANIE, /*WNIOSKI,*/

        // REZULTAT
        /* LEPSZE_DZIALANIE,*/ UNIKNIECIE_KONSEKWENCJI, PRZEWIDYWANIE, /*REZULTAT,*/ UTRZYMANIE,


        // PRACA
        /*WYSILEK, UZYTECZNOSC, OPLACA, PLUS_GT_MINUS,*/

        // ZARABIANIE
        BOGATY_SEKTOR, /*WIEDZA,*/ NISZA, REGION,

        // PRACA RESTRYKCYJNA
        PRZESTRZEGANIE_ZASAD, ATMOSFERA, WYSILEK, UZYTECZNOSC, REZULTATY, OPLACA, STOSUNEK1VS1, ULEPSZANIE_UMIEJETNOSCI, /*PLUS_GT_MINUS,*/

        // SPORT
        /*CZAS, SPRAWNOSC, ZDOLNOSC_DO_WYSILKU, EKWIPUNEK, ZGODA_OTOCZENIA,*/

        // OSIEDLE
        CZESTO_Z_CELEM, /*DZIALANIE,*/ ZACIESNIENIE_GRONA_ZNAJOMYCH,
        STO_PRO_LOJALNY, /*PRZESTRZEGANIE_ZASAD,*/

        // DOPUSZCZENIE
        DOBRZE_ZNA, /*WSPOLNI_ZNAJOMI,*/
        /*BEZPIECZENSTWO,*/ EMOCJE, /*PODOBA_SIE,*/
        /*PLUS_GT_MINUS,*/

        // KOBIETA
        /*PLUS_GT_MINUS, ZGODA_OTOCZENIA,*/
        SPELNIENIE_OCZEKIWAN,
        WSPIERANIE_PREFERENCJI,
        ODKRYWANIE_SWIATA,
        SPEDZANIE_CZASU,
        WIERNOSC,

        PILNOWANIE, KONTROLA,

        // *** *** *** *** *** *** *** *** *** UTRZYMANIA *** *** *** *** *** *** *** ***

        // KONCOWE
        SZCZESCIE, DOSWIADCZENIA, WSPOMNIENIA,
        /*ZNAJOMI,*/
        KOBIETA, DZIECI,
        /*PIENIADZE, BEZPIECZENSTWO,*/ STABILIZACJA, POZOSTANIE_W_KRAJU, /*ULEPSZANIE_UMIEJETNOSCI,*/
        MOZLIWOSC_WYBORU,
        /*SPRAWNOSC,*/ SILA,
        SILNE_JEDNOSTKI, OSZCZEDNOSC_CZASU, AKCEPTACJA, LATWY_DOSTEP_PRZEWAGI,
        CODZIENNA_BLISKOSC, ZYCIE_RAZEM,

        // PRZYCZYNY ZLA
        ZLE_GENY, GLUPOTA, NARKOTYKI, NIESWIADOMOSC, DZIALANIE_ZA_NAMOWA,

        // WARTOSC
        WYGODY, ROZRYWKI, PIENIADZE, SRODOWISKO, ZASADY, /*UMIEJETNOSCI,*/

        // GLOBAL PLANSZA
        /*LUDZIE,*/
        DZIETNOSC, WYCHOWANIE, MIESZKANIE,

        PRACA,
        FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE, FIRMY_WYMAGAJACE_DOSWIADCZENIE, RYNEK_PLAC, ZASOBY_LUDZKIE,

        MIEJSCA,

        // OCENIA WG
        ZLO, /*DOBRO,*/ ZYSK, EKIPA, PRZEWAGA, UMIEJETNOSC, PODOBIENSTWO,

        // THREAD WHILE LOOPS
        THREAD_WHILE_LOOP_BLISKOSC_K, THREAD_WHILE_LOOP_ZASIEG_WZROKU,
        THREAD_WHILE_LOOP_EFEKTYWNA_GADKA,

        THREAD_WHILE_LOOP_BLISKOSC_U,

        // PRZEWAGI
        /*ZNAJOMI,*/ OSIEDLOWE_SRD, /*KOBIETA,*/
        SZANSA_ZNAJOMI, SZANSA_OSIEDLOWE_SRD, SZANSA_KOBIETA,
        /*INFORMACJA, CZAS, WIEDZA,*/ BRAK_WSTYDU,
        LUDZIE_ZA_TOBA, WALKA_PIESCI, WALKA_SPRZET,
        /*UMIEJETNOSC,*/
        /*PRACA, PIENIADZE,*/
        WYSOKA_POZYCJA,

        // ZAGROZENIA
        STRATA_WOLNOSCI, STRATA_CZASU, STRATA_INFORMACJI, STRATA_WIEDZY,
        STRATA_DOSTEPU_PLANSZA, STRATA_DOSTEPU_ZNAJOMI, STRATA_MIEJSCA_W_HIERARCHII, STRATA_POZYCJI,
        STRATA_ZDROWIA, STRATA_HONORU,
        STRATA_PRACY, STRATA_PIENIEDZY, STRATA_ZARABIANIA, STRATA_WYKSZTALCENIA,
        STRATA_KOBIETY,

        // ZASADY
        PRAWO, /*NIE_KONFI,*/ NIE_PRZECIWNA,

        // POTRZEBA
        KONTAKTU, AKCEPTACJI, DOBRYCH_JEDNOSTKEK, ZWIAZKU, ZROZUMIENIA, HIGIENY, UBRANIA, RELIGII, /*ROZRYWKI,*/ RUCHU,
        // PRZYMUS
        JEDZENIE, PICIE, /*PRACA,*/ EDUKACJA, PRZEMIESZCZANIE_SIE, TRANSPORT, KUPNO_PRODUKTOW,
        // NIESPRAWIEDLIWOSC
        PRACA_XCZASU_BRAK_REZULATU, WDUPCANIE_WYSILKU_DO_PIECA, NADUZYWANIE_WYSOKIEJ_POZYCJI, GORZEJ_NA_STARCIE, PRZEWAGA_NA_STARCIE,
        STRONNICZOSC, WYKLUCZENIE,


        // DOBRY
        ROBIENIE_PROGRESU, ZDOBYWANIE_UMIEJETNOSCI, ZDOBYWANIE_WIEDZY, ZDOBYWANIE_SILY, USWIADAMIANIE,
        WYCIAGANIE_ZE_ZLEJ_SYTUACJI, ZMNIEJSZANIE_ZLA, ROBIENIE_OPCJI, PRZEKONYWANIE_ZA, POLECENIE,
        PRAWDA, CIERPLIWOSC,
        TRZEZWOSC,
        MADROSC,
        NOWY_DEFAULT_DOBRA_OSOBA,
        NIEPOZWALA_NA_ZLO,
        // ZLY
        MARNOWANIE_CZASU, POZBAWIANIE_UMIEJETNOSCI, POZBAWIANIE_WIEDZY, POZBAWIANIE_SILY, OGLUPIANIE,
        WDUPCANIE_W_ZLE_WARUNKI, ZAMYKANIE_OPCJI, PRZEKONYWANIE_PRZECIW,
        KLAMSTWO, AGRESJA,
        ODUZENIE,
        /*GLUPOTA,*/
        NOWY_DEFAULT_RYWAL,
        JEBIE_DOBRO, WYMAGA_PRZEWAG_NA_ZLU,

        // WYMUSZENIE REAKCJI
        KONTEKST, OSKARZENIE, ULTIMATUM, CISNIECIE,

        // REAKCJA
        BRAK_ODPOWIEDZI, PRZESTRASZENIE_SIE, UCIECIE,
        ODPOWIEDZ_ODCZEP, ODPOWIEDZ_NEUTRAL, ODPOWIEDZ_ZAINTERESOWANIE,
        EKSCYTACJA, PRZEJCIE_INICJATYWY,

        // SONDA GDY
        WIDZISZ, MOWI, ROBI, POSIADA,

        // SONDA PO
        OCZY, REAGOWANIE, CHODZENIE, POSTURA, ZACHOWANIE, MOWA, /*ZNAJOMI,*/

        // KRYTERIA WROGA
        PRZECIWNA_RASA, PRZECIWNY_NAROD, PRZECIWNA_KLASA, PRZECIWNY_KLUB, PRZECIWNA_STRONA, ZASZKODZIL,

        // *** *** *** *** *** *** *** *** *** PATOLOGIE *** *** *** *** *** *** *** ***
// PATOLOGIE ZWIAZKU
        STARY_MLODY, BURZUA_ULICA, NIESWIADOMY_SWIADOMY, SLABY_MOCNY, UZYWKI_BRAKUZYWEK, ZLO_DOBRO,
        LEKKOSC_TRUDNOSC, LATWOSC_ZERWANIA, ZDRADA, BRAK_CZASU, ODLEGLOSC,

        // PATOLOGIE_WSTEPNE_SWIAT
        SAMOTNOSC, ZWIAZEK_HOMOSEXUALNY, USZCZERBEK_NA_ZDROWIU, BIEDA,

        // PATOLOGIE_WSTEPNE_INFORMACJA
        /*BRAK_CZASU,*/ BRAK_DOSTEPU_DO_PLANSZY, BRAK_LUDZI, NIEMOZLIWOSC_MATERIALNEGO_ZNALEZIENIA_SIE, BRAK_MOZLIWOSCI_OCENY,
        OGOLNOSC,

        // PATOLOGIE_WSTEPNE_WIEDZA
        BRAK_INFORMACJI, BEZ_PRZYCZYNY, ZLE_SKUTKI, NIE_WYCIAGANIE_WNIOSKOW,

        // PATOLOGIE_WSTEPNE_BRAK_WSTYDU
        BRAK_WIEDZY, BRAK_DZIALANIA,

        // PATOLOGIE_WSTEPNE_REZULTAT
        OGROMNE_KONSEKWENCJE, BRAK_REZULTATOW,

        // PATOLOGIE_WSTEPNE_PRACA
        KARALNOSC, BRAK_WYKSZTALCENIA, BRAK_DOSWIADCZENIA, BRAK_UMIEJETNOSCI, ZADNYCH_ZNAJOMOSCI,

        // PATOLOGIE WSTEPNE_ZARABIANIE
        BRAK_PRACY, BRAK_PIENIEDZY,

        // PATOLOGIE WSTEPNE_SPORT
        NIESPRAWNOSC, NIEZDOLNOSC_DO_WYSILKU, BRAK_ZGODY_OTOCZENIA,

        // PATOLOGIE WSTEPNE_OSIEDLE
        INNE_MIASTO, ZLE_WYGLADA, BRAK_ZNAJOMYCH_W_SRODOWISKU, PRZECIWNY, KONFI,

        // PATOLOGIE WSTEPNE_DOPUSZCZENIE
        NIE_PATRZY, NIE_REAGUJE, NIE_USMIECHA, /*ZLO,*/ NIE_KOJARZY, WIDZI_PIERWSZY_RAZ, BRAK_WSPOLNYCH_ZNAJOMYCH,
        NIEBEZPIECZENSTWO, ZAJECIE, NIE_PODOBA_SIE, BRZYDKA, WSTYDZI_SIE, BRAK_EMOCJI,

        // PATOLOGIE WSTEPNE_KOBIETA
        NIE_STWORZENIE_POINTCUTA, NIEZLAPANIE_POINTCUTA, BRAK_POZNANIA, NIEDOPUSZCZENIE, BRAK_PARZONKA,
        NIESPODOBANIE_SIE, MINUS_GT_PLUS, ZAJETA,

        // PATOLOGIE UTRZYMANIA_SWIAT
        BRAK_ZNAJOMYCH, BRAK_ZWIAZKU, ZAGROZENIA, BRAK_ZRODLA_ZAROBKU,

        // PATOLOGIE UTRZYMANIA_INFORMACJA
        ZNIKNIECIE_INFORMACJI, BRAK_REZULTATU_INFORMACJI, BRAK_POTWIERDZENIA, NIEMOZLIWOSC_SPRAWDZENIA,

        // PATOLOGIE UTRZYMANIA_WIEDZA
        ZAPOMNIENIE, REGRESS_WIEDZY, UKRYWANIE_WIEDZY,

        // PATOLOGIE UTRZYMANIA_BRAK_WSTYDU
        NIEWYKORZYSTYWANIE_INFORMACJI, /*BRAK_DZIALANIA, NIE_WYCIAGANIE_WNIOSKOW,*/

        // PATOLOGIE UTRZYMANIA_REZULTAT
        NIE_PRZEWIDYWANIE, UTRACENIE,

        // PATOLOGIE UTRZYMANIA_PRACA
        BRAK_WYSILKU, NIE_UZYTECZNOSC, NIE_OPLACA, /*MINUS_GT_PLUS,*/
        NIE_PRZESTRZEGANIE_ZASAD, ZLA_ATMOSFERA, /*BRAK_REZULTATOW,*/ ZLE_STOSUNKI1VS1,
        REGRESS_UMIEJETNOSCI,

        // PATOLOGIE UTRZYMANIA_ZARABIANIE
        BIEDNY_SEKTOR, /*BRAK_WIEDZY,*/ DUZA_KONKURENCJA, BIEDNY_REGION,

// PATOLOGIE UTRZYMANIA_SPORT
        /*REGRESS_UMIEJETNOSCI,*/

        // PATOLOGIE UTRZYMANIA_OSIEDLE
        BRAK_CELU, NIE_DZIALA, NIE_KIBICUJE, NIELOJALNY, NIE_PRZESTRZEGA_ZASAD,

        // PATOLOGIE UTRZYMANIA_KOBIETA
        NIESPELNIENIE_OCZEKIWAN, NIEWSPIERANIE_PREFERENCJI, SPEDZANIE_CZASU_OSOBNO, /*ZDRADA,*/ BRAK_KONTROLI,

        // PATOLOGIE KONCOWE_SWIAT
        NIESZCZESCIE, ZLE_DOSWIADCZENIA, ZLE_WSPOMNIENIA,

        // PATOLOGIE KONCOWE_PRACA
        /*BRAK_PIENIEDZY,*/ BRAK_STABILIZACJI, ZMUSZONY_ZAGRANICA, /*BRAK_UMIEJETNOSCI, BRAK_WIEDZY,*/

        // PATOLOGIE KONCOWE_ZARABIANIE
        BRAK_MOZLIWOSCI_WYBORU,

// PATOLOGIE KONCOWE_SPORT
        /*NIESPRAWNOSC, BRAK_UMIEJETNOSCI, BRAK_WIEDZY,*/

        // PATOLOGIE KONCOWE_OSIEDLE
        /*BRAK_ZNAJOMYCH,*/ BRAK_SRODOWISKA, BRAK_KOBIETY, BRAK_DOSTEPU_SILNE_JEDNOSTKI,
        BRAK_THREAD_WHILE_LOOP_BLISKOSC_U, /*MARNOWANIE_CZASU,*/ BRAK_AKCEPTACJI, BRAK_DOSTEPU_PRZEWAGI,

        // PATOLOGIE KONCOWE_KOBIETA
        BRAK_CODZIENNEJ_BLISKOSCI, ZYCIE_W_SAMOTNOSCI, BRAK_DZIECI, PRZERWANIE_GENU,

        // PATOLOGIE GLOBAL_PLANSZA_LUDZIE
        MALA_DZIETNOSC, BLEDY_WYCHOWANIA, BRAK_MIESZKANIA,

        // PATOLOGIE GLOBAL_PLANSZA_PRACA
        BRAK_FIRM_NWD, BRAK_FIRM_WD, ZABURZONY_RYNEK_PLAC, OGROMNE_ZASOBY_LUDZKIE,

        // PATOLOGIE THREAD_WHILE_LOOP
        BRAK_THREAD_WHILE_LOOP_ZASIEG_WZROKU, /*BRAK_THREAD_WHILE_LOOP_BLISKOSC_U,*/
        BRAK_THREAD_WHILE_LOOP_BLISKOSC_K, BRAK_THREAD_WHILE_LOOP_EFEKTYWNA_GADKA,


// todo nieprzerwana gadka, od czasu do czasu angaz&check
    }
}

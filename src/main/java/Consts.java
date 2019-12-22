/**
 * Created by gadzik on 22.12.19.
 */
public class Consts {
    static WWPraca[] ALL_WARUNKI_WSTEPNE_PRACA = WWPraca.values();

    public enum WWInformacja {
        CZAS, DOSTEP_DO_PLANSZY, LUDZIE, MATERIALNE_ZNALEZIENIE_SIE, SONDA, SZCZEGOLY
    }

    public enum WWWiedza {
        INFORMACJA, PRZYCZYNA, SKUTEK, WNIOSKI
    }

    public enum WWBrakWstydu {
        INFORMACJA, WIEDZA, DZIALANIE
    }

    public enum WWRezultat {
        DZIALANIE, KONSEKWENCJE, WNIOSKI, REZULTAT
    }


    public enum WWSwiat {
        ZWIAZEK_2_OSOB, URODZENIE_SIE, ZDROWIE, BYT_MATERIALNY
    }

    public enum WWPraca {
        NIEKARALNOSC, WYKSZTALCENIE, DOSWIADCZENIE, UMIEJETNOSCI, ZNAJOMOSCI
    }

    public enum WWPracaRestrykcyjna {
        NIEKARALNOSC, STUDIA, KILKA_LAT_DOSWIADCZENIA, WIELE_UMIEJETNOSCI, Z_POLECENIA
    }

    public enum WWSport {
        CZAS, SPRAWNOSC, ZDOLNOSC_DO_WYSILKU, EKWIPUNEK, ZGODA_OTOCZENIA
    }

    public enum WWOsiedle {
        TO_SAMO_MIASTO, DOBRZE_WYGLADA, ZNAJOMY_W_SRODOWISKU,
        NIE_PRZECIWNY, NIE_KONFI
    }

    public enum WWDopuszczenie {
        PATRZY, REAGUJE, USMIECHA, DOBRO,
        KOJARZY, KTORYS_RAZ, WSPOLNI_ZNAJOMI,
        BEZPIECZENSTWO, NUDA, PODOBA_SIE,
        MUSI_DOPUSCIC
    }

    public enum WWKobieta {
        PODBICIE, POZNANIE,
        DOPUSZCZENIE,
        PARZONKO_XKILKA, SPODOBANIE_SIE,
        PLUS_GT_MINUS
    }

    public enum WUKobieta {
        PLUS_GT_MINUS, ZGODA_OTOCZENIA,
        SPEDZANIE_CZASU
    }
    public enum WKoncowe {
        SZCZESCIE, DOSWIADCZENIA, WSPOMNIENIA,
        ZNAJOMI,
        DZIECI,
        HAJS,
        SPRAWNOSC, SILA
    }

}

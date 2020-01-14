package metoda;

import temat.TT;
import typy_bazowe.TypT;

import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_TOPIC extends AbstractCPU {

    public List<TypT> PREFIXES = of(TypT.UBRANIE_WYGLAD_SZCZEGOLY, TypT.CEL, TypT.PLANY_DZIS, TypT.DAILY_WORRIES, TypT.OTOCZENIE, TypT.POGODA);
    public List<TypT> PDSTW = of(TypT.IMIE, TypT.MIESZKA, TypT.KONTEKST);
    public List<TypT> UTRZYMYWACZE = of(TypT.PRZEWIDZENIE, TypT.WNIOSKI, TypT.DEEP, TypT.KONTRA, TypT.ANGAZ, TypT.COMPARE, TypT.ZART, TypT.POTWIERDZENIE,
            TypT.JAKI_JAKA_JAKIE, TypT.DUZO_MALO);

    public List<TypT> NAD_TEMATY = of(TypT.WYGLAD, TypT.CZAS, TypT.MIEJSCE, TypT.EMOCJE_UCZUCIA, TypT.OSOBY_POWIAZANE, TypT.ZMYSLY,
            TypT.DOSWIADCZENIE, TypT.OSTATNIO_WIDZIANE, TypT.COS_NOWEGO, TypT.PRZED_PO, TypT.OCZEKIWANIA_RZECZYWISTOSC,
            TypT.POWSZECHNOSC, TypT.PLUSY_MINUSY, TypT.KROKI, TypT.CENA);

    public List<TypT> HIERARCHIA = of(TypT.WAZNE_NAJBLIZSZA_PRZYSZLOSC, TypT.WAZNE_DLUGA_PERSPEKTYWA, TypT.WAZNE_OSTATNIA_PRZESZLOSC,
            TypT.WAZNE_PRZESZLOSC_WPLYW_TERAZNIEJSZOSC, TypT.DOTYCZY_WAZNYCH_OSOB, TypT.PRZEWAGA, TypT.DOMINACJA, TypT.DOBRA,
            TypT.HIERARCHIA, TypT.ZASADY, TypT.DOSTEP);

    TT RZECZ = new TT(TypT.RZECZ,
            of(TypT.POTRZEBA, TypT.KOLOR, TypT.TYP, TypT.ATRYBUTY, TypT.POROWNANIE, TypT.CENA, TypT.UZYTECZNOSC, TypT.WYTRZYMALOSC,
                    TypT.OSTATNIO_WIDZIANY, TypT.POPULARNOSC, TypT.PROCES_POZYSKANIA, TypT.ZAKUPY)
    );
    TT MIEJSCE = new TT(TypT.MIEJSCE,
            of(TypT.WYSTROJ, TypT.KOLEJKA, TypT.TLOK, TypT.POPULARNOSC, TypT.DOJAZD, TypT.ZALETY, TypT.WADY, TypT.OKOLICA)
    );
    TT ZYWE_ISTOTY = new TT(TypT.ZYWE_ISTOTY,
            of(TypT.CECHY_CHARAKTERU, TypT.PLEC, TypT.CECHY_FIZYCZNE, TypT.GENY, TypT.NAUKA, TypT.PRZYWIAZANIE, TypT.UCZUCIA, TypT.UMIEJETNOSCI)
    );
    TT SPEDZANIE_CZASU = new TT(TypT.SPEDZANIE_CZASU,
            of(TypT.DZIALANIA, TypT.DAILY_WORRIES, TypT.PRACA, TypT.TRENING, TypT.PASJA)
    );
    TT RELACJE = new TT(TypT.RELACJE,
            of(TypT.ZACHOWANIA, TypT.REAKCJE, TypT.GENEZA_ZNAJOMOSCI)
    );
    TT RODZINA = new TT(TypT.RODZINA,
            of(TypT.DOM, TypT.DZIECI, TypT.RODZIENSTWO, TypT.RODZICE, TypT.DZIADKOWIE)
    );
    TT MORALNOSC_PRZEKONANIA_RELIGIA = new TT(TypT.MORALNOSC_PRZEKONANIA_RELIGIA,
            of());
    TT ZDROWIE = new TT(TypT.ZDROWIE,
            of(TypT.CODZIENNY_MAINTENCE, TypT.LEKARSTWA, TypT.SPA)
    );
    TT MIASTA = new TT(TypT.MIASTA,
            of(TypT.BLISKOSC, TypT.KLIMAT, TypT.KOMUNIKACJA, TypT.LUDZIE)
    );
    TT MARZENIA = new TT(TypT.MARZENIA,
            of()
    );
    TT MOMENT_W_HISTORII = new TT(TypT.MOMENT_W_HISTORII,
            of(TypT.CYKL_W_ZYCIU)
    );
    TT SPORT = new TT(TypT.SPORT,
            of(TypT.DYSCYPLINY, TypT.TRENERZY, TypT.ZDOLNI_SPORTOWCY, TypT.HISTORIA_TRENINGOW)
    );
    TT GOTOWANIE = new TT(TypT.GOTOWANIE,
            of(TypT.PRZEPIS, TypT.SMAK, TypT.RESTAURACJE)
    );
    TT HOLIDAYS = new TT(TypT.HOLIDAYS,
            of(TypT.BASENY_WODA, TypT.PL_ZA, TypT.BEZPIECZENSTWO, TypT.ODLEGLOSC, TypT.SPECYFICZNY_KRAJOBRAZ)
    );
    TT SWIETA = new TT(TypT.SWIETA,
            of()
    );

    public List<TT> TEMATY = of(
            RZECZ,
            MIEJSCE,
            ZYWE_ISTOTY,
            SPEDZANIE_CZASU,
            RELACJE,
            RODZINA,
            MORALNOSC_PRZEKONANIA_RELIGIA,
            ZDROWIE,
            MIASTA,
            MARZENIA,
            MOMENT_W_HISTORII,
            SPORT,
            GOTOWANIE,
            HOLIDAYS,
            SWIETA
    );

    public List<TT> KOMBO = of( // TODO

    );

    public List<TT> CODZIENNE = of( // TODO wystepujace_codzien, samopoczucie, dzien_wczesniej, wyglad

    );

    public List<TT> ZARTY = of(

    );


}


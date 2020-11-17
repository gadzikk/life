package metoda;

import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.YOU;

/**
 * Created by gadzik on 01.01.20.
 */
public class CPU_ZDOBYCIE_ZWIAZKU extends AbstractCPU {

    List<W> essentials = of(W.PRZYMUS, W.ROZWALENIE_SWIADOMOSCI, W.NAJNIZSZY_POZIOM_WARSTWY);

    List<W> endCase = of(W.ZWIAZEK_2_OSOB, W.CODZIENNA_BLISKOSC, W.SEX, W.DZIECI);

    List<W> warunki = of(W.DEFICYT_WSROD_STARYCH, W.MALE_ZRODLO_MLODYCH_KOBIET, W.POCIAG_DO_ZAGRANICZNYCH);

    List<W> kobieta = of(W.CHODZI_Z_BYLEKIM, W.BYLE_BEZPIECZENSTWO, W.BYLE_EMOCJE, W.PRZYJEMNOSCI);

    W kontakty = M.WW(
            of(W.PIERWSZY_KONTAKT),
            of(M.odmowa()),
            of(W.NASTEPNY_KONTAKT),
            of(M.GRANT(YOU, of(W.ZNA, W.BEZPIECZENSTWO, W.WIE_ZE_WARTO, W.CIEKAWOSC)))
    );

    W relacja = M.NEEDED(of(W.BLISKOSC, W.WZGL_IZOLACJA, W.NIE_DEFAULTOWA_SYTUACJA));

    List<W> patologie_ko = of(W.ZWIAZEK_Z_ZAGRANICZNYM, W.DZIECI, W.STARA);

    List<W> opcje = of(
            M.W(W.MLODE_KOBIETY,
                    of(
                            W.WALKA_Z_W8C,
                            W.MALE,
                            W.NIESWIADOMOSC,
                            W.PATOLA_DOSTEPOWA,
                            W.BRAK_POKAZANIA_SIE,
                            W.WSTYDZI_SIE,
                            W.WZIETE_NA_POZIOMIE_SZKOLNYM,
                            W.UZYWKI,

                            W.DZIEWICA,
                            W.MOZLIWOSC_WYCHOWANIA
                    )
            ),
            M.W(W.PLUS_30,
                    of(
                            W.BRAK_SRODOWISKA, W.BRAK_ZNAJOMYCH, W._II_,
                            W.BRAK_POKAZANIA_SIE, W._II_,
                            W.UZYWKI, W._II_,
                            W.KILKA_NIEUDANYCH_ZWIAZKOW, W._II_,
                            W.LUKI_OSOBOWOSCI
                    )
            ),
            // --- --- ---
            M.W(W.ZWYKLA_FEST,
                    of(
                            W.BRAK_OPCJI,
                            W.NIESZCZESCIE,
                            W.LUKI_OSOBOWOSCI
                    )
            ),
            M.W(o(W.LADNA, W._88_, W.PIENIADZE),
                    of(
                            W.MILION_ADORATOROW,
                            W.MALO_PRACY,
                            W.ZLY_CHARAKTER,
                            W.ZEROWE_SZANSE,
                            W.SKRESLA_ZA_1_NIEDOCIAGNIECIE
                    )
            ),
            M.W(o(W.LADNA, W._88_, W.DOBRE_SERCE),
                    of(
                            W.DZIEWICA,
                            W.WARTOSCI_RODZINNE,
                            W.KOBIETA_DIAMENT_ODDANA_RODZINIE
                    )
            )
    );

    public void run() {
        M.W(M.BRAK(W.SRODOWISKO), "--->", M.TRUDNO(W.ZWIAZEK));

        M.W(W.KOBIETA, "--->", M.WSPARCIE(M.WYBOR(TYPY_LUDZI_SHRT_WARUNKI)));
    }

    public void reakcja() {
        M.W(of(W.NIE_ZNAJA, W.NIE_KOJARZY, W.BRAK_WSPOLNYCH_ZNAJOMYCH), "--->", of(W.ODMOWA));
    }

    public void karyna() {
                M.przyjdzNaGotowe();
                karyna.thread_while_loop(M.oczekuje(W.EMOCJE));
                karyna.thread_while_loop(M.nieStaraSieWZwiazku());
    }

    public void doKosza() {
        M.W(of(W._NOT_,
                W.KASA,
                W.SRODOWISKO,
                W.LADNY,
                W.ZNAJOMI), "--->", of(W.DO_KOSZA));
    }

    public void dzialajacaManiura() {
        M.W(of(W.POLOZENIE_SIE_PRZED_DZIALAJACYM, W.FOTY,
                W.NAGADYWANIE_KOLEZANEK),            "--->", of(W.SPOKOJ, W.SRODOWISKO, W.PRACA_PO_ZNAJOMOSCI));
    }


//    __Bariery do znalezienia zwiazku [K] *s* >
//    Trudnosci = genow/urodzenia, jedynaczki, czorta, burzuy, technologii, szkoly
//    Nieumiejetnosc sie pokazania | duzo kolegow | brak odpowiedzi na zaloty | nieumiejetnosc gadania
//- wygodnictwo
//- multikulti
//- brak wychowania
//- nieumiejetnosc sie pokazania
//- dostepy
//- komputer internet
//- granice osiedlowe
//- wstyd kobiety
//- brak srodowisk
//- banany
//- mnostwo ludu zagranica
//- pustka
//
//+ przedszkole gleboko w osiedlu
//+ duzo mieszkan wokol
//+ duza dzietnosc
//+ rejonowka
//+ kosciol
//+ sklep osiedlowy
//+ autobus
//+ znajomi rodzicow
//+ klub sportowy
//+ silka
//+ mecz
//+ srodowisko osiedlowe
//+ wspolne wakacje, kolonie
//+ woda
//---
}

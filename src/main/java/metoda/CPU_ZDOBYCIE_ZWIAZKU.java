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

    WMWM kontakty = new WMWM(
            of(W.PIERWSZY_KONTAKT),
            of(M.odmowa()),
            of(W.NASTEPNY_KONTAKT),
            of(M.GRANT(YOU, of(W.ZNA, W.BEZPIECZENSTWO, W.WIE_ZE_WARTO, W.CIEKAWOSC)))
    );

    String relacja = M.NEEDED(of(W.BLISKOSC, W.WZGL_IZOLACJA, W.NIE_DEFAULTOWA_SYTUACJA));

    List<W> patologie_ko = of(W.ZWIAZEK_Z_ZAGRANICZNYM, W.DZIECI, W.STARA);

    List<WW> opcje = of(
            new WW(W.MLODE_KOBIETY,
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
            new WW(W.PLUS_30,
                    of(
                            W.BRAK_SRODOWISKA, W.BRAK_ZNAJOMYCH, W._II_,
                            W.BRAK_POKAZANIA_SIE, W._II_,
                            W.UZYWKI, W._II_,
                            W.KILKA_NIEUDANYCH_ZWIAZKOW, W._II_,
                            W.LUKI_OSOBOWOSCI
                    )
            ),
            // --- --- ---
            new WW(W.ZWYKLA_FEST,
                   of(
                           W.BRAK_OPCJI,
                           W.NIESZCZESCIE,
                           W.LUKI_OSOBOWOSCI
                   )
            ),
            new WW(o(W.LADNA, W._88_, W.PIENIADZE),
                    of(
                            W.MILION_ADORATOROW,
                            W.MALO_PRACY,
                            W.ZLY_CHARAKTER,
                            W.ZEROWE_SZANSE,
                            W.SKRESLA_ZA_1_NIEDOCIAGNIECIE
                    )
            ),
            new WW(o(W.LADNA, W._88_, W.DOBRE_SERCE),
                    of(
                            W.DZIEWICA,
                            W.WARTOSCI_RODZINNE,
                            W.KOBIETA_DIAMENT_ODDANA_RODZINIE
                    )
            )
    );

    public void reakcja() {
        new WWs(of(W.NIE_ZNAJA, W.NIE_KOJARZY, W.BRAK_WSPOLNYCH_ZNAJOMYCH), "--->", of(W.ODMOWA));
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

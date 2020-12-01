package watek;

import db.DBP;
import db.DBW;
import metoda.M;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 01.01.20.
 */
public class Watek_ZWIAZEK extends AbstractWatek {

    List<W> najwazniejszeZwiazek = of(W.PRZYMUS, W.ROZWALENIE_SWIADOMOSCI, W.NAJNIZSZY_POZIOM_WARSTWY);

    List<W> koncoweWarunki = of(W.ZWIAZEK_2_OSOB, W.CODZIENNA_BLISKOSC, W.SEX, W.DZIECI);

    List<W> warunki = of(W.DEFICYT_KOBIET_WSROD_STARYCH, W.MALE_ZRODLO_MLODYCH_KOBIET, M.KOBIETA(W.POCIAG_DO_ZAGRANICZNYCH));

    List<W> kobieta = of(W.CHODZI_Z_BYLEKIM, W.BYLE_BEZPIECZENSTWO, W.BYLE_EMOCJE, W.PRZYJEMNOSCI);

    W kontakty = M.WW(W.PIERWSZY_KONTAKT,
                        M.odmowa(),
                        W.NASTEPNY_KONTAKT,
                        of(W.ZNA, W.BEZPIECZENSTWO, W.WIE_ZE_WARTO, W.CIEKAWOSC));

    W relacja = M.POTRZEBNE(of(W.BLISKOSC, W.WZGL_IZOLACJA, M.OPCJA(W.SRODOWISKOWA_SYTUACJA)));

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
            M.W(of(W.LADNA, W._88_, W.DOBRE_SERCE, W._88_, W.DOBRE_WYCHOWANIE),
                    of(
                            W.DZIEWICA,
                            W.WARTOSCI_RODZINNE,
                            W.KOBIETA_DIAMENT_ODDANA_RODZINIE
                    )
            )
    );

    public void run() {
        M.W(of(W.SRODOWISKO, W.PRZYJEMNOSCI, W.KOMFORT, M.SRODOWISKO(W.BOJA_SIE)), "--->", M.DUZE_SZANSE(W.KOBIETA));

        M.W(of(M.OBECNOSC(W.SRODOWISKO), DBW.PRZEWAGI_Z_ULICY_WARUNKI(), M.KASOWANIE(W.POTENCJALI_KANDYDANCI)), "--->", M.DUZE_SZANSE(W.KOBIETA));

        M.W(M.BRAK(W.SRODOWISKO), "--->", M.TRUDNO(W.KOBIETA));

        M.W(W.KOBIETA, "--->", M.PODJECIE_DECYZJI(M.WSPARCIE(M.WYBOR(DBW.TYPY_LUDZI_KROTKO_WARUNKI()))));

        M.W(W.ZWIAZEK, "--->", DBW.WYMAGANIA_UTRZYMANIA_KOBIETA_WARUNKI());

        M.W(M.KOBIETA(M.ODCZUCIE(W.SAMOTNOSC)), "--->", of(M.KOBIETA(M.DOCENIA(W.ZWIAZEK)),
                                                                M.PRAWDZIWY(W.ZWIAZEK),
                                                                M.PRAWDZIWA(W.MILOSC)));

        M.W(of(DBP.PATOLOGIE_ZWIAZKU(), DBP.PATOLOGIE_WSTEPNE_KOBIETA(),
                                      DBP.PATOLOGIE_UTRZYMANIA_KOBIETA()), "--->", of(M.MOZLIWOSC(of(M.SLABY(W.ZWIAZEK), W.NIESZCZESCIE,
                                                                                                       DBP.PATOLOGIE_KONCOWE_KOBIETA()))));
    }

    public void reakcja() {
        M.W(of(W.NIE_ZNAJA, W.NIE_KOJARZY, W.BRAK_WSPOLNYCH_ZNAJOMYCH), "--->", of(W.ODMOWA));
    }

    public void karyna() {
                M.przyjdzNaGotowe();
                karyna.caly_czas(M.oczekuje(W.EMOCJE));
                karyna.caly_czas(M.nieStaraSieWZwiazku());
    }

    public void doKosza() {
        M.W(M.BRAK(of(
                W.KASA,
                W.SRODOWISKO,
                W.LADNY,
                W.ZNAJOMI)), "--->", of(W.DO_KOSZA));
    }

    public void dzialajacaManiura() {
        M.W(of(W.POLOZENIE_SIE_PRZED_DZIALAJACYM, W.ZDJECIA_TWARZOWKI,
                                             W.NAGADYWANIE_KOLEZANEK),"--->", DBW.PRZEWAGI_Z_ULICY_WARUNKI());
    }
}

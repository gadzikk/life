package watek;

import db.DBW;
import metoda.M;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 19.06.20.
 */
public class Watek_DOBRO_ZLO extends AbstractWatek {
    W wazne = M.WAZNE(of(M.WYBOR(of(W.DOBRO, W.ZLO))));

    W niesprawiedliwosc = DBW.NIESPRAWIEDLIWOSC_WARUNKI();

    public void run(){
        M.WW(of(W.TOLEROWANIE_ZLA,
                W.POZWOLENIE_NA_ZLO,
                W.SLUCHANIE_ZLEGO,
                W.DZIALANIE_DLA_ZLA), "--->", W.PELNE_POPARCIE_ZLA, "--->", W.PIEKLO);

        M.RZECZYWISTOSC(M.ZWYKLE(of(M.MOCNO(DBW.PRZYCZYNY_ZLA_WARUNKI()), M.SLABO(DBW.PRZYCZYNY_DOBRA_WARUNKI()))));

        M.WW(W.ZLO, "--->", of(M.ROBI_KRZYWDE(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())),
                                             M.TWORZENIE(of(DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MORALNE_WARUNKI()))), "--->",of(M.LEKKIE(W.ZYCIE),
                                                                                                                         M.OTRZYMANIE(of(M.TYMCZASOWE(DBW.PRZEWAGI_WARUNKI()),
                                                                                                                                        W.PRZYJEMNOSCI)),
                                                                                                                                 M.REZULTAT(W.PIEKLO)));

        M.WW(W.DOBRO, "--->", M.DUZO(of(W.CIERPIENIE, W.PRACA, W.WYSILEK, M.OBRONA_PRZED(W.ZLO))), "--->", of(W.ZMECZENIE, M.CIEZKIE(W.ZYCIE),
                                                                                                                        M.REZULTAT(W.NIEBO)));

        M.W(M.DUZO(W.GRZECH), "--->", M.DUZO(W.WADY));

        M.W(M.OSOBA(M.PODANIE_REKI(W.ZLO)), "--->", M.ZLO(W.DOSTEP)
                                                         .W_PRZECIWNYM_PRZYPADKU(M.ZLO(M.BRAK(W.DOSTEP))));

        M.W(W.ZLO, "--->", of(M.FALSZYWE_WRAZENIE(W.SILNI), M.RZECZYWISTOSC(W.SLABI)));
        M.W(W.DOBRO, "--->", of(M.FALSZYWE_WRAZENIE(W.SLABI), M.RZECZYWISTOSC(W.SILNI)));

        M.W(M.CZYN(of(M.DLUGOTERMINOWO(M.CEL(W.DOBRO)), M.INTENCJA(W.DOBRO), W._II_, M.KROTKOTERMINOWO(W.ZLO))), "--->", M.REZULTAT(W.DOBRO));

        zloDzialanie();
        dobroDzialanie();
        generalneZwykleWidzianeZachowanie();
        zloUjecieSwiatowe();
        wyborKazdegoCzlowieka();
        niesprawiedliwyHandel();
    }

    public void zloDzialanie() {
        M.PIERWSZE(of(W.KTOS_CIEBIE_LUB_TY_JEGO, W.SONDA_POD_ZROBIENIE_ZLA, W.AGRESJA_W_DZIALANIU, W.ZASOBY_OGRANICZONE));
        M.CALY_CZAS(of(W.PROBUJE, W.NIE_ZATRZYMA_SIE, M.ZWYKLE(W.PRZEGRANA)));
        M.CALY_CZAS(of(W.OBOWIAZEK_ZLA, W.PRAGNIENIE_ZLA, W.NASTAWIENIE_NA_ZLO, W.SONDA_POD_ZROBIENIE_ZLA, W.GLEBOKO_SZUKA_ZLA, W.EMOCJE_ZE_ZLA));

        W zleCzyny = DBW.ZLE_CZYNY_WARUNKI();

        W zachetaDoZla =  DBW.ZACHETA_DO_ZLA_WARUNKI();

        M.W(M.OSOBA(M.INTERAKCJA(W.ZLY)), "--->", M.REZULTAT(M.OSOBA(of(W.ZERO_ZYSKU, DBW.KRZYWDY_WARUNKI(), DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI()))));

        M.W(M.OSOBA(W.NOWY), "--->", of(M.ODRAZU(DBW.KRZYWDY_WARUNKI())));

        W wadyZlych = DBW.WADY_ZLYCH_WARUNKI();
        W okazje = DBW.OKAZJE_ZROBIENIE_ZLO_WARUNKI();

        zly.caly_czas(M.KONTROLA(W.WSZYSCY));

        M.W(of(W.ZLY, W._88_, W.WIDZIAL) , "--->", M.ODRAZU(of(W.PRAGNIENIE_ZLA, M.MOCNO(DBW.KRZYWDY_WARUNKI()))));

        M.W(of(W.ZLY, W._88_, W.BLISKOSC, W._88_, W.DOSTEP) , "--->", of(W.ZMATERIALIZOWANIE_ZLA,
                                                                                    DBW.KRZYWDY_WARUNKI(),
                                                                                    DBW.BRAK_ZASAD_WARUNKI(),
                                                                                    DBW.STRATY_MORALNE_WARUNKI(),
                                                                                    DBW.STRATY_MATERIALNE_WARUNKI(),
                                                                                    W.CIEZKIE_RANY));

        M.W(of(M.DOBRY(M.CALY_CZAS(M.KONTROLA(W.ZLY))), M.ZLY(W.ZROBIONE_ZLO)), "--->", M.DOBRY(of(W.CIESZY_SIE, M.SZANSA_NA(M.USPRAWIEDLIWIENIE(W.WALKA_PIESCI)),
                                                                                                        DBW.OKAZJE_ZROBIENIE_DOBRO_WARUNKI(),
                                                                                                        W.REAKACJA, M.AKTYWNA_WALKA_ZE_ZLEM(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI()),
                                                                                                        W.KARA, M.OPCJA(W.UKAZANIE),
                                                                                                        M.REZULTAT(M.ZLY(of(W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA))))));

        M.W(W.ZLY, "--->", M.RODZINA(M.DUZY_WYSILEK(M.CALY_CZAS(M.KONTROLA(W.ZLY))))
                                                                    .MIMO_TO(W.ZLY_OWOC)
                                                                    .KONCOWO(of(W.STRATA_CZASU, W.STRATA_PIENIEDZY, W.STRATA_SIL,
                                                                            DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI())));

        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", of(M.MIEJSCE_STALE(M.SPOTKANY(W.ZLY))), "--->", M.OSOBA(W.ZLO));

        M.POBIERZ_WZORCE_ZASADY(of(W.ZLO, W.SRODOWISKO));

        M.W(W.ZLY, "--->", of(M.ZWYKLE(of(W.SLABSZY.NIZ(W.INNI), M.GORSZE(W.ZYCIE).NIZ(W.INNI), M.GORSZE(W.UMIEJETNOSCI).NIZ(W.INNI))),
                                                M.TOLERANCJA(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())),
                                                M.DOSWIADCZENIE(M.ZDOLNY(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()))),
                                                M.W(W.OSOBA, "--->", M.ZLY(of(M.WYKORZYSTUJE(W.OSOBA), M.SZYBKO(M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI())))))),
                                                M.CEL(of(W.ZNISZCZENIE, DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI()))));

        M.W(W.ZLY, "--->", M.CALY_CZAS(M.ZLY(M.PRZEBYWANIE(M.OSOBY(W.ZLI)))));

        M.W(W.ZLY, "--->", of(M.TOLERANCJA(of(W.ZLO, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())),
                                   M.CZESTO(of(W.ZLO, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()))));

        M.W(of(W.ZLO), "--->", of(W.ROB_NAJWIEKSZA_KRZYWDE, W.ROZPOWIEDZ_DO_NAJWIEKSZEJ_LICZBY_OSOB, W.PRZEKONAJ_NAJWIECEJ_OSOB));

        o(M.WWW(on(W.DZIALAJACY, W._88_, W.ZROBIONE_ZLO), "--->", W.CZEKA_NA_EFEKT, "--->", W.BRAK_REAKCJI, "--->", W.ZACHETA_DO_ZLA))
                                                                        .w_przeciwnym_przypadku(of(W.REAKACJA, W.KARA, M.OPCJA(W.UKAZANIE),
                                                            M.DZIALAJACY(of(W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA, M.OPCJA(W.CHEC_POMSZCZENIA)))));

        M.W(M.UKAZANIE_W_PRAWDZIE(W.ZLO), "--->", M.ZLE_OSOBY(of(W.SPOGLADANIE_NA_SIEBIE, W.CISZA, M.CALY_CZAS(of(W.UMNIEJSZENIE, W.USPRAWIEDLIWINIE,
                                                                                                                        W.KLAMSTWO, W.PRZEKONYWANIE)))));

    }
    public void dobroDzialanie() {
        W dobreCzyny = DBW.DOBRE_CZYNY_WARUNKI();

        dobrzi.caly_czas(M.KONTROLA(W.ZLI));

        W sonda = M.SONDA(DBW.ZLY_ZNAKI_ROZPOZNAWCZE_WARUNKI());
        W okazje = DBW.OKAZJE_ZROBIENIE_DOBRO_WARUNKI();
        W metodyAntyDzialacz = M.PRAKTYKA(DBW.ANTY_DZIALACZ_ZLA_WARUNKI());
        W spedzanieCzasu = DBW.SPEDZANIE_CZASU_DOBRE();

        M.W(of(W.DOBRY, W._88_, W.WIDZIAL) , "--->", of(M.ODRAZU(M.MOCNO(W.KONTRA)), W.SPRAWIEDLIWOSC));

        M.POBIERZ_WZORCE_ZASADY(of(W.RODZINA, W.BIBLIA));

        M.W(W.DOBRY, "--->", M.CALY_CZAS(M.DOBRY(M.PRZEBYWANIE(M.OSOBY(W.DOBRZI)))));


    }
    public void generalneZwykleWidzianeZachowanie() {
        List<W> conditions = of(
                W.POBIJ_JAK_NAJWIECEJ_OSOB,
                W.ZDOBADZ_JAK_NAJWIECEJ_PRZEWAG
        );

        M.WYWYZSZAJ(M.UMACNIAJ(W.SIEBIE));
        M.UNIZAJ(M.OSLABIAJ(W.INNI));
    }
    public void zloUjecieSwiatowe() {
        diabel.niszczy(usa);
        usa.niszczy(polskiRzad);
        polskiRzad.niszczy(osoba);
        osoba.niszczyWedlePreferencji(osoba);
    }

    public void wyborKazdegoCzlowieka() {
        M.SPOTYKA_KAZDEG(of(W.CIERPIENIE, W.NIESPRAWIEDLIWOSC, W.PRZEWAGA));

        M.W(M.OSOBA(M.POSIADA(of(W.MADROSC, W.SUMIENIE, W.BOI_SIE_BOGA))), "--->", M.OSOBA((W.DOBRO)));

        M.W(M.OSOBA(M.POSIADA(of(W.PRZYJEMNOSCI, W.EMOCJE, W.PRAGNIENIE_ZLA))), "--->", M.OSOBA((W.ZLO)));
    }

    public void niesprawiedliwyHandel() {
        M.WW(M.WIECEJ_NIZ_ZWYKLE(of(W.WYSILEK, W.PIENIADZE, W.KONTROLA)), "--->", M.GORSZE(W.REZULTATY), "--->", M.OSOBA(M.ZLECAJACA(W.NERWY)));
    }
}

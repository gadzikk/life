package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 19.06.20.
 */
public class CPU_DOBRO_ZLO extends AbstractCPU {
    W wazne = M.WAZNE(of(M.WYBOR(of(W.DOBRO, W.ZLO))));

    List<W> niesprawiedliwosc = NIESPRAWIEDLIWOSC_WARUNKI;

    public void run(){
        M.W(W.UKAZANIE_W_PRAWDZIE, "--->", of(W.SPOGLADANIE_NA_SIEBIE, W.CISZA, M.DOPOKI(of(W.UMNIEJSZENIE, W.USPRAWIEDLIWINIE,
                                                                                    W.KLAMSTWO, W.PRZEKONYWANIE))));
        M.WW(of(W.TOLEROWANIE_ZLA,
                W.POZWOLENIE_NA_ZLO,
                W.SLUCHANIE_ZLEGO,
                W.DZIALANIE_DLA_ZLA), "--->", W.PELNE_POPARCIE_ZLA, "--->", W.PIEKLO);

        M.DEFAULT(of(M.MOCNO(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI), M.SLABO(PRZYCZYNY_SLUZENIA_DOBRU_WARUNKI)));

        M.WW(W.ZLO, "--->", of(M.ROBI_KRZYWDE(of(on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI))),
                                             M.TWORZENIE(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI)))), "--->",of(M.LEKKIE(W.ZYCIE),
                                                                                                                         M.OTRZYMANIE(of(M.TYMCZASOWE(PRZEWAGI_WARUNKI),
                                                                                                                                        W.PRZYJEMNOSCI)),
                                                                                                                                 M.REZULTAT(W.PIEKLO)));

        M.WW(W.DOBRO, "--->", M.DUZO(of(W.CIERPIENIE, W.PRACA, W.WYSILEK)), "--->", of(W.ZMECZENIE, M.CIEZKIE(W.ZYCIE),
                                                                                                 M.REZULTAT(W.NIEBO)));

        M.W(M.DUZO(W.GRZECH), "--->", M.DUZO(W.WADY));

        M.W(M.OSOBA(M.PODANIE_REKI(W.ZLO)), "--->", M.ZLO(W.DOSTEP)
                                                            .W_PRZECIWNYM_PRZYPADKU(M.ZLO(M.BRAK(W.DOSTEP))));

        M.W(W.ZLO, "--->", of(M.FALSZYWE_WRAZENIE(W.SILNI), M.RZECZYWISTOSC(W.SLABI)));
        M.W(W.DOBRO, "--->", of(M.FALSZYWE_WRAZENIE(W.SLABI), M.RZECZYWISTOSC(W.SILNI)));

        zloDzialanie();
        dobroDzialanie();
        dobroDzialacz();
        generalneZwykleWidzianeZachowanie();
        zloUjecieSwiatowe();
        wyborKazdegoCzlowieka();
        niesprawiedliwyHandel();
    }

    public void zloDzialanie() {
        M.FIRST(of(W.KTOS_CIEBIE_LUB_TY_NIEGO, W.SONDA_POD_ZROBIENIE_ZLA, W.AGRESJA_W_DZIALANIU, W.ZASOBY_OGRANICZONE));

        List<W> conditions = of(
                W.NIE_ZATRZYMA_SIE,
                M.thread_while_loop(W.PROBUJE),
                W.OSZUKIWANIE_WYKORZYSTANIE,
                W.ROBIENIE_CIERPIENIA,
                W.WIECZNA_PRZEGRANA,
                W.OBOWIAZEK_ZLA,
                W.PRAGNIENIE_ZLA,
                W.NASTAWIENIE_NA_ZLO,
                W.SONDA_POD_ZROBIENIE_ZLA,
                W.GLEBOKO_SZUKA_ZLA,
                W.EMOCJE_ZE_ZLA,

                W.BIEGANIE,
                W.NARKOTYKI,
                W.KAZDY_KAZDEGO_AGRESJA_DLA_EMOCJI,

                W.KLAMSTWO,

                W.PO_CICHU,
                W.OSZUKAC,
                W.WSTYD,
                W.OGLUPIANIE,

                W.MALYM_WYSILKIEM_NAJWIEKSZA_KRZYWDA,
                W.SLUCHAJ_KOLEGOW,
                W.GLUPI,

                W.PRZEWROTNE_FARYZEJSKIE_SUMIENIE,
                W.PRZEWAGA_NA_STARCIE,
                W.ZAZDROSC, W.ZAWISC, W.KRZYWDA, W.NIENAWISC
        );

        M.W(M.OSOBA(M.INTERAKCJA(W.ZLY)), "--->", M.REZULTAT(M.OSOBA(of(W.ZERO_ZYSKU, on(KRZYWDY_WARUNKI), on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))));

        List<W> NOWY = of(W.NAKLEJ_NALEPKE, W.HASLO_RDZENNYCH,
                W.WYJEBAC_ZDJECIA, W.PRZESTRZELIC, W.SKAZYWANIE_SAMOTNOSC, W.ZWYZYWAC, W.OBGADAC, W.POBIC, W.SHANBIC);

        List<W> wadyZlych = WADY_ZLYCH_WARUNKI;
        List<W> okazje = OKAZJE_ZROBIENIE_ZLO_WARUNKI;

        List<W> sprawdzajacy = of(W.GLUPI, W.AGRESYWNI, W.TEMPIENI_BYLI, W.BEZ_WSTYDU, W.BEZ_ZASAD, W.BRAK_SUMIENIA);
        List<W> staziBiegacze = of(W.DUZI_TEMPI, W.AGRESYWNI, W.ULEGLI, W.ZALEZNY, W.UZALZENIENI);
        List<W> mlodziBiegacze = of(W.WYKRECONE_SZCZURKI, W.OFERMY, W.NIEZDOLNOSC_DO_WYSILKU, W.UZALZENIENI);

        zly.thread_while_loop(M.KONTROLA(W.WSZYSCY));

        M.W(of(W.ZLY, W._88_, W.WIDZIAL) , "--->", of(M.ODRAZU(M.MOCNO(KRZYWDY_WARUNKI)), W.PRAGNIENIE_ZLA));

        M.W(of(W.ZLY, W._88_, W.BLISKOSC, W._88_, W.DOSTEP) , "--->", of(W.ZMATERIALIZOWANIE_ZLA,
                                                                                    W.WBICIE_NA_MUKE,
                                                                                    W.WYKORZYSTANIE,
                                                                                W.ROBIENIE_CIERPIENIA,
                                                                                    W.CIEZKIE_RANY));

        M.W(M.thread_while_loop(M.KONTROLA(W.ZLY)), "--->", of(W.CIESZY_SIE, M.SZANSA_NA(M.USPRAWIEDLIWIENIE(W.WALKA_PIESCI)),
                                                                    on(OKAZJE_ZROBIENIE_DOBRO_WARUNKI),
                                                                    W.REAKACJA, M.AKTYWNA_WALKA_ZE_ZLEM(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI)),
                                                                    W.KARA, M.OPCJA(W.UKAZANIE),
                                                                    W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA));

        M.W(W.ZLY, "--->", M.DUZY_WYSILEK(M.thread_while_loop(M.KONTROLA(W.ZLY)))
                                                                    .MIMO_TO(W.ZLY_OWOC)
                                                                    .KONCOWO(of(W.STRATA_CZASU, W.STRATA_PIENIEDZY, W.STRATA_SIL,
                                                                            on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))));

        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", of(W.MIEJSCE_STALE, W.ZLY, W.PRZEKONYWANIE_PRZECIW), "--->", M.OSOBA(W.ZLO));

        M.POBIERZ_WZORCE_ZASADY(of(W.ZLO, W.SRODOWISKO));

        M.W(W.ZLY, "--->", of(M.DEFAULT(of(W.SLABSZY.NIZ(W.INNI), M.GORSZE(W.ZYCIE).NIZ(W.INNI), M.GORSZE(W.UMIEJETNOSCI).NIZ(W.INNI))),
                                                M.TOLERANCJA(of(on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI))),
                                                M.DOSWIADCZENIE(M.ZDOLNY(of(on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI)))),
                                                M.W(W.OSOBA, "--->", M.ZLY(of(M.WYKORZYSTUJE(W.OSOBA), M.SZYBKO(M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI))))))),
                                                M.CEL(of(W.ZNISZCZENIE, on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))))
        );
        M.W(W.ZLY, "--->", M.thread_while_loop(M.ZLY(M.PRZEBYWANIE(M.OSOBY(W.ZLI)))));

        M.W(W.ZLY, "--->", of(M.TOLERANCJA(of(W.ZLO, on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI))),
                                   M.CZESTO(of(W.ZLO, on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI)))));

        M.W(of(W.ZLO), "--->", of(W.ROB_NAJWIEKSZA_KRZYWDE, W.ROZPOWIEDZ_DO_NAJWIEKSZEJ_LICZBY_OSOB, W.PRZEKONAJ_NAJWIECEJ_OSOB));

        o(M.WWW(on(W.DZIALAJACY, W._88_, W.ZROBIONE_ZLO), "--->", W.CZEKA_NA_EFEKT, "--->", W.BRAK_REAKCJI, "--->", W.ZACHETA_DO_ZLA))
                                                                        .w_przeciwnym_przypadku(of(W.REAKACJA, W.KARA, M.OPCJA(W.UKAZANIE),
                                                            M.DZIALAJACY(of(W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA, M.OPCJA(W.CHEC_POMSZCZENIA)))));


    }
    public void dobroDzialanie() {
        List<W> conditions = of(
                W.CIERPIENIE,
                W.KONTRA,
                W.WYGRANA,

                W.SPORT,
                W.BRAK_UZYWEK, W.JEDZENIE,

                W.PRAWDA,

                W.GLOSNO,
                W.UJAWNIC,
                W.SPRAWIEDLIWIE,
                W.BRAK_WSTYDU,
                W.USWIADOM,
                W.WIELKA_PRACA_ROBI_PRZEWAGE,
                W.MYSL_SAMODZIELNIE,
                W.MADRY,

                W.SUMIENIE,
                W.BRAK_PRZEWAG_NA_STARCIE,

                W.WSPARCIE
        );
        dobrzi.thread_while_loop(M.KONTROLA(W.ZLI));

        W sonda = M.SONDA(ZLY_ZNAKI_ROZPOZNAWCZE_WARUNKI);

        List<W> okazje = OKAZJE_ZROBIENIE_DOBRO_WARUNKI;

        M.W(of(W.DOBRY, W._88_, W.WIDZIAL) , "--->", of(M.ODRAZU(M.MOCNO(W.KONTRA)), W.SPRAWIEDLIWOSC));

        M.POBIERZ_WZORCE_ZASADY(of(W.RODZINA, W.BIBLIA));

        M.W(W.DOBRY, "--->", M.thread_while_loop(M.DOBRY(M.PRZEBYWANIE(M.OSOBY(W.DOBRZI)))));

        List<W> metodyAntyDzialacz = ANTY_DZIALACZ_ZLA_WARUNKI;
    }
    public void dobroDzialacz() {
        List<W> conditions = of(
                W.POZBAWIENIE_PRZEWAG_NIESPRAWIEDLIWYCH
        );
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
        diabel.wali(usa);
        usa.wali(polskiRzad);
        polskiRzad.wali(osoba);
        osoba.waliWedlePreferencji(osoba);
    }

    public void wyborKazdegoCzlowieka() {
        List<W> spotykaKazdego = of(W.CIERPIENIE, W.NIESPRAWIEDLIWOSC, W.PRZEWAGA);
        W sciezkaZycia;
        if(warunki.containsAll(of(W.MADROSC, W.SUMIENIE, W.BOI_SIE_BOGA))){
            sciezkaZycia = W.IDZIE_W_PRAWO;
        }
        else if(warunki.containsAll(of(W.PRZYJEMNOSCI, W.EMOCJE, W.PRAGNIENIE_ZLA))){
            sciezkaZycia = W.IDZIE_W_LEWO;
        }
    }

    public void niesprawiedliwyHandel() {
        M.WW(M.WIECEJ_NIZ_ZWYKLE(of(W.WYSILEK, W.PIENIADZE, W.KONTROLA)), "--->", M.GORSZE(W.REZULTATY), "--->", M.OSOBA(M.ZLECAJACA(W.NERWY)));
    }
}

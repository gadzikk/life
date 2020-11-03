package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 19.06.20.
 */
public class CPU_DOBRO_ZLO extends AbstractCPU {
    public void run(){
        M.W(W.UKAZANIE_W_PRAWDZIE, "--->", of(W.SPOGLADANIE_NA_SIEBIE, W.CISZA, M.WHILE(of(W.UMNIEJSZENIE, W.USPRAWIEDLIWINIE,
                                                                                    W.KLAMSTWO, W.PRZEKONYWANIE))));
        M.WW(of(W.TOLEROWANIE_ZLA,
                W.POZWOLENIE_NA_ZLO,
                W.SLUCHANIE_ZLEGO,
                W.DZIALANIE_DLA_ZLA), "--->", W.PELNE_POPARCIE_ZLA, "--->", W.PIEKLO);

        M.DEFAULT(of(M.MOCNO(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI), M.SLABO(PRZYCZYNY_SLUZENIA_DOBRU_WARUNKI)));

        zloDzialanie();
        dobroDzialanie();
        dobroDzialacz();
        general();
        zloUjecieSwiatowe();
        wyborKazdegoCzlowieka();
    }

    public void zloDzialanie() {
        M.FIRST(of(W.KTOS_CIEBIE_LUB_TY_NIEGO, W.SONDA_POD_ZROBIENIE_ZLA, W.AGRESJA_W_DZIALANIU, W.ZASOBY_OGRANICZONE));

        List<W> conditions = of(
                W.NIE_ZATRZYMA_SIE,
                W.WDUPCANIE_WSZYSTKICH,
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
        List<W> NOWY = of(W.NAKLEJ_NALEPKE, W.WDUPC_ZAKLECIEM,
                W.WYJEBAC_ZDJECIA, W.PRZESTRZELIC, W.SKAZYWANIE_SAMOTNOSC, W.ZWYZYWAC, W.OBGADAC, W.POBIC, W.SHANBIC);

        List<W> sprawdzajacy = of(W.GLUPI, W.AGRESYWNI, W.TEMPIENI_BYLI, W.BEZ_WSTYDU, W.BEZ_ZASAD, W.BRAK_SUMIENIA);
        List<W> staziBiegacze = of(W.DUZI_TEMPI, W.AGRESYWNI, W.ULEGLI, W.ZALEZNY, W.UZALZENIENI);
        List<W> mlodziBiegacze = of(W.WYKRECONE_SZCZURKI, W.OFERMY, W.NIEZDOLNOSC_DO_WYSILKU, W.UZALZENIENI);

        zly.thread_while_loop(M.KONTROLA(W.WSZYSCY));

        M.W(of(W.ZLY, W._88_, W.WIDZIAL) , "--->", of(M.ODRAZU(M.MOCNO(KTO_KOGO_WARUNKI)), W.PRAGNIENIE_ZLA));

        M.W(of(W.ZLY, W._88_, W.BLISKOSC, W._88_, W.DOSTEP) , "--->", of(W.ZMATERIALIZOWANIE_ZLA,
                                                                                    W.WBICIE_NA_MUKE,
                                                                                    W.WYKORZYSTANIE,
                                                                                W.ROBIENIE_CIERPIENIA,
                                                                                    W.CIEZKIE_RANY));

        M.W(M.thread_while_loop(M.KONTROLA(W.ZLY)), "--->", of(W.REAKACJA, M.AKTYWNA_WALKA_ZE_ZLEM(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI)),
                                                                                    W.KARA, M.OPCJA(W.UKAZANIE),
                                                                                    W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA));

        M.W(W.ZLY, "--->", M.DUZY_WYSILEK(M.thread_while_loop(M.KONTROLA(W.ZLY)))
                                                                    .MIMO_TO(W.ZLY_OWOC)
                                                                    .KONCOWO(of(W.STRATA_CZASU, W.STRATA_PIENIEDZY,
                                                                                W.STRATA_SIL ,W.STRATY_MORALNE)));
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

        M.W(of(W.DOBRY, W._88_, W.WIDZIAL) , "--->", of(M.ODRAZU(M.MOCNO(W.KONTRA)), W.SPRAWIEDLIWOSC));
    }
    public void dobroDzialacz() {
        List<W> conditions = of(
                W.POZBAWIENIE_PRZEWAG_NIESPRAWIEDLIWYCH
        );
    }
    public void general() {
        List<W> conditions = of(
                W.POBIJ_JAK_NAJWIECEJ_OSOB,
                W.ZDOBADZ_JAK_NAJWIECEJ_PRZEWAG
        );
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
}

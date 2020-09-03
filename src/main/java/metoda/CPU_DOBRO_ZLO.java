package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 19.06.20.
 */
public class CPU_DOBRO_ZLO extends AbstractCPU {
    public void run(){
        zlo();
        dobro();
        dobroDzialacz();
        general();
        zloUjecieSwiatowe();
    }

    public void zlo() {
        M.FIRST(of(W.KTOS_CIEBIE_LUB_TY_NIEGO, W.SONDA_POD_ZROBIENIE_ZLA, W.AGRESJA, W.ZASOBY_OGRANICZONE));

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

        new WWs(of(W.ZLY, W._88_, W.WIDZIAL) , "--->", of(W.ODRAZU_ZLO, W.PRAGNIENIE_ZLA));
    }
    public void dobro() {
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
        osoba.waliWedlePreferencji();
    }
}

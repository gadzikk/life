package metoda;

import typy_bazowe.TypZadania;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 05.01.20.
 */
public class CPU_SJ extends AbstractCPU {
    List<W> warunekiWejsciowe = of(W.ZLO_NA_CZUBKU_STOSU, W.DZUNGLA, W._100PROCENT_WYSILKU_10PROCENT_OTRZYMUJESZ, W.CALE_ZYCIE_CIERPIENIE,
            W.STARZEJESZ_SIE, W.MIESZKANIE_300TYS_WYPLATA_3TYS, W.KTOS_CIEBIE_LUB_TY_NIEGO, W.PUSTKA, W._1_OSOBA__DUZO,
            W.SLABSZA_PRZEWAGA_ULEGA_MOCNIEJSZEJ_W_MOMENCIE_PRZY_WARUNKACH
    );
    List<W> warunki = of(
            czasUlotnosc(W.SAMOTNOSC), czas(W.BRAK_ZWIAZKU), czas(W.BRAK_SRODOWISKA),
            W.BRAK_CZASU_CODZIENNE, W.BRAK_CZASU_ROCZNE, W.CODZIEN_OD_POCZATKU,
            temporal(W.PRACA), czas(W.ZERO_ZYSKU_ZYCIOWO), temporal(W.PIENIADZE)
    );

    List<W> cechy = of(
            W.DOBRY, W.POBOZNY, W.CIERPIENIE_DLUGOTERMINOWE, W.ZLODZIEJ,
            W.NIEPRZEKUPNY, W.CIEZKI_WYGLAD, W.ZDANY_TYLKO_NA_SIEBIE, W.TOZSAMOSC_RASOWA, W.ANTY_POSLUSZNOSC,
            W.GOTOWY_NA_STARCIE, W.ZDOLNY_DO_WALKI, W.ZDOLNY_WALKA_SPRZET, W.ZDOLNY_DO_RYZYKA,
            W.MOCNY_WZROK, W.DOSTEP_DO_WIELU_PLANSZ,
            W.NIE_REGENERUJE_SIE, W.TOKSYCZNY_ORGANIZM, W.SIEROTA, W.Z_GORY_PRZEGRANY,
            W.NIECHCIANE_DZIECKO, W.CHOROBA_SIEROCA, W.LOPATKSY, W.POSTURA_50KG, W.ON_LICHY_JEST,
            W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY, W.TRZEZWY,
            W.CHECI, W.PRACOWITOSC,
            W.WIEDZA_ULICA, W.WIEDZA_KOBIETY, W.WIEDZA_RYNEKPRACY, W.WIEDZA_PRAWO, W.WIEDZA_ZAWOD,
            W.WIEDZA_LUDZIE_GENY, W.WIEDZA_LUDZIE_CHARAKTER, W.WIEDZA_SPORT,
            W.Z_KAZDEGO_NARODU,
            W.NA_HUCIE_30_LATKI_BOJA_SIE
    );
    List<W> umiejetnosci = of(
            W.PODBICIE, W.STWORZENIE_SYTUACJI, W.MOWI_SZYBKO
    );

    List<W> nastawienieOtoczenia = of(
            W.WYKLUCZENIE, W.BAWMYSIE_JEGO_PODKOPAC, W.ZAZDROSC, W.WZIAC_MU_WSZYSTKO,
            W.NIENAWISC_FESTOW, W.WALKA_Z_W8C, W.WALKA_ZAGRANICZNI
    );
    List<W> szukasz = of(W.WZGL_IZOLACJA, W.SRODOWISKO, W.KOBIETA, W.END_CASE_SILNY, W.DOBRE_ZYCIE, W.KLUCZ_ZYCIOWY);

    List<W> wymaganiaZycia = of(W.NIEPRZECIETNE_RZECZY);

    List<W> priorytety = of(W.ULICA, W.KOBIETA, W.PRACA, W.NAUKA);

    List<TypZadania> zadania = of(
            dudki(TypZadania.PRACA), dudki(TypZadania.NAUKA),
            stanKondycja(of(TypZadania.SILKA, TypZadania.BIEGANIE, TypZadania.TRENING_BOKS, TypZadania.TRENING_SILOWY_DOM)),
            antySamotnosc(TypZadania.POZNAWANIE)
    );

    List<W> miejscaKazni = of(W.DOM, W.G41, W.TM, W.TMTR, W.PK, W.AGH, W.BKS_HTK, W.BXRNIA, W.GRPL, W.CL, W.BBH);

    List<W> walczysz = of(W.RODZICE, W.FESTY, W.BURZUAZJA, W.ZAGRANICZNI, W.OSIEDLOWY, W.RUDZI, W.CYGANIE);

    List<W> random = of(W.RESET, W.ZMIANA, W.NIE_PRZEWIDZISZ_PRZYSZLOSCI);

    List<W> patologie = PATOLOGIE;

    public void run(){
        new WM(of(W._NOT_, W.PRZED_9, W._88_, W.PO_17),
                of(M.REMOVE(ME, W.DZIEN))
        );
        new WM(of(W.MIEJSCE_STALE),
                of(M.robCosExtra())
        );

        M.thread_while_loop(W.PUSTKA);
        new WM(of(W.LUDZIE),
                of(
                        M.widzisz(W.WADY),
                        M.widzisz(W.ZLO),
                        M.widzisz(W.ZAZDROSC)
                )
        );
        new WM(of(W.WZGL_IZOLACJA, W._II_, W.ZNAJOMI, W._88_, W.CZAS, W._88_, W.PODBIJASZ),
                of(
                        M.GRANT(ME, W.SZANSA_POZNANIE),
                        M.GRANT(ME, W.SZANSA_SONDA),
                        M.GRANT(ME, W.SZANSA_INFORMACJA)
                )
        );
        new WM(of(W.NIE_DOSTAJESZ, W._II_ ,W.NIE_FINALIZUJESZ),
                of(
                        M.GRANT(SOMEONE, W.FRAJER_DOSTAJE)
                )
        );
    }
}

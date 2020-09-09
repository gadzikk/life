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
    List<W> warunkiWyjscia = of(W.NIEBOISZ_SIE_WYJSC, W.NIEBOISZ_SIE_STARCIA, W.NIEBOISZ_SIE_NIESPRAWIEDLIWYCH_PRZEWAG,
            W.PRIORYTET_WYCHODZENIE_U_SIEBIE, W.ORIENT_RZECZY_WARTOSCIOWE, W.DZIALANIE_RZECZY_WARTOSCIOWE, W.WYSMIEWASZ_ROBIENIE_ZDJEC);

    W nastawienie = W.KONTRA;

    Integer atrakcyjnoscAktywnosci = c(W.PRACA, "<", W.NAUKA, "<", W.REWIR_ULICA);

    List<W> warunekiWejsciowe = of(W.ZLO_NA_CZUBKU_STOSU, W.DZUNGLA, W._100PROCENT_WYSILKU_10PROCENT_OTRZYMUJESZ, W.CALE_ZYCIE_CIERPIENIE,
            W.STARZEJESZ_SIE, W.MIESZKANIE_300TYS_WYPLATA_3TYS, W.KTOS_CIEBIE_LUB_TY_NIEGO, W.PUSTKA, W._1_OSOBA__DUZO,
            W.PRZEWAGA_ZROBIONA_NA_KRZYWDZIE_LUB_KURESTWIE, W.SLABSZA_PRZEWAGA_ULEGA_MOCNIEJSZEJ_W_MOMENCIE_PRZY_WARUNKACH,
            W.BIJESZ_KTOS_MOZE_ODDAC_MOCNIEJ, W.MALO_OSOB, W.OSOBY_KAZDY_NA_KAZDEGO
    );
    List<W> warunki = of(
            czasUlotnosc(W.SAMOTNOSC), czas(W.BRAK_ZWIAZKU), czas(W.BRAK_SRODOWISKA),
            W.BRAK_CZASU_CODZIENNE, W.BRAK_CZASU_ROCZNE, W.CODZIEN_OD_POCZATKU,
            temporal(W.PRACA), czas(W.ZERO_ZYSKU_ZYCIOWO), temporal(W.PIENIADZE)
    );

    List<W> cechy = of(
            W.WSZEDZIE_OBCY_GADZIO, W.CECHY_WSZYSTKIE_NABYTE,
            W.DOBRY, W.POBOZNY, W.ARCY_KROL_CIERPIENIA, W.ZLODZIEJ,
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
            W.NA_HUCIE_30_LATKI_BOJA_SIE,
            W.BRAK_ROZRYWEK, W.BRAK_DOBRYCH_UCZUC, W.PUSTKA, W.DEFAULT_SYTUACJE
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

    W podstawaEgzystencji = W.WYSILEK_FIZYCZNY;

    List<W> orient = of(W.END_CASE, W.OBJECIE_POCZATEK_KONIEC, W.PRZEWIDZENIE_KONSEKWENCJI);
    W wiadomosci = W.PRZYJECIE_DO_WIADOMOSCI_BEZ_ROZKMINIANIA_NA_ULICY;
    List<W> okazja = of(W.DOBRO, W.POZNANIE, W.WALKA_PIESCI);

    List<W> random = of(W.RESET, W.ZMIANA, W.NIE_PRZEWIDZISZ_PRZYSZLOSCI);

    List<W> patologie = PATOLOGIE;

    List<String> przyjaciele = of("RENA_RODZINA", "T_RODZINA", "DZIADZIUS_RODZINA", "KS_ANDRZEJ_RODZINA",
            "CIOCIA_RODZINA", "ANIA_RODZINA", "DOMINIK_RODZINA", "JANIO_RODZINA", "OLUS_RODZINA");

    List<String> wrogowie = of("KLAUDIUSZ", "ZBYSIU_SHN", "BANIA_WSH", "HOOLIGANS", "SLAWO_KPC", "LYSY_KPC",
            "SZYDELKO", "KOTALA");

    public void run() {
        W nastawienie = W.AKTYWNA_KONTRA;

        M.subscribe(of(
                W.ZAGROZENIA,
                W.WARTOSC,
                W.ULICA
        ));

        new WWs(of(W.WIDZISZ_ZLO), "--->", of(W.ODRAZU_DZIALANIE_KONTRA));

        new WWs(of(W.WZGL_IZOLACJA), "--->", of(W.ODRAZU_DZIALANIE));

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
        new WM(of(W.NIE_DOSTAJESZ, W._II_, W.NIE_FINALIZUJESZ),
                of(
                        M.GRANT(SOMEONE, W.FRAJER_DOSTAJE)
                )
        );

        new WWs(of(W._NOT_, W.SPRZECIW_WZGLEDEM_ZLA), "--->", of(W.CALE_ZLO_W_CIEBIE));

        wsrodLudzi();
        prioriDzialania();
        typyOsobZMojejPerspektywy();
        ciebie();
        denerwuje();
        zagrozenia();
        antyPan();
    }

    public void wsrodLudzi() {
        M.thread_while_loop(W.ZLO_KRAZY);
        M.thread_while_loop(W.SWIADOMY_WLASNEGO_TERYTORIUM);
        M.thread_while_loop(of(W.SONDA_PRZEWAG, W.SONDA_CZYNOW));

        wszyscy.nastawienie(W.AGRESJA);
        wszyscy.niktNiePyta();
        wszyscy.informacjeZGory();
    }

    public void prioriDzialania() {
        List<W> primo = of(W.BIBLIA, W.MORALNOSC, W.SPRAWIEDLIWOSC);
        List<W> drugie = of(W.PRZEWAGA_NA_SWOJA_STRONE);
    }

    public void typyOsobZMojejPerspektywy() {
        wiesniak.threadWhileLoop(W.CZYNY_PRZECIW_TOBIE).przerwanie(W.SILA_PRZECIW_NIEMU);
        wiesniak.wali().cisnie().skazujeNaSamotnosc();
        czoloWisly.wali().cisnie().skazujeNaSamotnosc();
        cracoviaSlabi.wali().cisnie().skazujeNaSamotnosc();
        me.thread_while_loop(W.WSZEDZIE_OBCY_GADZIO);
    }

    public void ciebie() {
        new WWs(of(
                W.KOBIETA, W.ZNAJOMOSCI, W.SAMOCHOD,
                W.SONDA, W.UKRYCIE, W.NAKLEJ_NALEPKE, W.CISNIE, W.SKAZYWANIE_SAMOTNOSC,
                W.BOJKA, W.ZMECZENIE, W.BRAK_CZASU,
                W.RESTRYKCJA_ZNAJOMYCH, W.SPRZET, W.PUSTKA,
                W.DOMINACJA
        ),                                                                        "--->", of(W.W_CIEBIE));
    }

    public void denerwuje() {
        List<W> denerwuje = of(W.BEZKARNOSC ,W.NIESPRAWNOSC, W.RESET, W.PRZEWAGA_MIMO_BLEDU, W.BRAK_KONSEKWENCJI);
    }

    public void zagrozenia() {
        W oni = M.MALO(of(W.SPRZET, W.ZNAJOMOSCI, W.FOTY, W.NAKLEJ_NALEPKE));
        List<W> ja = of(W.OTWARTE_STARCIE, W.GLOSNO_CISNIECIE, W.WALKA_PIESCI);
    }

    public void antyPan() {
        List<W> antyPan = of(W.GRZEBANIE_W_KIBLU_CODZIEN, W.MALY_ODZEW_SZUKANIE_PRACY, W.JEBANIE_PRZEZ_MANAGEROW_ZAWSZE,
                W.NIEMOZESZ_WYDAC_KASY);
    }
}

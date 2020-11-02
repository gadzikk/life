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
    List<W> periodyczneCzynnosci = of(M.CZESTO(W.WYCHODZISZ), M.CZESTO(W.WYSILEK_FIZYCZNY));

    List<W> warunkiWyjscia = of(
            M.NIEBOISZ_SIE(W.POMSZCZENIE), M.NIEBOISZ_SIE(W.NOTYFIKACJA_EKIPA), M.NIEBOISZ_SIE(W.FOTY),
            M.NIEBOISZ_SIE(W.OBRAZENIA_FIZYCZNE), M.NIEBOISZ_SIE(W.STARCIE_WIELU_NA_JEDNEGO),
            M.NIEBOISZ_SIE(M.MOZLIWOSC(W.SPRZET)),
            M.NIEBOISZ_SIE(of(W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI)),
            M.thread_while_loop(M.PRZYGOTOWANY(W.DZIALANIE_POD_PRESJA)),
            M.PRIORYTET(W.WYCHODZENIE_U_SIEBIE), M.ORIENT(W.RZECZY_WARTOSCIOWE), M.DZIALANIE(W.RZECZY_WARTOSCIOWE));

    W ciaglaCzynnoscUlica = M.thread_while_loop(M.WYBOR(of(W.IDZIESZ, W.STOISZ_BRAMA, W.STOISZ_MIEJSCE_STALE, W.JEDZIESZ_TRAUTO)));

    W nastawienie = W.KONTRA;

    Integer atrakcyjnoscAktywnosci = c(W.PRACA, "<", W.NAUKA, "<", W.REWIR_ULICA);

    List<W> warunekiWejsciowe = of(W.ZLO_NA_CZUBKU_STOSU, W.DZUNGLA, W._100PROCENT_WYSILKU_10PROCENT_OTRZYMUJESZ, W.CALE_ZYCIE_CIERPIENIE,
            W.STARZEJESZ_SIE, W.MIESZKANIE_300TYS_WYPLATA_3TYS, W.KTOS_CIEBIE_LUB_TY_NIEGO, W.PUSTKA, W._1_OSOBA__DUZO,
            W.PRZEWAGA_ZROBIONA_NA_KRZYWDZIE_LUB_KURESTWIE, W.SLABSZA_PRZEWAGA_ULEGA_MOCNIEJSZEJ_W_MOMENCIE_PRZY_WARUNKACH,
            W.BIJESZ_KTOS_MOZE_ODDAC_MOCNIEJ, W.MALO_OSOB, W.OSOBY_KAZDY_NA_KAZDEGO
    );
    List<W> warunki = of(
            M.CZAS(M.ULOTNOSC(W.SAMOTNOSC)), M.CZAS(W.BRAK_ZWIAZKU), M.CZAS(W.BRAK_SRODOWISKA),
            W.BRAK_CZASU_CODZIENNE, W.BRAK_CZASU_ROCZNE, W.CODZIEN_OD_POCZATKU,
            M.TYMCZASOWE(W.PRACA), M.CZAS(W.ZERO_ZYSKU_ZYCIOWO), M.TYMCZASOWE(W.PIENIADZE)
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
        M.W(W.WYCHODZISZ, "--->", of(M.thread_while_loop(W.ZLO_KRAZY),
                                        zli.thread_while_loop(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA),
                                        zli.thread_while_loop(W.STWARZA_OKAZJE_ZROBIENIE_ZLA),
                M.thread_while_loop(of(ciaglaCzynnoscUlica, W.ZASIEG_WZROKU, W.SCIEZKI, W.LUDZIE, W.WIDOCZNY_GDY_IDZIESZ))));

        W nastawienie = W.AKTYWNA_KONTRA;
        W nastawienieOtoczenia = W._80_PROCENT_CHCE_CIE_ROZJEBAC;

        W warunkiNieDoZycia = M.thread_while_loop(of(
                W.PUSTKA, W.ZLE_W_ZYCIU, W.MALO_OSOB,
                W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, W.NIEMOZLIWOSC_ZDOBYCIA_PRACY_NEUTRALNY_RZUT,
                W.WIEKSZOSC_DZIALA, W._80_PROCENT_CHCE_CIE_ROZJEBAC,
                W.CHETNOSC_ZERO, W.DZIALAJACE_KARYNY, W.NIEMOZLIWOSC_PODERWANIA_KOBIETY_NEUTRALNY_RZUT, PATOLOGIE_WSTEPNE_KOBIET.get(0)
        ));

        M.subscribe(of(
                W.ZAGROZENIA,
                W.WARTOSC,
                W.ULICA
        ));

        M.W(of(W.WIDZISZ_ZLO), "--->", of(W.ODRAZU_DZIALANIE_KONTRA));

        M.W(of(W.WZGL_IZOLACJA), "--->", of(W.ODRAZU_DZIALANIE));

        M.W(of(W._NOT_, W.PRZED_9, W._88_, W.PO_17),
                of(M.REMOVE(ME, W.DZIEN))
        );
        M.W(of(W.MIEJSCE_STALE),
                of(M.robCosExtra())
        );

        M.thread_while_loop(W.PUSTKA);
        M.W(of(W.LUDZIE),
                of(
                        M.widzisz(W.WADY),
                        M.widzisz(W.ZLO),
                        M.widzisz(W.ZAZDROSC)
                )
        );
        M.W(of(W.WZGL_IZOLACJA, W._II_, W.ZNAJOMI, W._88_, W.CZAS, W._88_, W.PODBIJASZ),
                of(
                        M.GRANT(ME, W.SZANSA_POZNANIE),
                        M.GRANT(ME, W.SZANSA_SONDA),
                        M.GRANT(ME, W.SZANSA_INFORMACJA)
                )
        );
        M.W(of(W.NIE_DOSTAJESZ, W._II_, W.NIE_FINALIZUJESZ),
                of(
                        M.GRANT(SOMEONE, W.FRAJER_DOSTAJE)
                )
        );

        M.W(of(W._NOT_, W.SPRZECIW_WZGLEDEM_ZLA), "--->", of(W.CALE_ZLO_W_CIEBIE));

        M.W(W.TWOJA_PORAZKA, "--->", M.OSOBY(of(twoiWrogowie, zagraniczni, drugaStrona)).smiejeSie().hanba().wesele());

        M.W(W.JESTES_SILNY, "--->", of(zazdrosni.aktywneZlo(), dzialacz.probaSkasowania(), wszyscy.SET(W.ZAGROZENIE)));

        M.W(M.TRZYMANIE_RELACJI(W.RODZICE), "--->", M.thread_while_loop(of(W.KONTROLA, W.SZKODLIWY_WPLYW)));


        wsrodLudzi();
        prioriDzialania();
        typyOsobZMojejPerspektywy();
        ciebie();
        denerwuje();
        zagrozenia();
        antyPan();
        antyDzialacz();
        duzyMalyWarunek();
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
        M.W(of(
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

    public void antyDzialacz() {
        M.SET(W.ZERO_TOLERANCJI_DZIALAJACY);
        M.thread_while_loop(W.DZIALANIE_POD_PRESJA);
        M.thread_while_loop(M.KONTROLA(W.WSZYSCY));

        M.W(of(M.WIDZISZ(W.DZIALAJACY), W._88_, W.BLISKOSC), "--->", of(W.REAKACJA, M.AKTYWNA_WALKA_ZE_ZLEM(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI)),
                                                                            W.KARA, M.OPCJA(W.UKAZANIE),
                                                                            W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA));

        M.W(of(W.WPIERDOL), "--->", of(W.STRACH, W.BOL, W.MORALNIAK, W.STRATA_MANIURY, W.POZBAWIENIE_PRZEWAGI,
                                                                                M.MOCNO(W.CHEC_POMSZCZENIA)));
    }

    public List<W> duzyMalyWarunek() {
        return of(
                M.PERSPEKTYWA(W.ULICA).MALY_WARUNEK(W.PIENIADZE),
                M.DUZY_WARUNEK(W.RODZINA),
                M.DUZY_WARUNEK(of(W.INFORMACJA, W.CZAS)),
                M.DUZY_WARUNEK(of(W.ULICA, W.SILA, W.ZNAJOMI)),
                M.DUZY_WARUNEK(of(W.ROZWOJ_UMYSLOWY, W.ROZWOJ_FIZYCZNY)),

                M.MALY_WARUNEK(of(W.WYCHODZENIE, W.OBECNOSC)),
                M.DUZY_WARUNEK(W.ZAGADANIE)
        );
    }
}

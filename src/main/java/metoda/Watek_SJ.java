package metoda;

import db.DBP;
import db.DBW;
import typy_bazowe.TypZadania;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 05.01.20.
 */
public class Watek_SJ extends AbstractWatek {
    List<W> periodyczneCzynnosci = of(M.CZESTO(W.WYCHODZISZ), M.CZESTO(W.WYSILEK_FIZYCZNY));

    List<W> warunkiWyjscia = of(
            M.NIEBOISZ_SIE(W.POMSZCZENIE), M.NIEBOISZ_SIE(W.NOTYFIKACJA_EKIPA), M.NIEBOISZ_SIE(W.ZDJECIA_TWARZOWKI),
            M.NIEBOISZ_SIE(W.OBRAZENIA_FIZYCZNE), M.NIEBOISZ_SIE(W.STARCIE_WIELU_NA_JEDNEGO),
            M.NIEBOISZ_SIE(M.MOZLIWOSC(W.SPRZET)),
            M.NIEBOISZ_SIE(of(W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI)),
            M.CALY_CZAS(M.PRZYGOTOWANY(W.DZIALANIE_POD_PRESJA)),
            M.PRIORYTET(W.WYCHODZENIE_U_SIEBIE), M.ORIENT(W.RZECZY_WARTOSCIOWE), M.DZIALANIE(W.RZECZY_WARTOSCIOWE));

    W ciaglaCzynnoscUlica = M.CALY_CZAS(M.WYBOR(of(W.IDZIESZ, W.STOISZ_BRAMA, W.STOISZ_MIEJSCE_STALE, W.JEDZIESZ_TRAUTO)));

    List<W> nastawienie = of(W.NASTAWIENIE_BIERZESZ_CO_TWOJE, M.ZABIERASZ_ZLYM(W.WARTOSC) ,W.KONTRA);

    Integer atrakcyjnoscAktywnosci = c(W.PRACA, "<", W.NAUKA, "<", W.REWIR_ULICA, "<", W.REWIR_Z_WARTOSCIA);

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
            W.BRAK_ROZRYWEK, W.BRAK_DOBRYCH_UCZUC, W.PUSTKA, W.STANDARDOWA_SYTUACJA
    );
    List<W> umiejetnosci = of(
            W.PODBICIE, W.STWORZENIE_SYTUACJI, W.MOWI_SZYBKO
    );

    List<W> nastawienieOtoczenia = of(
            W.WYKLUCZENIE, W.BAWMYSIE_JEGO_PODKOPAC, W.ZAZDROSC, W.WZIAC_MU_WSZYSTKO,
            W.NIENAWISC_FESTOW, W.WALKA_Z_W8C, W.WALKA_ZAGRANICZNI
    );

    W codzienne = M.CODZIEN(of(M.PLAN(W.DZIEN), M.PATRZ(W.PROGNOZA_POGODY), W.WYCHODZENIE, W.MODLITWA,
                    M.OSWAJAJ_SIE(of(DBW.SYTUACJE_STARCIE_WARUNKI(), on(DBP.ZBIOR_PATOLOGIE()))),
                    M.ORIENT(W.WARTOSC), M.ULEPSZANIE(of(W.SILA, W.UMIEJETNOSCI))));

    W tydzien = M.TYDZIEN(of(M.PLAN(of(W.TYDZIEN, W.ULICA, W.PRACA, W.KOBIETA, W.SPORT)),
                            M.PATRZ(W.PROGNOZA_POGODY), M.CZYTANIE(W.PROGRAM)));

    List<W> szukasz = of(W.WZGL_IZOLACJA, W.SRODOWISKO, W.KOBIETA, W.SILNY_KONCOWY_WARUNEK, W.DOBRE_ZYCIE, W.KLUCZ_ZYCIOWY);

    List<W> wymaganiaZycia = of(W.NIEPRZECIETNE_RZECZY);

    List<W> priorytety = of(W.ULICA, W.KOBIETA, W.PRACA, W.NAUKA);

    List<TypZadania> zadania = of(
            dudki(TypZadania.PRACA), dudki(TypZadania.NAUKA),
            stanKondycja(of(TypZadania.SILKA, TypZadania.BIEGANIE, TypZadania.TRENING_BOKS, TypZadania.TRENING_SILOWY_DOM)),
            antySamotnosc(TypZadania.POZNAWANIE)
    );

    List<W> miejscaKazni = of(W.DOM, W.G41, W.TM, W.TMTR, W.PK, W.AGH, W.BKS_HTK, W.BXRNIA, W.GRPL, W.CL, W.BBH);

    List<W> walczysz = of(W.RODZICE, W.FESTY, W.WYGODNY, W.ZAGRANICZNI, W.OSIEDLOWY, W.RUDZI, W.CYGANIE);

    W podstawaEgzystencji = W.WYSILEK_FIZYCZNY;

    List<W> orient = of(W.END_CASE, W.OBJECIE_POCZATEK_KONIEC, W.PRZEWIDZENIE_KONSEKWENCJI);
    W wiadomosci = W.PRZYJECIE_DO_WIADOMOSCI_BEZ_ROZKMINIANIA_NA_ULICY;
    List<W> okazja = of(W.DOBRO, W.POZNANIE, W.WALKA_PIESCI);

    List<W> random = of(W.RESET, W.ZMIANA, W.NIE_PRZEWIDZISZ_PRZYSZLOSCI);

    List<W> mojeDzialanie = of(M.wszystkoNaChlodno(), M.tyDobrze(), M.karzeszZaWadyZachowania());

    List<W> patologie = DBP.ZBIOR_PATOLOGIE();

    List<String> przyjaciele = of("RENA_RODZINA", "T_RODZINA", "DZIADZIUS_RODZINA", "KS_ANDRZEJ_RODZINA",
            "CIOCIA_RODZINA", "ANIA_RODZINA", "DOMINIK_RODZINA", "JANIO_RODZINA", "OLUS_RODZINA");

    List<String> wrogowie = of("KLAUDIUSZ", "ZBYSIU_SHN", "BANIA_WSH", "HOOLIGANS", "SLAWO_KPC", "LYSY_KPC",
            "SZYDELKO", "KOTALA");

    public void run() {
        M.W(W.WYCHODZISZ, "--->", of(M.CALY_CZAS(W.ZLO_KRAZY),
                                        ZLE_OSOBY.caly_czas(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA),
                                        ZLE_OSOBY.caly_czas(W.STWARZA_OKAZJE_ZROBIENIE_ZLA),
                                        M.ZWYKLE(of(DBW.KRZYWDY_WARUNKI(), DBW.OSLONY_WARUNKI())),
                M.CALY_CZAS(of(ciaglaCzynnoscUlica, W.ZASIEG_WZROKU, W.SCIEZKI, W.LUDZIE, W.WIDOCZNY_GDY_IDZIESZ))));

        W nastawienie = W.AKTYWNA_KONTRA;
        W nastawienieOtoczenia = W.LUDZIE_CHCA_TWOJEJ_KRZYWDY;

        W warunkiNieDoZycia = M.CALY_CZAS(of(
                W.PUSTKA, W.ZLE_W_ZYCIU, W.MALO_OSOB,
                W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, M.MALA_SZANSA(W.ZDOBYCIE_PRACY_NEUTRALNY_RZUT),
                W.WIEKSZOSC_DZIALA, W.LUDZIE_CHCA_TWOJEJ_KRZYWDY,
                W.CHETNOSC_ZERO, M.DZIALAJACY(W.KOBIETY), M.MALA_SZANSA(W.PODERWANIE_KOBIETY_NEUTRALNY_RZUT), DBP.PATOLOGIE_WSTEPNE_KOBIETA()
        ));

        M.subscribe(of(
                W.ZAGROZENIA,
                W.WARTOSC,
                W.ULICA
        ));

        M.W(W.WIDZISZ_ZLO, "--->", M.ODRAZU(M.DZIALANIE(W.KONTRA)));

        M.W(DBW.WZGL_IZOLACJA_WARUNKI(), "--->", M.ODRAZU(W.DZIALANIE));

        M.W(of(W._NIE_, W.PRZED_9, W._88_, W.PO_17),
                of(M.REMOVE(ME, W.DZIEN))
        );
        M.W(of(W.MIEJSCE_STALE),
                of(M.robCosExtra())
        );

        M.WW(W.INFORMACJA, "--->", W.CONTENT, "--->", W.PROGRAM, "--->", M.WYKORZYSTANIE_W_PRAKTYCE(W.PROGRAM));

        M.W(W.PRACA, "--->", M.WEZ(of(W.PIENIADZE, W.STABILIZACJA, W.BENEFITY, W.URLOP, W.CHOROBOWE,
                                           W.KOD_PROJEKTOW, W.WIEDZA, W.DOSWIADCZENIE, W.KONTAKTY)));

        M.CALY_CZAS(W.PUSTKA);
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

        M.W(of(W._NIE_, W.SPRZECIW_WZGLEDEM_ZLA), "--->", of(W.CALE_ZLO_W_CIEBIE));

        M.W(W.TWOJA_PORAZKA, "--->", M.OSOBY(of(W.WROGOWIE, W.ZAGRANICZNI, W.PRZECIWNY_KLUB)).CIESZA_SIE());

        M.W(W.JESTES_SILNY, "--->", of(zazdrosni.aktywneZlo(), dzialacz.probaSkasowania(), wszyscy.SET(W.ZAGROZENIE)));

        M.W(M.TRZYMANIE_RELACJI(W.RODZICE), "--->", M.CALY_CZAS(of(W.KONTROLA, W.SZKODLIWY_WPLYW)));

        M.W(of(W.KOLECZKO_WZAJEMNEJ_ADORACJI), "--->", of(M.punktujWady(), M.II(), M.wprowadzCosLepszego(), M.II(), M.zniszczSila()));

        wsrodLudzi();
        prioriDzialania();
        typyOsobZMojejPerspektywy();
        ciebie();
        denerwuje();
        zagrozenia();
        antyPan();
        antyDzialacz();
    }

    public void wsrodLudzi() {
        M.CALY_CZAS(W.ZLO_KRAZY);
        M.CALY_CZAS(W.SWIADOMY_WLASNEGO_TERYTORIUM);
        M.CALY_CZAS(of(W.SONDA_PRZEWAG, W.SONDA_CZYNOW));

        wszyscy.nastawienie(W.AGRESJA);
        wszyscy.niktNiePyta();
        wszyscy.informacjeZGory();

        M.CALY_CZAS(W.DOBRO);
        M.CALY_CZAS(W.POTENCJALNE_STARCIE);
        M.CALY_CZAS(W.AKTYWNA_WALKA_ZE_ZLEM);

        M.CALY_CZAS(W.ANTY_POSLUSZNOSC);
        M.CALY_CZAS(W.ANTY_FEST);
        M.CALY_CZAS(W.ANTY_SYSTEM);
        M.CALY_CZAS(W.ANTY_BURZUA);

        M.WW(of(W.LUDZIE),
                of(
                        M.pokazSieZNajlepszejStronyZachowania(),

                        M.wzrokiemPowstrzymaj(),
                        M.nadajZobowiazanieTonem(),
                        M.izolujObszar(),

                        M.skinaj(),
                        M._3pktTwarzy()
                ),
                of(W.CZESTO_PATRZY, W._88_, W.NIE_WIE_CO_ZROBIC, W._II_, W.WIDZISZ, W._88_, W.DOBRY),
                of(
                        M.rozpoczecieRozmowy()
                )
        );
    }

    public void prioriDzialania() {
        List<W> primo = of(W.BIBLIA, W.MORALNOSC, W.SPRAWIEDLIWOSC);
        List<W> drugie = of(W.PRZEWAGA_NA_SWOJA_STRONE);
    }

    public void typyOsobZMojejPerspektywy() {
        wiesniak.caly_czas(W.CZYNY_PRZECIW_TOBIE).przerwanie(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI());
        wiesniak.niszczy().cisnie().skazujeNaSamotnosc();
        czoloWisly.niszczy().cisnie().skazujeNaSamotnosc();
        cracoviaSlabi.niszczy().cisnie().skazujeNaSamotnosc();
        me.caly_czas(W.WSZEDZIE_OBCY_GADZIO);
    }

    public void ciebie() {
        M.W(of(DBW.PRZEWAGI_WARUNKI(),
               DBW.SLABOSCI_WARUNKI(),
               DBW.KRZYWDY_WARUNKI(),
               DBW.BRAK_ZASAD_WARUNKI(),
               DBW.RELACJE_WARUNKI(),
               W.PUSTKA,
               W.DOMINACJA),  "------------>", M.DOTYCZA(M.UDERZAJA(W.KAZDEGO_CZLOWIEKA)));
    }

    public void denerwuje() {
        List<W> denerwuje = of(W.BEZKARNOSC ,W.NIESPRAWNOSC, W.RESET, W.PRZEWAGA_MIMO_BLEDU, W.BRAK_KONSEKWENCJI);
    }

    public void zagrozenia() {
        W oni = M.MALO(of(W.SPRZET, W.ZNAJOMOSCI, W.ZDJECIA_TWARZOWKI, W.NAKLEJ_NALEPKE));
        List<W> ja = of(W.OTWARTE_STARCIE, W.GLOSNO_CISNIECIE, W.WALKA_PIESCI);
    }

    public void antyPan() {
        List<W> antyPan = of(W.GRZEBANIE_W_KIBLU_CODZIEN, W.MALY_ODZEW_SZUKANIE_PRACY, W.GNOJONY_PRZEZ_MANAGEROW_ZAWSZE,
                W.NIEMOZESZ_WYDAC_KASY);
    }

    public void antyDzialacz() {
        M.SET(W.ZERO_TOLERANCJI_DZIALAJACY);
        M.CALY_CZAS(DBW.KONFRONTACJA_WARUNKI());
        M.CALY_CZAS(M.KONTROLA(W.WSZYSCY));

        M.W(of(M.WIDZISZ(W.DZIALAJACY), W._88_, W.BLISKOSC), "--->", of(W.CIESZY_SIE, M.SZANSA_NA(M.USPRAWIEDLIWIENIE(W.WALKA_PIESCI)),
                                                                            DBW.OKAZJE_ZROBIENIE_DOBRO_WARUNKI(),
                                                                            W.REAKACJA, M.AKTYWNA_WALKA_ZE_ZLEM(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI)),
                                                                            W.KARA, M.OPCJA(W.UKAZANIE),
                                                                            W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA));

        M.W(of(W.PRZEGRANE_STARCIE), "--->", of(W.STRACH, W.BOL, W.MORALNIAK, W.STRATA_MANIURY, W.POZBAWIENIE_PRZEWAGI,
                                                                                M.MOCNO(W.CHEC_POMSZCZENIA)));
    }
}

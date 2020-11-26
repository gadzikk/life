package metoda;

import warunek.W;
import z_inne.OH;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.YOU;

/**
 * Created by gadzik on 04.01.20.
 */
public class CPU_UL extends AbstractCPU {
    W wazne = M.WAZNE(of(W.OBECNOSC, W.HIERARCHIA_ULICA, W.KIBICOWANIE, W.KRYMINAL, M.ILE_ZROBIL(W.EKIPA), on(ZASADY_WARUNKI), on(PRZEWAGI_WARUNKI), on(WALKA_WARUNKI)));

    List<W> dazenia = of(W.STARCIE, W.DOMINACJA, W.RUCHANIE, M.TLO(W.DOSTEP));
    List<W> walka = of(
            M.walkaSila(of(W.ZAGRANICZNI, W.BURZUAZJA)),
            M.walkaWiedza(of(W.BIEGACZE, W.NIECHCACY_WPUSCIC))
    );
    List<W> typyLudzi = TYPY_LUDZI_SHRT_WARUNKI;

    W ktoKogo = M.MOCNO(KRZYWDY_WARUNKI);
    W kurestwo = M.MOCNO(BRAK_ZASAD_WARUNKI);
    W oslony = M.MOCNO(OSLONY_WARUNKI);

    W ciaglaCzynnoscUlica = M.thread_while_loop(M.WYBOR(of(W.IDZIESZ, W.STOISZ_BRAMA, W.STOISZ_MIEJSCE_STALE, W.JEDZIESZ_TRAUTO)));

    List<W> podstawa = of(W.OGRANICZENIE_CZASOWE, W.DNI, W.TYGODNIE, W.LATA, W.OBECNOSC, W.DOSTEP, W.POZNANIE_CZLOWIEKA_WADAMI,
            W.ENUM, W.ANTY_FEST, W.ANTY_SYSTEM, W.ANTY_BURZUA, W.ANTY_KONFI, W.DEFAULT_WARUNKI, W.STARCIE, W.KTO_ZYSKUJE);

    Integer atr = c(M.SILNE(W.DOBRO), ">", M.OBECNOSC(W.ULICA), ">", W.JUMA, ">", W.KIBICOWANIE, ">", on(W.DILL, W.DZIALANIE_DLA_ZLA));

    List<W> zasady = ZASADY_WARUNKI;
    List<W> prawa = of(W.DOMINACJA, W.GLUPIEGO_CZEKA_KARA, W.PRZEWAGA, W.DOSTEP, W.HIERARCHIA, W.JEDNOSC_PRZECIW_ZAZDROSCI);

    List<W> mojeDzialanie = of(M.wszystkoNaChlodno(), M.tyDobrze(), M.karzeszZaWadyZachowania());

    List<W> wchodzisz = of(M.dostepDoInformacjiPrzezManiury(), M.wstrzymajSieZWiezeciemKobiety(), M.szukajHakow());

    List<W> dobraJednostka = of(W.ZOBOWIAZANIA, W.OCZEKIWANIA, W.WYMAGANIA, W.OBECNOSC, W.CEL, W.ZDOLNY_DO_WALKI, W.ZDOLNY_DO_RYZYKA);


    List<W> popytPodaz = of(
            M.DOJRZEWA_W_CIERPIENIU(W.SILNA_JEDNOSTKA), M.LOKALNE_SRODOWISKO(M.NAJWIECEJ(W.EMOCJE)),
            M.WYROBIENIE_CHARAKTERU(M.WYMAGA(M.DUZO(M.DOSWIADCZENIA(of(W.ULICA, W.CIERPIENIE, W.WALKA))))),
            M.DLUGO(M.CIEZKO(M.PRACUJE(M.MALO_OSOB(M.POSIADA(W.WARTOSC))))),

            M.PODZIELONA(M.TEMPA(M.STARA(M.AGRESYWNA(W.CZOLOWKA_EKIPY)))), M.KAZDY_W_EKIPIE(M.CZEKA_NA(W.SZANSA_OD_LOSU)),
            M.ZLODZIEJE(1, W.PROCENT), M.CZOLOWKA(5, W.PROCENT), M.KIBICE(10, W.PROCENT), M.MLODZI(30, W.PROCENT),
            W.CO_JEST, W.CZEGO_NIE_MA,
            W.BRAK_CZASU, W.ODBIJANIE_OD_EKIP, W.UZYWKI, M.WALY(W.SWOI));

    List<W> metodyWzieciaNaSwaStrone = of(// todo
    );

    List<W> bledy = BLEDY_WARUNKI;

    List<W> kogo = KOGO_WARUNKI;
    List<W> musiBycKara = WYMAGA_KARY_WARUNKI;
    List<W> rany = ZBIOR_RANY;

    List<W> szansaNaWarunek = of(W.OBECNOSC, W.DEFAULT_ZACHOWANIE, W.DEFAULT_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNIE_ULATWIASZ, W.PRZEKONYWANIE, W.ULTIMATUM);
    List<W> warunek = of(W.ULTIMATUM, W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC, W.SILA, W.PRIORYTET);

    List<W> konfrontacja = KONFRONTACJA_WARUNKI;

    List<W> srodki = srodki();

    List<W> zarobekNielegalny = ZAROBEK_NIELEGALNY_WARUNKI;

    List<W> reakcje = REAKCJE_WARUNKI;

    public void run(){
        M.W(of(W.SILNA_JEDNOSTKA, W._88_, W.DZIALANIE_W_EKIPIE), "--->", M.DOSTEP(of(W.CZOLO, W.OGARNIECI)));

        M.W(M.BRAK(M.DOSTEP(of(W.CZOLO, W.OGARNIECI))), "--->", of(W.MOCNI_NIE_LICZACY_SIE, W.NORMALNY, M.MLODE(M.CHETNE(W.PIONKI)),
                                                                                            W.FEST, W.BANAN, W.SYSTEMOWIEC, W.WYGODNIS));

        M.W(of(W.MOCNY_WZROK), "--->", of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY));
        M.W(of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY), "--->",of(W.KREGOSLUP_MORALNY, W.ZDOLNOSC_DO_WYSILKU, W.ZDOLNY_DO_WALKI, W.WNIOSKI, W.PODSWIADOMOSC, W.WIEDZA_SPORT));
        M.W(of(W.CIERPIENIE, W._88_, W.Z_MIASTA, W._88_, W.DOSTEP_DO_PLANSZY), "--->",of(W.ZDOLNY_WALKA_SPRZET, W.ZDOLNY_DO_RYZYKA, W.WIEDZA_ULICA, W.DOBRA_JEDNOSTKA));

        M.W(M.BRAK(W.DZIALANIE_W_EKIPIE), "--->", M.thread_while_loop(W.PUSTKA));

        M.W(M.BRAK(W.KONTAKT_TEL), "--->", M.thread_while_loop(M.BRAK(W.BLISKOSC_ULICA)));

        M.W(of(W.OBECNOSC, W.ZASADY, W.PRACA), "--->",of(W.SRODOWISKO, W.HIERARCHIA, W.RYWALIZACJA));

        M.W(W.RDZENNI, "--->", M.RDZENNY(M.NAWYK(W.WYCHODZENIE_NA_ULICE)));

        tworzaceJakosc();
        wychodzisz();
        najkrotszaSonda();
        sonda();
        starcie();
        ulicaRelacjeWarunkow();
        algorytmUlicy();
        kibicowanieKrotkieUjecie();
        tworzenieWarunkow();
        przeplywInformacji();
        hierarchiaOsiedle();
        krajobrazUlicy();
        agresja();
        shortest();
        przewagi();
        ANTY_60_sledztwoPolicyjne();
        sprzet();
        terytoriumWroga();
        przejecie();
        zwyklaOsobaZOsiedla();
        zzzHandly();
        nuda();
        tchorzSchemat();
        nieZnam();
        slabszegoKlubuZalosneStarania();
        srodki();
        gadka();
    }

    public void tworzaceJakosc() {
        M.W(W.SILNY, "--->", M.CZESTO(W.WYCHODZISZ));

        M.W(DUZO_IF_WARUNKI, "--->",of(M.wydluzajCzas(),
                                                M.estymuj(),
                                                M.maloLazBezCelu(), M.stale(), M.ujscie(), M.zKims()));

        M.W(W.KONDYCJA, "--->",of(M.duzoGetAndCompare(),
                                    M.od_8_do_22()));

        M.W(of(W.BRAK_WSTYDU, W._88_, W.WYCHODZENIE_NA_ULICE), "--->", of(M.proba(), M.wnioski(), M.wiedza()));
    }

    public void wychodzisz() {
        M.W(W.WYCHODZISZ, "--->", of(M.thread_while_loop(W.ZLO_KRAZY),
                ZLE_OSOBY.thread_while_loop(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA),
                ZLE_OSOBY.thread_while_loop(W.STWARZA_OKAZJE_ZROBIENIE_ZLA),
                M.DEFAULT(of(on(KRZYWDY_WARUNKI), on(OSLONY_WARUNKI))),
                M.thread_while_loop(of(ciaglaCzynnoscUlica, W.ZASIEG_WZROKU, W.SCIEZKI, W.LUDZIE, W.WIDOCZNY_GDY_IDZIESZ))));

        List<W> warunkiWyjscia = of(
                M.NIEBOISZ_SIE(W.POMSZCZENIE), M.NIEBOISZ_SIE(W.NOTYFIKACJA_EKIPA), M.NIEBOISZ_SIE(W.ZDJECIA_TWARZOWKI),
                M.NIEBOISZ_SIE(W.OBRAZENIA_FIZYCZNE), M.NIEBOISZ_SIE(W.STARCIE_WIELU_NA_JEDNEGO),
                M.NIEBOISZ_SIE(M.MOZLIWOSC(W.SPRZET)),
                M.NIEBOISZ_SIE(of(W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI)),
                M.thread_while_loop(M.PRZYGOTOWANY(W.DZIALANIE_POD_PRESJA)),
                M.PRIORYTET(W.WYCHODZENIE_U_SIEBIE), M.ORIENT(W.RZECZY_WARTOSCIOWE), M.DZIALANIE(W.RZECZY_WARTOSCIOWE));

        M.W(W.MIEJSCE_STALE, "--->", M.DEFAULT(BRAK_ZASAD_WARUNKI));
    }

    public void najkrotszaSonda(){
        M.W(of(W.MEZCZYZNA),
                of(
                        M.MOCNO(M.sonda(W.OCZY)),
                        M.sonda(W.ROZMIAR),
                        M.MOCNO(M.sonda(W.HASLO_RDZENNYCH)),
                        M.sonda(W.Z_KIM),
                        // ----------------------------------
                        M.sonda(W.SWIADOMOSC), // 1: FEST
                        M.sonda(W.SILA_SPRAWCZA), // WPLYW: 0
                        M.sonda(W.ZLO_DOBRO), // UZASADNIENIE: 0
                        M.sonda(W.WIEK),
                        M.sonda(W.CZY_CWEL), // NICNIEMOZE : 0
                        // ---------------------------------
                        M.POROWNANIE(W.INNI),
                        M.sonda(W.SRODOWISKO),
                        M.sonda(W.CZYNY_DZIALANIA),
                        // ---------------------------------
                        M.sonda(W.OGRANICZENIA),
                        M.sonda(W.ZAGROZENIA),
                        M.sonda(W.WARTOSCI_ZYCIOWE),
                        M.sonda(W.DZIEN_CODZIENNY),
                        M.sonda(W.HIERARCHIA),
                        M.sonda(W.GDZIE)
                )
        );

        M.W(of(W.KOBIETA),
                of(
                        M.sonda(W.ROZMIAR),
                        M.sonda(W.LADNA),
                        M.sonda(W.STWARZA_SZANSE),
                        //-------------------------
                        M.sonda(PATOLOGIE_WSTEPNE_KOBIETA, PATOLOGIE_UTRZYMANIA_KOBIETA)
                )
        );
    }

    public void sonda(){
        List<W> sondaShrts = SONDA_SHRTS_WARUNKI;
        List<W> sondaGdy = SONDA_GDY_WARUNKI;
        List<W> sondaPo = SONDA_PO_WARUNKI;
        List<W> kogo = KOGO_WARUNKI;
        List<W> wymagaKary = WYMAGA_KARY_WARUNKI;
        List<W> sondaDzialacza = SONDA_DZIALACZA_WARUNKI;
        List<W> kryteriaWroga = KRYTERIA_WROGA_WARUNKI;
        List<W> oceniaWedlug = OCENIA_WEDLUG_WARUNKI;

        M.WWW(W.INFORMACJA, "--->", W.SONDA, "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);

        M.W(of(W.SONDA_ZASOBU), "--->", M.SONDA(of(W.WARTOSC, W.TRUDNOSC_UTRZYMANIA, W.KTO_POSIADA, W.KTO_ZYSKUJE, W.KTO_TRACI)));

        M.W(of(W.SONDA_DZIALANIA), "--->", M.SONDA(of(W.WARTOSC, W.BEZPIECZENSTWO, W.KONSEKWENCJE, W.CZESTOTLIWOSC, W.EFEKTYWNOSC)));

        M.W(M.MIEJSCE_STALE(WZGL_IZOLACJA_WARUNKI), "--->", M.SONDA_GLEBOKA(izolowanaOsoba));

        M.W(W.CZYN, "--->", M.SONDA(of(M.jakie(W.WARUNKI_POCZATKOWE),
                                            M.jakDuze(W.PRZECIWNOSCI),
                                            M.jakDuze(W.ULATWIENIA),
                                            M.jakie(W.PRZYCZYNY),
                                            M.ile(W.CZAS),
                                            M.jakDuze(W.WARUNKI_OSIAGNIETE))));

        M.W(M.WIDZISZ(W.WARUNEK), "--->", M.SONDA(of(W.POCZATEK, W.KONIEC, W.SILA, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC)));

        M.W(M.OSOBA(W.MOWI), "--->", M.SONDA(M.OSOBA(W.KTO_MOWI)));

        M.W(W.POKAZUJE_EMOCJE, "--->", W.SLABY);

        M.W(W.NIE_UMIE_KLAMAC, "--->", W.MALO_PRZEZYL);

        M.W(of(W.ZLY, W._88_, W.PATRZY), "--->", M.SONDA(W.ZROBIENIE_ZLA).CEL(of(on(KRZYWDY_WARUNKI), M.OPCJA(on(BRAK_ZASAD_WARUNKI)))));

        M.WW(M.INFORMACJA(W.OSOBA), "--->", M.SONDA(W.HASLO_RDZENNYCH), "--->", of(M.OSOBA(W.OD_NAS), W._II_,
                                                                                                M.OSOBA(W.WROG), W._II_,
                                                                                                M.OSOBA(W.NIESTWARZA_ZAGROZENIA)));

        M.W(M.INFORMACJA(W.WROG), "--->", M.OSOBY(M.BLISKO(W.DZIALAJACY)).KAZDY(on(KRZYWDY_BEZPOSREDNIE_WARUNKI)));

        M.WW(W.OSOBA, "--->", of(M.SONDA(SONDA_SHRTS_WARUNKI),
                                    M.SONDA(PRZEWAGI_WARUNKI)), "--->", of(M.W(W.MOCNY, "--->", of(M.AKCEPTACJA(W.OSOBA), M.WSPARCIE(W.OSOBA))),
                                                                            M.W(W.SLABY, "--->", of(M.ODRZUCENIE(W.OSOBA), M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI)))))));
        M.W(W.WIDZISZ_BLAD, "--->", M.SONDA(BLEDY_WARUNKI));

        M.W(M.OSOBA(W.SRODOWISKO), "--->", M.SONDA(SONDA_DZIALACZA_WARUNKI));

        M.W(W.MEZCZYZNA_Z_KOBIETA, "--->", M.OSOBA(of(W.UMIE_BAJEROWAC, W.ZNAJOMI, W.SRODOWISKO)));

        M.W(M.POTRZEBA(W.WALKA_PIESCI), "--->", M.SONDA(KOGO_WARUNKI));


        M.W(of(W.LADNY, W._88_, W.BRAK_CIERPIENIA), "--->", M.OSOBA(W.NIEGODNY_POPATRZENIA));

        M.W(of(W.LADNY, W._88_, W.BRAK_CIERPIENIA, W._88_, W.PRZEWAGA, W._II_, W.PATRZY), "--->", W.STARCIE);

        M.W((of(W.ZLODZIEJKA,
                W.KIBICOWANIE,
                W.DOBRZE_ZMYSLY, W._88_, W.SPORT,
                W.ZDOLNY_DO_WALKI)),          "---->", M.MOZLIWOSC(M.OSOBA(W.DOBRA_JEDNOSTKA)));

        M.W(of(M.BRAK(W.ZLODZIEJKA),
                M.BRAK(W.KIBICOWANIE),
                M.BRAK(of(W.DOBRZE_ZMYSLY, W._88_, W.SPORT)),
                M.BRAK(W.ZDOLNY_DO_WALKI)),          "---->", M.OSOBA(of(W.FEST, W.SLABY, W.NIESWIADOMY, W.SYSTEMOWIEC)));


        M.W(of(W.ZE_WSI, W._88_, W.BRAK_WYSILKU_FIZYCZNEGO), "--->", M.OSOBA(of(W.NIEPATRZY_GLOBALNIE, W.ZAMKNIETY_W_SWOIM_POKOJU)));

        M.W(M.ZASOB(M.NALEZY_DO(W.SLABY)), "--->", of(M.PRACA_NAD(W.ZASOB), M.WZIECIE_NA_SWOJA_STRONE(W.ZASOB)));

        M.W(of(W.BIEGACZE), "--->", of(W.BRAK_PIENIEDZY, W.GLUPI, W.NUDA, W.ZLY, W.DOSTEP_OGRANICZONY));
    }

    public void ulicaRelacjeWarunkow() {
        M.NIGDY_MALO(of(W.PIENIADZE, W.SEX, W.PRZYJEMNOSCI)); // MATERIALNE
        M.NIGDY_MALO(of(W.ZLO, W.DOBRO, W.NIENAWISC, W.MILOSC, W.AGRESJA_W_DZIALANIU, W.CIERPLIWOSC)); // MORALNE

        M.W(M.DEFAULT(M.thread_while_loop(W.WSZYSCY_CHCA_CIE_TWOJEJ_KRZYWDY)), "--->",of(M.W(W.HASLO_RDZENNYCH, "--->",  W.NEUTRALNOSC),
                                                                                             M.W(M.BRAK(W.HASLO_RDZENNYCH), "--->", KRZYWDY_WARUNKI)));

        M.WW(W.SONDA, "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);

        M.W(of(W.PIERWSZA_REAKCJA, W.REAKCJA_PO_SONDZIE, W.REAKCJA_PO_NARADZIE), "--->", of(W.REAKCJA));

        M.DUZY_WARUNEK(of(W.TRAUTO, W.KOBIETA, W.MIEJSCE_STALE, W.OSIEDLE, W.PRZEWAGA, W.SILA));

        M.W(M.thread_while_loop(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)), "--->", M.thread_while_loop(M.PRZEWAGA(W.CIAGLOSC_INFORMACJI)));

        M.W(W.SLABY, "--->", M.DEFAULT(W.CEL_ATAKU));
        M.W(W.SILNY, "--->", M.DEFAULT(M.thread_while_loop(M.WYBOR_CELU(W.SLABSI))));

        M.DEFAULT(of(M.MOCNO(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI), M.SLABO(PRZYCZYNY_SLUZENIA_DOBRU_WARUNKI)));

        M.W(of(W.MILY_TEAMT, W.ZARTY, W.POCHWALA, W.WSPARCIE, W.DOBRE_EMOCJE,
                W.TEMAT_ZGODNY_Z_WARTOSCIAMI, W.TEMAT_ZGODNY_Z_EMOCJAMI, W.TEMAT_NIEPODWAZALNY), "--->", of(W.DOBRA_ROZMOWA));


        M.W(of(W.DEFAULT_REAKCJA_ZLO), "--->", of(W.ZNIECZULICA));

        M.W(of(W.DEFAULT_REAKCJA_DOBRO), "--->", of(W.ZNISZCZYC));

        M.W(of(W.KOBIETA_W_ZWIAZKU), "--->", of(W.NAPEWNO_DAJE));

        M.W(of(W.ZLE_W_ZYCIU), "--->", of(W.ROBI_GORZEJ_INNYM,
                                            W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC,
                                            W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH));

        M.W(of(W.CIEKAWOSC_LUDZI, W.CIEKAWOSC_NIE_DEFAULTOWYCH_SYTUACJI), "--->", of(W.ATRAKCYJNOSC_ULICY));

        M.W(of(W.MALO_CZASU, W.NIE_ODZYWA_SIE), "--->", of(W.BRAK_SONDY));

        M.W(of(W.DOSTRZEZENIE_OKAZJI, W.NASTAWIENIE), "--->", of(W.ZAMKNIECIE_SYTUACJI));

        M.W(of(W.BEZKARNOSC, W.EMOCJE_ZE_ZLA, W.PRZEWAGA, W.NARKOTYKI), "--->", of(W.ZACHETA_DO_ZLA));

        M.W(of(W.OBECNOSC, W.ZOBACZENIE_WARTOSCI, W.DZIALANIE,
                W.NIEDANIE_WYBORU, W._II_, W.ZDOMINOWANIE, W.UTRZYMANIE), "--->", of(W.OSIAGNIECIE_WARUNKU));

        M.W(of(M.DLUGOTRWALE(SPORT_WARUNKI)), "--->", of(W.UZALEZNIENIE_OD_SPORTU));

        M.W(of(W.OSOBA_ZASIEG_WZROKU), "--->", of(W.SONDA_PO_WADACH));

        M.WW(of(W.LADNY, W.SILNY), "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SLABY), "--->", of(W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE));

        M.WW(of(W.LADNY, W.SILNY), "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SILNY), "--->", of(W.OTWARTE_STARCIE, W.WALKA_PIESCI));

        M.W(of(W.SAM) , "--->", of(W.LATWY_CEL, W.BRAK_PRZEWAG));

        M.W(M.SPOTKANY(goscZHanba), "--->", M.ZAWSZE_GDY_BLISKOSC(of(W.CISNIE, W.WYPOMNIENIE_HANBY)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).W_PRZECIWNYM_PRZYPADKU(W.PRZYPAL));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));

        M.WW(W.OSIEDLE, "--->", W.MIEJSCE_RESTRYKCYJNE_OSIEDLE, "--->", of(M.WIDZISZ(W.OSIEDLOWE_SRD), W.ZNASZ));

        M.W(W.NARKOTYKI, "--->", W.NIESTABILNOSC_UMYSLOWA);

        M.W(M.MIEJSCE_STALE(WZGL_IZOLACJA_WARUNKI), "--->", of(M.WPLYW(W.LUDZIE), M.MOZLIWOSC(of(W.KONFLIKT, W.ZNAJOMOSCI, W.PRZYJAZN, W.MILOSC))));

        M.W(of(M.BRAK(W.ORIENT), W.DZIALANIE,
                M.OPCJA(W.ZUCHWALOSC), M.OPCJA(M.BRAK(W.WIEDZA))), "--->", M.SZYBKO(W.KARA));

        M.W(W.OBCY, "--->", M.SZANSA_NA(of(M.SRODOWISKO(W.BOJA_SIE), W.EMOCJE_ZE_ZLA, W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)));

        M.WW(M.WALKA_DWOCH_OSOB((of(on(KRZYWDY_WARUNKI),
                            M.OPCJA(BRAK_ZASAD_WARUNKI),
                            M.OPCJA(OSLONY_WARUNKI)))), "--->", M.WALKA(W.ZLO.PRZECIW(W.ZLO)), "---->",
                                                                                                    M.REZULTAT(M.OBOJE(of(
                                                                                                        on(STRATY_MORALNE_WARUNKI),
                                                                                                        on(STRATY_MATERIALNE_WARUNKI),
                                                                                                    W.ZERO_ZYSKU))));

        M.W(M.NIEZDOLNOSC(of(W.WALKA_PIESCI, W.WALKA_SPRZET)), "--->", M.BRAK(W.SILA_SPRAWCZA_ULICA));

        M.W(W.POTRZEBA, "--->", M.UZASADNIENIE_OBECNOSCI(W.POTRZEBA));
    }



    public List<W> srodki() {
        return of(

                M.W(of(W.WALKA_PIESCI),
                        of(
                                M.sondaDostepu(),
                                M.sondaZagrozenia(),
                                M.sondaPrzypalu(KRYTERIA_PRZYPALU_WARUNKI),
                                M.poCichu(), M.II(), M.otwarteStacieF2F(),
                                M.POTRZEBNE(of(
                                        W.ZDOLNY_DO_WALKI,
                                        W.MALY_DOSTEP, W.MALE_ZAGROZENIE, W.MALY_PRZYPAL, W.ZGODA_OTOCZENIA)
                                )
                        )
                ),
                M.W(of(W.WALKA_SPRZET),
                        of(
                                M.skasowanieDostepu(),
                                M.postawienieNajwiekszejPrzewagiWKrotkimCzasie(),
                                M.nieDajSzansObrony(),
                                M.poCichu(), M.zZaskoczenia(), M.zUkrycia(),
                                M.POTRZEBNE(of(
                                        W.ZDOLNY_WALKA_SPRZET,
                                        W.DOBRE_MIEJSCE, W.DOBRA_GODZINA,
                                        W.WARTOSC, W.ZLAMANIE_ZASAD, W.ZGODA_GORY)
                                )
                        )
                ),
                M.W(of(W.STANDARDY, W._II_, W.PRAWO),
                        of(
                                M.przestrzeganie(of(W.STANDARDY, W._II_, W.PRAWO)),
                                M.oparcieSie(of(W.STANDARDY, W._II_, W.PRAWO)),
                                M.poCichu(),
                                M.POTRZEBNE(of(
                                        W.AUTORYTET,
                                        W.ZLAMANIE_STANDARDU, W._II_, W.ZLAMANIE_PRAWA,
                                        W.DLUGA_DOSTEPNOSC, W.LUDZIE, W.PRZEKONANE_OTOCZENIE)
                                )
                        )
                ),
                M.W(of(W.KLAMSTWO, W._88_, W.PRZEKONYWANIE),
                        of(
                                M.poCichu(),
                                M.POTRZEBNE(of(
                                        W.WARTOSC, W.LUDZIE_ZA_TOBA)
                                )
                        )
                ),
                M.W(of(W.OCZY, W.USZY, W.CIERPIENIE, W.POZBAWIENIE_BEZPIECZENSTWA, W.POZBAWIENIE_DOSTEPOW),
                        of(
                                M.zamkniecieSytuacjiBezpowrotnie(),
                                M.dokrecanieSruby(),
                                M.odnowa(), M.II(), M.odnowaMocniej(),
                                M.widziszTylkoZlaStrone(),
                                M.POTRZEBNE(of(
                                        W.OKAZJA, W.EKIPA_DLUGA_DOSTEPNOSC,
                                        W.EKIPA_RYZYKO, W.EKIPA_WALKA, W.OGARNIECI_ZA_TOBA)
                                )
                        )
                ),
                M.W(of(W.POZBAWIENIE_PRZEWAGI, W.KOSZTA, W.CIERPIENIE_DLUGOTERMINOWE, W.POJECHANE),
                        of(
                                M.ultimatum(of(W.RODZINA, W.BLISKIE_OSOBY, W.SRODOWISKO, W.PRACA, W.PIENIADZE)),
                                M.dokrecanieSruby(),
                                M.wjezdzanieNaCalyCyklDnia(),
                                M.dlugRosnie(),
                                M.POTRZEBNE(of(
                                        W.OWNER_ZA_TOBA, W.GORA_ZA_TOBA, W.EKIPA_SPRZET)
                                )
                        )
                ),
                M.W(of(W.POZBAWIANIE_AUTORYTETU),
                        of(
                                wszyscy.FOR_EACH(),
                                M.glosno(),
                                M.obrazanie(obelgi),
                                M.ukazanieZlychCech(),
                                M.wspominanieZlychWydarzen(),
                                M.zartowanie(zarty),
                                M.otwarteStacieF2F(),
                                M.terror(terror),
                                wszyscy.FOR_EACH_END(),
                                M.ktoZNimTenKurwa(),
                                M.shanbienie(),
                                M.POTRZEBNE(of(W.LUDZIE_WOKOL, W.LUDZIE_ZA_TOBA))
                        )
                )
        );
    }

    public List<W> poWejsciuDoCzlowki() {
        return of(M.thread_while_loop(M.ORIENT(of(W.SWOJA_EKIPA, W.PRZECIWNA_EKIPA, W.PSY))),
                    W.KAZDE_DZIALANIE_OCENIANE, W.PILNOWANIE_HIERARCHII, W.PILNOWANIE_PRZEWAG,
                    M.DOSTEP(of(W.WPROWADZANIE_ZASAD, W.ULTIMATUM, W.TWORZENIE_WARUNKOW, W.TWORZENIE_SZANS)),
                    W.ZMANIURAMI_PO_INFORMACJE, W.ZADNEJ_LITOSCI
        );
    }

    public void shortest(){
        List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);
        List<W> shrtOsobaSonda = SONDA_SHRTS_WARUNKI;

        M.W(of(W._01, W._II_, W.TRACISZ), "--->", W.REAKACJA);

        M.W(W.ZASZKODZIL,"--->", of(M.zapamietaj(),
                                        M.postawCiezkiWarunek(srodki),
                                        M.nieCzekaj(),
                                        M.wyprzedz(), M.szybkoDzialaj()));
    }


    public void gadka(){
        List<W> warunki = of(W.CALY_CZAS_ZRODLA_GADKI, W.CALY_CZAS_NADRZEDNY_FLOW_GADKI, W.CALY_CZAS_WEDROWKA_POKOJE);
        List<W> ograniczenia = of(W.OGRANICZENIE_CZASOWE, W.OGRANICZENIE_UWAGI);

        osoba.pobierz(W.NADRZEDNY_NURT_ROZMOWY); M.II(); osoba.stworz(W.ZRODLO_GADKI);
        M.W(W.NIEODZYWASZ_SIE, "--->", of(W.UNIKASZ_WALKI, W.NEUTRAL, W.TOCZY_SIE_BEZ_INGERENCJI, W.POZA_HIERARCHIA_ROZMOWY));

        M.kontrubutujesz();
        M.wyborOsob();
        M.glos();
        M.odMalegoDoDuzego();
        M.akcentujCoWazne();
        M.OPCJA(M.docenDostep());
        M.izolujJednostki(); M.II(); M.angazujJednostki();
        M.stworzWartosc();
        M.W(of(W._NIE_, W.KTOS_WAZNY, W.COS_WAZNEGO), "--->", M.sciagajGadke());

        M.W(of(W.MOZLIWOSC_PRZERWANIA_MOWY), "--->", of(M.mowSzybko(),
                                                        M.uwagaNaSobie()));

        M.thread_while_loop(W.NADRZEDNY_NURT_ROZMOWY);
        M.thread_while_loop(W.DOMINACJA_W_ROZMOWIE);
        M.thread_while_loop(W.NAJBARDZIEJ_CIEKAWY_TEMAT);
        M.thread_while_loop(W.WEDROWKA_PO_POKOJACH);
    }
    public void starcie(){
        W dzialanie = M.NAJMNIEJSZY_CZAS(W.NAJWIEKSZA_KRZYWDA);
        List<W> konfrontacja = KONFRONTACJA_WARUNKI;
        List<W> ktoKogo = KRZYWDY_WARUNKI;
        List<W> rany = ZBIOR_RANY;
        List<W> sytuacjeStarcie = SYTUACJE_STARCIE_WARUNKI;
        List<W> kryteriaPrzypalu = KRYTERIA_PRZYPALU_WARUNKI;
        List<W> metodaStarcieReakcja = METODA_STARCIE_REAKCJA_WARUNKI;
        List<W> ulicaPrzewagaReakcja = ULICA_PRZEWAGA_SPOSOB_WARUNKI;
        List<W> obronaStarcie = OBRONA_STARCIE_WARUNKI;
        List<W> zachowanieRezulat = ZACHOWANIE_REZULTAT_ULICA_WARUNKI;
        List<W> wymuszenieReakcji = WYMUSZENIE_REAKCJI_WARUNKI;
        List<W> zasiegPrzewagiUlica = ZASIEG_PRZEWAGI_ULICA_WARUNKI;

        M.W(of(W.POMSZCZENIE, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI,
                W.OBRAZENIA_FIZYCZNE, W.STARCIE_WIELU_NA_JEDNEGO,
                W.SPRZET, W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI), "--->", M.PARALIZUJE(of(W.SLABY, W.NIESWIADOMY)));

        M.W(W.WALKA_PIESCI, "--->", M.ULTIMATIUM(W.BRONI_SIE)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);
        M.W(W.CISNIE, "--->", M.ULTIMATIUM(W.ODPOWIADA)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);
        M.W(W.STRATA, "--->", M.ULTIMATIUM(W.POMSZCZENIE)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);

        M.WW(M.WIDZISZ(W.OSOBY), "--->", SYTUACJE_STARCIE_WARUNKI, "---->", W.STARCIE, "---->", of(W.WYGRANA, W._II_, W.PRZEGRANA,
                                                                                                                M.OPCJA(STRATY_MATERIALNE_WARUNKI),
                                                                                                                M.OPCJA(STRATY_MORALNE_WARUNKI)));

        M.W(W.WIDZISZ, "--->", of(M.POBIERZ(NASTAWIENIA_WARUNKI), M.SONDA_PRZYPALU(kryteriaPrzypalu), M.PLAN(of(W.ODDALENIE_SIE, W.UKRYCIE_SIE)),
                                                                        M.PRZEWIDZENIE(W.DROGA),
                                                                        M.NABYCIE(W.BLISKOSC),
                                                                        M.ROBOTA(ZBIOR_RANY),
                                                                        M.ODDALENIE_SIE(W.MIEJSCE),
                                                                        M.UKRYCIE()));

        M.W(M.OSOBA(KRYTERIA_WROGA_WARUNKI), "--->", of(M.UTRUDNIAJ(M.OSOBA(W.ZYCIE)),
                                                            M.UTRUDNIAJ(M.OSOBA(W.DOSTEP)),
                                                            M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI)))));

        List<W> sprzety = of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)));

        M.W(of(M.PROSTO(W.CISNIE)), "--->", of(W.ODRAZU_DZIALANIE));

        M.W(of(W.KLOTNIA), "--->", of(M.powtarzajGlosnoSensowneArgs(),
                                        M.W(W.ZAPIERA_SIE, "--->", of(M.upierasz(), M.udowadniaszPrzytaczasz())),
                                        M.W(W.ZAPIERA_SIE_RODZINA_PRACA, "--->", of(M.odpusc(),
                                                                                        M.wygrales(),
                                                                                        M.II(),
                                                                                        M.serceZkamienia(),
                                                                                        M.udowadniaj(),
                                                                                        M.prowokujStarcie()))));


        M.W(of(W.ZASIEG_ZMYSLOW, W._88_,
                W.WROG, W._II_,
                W.NIEGODNY_POPATRZENIA, W._II_,
                W.ROBI_ZDJECIA, W._II_,
                W.KONFI), "             ---->", M.STARCIE(W.OSOBA));


        M.W(M.STARCIE(W.MIEJSCE_STALE), "--->",  of(W.MOZLIWOSC_STRATY_DOSTEPU_MIEJSCA,
                                                        W.MOZLIWOSC_PSOW,
                                                        W.PO_EKIPE_NIEZDARZY,
                                                        W.PO_PSY_NIEZDARZY));

        M.W(W.USMIECH_ZNIEWAZAJACY, "--->", W.CISNIJ);

        M.W(of(W.AKCJA), "--->",  of(M.pamiecOBolach(),
                                        M.widzisz(),
                                        M.liczysz(),
                                        M.kontrolaSiebieKrokZaKrokiem(),
                                        M.leciszZZaskoczenia()));

        M.W(W.KOMIN, "--->", M.zobligowanyDoDzialania());

        M.W(W.SILNY, "--->", of(M.czekajNaBlad(W.WIEDZA),
                                    M.odlaczDostep(W.BLAD)));

        M.W(W._1SPOJRZENIE, "--->", M.OSOBA(M.SONDA(W.ZNAJOMOSC)));

        M.W(W._2SPOJRZENIA, "--->", of(M.probaZdobyciaInformacji(), M.II(),   M.szykowanieStarcia()));


        M.W(of(W.STARZY_LUDZIE, W._II_, W.FESTY), "--->", M.MOZLIWOSC(W.PRZYPAL));

        M.W(of(W.STARCIE), "--->", M.OPPONENT(W.KONSEKWENCJE));

        M.W(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI, W.WALKA_SPRZET), "--->", of(dzialaczMocny.pomsci(),
                                                                                        dzialaczMocny.ultimatumEkipie()));

        M.W(M.POBITY(osoba), "--->", of(M.KOLEJKA_DO(M.POBICIE(osoba)), M.POINFORMUJ_WSZYSTKICH(W.HANBA), W.DLUG_MORALNY, W.CHEC_POMSZCZENIA,
                                                                    znajomy.PRZESTAJE(W.WSPARCIE), znajomy.ZACZYNA(W.PRZECIW), silniejszy.GNOJI(osoba)));
    }

    public void przewagi(){
        List<W> przewagi = PRZEWAGI_WARUNKI;
        List<W> slabosci = SLABOSCI_WARUNKI;

        M.W(W.PRZEWAGA_LOKALNA, "--->", W.PRZEWAGA_GLOBALNA);

        List<W> potrzebneWarunki = of(W.STALA_PLANSZA, W.WIELE_INTERAKCJI, W.WIELE_OSOB, W.OSOBA_ODSLANIAJACA_SIE);

        W brakZasad = M.NIEWAZNE(BRAK_ZASAD_WARUNKI).MIMO_TO(M.WAZNE(of(W.PRZEWAGA, W.ZYSK, W.WARUNEK_SPRZYJAJACY)));

        M.W(W.DUZA_PRZEWAGA, "--->", of(W.TWORZENIE_WARUNKOW, W.SILA_SPRAWCZA, W.REALNY_WPLYW_NA_LUDZI, W.REALNY_WPLYW_NA_WYDARZENIA));

        M.W(of(W.SLABY, W._88_, W.PRZEWAGA), "--->",  M.MOZLIWOSC(M.PRZEJECIE(W.PRZEWAGA)));

        M.W(of(W.ZLY, W._88_, W.BAZUJE_NA_PRZEWADZE), "--->", M.ZNISZCZENIE(M.OSOBA(W.PRZEWAGA)));

        M.W(of(M.OSOBA(W.DOBRY), W._88_, M.POSIADA(W.PRZEWAGA)), "--->", M.WSPARCIE(W.PRZEWAGA));

        M.W(of(W.DOBRY, W._88_, W.BRAK_PRZEWAGI_X, W._88_, W.MAM_PRZEWAGE_X), "--->", M.podzielSie(W.PRZEWAGA));

        M.W(M.BRAK(W.PRZEWAGA), "--->", M.PRACA(of(W.WYSILEK, W.CIERPLIWOSC, W.CIERPIENIE)));

        M.W(W.PRZEWAGA_OPIERAJACA_SIE_NA_LUDZIACH, "--->", of(W.MOZLIWA_ULOTNOSC, M.utrzymaj()));

        M.W(of(W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU, W._II_,
                W.DUZA_PRZEWAGA_STARCIA, W.DUZY_POSLUCH, W.DUZA_PRZYCHYLNOSC), "--->", M.MOZLIWOSC(W.ZDOMINOWANIE));

        M.W(M.MOZLIWOSC(W.ZDOMINOWANIE), "--->", of(M.zdominuj(of(W.WIEDZA_GDZIE_JAK_UDERZYC, W.STWORZENIE_WARTOSCI, W.ZEBRANIE_PRZEWAGI, W.WIEDZA, W.DOBRO, W.PRZYMUS)),
                                                                                                                M.II(),
                                  M.zdominuj(of(W.ZDROWOTNE_KASOWANIE_JEDNOSTEK, W.DOSTEPOWE_KASOWANIE_JEDNOSTEK, W.EKIPA_SPRZET, W.WALKA_SPRZET, W.WALKA_PIESCI))));

        M.W(W.ZDOMINOWANIE, "--->", of(W.TWORZENIE_WARUNKOW, W.TWORZENIE_SZANS, W.ZBIERANIE_WARTOSCI, W.TWORZENIE_MODY));

        M.W(of(W.RESTRYKCJA), of(M.sredniaRestrykcja(of(W.SKLEP, W.RESTAURACJA, W.KLUB)),
                                M.mocnaRestrykcja(of(W.ULICA, W.BLOKI, W.PRZYSTANEK, W.TRAUTO))));

        M.W(of(W.MIEJSCE_STALE, W._88_, W.KIBICOWANIE),
                of(
                        M.zeSrodowiska(W.OK),
                        M.pozaSrodowisko(W.KUP_COS),
                        M.drugaStrona(W.WYPAD),
                        M.drugaStronaDzialajacy(W.SZPITAL)
                )
        );
        M.W(W.PRZEWAGA_NA_STARCIE,
                of(
                        W.ZNAJOMI_OD_SZKOLY,
                        W.UTRZYMANE_PRZEWAGI_OD_SZKOLY
                )
        );
    }



    public void przeplywInformacji(){
        M.W(W.STALO_SIE, "--->", of(M.dodajDoGoraceTematy(W.STALO_SIE),
                                        M.powiazZ(osoba),
                                        M.zapamietaj()));

        M.W(of(W.SPOTKANY_ZNAJOMY), "--->",of(M.wezOstatnieGoraceTematy(),
                                                  M.rozpowiedz(znajomy, W.STALO_SIE, osoba)));

        M.W(M.OSOBA(M.ZNAJOMY(W.OSOBA_X)), "---->", M.rozpowiedz(znajomy, W.STALO_SIE, osoba));
    }

    public void hierarchiaOsiedle(){
        List<W> warunki = of(W.ANTY_NORMALNOSC, W.HIERARCHIA, W.ZAZDROSC, W.BRAK_ZASAD, W.TWORZENIE_WZAJEMNEGO_CIERPIENIA,
                W.ZLO, W.NUDA, W.EMOCJE_ZE_ZLA);

        Map<W, Integer> miejsceSzansaProcent = new HashMap<>();
        miejsceSzansaProcent.put(W.MELINA_NA_OSIEDLU, 80);
        miejsceSzansaProcent.put(W.MIEJSCE_STALE, 50);
        miejsceSzansaProcent.put(W.OSIEDLE, 20);
        miejsceSzansaProcent.put(W.GLOWNA_DROGA, 10);

        Map<Integer, W> przewagi = new HashMap<>();
        przewagi.put(3, W.ILOSC_OSOB);
        przewagi.put(2, W.WALKA_SPRZET);
        przewagi.put(1, W.WALKA_PIESCI);
        przewagi.put(1, W.ROZMIAR);

        OH przydupas = new OH();
        OH przydupas2 = new OH();
        OH przydupas3 = new OH();
        OH przydupas4 = new OH();
        OH przydupas5 = new OH();
        OH przydupas6 = new OH();
        OH przydupas7 = new OH();
        OH przydupas8 = new OH();
        OH przydupas9 = new OH();

        OH ogarniety = new OH(of(przydupas, przydupas2, przydupas3));
        OH ogarniety2 = new OH(of(przydupas4, przydupas5, przydupas6));
        OH ogarniety3 = new OH(of(przydupas7, przydupas8, przydupas9));

        OH gangusZHajsem = new OH(of(ogarniety, ogarniety2, ogarniety3));
    }

    public void algorytmUlicy() {
        List<W> budujacyHierarchieDecyzyjni = of(W.MORDERCY, M.DLUGO(W.STRATA_WOLNOSCI), M.DUZO(M.ZROBIL_DLA(W.EKIPA)),
                W.RUMUNI, W.BANDYCI, W.NIESPRAWIEDLIWI, W.AGRESYWNI, on(PRZEWAGI_WARUNKI));

        List<W> cele = of(W.WZIECIE_JAKNAJWIECEJ_OSOB_DO_BIEGANIA, W.WZIECIE_JAKNAJWIECEJ_OSOB_DO_CPANIA, M.SILNA(W.EKIPA), W.PIENIADZE, W.SILA_SPRAWCZA);
        List<W> przyczynyBiegania = of(W.MODA, W.STARSI, W.WYKLUCZENIE_ZE_SRODOWISKA, W.AGRESJA, W.KORZYSCI, W.WADY, W.NUDA);
        List<W> klimatBiegania = of(W.NARKOTYKI, W.WYROK, W.KONFIDENCI, W.PIENIADZE, W.KONTUZJA, W.CIERPIENIE, M.CALY_CZAS(W.ORIENT));

        M.W(W.WEJSCIE, "---->", of(M.OTRZYMANIE(of(W.FALSZYWE_KORZYSCI, on(PRZEWAGI_Z_ULICY_WARUNKI)))));

        M.oglup(of(W.DOSTEP_DO_PLANSZY, W.KLAMSTWO, W.NARKOTYKI));
        M.przestrzel(osoba);
        M.wezDoSrodowiska(osoba);
        M.GRANT(ME, of(W.ZRODELKO, W.STOZEK_SZCZEGOLU, W.SUBSCRIBES_INFORMACJE, W.BLISKOSC, W.TELEFONY, W.PRZEWAGA));

        M.thread_while_loop(W.KONTROLA);
        M.thread_while_loop(W.WYMAGANIE_DZIALANIA_DLA_ZLA);
        M.thread_while_loop(W.GNOJ_POSTRONNYCH);  me.thread_while_loop(W.GNOJ_EKIPA_NIZSI_OD_CIEBIE);
        M.thread_while_loop(W.GNOJ_EKIPA);
        M.thread_while_loop(W.UNIZAJ_CZYNY);

        M.sonda(W.ILE_SIE_DA); M.odkryjWady(osoba); M.wstawDoHierarchiiPodToba(osoba);
        M.thread_while_loop(M.WYKORZYSTUJE(W.OSOBA));
        M.thread_while_loop(M.otoczPrzewage(W.WALKA_SPRZET));
        M.W(W.WYJSCIE, "--->", of(W.SAMOTNOSC, W.POJECHANE, W.WALKA_SPRZET));
    }
    public void kibicowanieKrotkieUjecie() {
        M.W(M.SRODOWISKO(M.NIE_WYKORZYSTUJE(W.OSOBA)), "--->", M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI))));

        M.W(M.NIE_ZNAJA(W.OSOBA), "--->", M.ROZKMINANIE(of(W.HASLO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)));

        M.W(M.OSOBA(M.BRAK(W.HASLO_RDZENNYCH)), "--->", of(M.dziwadlo(W.OSOBA),
                                                                    M.gorszeTraktowanieNizReszta(W.OSOBA),
                                                                    M.zamkniecieSytuacjiBezpowrotnie(),
                                                                    M.obgadywanie()));

        M.W(W.SLABY, "--->", M.DUZE_SZANSE(M.PO_CICHU(of(M.SPRAWDZANIE(W.HASLO_RDZENNYCH), W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI))));
        M.W(W.SILNY, "--->", M.DUZE_SZANSE(M.OTWARTE(W.STARCIE)));

        M.WEJSCIE(W.EKIPA).W_PRZECIWNYM_PRZYPADKU(of(W.PUSTKA, W.FESTY, W.BEZ_PIENIEDZY, W.SLABI));
    }

    public void krajobrazUlicy() {
        List<W> conditions = of(W.PUSTKA, W.BRAK_PIENIEDZY, W.NARKOTYKI, W.KAZDE_DOBRO_NA_DOL);

        M.thread_while_loop(W.KUMULUJACA_SIE_PATOLOGIA);
        M.tlo(of(W.AGRESJA, W.NERWY, W.ZLO, W.DOSTEP));
    }



    public void agresja() {
        M.POTRZEBNE(of(W.BEZPIECZNE_MIEJSCE_BRAK_POLICJI, W.OPPONENT_NIEPRZESTRASZONY, M.OPPONENT(W.BLISKOSC)));

        M.W(of(W.KTOS_SAM, W.KTOS_PATRZY, W.KTOS_POSIADA,
                W.CISNIE, W.BOJKA, W.ZLE_W_ZYCIU),               "--->", M.MOZLIWOSC(W.STARCIE));

        M.W(W.STARCIE, "--->", KRZYWDY_BEZPOSREDNIE_WARUNKI);


    }

    public void zwyklaOsobaZOsiedla() {
        List<W> warunki = of(M.MOCNO(W.KIBICOWANIE), M.MOCNO(M.CHETNIE(W.ZLO)), M.MOCNO(W.MIEJSCE_STALE), M.MOCNO(W.MODA), M.MOCNO(W.ZNAJOMI),
                M.MOCNO(W.HIERARCHIA), M.MOCNO(W.UKLADZIK), M.MOCNO(W.WYKORZYSTANIE), M.MOCNO(W.BRAK_WSTYDU), M.MOCNO(W.KLAMSTWO),
                M.SLABO(W.WYSILEK), M.SLABO(W.RYZYKO), M.SLABO(W.UMIEJETNOSCI), M.SLABO(W.OBECNOSC), M.SLABO(W.PRAWDA), M.SLABO(W.DOBRO));

        M.OSOBA(M.SET(of(W.NASTAWIENIE_PRZYJEMNOSCI, W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_HIERACHI_PRZYWILEJE)));
    }

    public void zzzHandly() {
        M.WW(M.WIECEJ_NIZ_ZWYKLE(of(W.WYSILEK, W.PIENIADZE, W.KONTROLA)), "--->", M.GORSZE(W.REZULTATY), "--->", M.OSOBA(M.ZLECAJACA(W.NERWY)));
    }

    public void nuda() {
        M.W(W.WYJSCIE_NA_ULICE, "--->", W.NUDA);

        M.W(of(W.WYJSCIE_NA_ULICE, W._88_, W.KIBICOWANIE, on(PRZEWAGI_Z_ULICY_WARUNKI)), "--->", of(W.BRAK_NUDY));
    }

    public void tchorzSchemat() {
        M.W(W.MIEJSCE_STALE, "--->", W.SONDA_ILE_MOZNA);

        M.W(W.NASTAWIENIE, "--->", M.JEZELI_MOZNA(M.LATWO(KRZYWDY_WARUNKI)));
    }

    public void nieZnam() {
        M.W(of(W.NIE_ZNAM), "--->", of(W.DRUGA_STRONA, W.NIE_MA_DOSTEPU, W.PRZESTRZELIC, W.ROZKMINIC));
    }

    public void tworzenieWarunkow() {
        polskiRzad.tworzyWarunki(of(W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, W.PRAWO));
        grubasPrzewaga.tworzyWarunki(of(W.KLAMSTWO, W.SLABY, W.WADY, W.DZIALAJACY, W.ZMYSLY_DLA_ZLA, M.NASYLANIE_DZIALACZY(),
                                                                                        oraz(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI)));

        grubasPrzewaga.tworzyWarunki(M.ZAPOTRZEBOWANIE(of(W.ZLO, on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI), on(KRZYWDY_WARUNKI))));
        grubasPrzewaga.tworzyWarunki(M.TOLERANCJA(of(on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI))).CEL(M.CZESTO(of(W.WYKORZYSTANIE, W.DZIALANIE_DLA_ZLA))));

        M.W(grubasPrzewaga.tworzyWarunki(M.TOLERANCJA(M.KONTROLA(KONTROLA_WARUNKI))), "--->", M.KONTROLA(of(
                                                                                                    M.SRODOWISKO(W.KOBIETY),
                                                                                                    M.SRODOWISKO(PRZEWAGI_Z_ULICY_WARUNKI),
                                                                                                    M.SRODOWISKO(W.WARTOSC),
                                                                                                    M.SRODOWISKO(W.OSOBY),
                                                                                                    M.SRODOWISKO(W.CIAGLOSC_INFORMACJI),
                                                                                                    M.SRODOWISKO(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ))))));

        dzialacz.zwiekszaSzanse(of(W.ZLO, on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI), on(KRZYWDY_WARUNKI)));

        grubasPrzewaga.tworzy(W.SRODOWISKO).CEL(of(
                M.ZWIEKSZANIE(PRZEWAGI_Z_ULICY_WARUNKI), M.MATERIALIZOWANIE_ZLA_DZIEKI(W.PRZEWAGA), M.WYKLUCZENIE(osobyPozaSrodowisko),
                M.ROBI_KRZYWDE_Z_PRZEWAGA(osobyPozaSrodowisko, KRZYWDY_WARUNKI),
                M.NABYCIE(of(W.SILA_SPRAWCZA, W.PRZEWAGA_SILY, W.POSLUCH)),
                M.NABYCIE(M.WPLYW(W.LUDZIE)),
                M.NABYCIE(M.MOZLIWOSC(of(W.KONFLIKT, W.ZNAJOMOSCI, W.PRZYJAZN, W.MILOSC))),
                M.NABYCIE(W.PRZYJEMNOSCI),
                M.NABYCIE(W.CIAGLOSC_INFORMACJI),
                M.NISZCZENIE(W.DOBRO),
                M.TWORZENIE(W.ZLO),
                M.ULTIMATIUM(W.ZLO).W_PRZECIWNYM_PRZYPADKU(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))),
                osoby.DZIALANIE(W.ZLO)
                        .CEL(of(W.KOMFORT, W.PRZEWAGA, W.PRZYJEMNOSCI, W.BRAK_CIERPIENIA))
                        .REZULTAT(of(M.USPRAWIEDLIWIENIE(W.ZLE_CZYNY), W.WARTOSC_MATERIALNA))
        ));

        fest.tworzyWarunki(of(W.WYWYZSZENIE_SLABYCH));
    }

    public void przejecie() {
        M.thread_while_loop(W.NORMALNOSC);
        M.W(M.PRZEJECIE(KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, OSLONY_WARUNKI), "--->", M.OBSADZ_STANOWISKA(of(W.SWOI, W.ZLI)));
        M.ULTIMATIUM(pracownicy.thread_while_loop(M.DZIALANIE_DLA_ZLA(KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, OSLONY_WARUNKI)));
        M.thread_while_loop(M.DOSTEP_TYLKO(M.OSOBY(W.ZLI)));

        M.W(M.MIEJSCE_STALE(W.DLUGA_DOSTEPNOSC), "--->", of(M.WEJSCIE(W.WCZESNIE_RANO),
                                                                M.thread_while_loop(M.DYZURY(W.DZIALAJACY)),
                                                                M.thread_while_loop(M.SPRAWDZANIE(W.WSZYSCY))));
    }



    public void slabszegoKlubuZalosneStarania() {


        M.ULTIMATIUM(W.ZLO).W_PRZECIWNYM_PRZYPADKU(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI)));


    }

    public void terytoriumWroga() {
        M.CZESTO(M.ZWIADY(W.OSIEDLE));
        M.CZESTO(M.OSIEDLE(W.ZDJECIA_TWARZOWKI));

        M.CZESTO(M.ZWIADY(W.MIEJSCA_STALE));
        M.CZESTO(M.MIEJSCE_STALE(W.ZDJECIA_TWARZOWKI));

        M.CZESTO(M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)));
        M.CZASEM(M.WJAZD(M.OSIEDLE(W.SPRZET)));

        M.thread_while_loop(M.PROBUJ(M.PRZEJECIE(of(W.OSIEDLE, W.MIEJSCE_STALE, W.PRACA, W.SLUZBY, W.LUDZIE))));
    }

    public void ANTY_60_sledztwoPolicyjne() {
        W pierwszePrawo = M.BRON_BOZE(W.NIGDY_NIE_GADAJ_Z_POLICJA);

        W obligatoryjnie = M.MOCNO(of(W.NIE_ZNAM_OSOBY_X, W.NIE_BYLEM_NA_MIEJSCU, W.NIE_DOKONALEM_ZARZUCANEGO_CZYNU, W.NIE_BYLEM_Z_OSOBA_X,
                                    W.NIE_ZNAM_PODEJRZANYCH, W.NIE_ROZPOZNAJE_OSOB_NA_ZDJECIACH, W.NIE_POTRAFIE_WSKAZAC_WINNYCH,
                                    W.NIE_POTRAFIE_POMOC_W_SLEDZTWIE, W.NIE_POTWIERDZAM_WERSJI_SWIADKOW_POKRZYWDZONYCH));

        M.START(of(
                M.WYRZUCENIE_Z_GLOWY(M.CELOWE_ZAPOMNIENIE(W.PRAWDZIWA_WERSJA_WYDARZEN)),

                M.ZAPAMIETANIE(of(W.BEZ_PRZYPALOWA_WERSJA_WYDARZEN, W._II_, W.NIE_PAMIETAM_CO_ROBILEM_TEGO_DNIA))
        ));

        W konsekwetnie = M.thread_while_loop(M.TRZYMANIE_DO_KONCA(W.JEDNA_WERSJA_WYDARZEN)
                                                    .MIMO(of(W.DOWODY_OBCIAZAJACE, M.MOZLIWOSC(W.STRATA_WOLNOSCI))));

        // kryterium oceny zachowania

        M.WWW(W.ZDARZENIE, "->", W.SPRAWA_W_SADZIE,
                                        "--->", M.OSOBA(M.BRAK(M.WSPOLPRACA(W.POLICJA))), "--->", W.WYROK_SADU, "--->", M.OSOBA(W.OK));

        M.WWW(W.ZDARZENIE, "->", W.SPRAWA_W_SADZIE,
                                   "--->", M.OSOBA(M.WSPOLPRACA(W.POLICJA)), "--->", M.WYROK_SKAZUJACY(W.WINNY), "--->", M.OSOBA(W.KONFI));

        M.REZULTAT(of(
         M.WW(M.WYROK_SKAZUJACY(M.OSOBA(W.OK)), "->", M.OSOBA(M.TYMCZASOWE(W.STRATA_WOLNOSCI)), "->", M.DOSTEP(of(W.SRODOWISKO, W.PRZEWAGA, W.ZNAJOMI))),

         M.W(M.OSOBA(W.KONFI), "--->", M.OSOBA(M.DOZYWOTNIO(of(W.WYKLUCZENIE, W.HANBA, M.BRAK_DOSTEPU(of(W.SRODOWISKO, W.PRZEWAGA, W.ZNAJOMI))))))
        ));

        // DPK
        M.W(W.DOBROWOLNE_PODDANIE_SIE_KARZE, "---->", M.POTRZEBNE(W.ZGODA_WSZYSTKICH_OSKARZONYCH_NA_DPK))
                                                                            .W_INNYM_PRZYPADKU(M.OSOBA(M.WSPOLPRACA(W.POLICJA)));
    }

    public void sprzet() {
        M.W(W.SPRZET, "--->", of(M.ZMNIEJSZANIE_PRZEWAG(M.OSOBA(W.BEZ_SPRZETU)),
                                                            M.SILNA_OSLONA(W.WARTOSC),
                                                            M.NAJWIEKSZY(W.STRACH),
                                                            M.DUZA_KRZYWDA(W._1_RUCH),
                                      M.UZYCIE(M.WYMAGA(of(W.SILNA_PSYCHIKA, W._88_, M.NIE_PRZESTRASZENIE_SIE(of(W.KONSEKWENCJE, W.CHEC_POMSZCZENIA,
                                                                                                            W.STRATA_WOLNOSCI, W.OGRANICZENIE_WOLNOSCI_ULICA,
                                                                                                            W.USZCZERBEK_NA_ZDROWIU, W.HOSPITALIZACJA)))))));
    }
}
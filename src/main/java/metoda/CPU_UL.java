package metoda;

import warunek.W;
import z_inne.OH;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.SOMEONE;
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
        M.W(of(W._NOT_, W.CZOLO, W.OGARNIECI),
                of(
                        M.GRANT(ME, of(W.MOCNI_NIE_LICZACY_SIE, W.CHETNE_PIONKI, W.PIONKI, W.MLODE_PIONKI,
                                W.FEST, W.BANAN, W.SYSTEMOWY_BURZUJ, W.WYGODNIS))
                )
        );

        M.W(of(W.NIESWIADOMOSC),
                of(
                        M.GRANT(ME, of(W.NIESZCZESCIE))
                )
        );

        M.W(of(W.BRAK_SRODOWISKA),
                of(
                        M.GRANT(ME, W.BRAK_CIAGLOSCI_OTOCZENIA),
                        M.GRANT(ME, W.OD_ENDCASE_DO_ENDCASE)
                )
        );

        M.W(of(W._NOT_, W.SILA_RZADZI),
                of(
                        M.GRANT(ME, W.FEST_RZADZI)
                )
        );

        M.W(of(W._NOT_, W.ULICA),
                of(
                        M.GRANT(SOMEONE, of(W.SYSTEMOWIEC, W.BURZUAZJA))
                )
        );

        M.WWW(of(W.MOCNY_WZROK),
                of(
                        M.GRANT(ME, potrzeba(of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY)))
                ),
                of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY),
                of(
                        M.GRANT(ME, of(W.KREGOSLUP_MORALNY, W.ZDOLNOSC_DO_WYSILKU, W.ZDOLNY_DO_WALKI, W.WNIOSKI, W.PODSWIADOMOSC, W.WIEDZA_SPORT))
                ),
                of(W.CIERPIENIE, W._88_, W.Z_MIASTA, W._88_, W.DOSTEP_DO_PLANSZY),
                of(
                        M.GRANT(ME, of(W.ZDOLNY_WALKA_SPRZET, W.ZDOLNY_DO_RYZYKA, W.WIEDZA_ULICA, W.DOBRA_JEDNOSTKA))
                )
        );

        M.W(of(W.CIERPIENIE),
                of(
                        M.zapamietaj(of(W.OSOBA, W.MIEJSCE, W.WARUNEK)),
                        M.robRany(W.OSOBA)
                )
        );

        M.W(of(W.WIECZNY_IMIGRANT),
                of(
                        M.DEFAULT(_100osob.wyklucz(W.WIECZNY_IMIGRANT))
                )
        );

        M.WW(of(W.ZLY),
                of(
                        M.atak(),
                        M.zamykajDostep()
                ),
                of(W.DOBRY),
                of(
                        M.wspieraj(),
                        M.udostepniaj()
                )
        );

        M.WW(of(W._NOT_, W.DZIALANIE_W_EKIPIE),
                of(
                        M.GRANT(ME, W.THREAD_WHILE_LOOP_PUSTKA)
                ),
                of(W._NOT_, W.KONTAKT_TEL),
                of(
                        M.GRANT(ME, W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U)
                )
        );
        M.W(of(W.POTENCJALNA_IZOLACJA_WIELE_RAZY, W._88_, W.POTENCJALNE_ZYSKANIE_PRZEWAGI),
                of(
                        M.wstrzymajSie()
                )
        );
        M.W(of(W.ZMARNOWANA_SZANSA),
                of(
                        M.skreslaj(osoba)
                )
        );
        M.W(of(W.OBECNOSC, W.ZASADY, W.PRACA),
                of(
                        M.GRANT(ME, of(W.SRODOWISKO, W.HIERARCHIA, W.RYWALIZACJA))
                )
        );

        shortest();
        tworzaceJakosc();
        zachowanie();
        starcie();
        gadka();
        przewagi();
        shortestSonda();
        sonda();
        przeplywInformacji();
        nawiazanieRelacji();
        hierarchiaOsiedle();
        teoriaPrzewagUlicy();
        algorytmUlicy();
        kibicowanieUjecie();
        krajobrazUlicy();
        dojscieDoWalki();
        ulicaRelacjeWarunkow();
        wokolDzialaczaSrodowiska();
        agresja();
        defaultOsoba();
        szansaNaDzialajacego();
        zzzHandly();
        nuda();
        tchorzSchemat();
        nieZnam();
        rdzenni();
        tworzenieWarunkow();
        defaultNastawieniaWychodzenieNaUlice();
        przejecie();
        wychodzisz();
        slabszegoKlubuZalosneStarania();
        terytoriumWroga();
        ANTY_60_sledztwoPolicyjne();
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

    public List<W> afterTop() {
        return of(W.SWOJA_EKIPA, W.PRZECIWNA_EKIPA, W.PSY,
                W.KAZDE_DZIALANIE_OCENIANE, W.PILNOWANIE_HIERARCHII, W.PILNOWANIE_PRZEWAG,
                W.WPROWADZANIE_ZASAD, W.ULTIMATUM, W.TWORZENIE_WARUNKOW, W.TWORZENIE_SZANS, W.ZMANIURAMI_PO_INFORMACJE,
                W.ZADNEJ_LITOSCI
        );
    }

    public void shortest(){
        List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);
        List<W> shrtOsobaSonda = of(W.TEZYNA_FIZYCZNA, W.UBRANIE, W.OSOBOWOSC, W.WARTOSCI_ZYCIOWE, W.SRODOWISKO, W.SPEDZANIE_WOLNEGO_CZASU, W.RODZENSTWO);

        M.WW(of(W._01, W._II_, W._NOT_, W.BENEFICJENT),
                of(
                        M.reaguj()
                ),
                of(W.BENEFICJENT),
                of(
                        M.wspieraj(), M.II(), M.neutral()
                )
        );
        M.sondujWarunekMocniejszy();
        M.ktoMialTrudno();
        M.ktoSieUpaja();
        M.ktoFest();

        M.kogoTrzymaStrone();

        M.sondaPosiadania();
        M.sondaPrzewag();

        M.WW(of(W.TRACE),
                of(
                        M.dzialaj()
                ),
                of(W.ZASZKODZIL),
                of(
                        M.zapamietaj(),
                        M.postawCiezkiWarunek(srodki),
                        M.nieCzekaj(),
                        M.wyprzedz(),
                        M.szybkoDzialaj()
                )
        );
    }
    public void tworzaceJakosc(){
        M.WWW(of(W.SILNY),
                of(
                        M.wychodzisz(),
                        M.odslaniasz()
                ),
                DUZO_IF_WARUNKI,
                of(
                        M.wydluzajCzas(),
                        M.estymuj(),
                        M.maloLazBezCelu(), M.stale(), M.ujscie(), M.zKims()
                ),
                of(W.KONDYCJA),
                of(
                        M.duzoGetAndCompare(),
                        M.od_8_do_22()
                )
        );
        M.W(of(W.BRAK_WSTYDU, W._88_, W.WYCHOWANIE_NA_ULICY),
                of(
                        M.proba(),
                        M.wnioski(),
                        M.wiedza()
                )
        );
    }
    public void zachowanie() {
        boolean mocnyWzrok = true;
        List<W> priorytety = of(W.ULICA, W.KOBIETA, W.PRACA);
        M.thread_while_loop(W.DOBRO);
        M.thread_while_loop(W.POTENCJALNE_STARCIE);
        M.thread_while_loop(W.AKTYWNA_WALKA_ZE_ZLEM);

        M.thread_while_loop(W.ANTY_POSLUSZNOSC);
        M.thread_while_loop(W.ANTY_FEST);
        M.thread_while_loop(W.ANTY_SYSTEM);
        M.thread_while_loop(W.ANTY_BURZUA);

        // informacja bodziec
        M.WWW(of(W._01, W._II_, W._NOT_, W.BENEFICJENT),
                of(
                        M.reaguj()
                ),
                of(W.BENEFICJENT),
                of(
                        M.wspieraj(), M.II(), M.neutral()
                ),
                of(W.BRAK_ZYSKU),
                of(
                        M.wyjebane()
                )
        );
        M.WW(of(W.LUDZIE),
                of(
                        M.pokazPrzewagi(),
                        M.pokazSieZNajlepszejStronyZachowania(),

                        M.wzrokiemPowstrzymaj(),
                        M.nadajZobowiazanieTonem(),
                        M.izolujObszar(),

                        M.ocenWedlugWad(izolowanaOsoba),
                        M.oszacujOgraniczenia(izolowanaOsoba),
                        M.oszacujDzienCodzienny(izolowanaOsoba),
                        M.oszacujWartosci(izolowanaOsoba),
                        M.oszcaujZagrozenia(izolowanaOsoba),

                        M.skinaj(),
                        M._3pktTwarzy()
                ),
                of(W.CZESTO_PATRZY, W._88_, W.NIE_WIE_CO_ZROBIC, W._II_, W.WIDZISZ, W._88_, W.DOBRY),
                of(
                        M.initGadki()
                )
        );
    }
    public void gadka(){
        List<W> warunki = of(W.THREAD_WHILE_LOOP_ZRODLA_GADKI, W.THREAD_WHILE_LOOP_NADRZEDNY_FLOW_GADKI, W.THREAD_WHILE_LOOP_WEDROWKA_POKOJE);
        List<W> ograniczenia = of(W.OGRANICZENIE_CZASOWE, W.OGRANICZENIE_UWAGI);

        osoba.pobierz(W.NADRZEDNY_FLOW_GADKI); M.II(); osoba.stworz(W.ZRODLO_GADKI);
        M.WW(of(W.NIEODZYWASZ_SIE),
                of(
                        M.GRANT(ME, of(W.UNIKASZ_WALKI, W.NEUTRAL, W.TOCZY_SIE_BEZ_INGERENCJI, W.POZA_HIERARCHIA_ROZMOWY)
                        )),
                of(W.UCINASZ),
                of(
                        M.REMOVE(ME, W.GADKA)
                )
        );
        M.kontrubutujesz();
        M.wyborOsob();
        M.glos();
        M.odMalegoDoDuzego();
        M.akcentujCoWazne();
//            M.docenDostep();
        M.izolujJednostki(); M.II(); M.angazujJednostki();
        M.stworzWartosc();
        M.W(of(W.KTOS_WAZNY, W.COS_WAZNEGO),
                of(
                        M.sciagajGadke()
                )
        );
        M.thread_while_loop(W.NADRZEDNY_FLOW_GADKI);
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
        List<W> ulicaPrzewagaReakcja = ULICA_PRZEWAGA_REAKCJA_WARUNKI;
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

        M.PROSTO(W.BOJKA);
        M.W(of(M.PROSTO(W.CISNIE)), "--->", of(W.ODRAZU_DZIALANIE));

        M.WWW(of(W.KTOS_SZKODZI),
                of(
                        M.kontruj()
                ),
                of(W.TRACE),
                of(
                        M.dzialaj()
                ),
                of(W.ZASZKODZIL),
                of(
                        M.zapamietaj(),
                        M.postawCiezkiWarunek(srodki),
                        M.nieCzekaj(),
                        M.wyprzedz(),
                        M.szybkoDzialaj()
                )
        );
        M.WWW(of(W.KLOTNIA),
                of(
                        M.powtarzajGlosnoSensowneArgs()
                ),
                of(W.ZAPIERA_SIE),
                of(
                        M.upierasz(),
                        M.udowadniaszPrzytaczasz()
                ),
                of(W.ZAPIERA_SIE_RODZINA_PRACA),
                of(
                        M.odpusc(),
                        M.wygrales(),
                        M.II(),
                        M.serceZkamienia(),
                        M.udowadniaj(),
                        M.prowokujStarcie()
                )
        );
        M.WW(of(W.MOZLIWOSC_PRZERWANIA_MOWY),
                of(
                        M.mowSzybko(),
                        M.uwagaNaSobie()
                ),
                of(W.UPORCZYWIE_PRZERYWA),
                of(
                        M.przywolajPorzadek(),
                        M.starcie(rany)
                )
        );
        M.WW(of(W.ZLA_JEDNOSTKA),
                of(
                        M.wysmianie(),
                        M.zleEmocje(),
                        M.obracaniePrzeciw(),
                        M.sciagajGadke(),
                        M.starcie(rany)
                ),
                of(W.ZASIEG_ZMYSLOW, W._88_, W.KOSA, W._II_, W.NIEGODNY_POPATRZENIA, W._II_, W.ROBI_ZDJECIA, W._II_, W.KONFI),
                of(
                        M.starcie(rany)
                )
        );
        M.W(of(W.SIEDZA, W._88_, W.DZIALAJACY, W._88_, W.MIEJSCE_STALE),
                of(
                        M.niszczWieczor(),
                        M.postawCiezkiWarunek(srodki),
                        M.GRANT(ME, W.PO_EKIPE_NIEZDARZY),
                        M.GRANT(ME, W.PO_PSY_NIEZDARZY),
                        M.GRANT(ME, W.SAM_NIEJEST_WSTANIE_SIE_BRONIC)
                )
        );
        M.W(of(W.STARCIE_NA_MIEJSCU),
                of(
                        M.GRANT(ME, W.MOZLIWOSC_STRATY_DOSTEPU_MIEJSCA),
                        M.GRANT(ME, W.MOZLIWOSC_PSOW)
                )
        );
        M.WW(of(W.CISNIE, W._II_, W.USMIECH_ZNIEWAZAJACY),
                of(
                        M.odpowiedz(),
                        M.ukazWadyWStarciuSlownym()
                ),
                of(W.CISNIE_MOCNO),
                of(
                        M.starcie(rany), M.II(), M.starcieBezZasad()
                )
        );
        M.WW(of(W.BEKA, W._88_, W.NIEZNASZ_GO),
                of(
                        M.ucinaj()
                ),
                of(W.BEKA_Z_CIEBIE),
                of(
                        M.starcie(rany)
                )
        );
        M.WW(of(W.AKCJA),
                of(
                        M.pamiecOBolach(),
                        M.widzisz(),
                        M.liczysz(),
                        M.kontrolaSiebieKrokZaKrokiem(),
                        M.leciszZZaskoczenia()
                ),
                of(W.KOMIN),
                of(
                        M.zobligowanyDoDzialania()
                )
        );
        M.W(of(W.SILNY),
                of(
                        M.czekajNaBlad(W.WIEDZA),
                        M.odlaczDostep(W.BLAD)
                )
        );
        M.WW(of(W._1SPOJRZENIE),
                of(
                        M.patrzCzyZnam()
                ),
                of(W._2SPOJRZENIA),
                of(
                        M.probaZdobyciaInformacji(),
                        M.szykowanieStarcia()
                )
        );
        M.WW(of(W.GANGUS, W._88_, W._1SPOJRZENIE),
                of(
                        M.cisnie()
                ),
                of(W.GANGUS, W._88_, W.ODPOWIEDZ),
                of(
                        M.starcie(rany),
                        M.tworzKonsekwencje()
                )
        );
        M.W(of(W.LADNY),
                of(
                        zly.zabij()
                )
        );
        M.W(of(W.KOLECZKO_WZAJEMNEJ_ADORACJI),
                of(
                        M.punktujWady(), M.II(), M.wprowadzCosLepszego(), M.II(), M.rozdupcSila()
                )
        );
        M.W(of(W.STARZY_LUDZIE, W._II_, W.FESTY),
                of(
                        M.GRANT(ME, W.MOZLIWOSC_PRZYPAL)
                )
        );
        M.W(of(W.STARCIE),
                of(
                        M.przestroga(),
                        M.konsekwencje(opponent)
                )
        );
        M.W(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI, W.WALKA_SPRZET), "--->", of(dzialaczMocny.pomsci(),
                                                                                        dzialaczMocny.ultimatumEkipie()));

        M.W(M.POBITY(osoba), "--->", of(M.KOLEJKA_DO(M.POBICIE(osoba)), M.NOTIFY_ALL(W.HANBA), W.DLUG_MORALNY, W.CHEC_POMSZCZENIA,
                                                                    znajomy.PRZESTAJE(W.WSPARCIE), znajomy.ZACZYNA(W.PRZECIW), silniejszy.GNOJI(osoba)));
    }
    public void przewagi(){
        W przewagaGlobal = W.PRZEWAGA_LOCAL;
        List<W> potrzebneWarunki = of(W.STALA_PLANSZA, W.WIELE_INTERAKCJI, W.WIELE_OSOB, W.OSOBA_ODSLANIAJACA_SIE);

        W brakZasad = M.NIEWAZNE(BRAK_ZASAD_WARUNKI).MIMO_TO(M.WAZNE(of(W.PRZEWAGA, W.ZYSK, W.WARUNEK_SPRZYJAJACY)));

        M.W(W.DUZA_PRZEWAGA, "--->", of(W.TWORZENIE_WARUNKOW, W.SILA_SPRAWCZA, W.REALNY_WPLYW_NA_LUDZI, W.REALNY_WPLYW_NA_WYDARZENIA));

        M.WW(of(W.NIEZNAJOMY, W._88_, W.NIEWSTANIE_OBRONIC_PRZEWAGI),
                of(
                        M.bierzPrzewage()
                ),
                of(W.BAZUJE_NA_PRZEWADZE),
                of(
                        M.kasujMuPrzewage()
                )
        );
        M.WW(of(W.WADA),
                of(
                        M.DEFAULT(M.zapamietaj())
                ),
                of(W.WADA, W._88_, W.ZLY),
                of(
                        M.dziurkaDoJakNajwiekszejLiczbyOsob()
                )
        );
        M.WW(of(W.NEUTRAL),
                of(
                        M.neutral()
                ),
                of(W.DOBRY),
                of(
                        M.wspieramPrzewage()
                )
        );
        M.W(of(W.DOBRY, W._88_, W.BRAK_PRZEWAGI_X, W._88_, W.MAM_PRZEWAGE_X),
                of(
                        M.podzielSie(W.PRZEWAGA)
                )
        );
        M.W(of(W.BRAK_PRZEWAG),
                of(
                        M.praca(of(W.WYSILEK, W.CIERPLIWOSC, W.CIERPIENIE))
                )
        );
        M.W(of(W.BRAK_ZAKLECIA),
                of(
                        M.srodowiskoWaliBuca(),
                        M.srodowiskoRobiCierpienie()
                )
        );
        M.W(of(W.PRZEWAGA_OPIERAJACA_SIE_NA_LUDZIACH),
                of(
                        M.GRANT(ME, W.MOZLIWA_ULOTNOSC),
                        M.dzialajSzybkoZZaskoczenia(),
                        M.przejmij(),
                        M.utrzymaj()
                )
        );
        M.WW(of(W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU, W._II_, W.DUZA_PRZEWAGA_STARCIA, W.DUZY_POSLUCH, W.DUZA_PRZYCHYLNOSC),
                of(
                        M.zdominuj(of(W.WIEDZA_GDZIE_JAK_UDERZYC, W.STWORZENIE_WARTOSCI, W.ZEBRANIE_PRZEWAGI,
                                W.WIEDZA, W.DOBRO, W.PRZYMUS)),
                        M.II(),
                        M.zdominuj(of(W.ZDROWOTNE_KASOWANIE_JEDNOSTEK, W.DOSTEPOWE_KASOWANIE_JEDNOSTEK,
                                W.EKIPA_SPRZET, W.WALKA_SPRZET, W.WALKA_PIESCI))
                ),
                of(W.ZDOMINOWANIE),
                of(
                        M.GRANT(ME, of(W.TWORZENIE_WARUNKOW, W.TWORZENIE_SZANS, W.ZBIERANIE_WARTOSCI,
                                W.TWORZENIE_ZARTY, W.TWORZENIE_MODY)),
                        M.utrzymaj(afterTop())
                )
        );
        M.W(of(W.RESTRYKCJA),
                of(
                        M.sredniaRestrykcja(of(W.SKLEP, W.RESTAURACJA, W.KLUB)),
                        M.mocnaRestrykcja(of(W.ULICA, W.BLOKI, W.PRZYSTANEK, W.TRAUTO))
                )
        );

        M.W(of(W.MIEJSCE_STALE, W._88_, W.KIBICOWANIE),
                of(
                        M.zeSrodowiska(W.OK),
                        M.fest(W.KUP_COS),
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
    public void shortestSonda(){
        M.W(of(W.MEZCZYZNA),
                of(
                        M.MOCNO(M.sonda(W.OCZY)),
                        M.MOCNO(M.sonda(W.HASELKO_RDZENNYCH)),
                        M.sonda(W.Z_KIM),
                        M.sonda(W.SWIADOMOSC), // 1: FEST
                        M.sonda(W.SILA_SPRAWCZA), // WPLYW: 0
                        M.sonda(W.ROZMIAR),
                        M.sonda(W.ZLO_DOBRO), // UZASADNIENIE: 0
                        M.sonda(W.WIEK),
                        M.sonda(W.CZY_CWEL), // NICNIEMOZE : 0
                        M.POROWNANIE(W.INNI),
                        M.sonda(W.SRODOWISKO),
                        M.sonda(W.CZYNY_DZIALANIA),
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

        M.W(of(W.SONDA_ZASOBU), "--->", M.SONDA(of(W.WARTOSC, W.TRUDNOSC_UTRZYMANIA, W.KTO_ZYSKUJE, W.KTO_TRACI)));

        M.W(of(W.SONDA_DZIALANIA), "--->", M.SONDA(of(W.WARTOSC, W.BEZPIECZENSTWO, W.KONSEKWENCJE, W.CZESTOTLIWOSC, W.EFEKTYWNOSC)));

        M.W(M.MIEJSCE_STALE(WZGL_IZOLACJA_WARUNKI), "--->", M.SONDA_GLEBOKA(izolowanaOsoba));

        M.W(W.CZYN, "--->", M.SONDA(of(M.jakie(W.WARUNKI_POCZATKOWE),
                                            M.jakDuze(W.PRZECIWNOSCI),
                                            M.jakDuze(W.ULATWIENIA),
                                            M.jakie(W.PRZYCZYNY),
                                            M.ile(W.CZAS),
                                            M.jakDuze(W.WARUNKI_OSIAGNIETE))));

        M.W(M.WIDZISZ(W.WARUNEK), "--->", M.SONDA(of(W.POCZATEK, W.KONIEC, W.SILA, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC)));

        M.W(M.OSOBA(W.MOWI), "--->", M.SONDA(W.KTO_MOWI));

        M.W(W.POKAZUJE_EMOCJE, "--->", W.SLABY);

        M.W(W.NIE_UMIE_KLAMAC, "--->", W.MALO_PRZEZYL);

        M.W(of(W.ZLY, W._88_, W.PATRZY), "--->", M.SONDA(W.ZROBIENIE_ZLA).CEL(KRZYWDY_WARUNKI));

        M.WW(M.INFORMACJA(W.OSOBA), "--->", M.SONDA(W.HASELKO_RDZENNYCH), "--->", of(M.OSOBA(W.OD_NAS), W._II_,
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
                M.BRAK(W.ZDOLNY_DO_WALKI)),          "---->", M.OSOBA(of(W.FEST, W.SLABY, W.NIESWIADOMY)));


        M.W(of(W.ZE_WSI, W._88_, W.BRAK_WYSILKU_FIZYCZNEGO), "--->", M.OSOBA(of(W.NIEPATRZY_GLOBALNIE, W.ZAMKNIETY_W_SWOIM_POKOJU)));

        M.W(M.ZASOB(M.NALEZY_DO(W.SLABY)), "--->", of(M.PRACA_NAD(W.ZASOB), M.WZIECIE_NA_SWOJA_STRONE(W.ZASOB)));

        M.W(of(W.BIEGACZE),
                of(
                        M.GRANT(YOU, of(W.BRAK_PIENIEDZY, W.GLUPI, W.NUDA, W.ZLY, W.DOSTEP_OGRANICZONY))
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
    public void nawiazanieRelacji(){
        M.thread_while_loop(W.PUSTKA);
        M.W(of(W.LUDZIE),
                of(
                        M.widzisz(W.WADY),
                        M.widzisz(W.ZLO),
                        M.widzisz(W.ZAZDROSC)
                )
        );
        M.W(of(on(WZGL_IZOLACJA_WARUNKI), W._II_,
                  W.ZNAJOMI, W._II_,
                  W.CZAS, W._88_, W.PODBIJASZ), "--->", W.SZANSA_POZNANIE);

        M.thread_while_loop(W.UTRZYMANIE_RELACJI);

        M.W(M.BRAK(W.UTRZYMANIE_RELACJI), "--->", of(M.KONIEC(W.RELACJA),
                                                          M.KONIEC(M.ZNAJOMOSC(W.OSOBA)),
                                                          W.ZMARNOWANY_CZAS));
    }
    public void hierarchiaOsiedle(){
        List<W> warunki = of(W.ANTY_NORMALNOSC, W.HIERARCHIA, W.ZAZDROSC, W.BRAK_ZASAD, W.TWORZENIE_WZAJEMNEGO_CIERPIENIA,
                W.ZLO, W.NUDA, W.EMOCJE_ZE_ZLA);

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

    public void teoriaPrzewagUlicy(){
        Map<Integer, W> przewagi = new HashMap<>();
        przewagi.put(3, W.ILOSC_OSOB);
        przewagi.put(2, W.WALKA_SPRZET);
        przewagi.put(1, W.WALKA_PIESCI);
        przewagi.put(1, W.ROZMIAR);
    }

    public void algorytmUlicy() {
        List<W> budujacyHierarchieDecyzyjni = of(W.MORDERCY, M.DLUGO(W.STRATA_WOLNOSCI), M.DUZO(M.ZROBIL_DLA(W.EKIPA)),
                W.RUMUNI, W.BANDYCI, W.NIESPRAWIEDLIWI, W.AGRESYWNI, on(PRZEWAGI_WARUNKI));

        List<W> cele = of(W.WZIECIE_JAKNAJWIECEJ_OSOB_DO_BIEGANIA, W.WZIECIE_JAKNAJWIECEJ_OSOB_DO_CPANIA, M.SILNA(W.EKIPA), W.PIENIADZE, W.SILA_SPRAWCZA);
        List<W> przyczynyBiegania = of(W.MODA, W.STARSI, W.WYKLUCZENIE_ZE_SRODOWISKA, W.AGRESJA, W.KORZYSCI, W.WADY, W.NUDA);
        List<W> klimatBiegania = of(W.NARKOTYKI, W.WYROK, W.KONFIDENCI, W.PIENIADZE, W.KONTUZJA, W.CIERPIENIE, M.CALY_CZAS(W.ORIENT));

        M.W(W.WEJSCIE, "---->", of(M.OTRZYMANIE(W.FALSZYWE_KORZYSCI), on(PRZEWAGI_Z_ULICY_WARUNKI)));

        M.oglup(of(W.DOSTEP_DO_PLANSZY, W.NARKOTYKI));
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

    public void kibicowanieUjecie() {
        M.W(M.SRODOWISKO(M.NIE_WYKORZYSTUJE(W.OSOBA)), "--->", M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI))));

        M.W(M.NIE_ZNAJA(W.OSOBA), "--->", M.ROZKMINANIE(of(W.HASELKO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)));

        M.W(M.OSOBA(M.BRAK(W.HASELKO_RDZENNYCH)), "--->", of(M.dziwadlo(W.OSOBA),
                                                                    M.gorszeTraktowanieNizReszta(W.OSOBA),
                                                                    M.zamkniecieSytuacjiBezpowrotnie(),
                                                                    M.obgadywanie()));

        M.W(W.SLABY, "--->", M.DUZE_SZANSE(of(M.SPRAWDZANIE(W.HASELKO_RDZENNYCH), W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)));

        M.WEJSCIE(W.EKIPA).W_PRZECIWNYM_PRZYPADKU(of(W.PUSTKA, W.FESTY, W.BEZ_PIENIEDZY, W.SLABI));
    }
    public void krajobrazUlicy() {
        List<W> conditions = of(W.PUSTKA, W.BRAK_PIENIEDZY, W.NARKOTYKI, W.KAZDE_DOBRO_NA_DOL);

        M.thread_while_loop(W.KUMULUJACA_SIE_PATOLOGIA);
        M.tlo(of(W.AGRESJA, W.WKURWIENIE, W.ZLO, W.DOSTEP));
    }
    public void dojscieDoWalki() {
        M.POTRZEBNE(of(W.BEZPRZYPALOWE_MIEJSCE, W.OPPONENT_NIEPRZESTRASZONY, W.BLISKOSC_70PROC));
    }
    public void ulicaRelacjeWarunkow() {
        M.NIGDY_MALO(of(W.KASA, W.SEX, W.PRZYJEMNOSCI)); // MATERIALNE
        M.NIGDY_MALO(of(W.ZLO, W.DOBRO, W.NIENAWISC, W.MILOSC, W.AGRESJA_W_DZIALANIU, W.CIERPLIWOSC)); // MORALNE

        M.W(M.DEFAULT(M.thread_while_loop(W.WSZYSCY_CHCA_CIE_TWOJEJ_KRZYWDY)), "--->",of(M.W(W.HASELKO_RDZENNYCH, "--->",  W.NEUTRALNOSC),
                                                                                      M.W(M.BRAK(W.HASELKO_RDZENNYCH), "--->", KRZYWDY_WARUNKI)));

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

        M.W(of(W.BOKS_DLUGOTRWALY), "--->", of(W.UZALEZNIENIE_OD_SPORTU));

        M.W(of(W.OSOBA_ZASIEG_WZROKU), "--->", of(W.SONDA_PO_WADACH));

        M.WW(of(W.LADNY, W.SILNY), "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SLABY), "--->", of(W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE));

        M.WW(of(W.LADNY, W.SILNY), "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SILNY), "--->", of(W.OTWARTE_STARCIE, W.WALKA_PIESCI));

        M.W(of(W.SAM) , "--->", of(W.LATWY_CEL, W.BRAK_PRZEWAG));

        M.W(M.SPOTKANY(goscZHanba), "--->", M.ZAWSZE_GDY_BLISKOSC(of(W.CISNIE, W.WYPOMNIENIE_HANBY)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).W_PRZECIWNYM_PRZYPADKU(W.PRZYPAL));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));

        M.WW(W.OSIEDLE, "--->", W.MELINA_NA_OSIEDLU, "--->", of(M.WIDZISZ(W.OSIEDLOWE_SRD), W.ZNASZ));

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

    }

    public void wokolDzialaczaSrodowiska() {
        M.W(M.OSOBA(W.ZNAJOMI), "--->", M.ULTIMATIUM(W.DZIALANIE_DLA_ZLA).W_PRZECIWNYM_PRZYPADKU(KRZYWDY_WARUNKI));

        M.W(of(W.SRODOWISKO, W.UMNIEJSZANIE_WAD, W.WZAJEMNE_WSPARCIE,
                M.oddalanieSieOdWalkiZagrozenia(of(W.SKAZYWANIE_SAMOTNOSC, W.PRZEWAGA, W.PRZYJEMNOSC)),
                M.oddalanieOdKonkurencji(of(W.SIEDZENIE_MELINY, W.PRZYCHYLNOSC))),                "--->", of(W.NIE_ODKRYTY, W.BRAK_TRUDNOSCI,
                W.NIE_ODKRYCIE_WAD));

        M.W(of(W.NIEDOJEBANIE_UMYSLOWE,W.NIEDOJEBANIE_FIZYCZNE, W.AGRESJA_W_DZIALANIU,
                W.DOMINACJA, W.GLEBOKO_SZUKA_ZLA, W.TRAKTUJA_SIE_JAK_DZIECI,
                W.NIE_ODKRYTY, W.BRAK_TRUDNOSCI, W.NIE_ODKRYCIE_WAD,
                W.BRAK_SUMIENIA, W.ZYSK_Z_DZIALANIA,
                W.EGOISTA, W.CHEC_KRZYWDY, W.NIEZWRACA_UWAGI_NA_KRZYWDE_INNYCH,
                W.LEKCEWAZY_INNYCH, W.UNIZA, W.ZUCHWALY),                                "--->", of(W.DZIALAJACY));

        M.W(of(W.ZLY, W._88_, W.PRZEWAGA), "--->", of(W.WALI_OSOBE_BEZ_PRZEWAGI, W.BEZKARNOSC, W.GLUPOTA));

        M.W(of(W.NUDA, W.KTOS_CIEBIE_LUB_TY_NIEGO,
                W.AGRESJA_W_DZIALANIU, W.EMOCJE_ZE_ZLA), "--->", of(W.WALI_OSOBE_BEZ_PRZEWAGI, W.OSZUKANIE_WDUPCENIE, W.BEZKARNOSC, W.GLUPOTA));

        M.W(of(W.DZIALANIE_POZA_RANGA), "--->", of(W.OGLUPIANIE, W.KLAMSTWO, W.PO_CICHU, W.ZAMKNIJ_ZASOB));

        M.W(of(W.SRODOWISKO, W.UMNIEJSZANIE_WAD, W.WZAJEMNE_WSPARCIE,
                M.oddalanieSieOdWalkiZagrozenia(of(M.OSOBA(W.SKAZYWANIE_SAMOTNOSC), W.PRZEWAGA, W.PRZYJEMNOSC)),
                M.oddalanieOdKonkurencji(of(W.SIEDZENIE_MELINY, W.PRZYCHYLNOSC,
                        W.OGLUPIANIE, W.KLAMSTWO, W.PO_CICHU, W.ZAMKNIJ_ZASOB)),
                W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE, W.SPRZET, W.AGRESJA_W_DZIALANIU, W.ZLO),   "--->", of(W.NIESPRAWIEDLIWI,
                                                                                                                W.NIESPRAWIEDLIWE_PRZEWAGI,
                                                                                                                W.EMOCJE_ZE_ZLA));
        M.W(of(W.ZLY, W._88_, W.WIDZIAL) , "--->", of(W.ODRAZU_ZLO, W.PRAGNIENIE_ZLA));

        M.W(of(W.TEORIA_RYWALIZACJI, W.BLISKOSC), "--->", of(W.KTOS_CIEBIE_LUB_TY_NIEGO, W.ZAMKNIJ_ZASOB,
                W.WYKORZYSTUJ, W.OSZUKANIE_WDUPCENIE, W.POBIC));

        M.W(of(M.OSLONKA(of(W.PRZEWAGA, W._88_, W.UKRYCIE))) , "--->", of(W.GIERKA_KTO_NAJBARDZIEJ_PRZEJEBANY));

        M.W(of(W.SPOTKANIE_WZROKIEM), "--->", of(W.KTOS_CIEBIE_LUB_TY_NIEGO, W.KTO_WIECEJ_PATRZY,
                W.KTO_WIECEJ_CISNIE, W.KTO_WIECEJ_BIJE, W.KTO_WIECEJ_SPRZETU,
                W.KTO_WIECEJ_OSOB, W.KTO_WIECEJ_KONTUZJI, W.KTO_WIECEJ_STRACHU));

        M.W(of(W.DASZ_SIE_POZNAC, W._88_, W.NIESLUCHASZ) , "--->", of(W.GNOJA));

        M.WW(of(M.MOCNO(of(W.AGRESJA, W.CHETNY_DZIALANIA, W.GLUPOTA)),
                W.BRAK_PIENIEDZY, W.SLUCHAJ_KOLEGOW), "--->",  of(W.EKIPA), "---->", of(W.WYKONYWANIE_ROZKAZOW_DLA_HAJSU_ZLA,
                W.WYROK, W.OGRANICZONE_INFORMACJE,
                W.PRZEWAGA_SILY, W.PRZEWAGA_EKIPY_SPRZETU));

        M.W(of(W.ZLO), "--->", of(W.ROB_NAJWIEKSZA_KRZYWDE, W.ROZPOWIEDZ_DO_NAJWIEKSZEJ_LICZBY_OSOB, W.PRZEKONAJ_NAJWIECEJ_OSOB));

        M.W(of(W.BLISKOSC, W._88_, W.WROGOSC), "--->", KRZYWDY_WARUNKI);

        M.W(of(W.SIEDZENIE_W_SRODOWISKU), "--->", of(W.BEZPIECZENSTWO, W.STREFA_KOMFORTU, W.POTRZEBA_EMOCJI,
                W.ZNUDZENIE_OSOBAMI, W.POTRZEBA_NOWYCH_OSOB));

        o(M.WWW(on(W.DZIALAJACY, W._88_, W.ZROBIONE_ZLO), "--->", W.CZEKA_NA_EFEKT,
                                                            "--->", W.BRAK_REAKCJI, "--->", W.ZACHETA_DO_ZLA))
                                                                .w_przeciwnym_przypadku(of(W.REAKACJA, W.KARA, M.OPCJA(W.UKAZANIE),
                                                                W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA,
                                                                                        M.OPCJA(W.CHEC_POMSZCZENIA)));

        M.W(M.WOKOL_TYLKO(W.ZLI), "--->", of(wszyscy.SLUCHAJA(najwyzszyHierarchiaWokol),
                                        M.GRANT(najwyzszyHierarchiaWokol, of(W.SILA_SPRAWCZA, W.TWORZENIE_WARUNKOW))));

        M.W(of(W.MIEJSCE_STALE_DZIALAJACE, W._II_, W.SRODOWISKO), "--->", M.thread_while_loop(of(W.KOMFORT, W.INFORMACJE)));

        M.W(M.INFORMACJA(W.KRZYWDA_DRUGIEJ_STRONY), "--->", of(W.NASTAWIENIE_WSPARCIE, W.WESELE, W.CHCEMY_WIECEJ, W.ZA_CIOSEM));

        M.W(of(M.WOKOL_TYLKO(W.SWOI), W.ZLO, W._88_, W.INTERAKCJA), "--->", of(W.NOTYFIKACJA_EKIPA, W.WSPARCIE_OSLONY, W.PRZEKONYWANIE_PRZECIW));

        M.W(of(M.OSOBA(W.BIEGAJACY),
                W.BLISKOSC,
                M.OSOBA(W.NIE_BIEGAJACY)), "--->", M.OSOBA(W.BIEGAJACY).ROBI_KRZYWDE(of(M.OSOBA(W.NIE_BIEGAJACY), on(KRZYWDY_WARUNKI))));

        M.W(M.NAUCZ((M.OSOBA(of(on(ZAROBEK_NIELEGALNY_WARUNKI),
                                on(KRZYWDY_WARUNKI),
                                on(BRAK_ZASAD_WARUNKI))))), "---->", M.CEL(of(M.WYKORZYSTUJE(W.OSOBA), M.OSOBA(M.DZIALANIE_DLA(W.SRODOWISKO)), W.OKRASC_PIENIADZE)));

        M.WW(M.thread_while_loop(M.KONTROLA(W.OSOBA)), "--->", of(M.thread_while_loop(M.OSOBA(M.DZIALANIE(W.ZLO))),
                                                                         M.thread_while_loop(M.OSOBA(M.WYKONUJE(W.ROZKAZ)))),
                                                                "--->", M.REZULTAT(M.thread_while_loop(M.OSOBA(M.DOSTEP(PRZEWAGI_Z_ULICY_WARUNKI)))));
        M.W(M.SLABY(W.DZIALAJACY), "--->", W.WSPARCIE);
        M.W(M.SILNY(W.NIE_DZIALAJACY), "--->", M.KRZYWDY(KRZYWDY_WARUNKI));

        M.W(M.OSOBA(M.PRZESTAJE(of(M.WYKONUJE(W.ROZKAZ), M.DZIALANIE(W.ZLO)))), "--->",of(M.OSOBA(M.BRAK_DOSTEPU(PRZEWAGI_Z_ULICY_WARUNKI)),
                                                                                            M.KRZYWDY(of(W.OSOBA, on(KRZYWDY_WARUNKI)))));

        M.W(M.MIEJSCE_STALE(WZGL_IZOLACJA_WARUNKI), "--->", of(M.thread_while_loop(M.KONTROLA(W.OSOBY)),
                                                                    M.thread_while_loop(M.SONDA(W.OSOBY)),
                                                                    M.thread_while_loop(M.ORIENT(W.WARTOSC)),
                                                                    M.W(W.WARTOSC, "--->", M.DZIALANIE(W.WARTOSC)),
                                                            M.W(W.OSOBA,"--->", of(M.zeSrodowiska(W.OK),
                                                                                    M.fest(W.KUP_COS),
                                                                                    M.drugaStrona(W.WYPAD),
                                                                                    M.drugaStronaDzialajacy(W.SZPITAL)))));

        M.W(M.DZIALAJACY(W.STARCIE), "--->", of(M.zaczepSprowokuj(osoba),
                                                     M.wrocZPrzewaga(),
                                                     M.walZPrzewaga(osoba, W.PRZEWAGA),
                                                     M.rozpowiedz(W.WSZYSCY),
                                                     M.thread_while_loop(W.DOMINACJA)));

        M.W(W.HASELKO_RDZENNYCH, "--->", of(M.SPRAWDZANIE(W.SWOI), M.SPRAWDZANIE(W.WROG),
                                                 M.UPEWNIENIE_SIE(M.BEZ_KONSEKWENCJI(M.W_SRODOWISKU(KRZYWDY_WARUNKI)))));

        M.W(M.SONDA(PRZEWAGI_WARUNKI), "--->", M.DEFAULT(of(M.W(W.BRAK_PRZEWAG, "--->", W.BRAK_DZIALANIA),
                                                                M.W(W.MALO_PRZEWAG, "--->", M.UKRYTE(W.DZIALANIE)),
                                                                M.W(W.DUZO_PRZEWAG, "--->", M.OTWARTE(W.DZIALANIE)))));

        M.WW(M.WEJSCIE(W.EKIPA), "--->", M.NABYWANIE(PRZEWAGI_Z_ULICY_WARUNKI), "--->", M.thread_while_loop(M.ROBI_KRZYWDE_Z_PRZEWAGA(of(W.PRZECIWNY_KLUB,
                                                                                                    on(KRZYWDY_WARUNKI), on(PRZEWAGI_Z_ULICY_WARUNKI),
                                                                                                    on(BRAK_ZASAD_WARUNKI), on(OSLONY_WARUNKI)))));

        of(M.NIEWAZNE(W.PRAWDA), M.WAZNE(W.DOBRO_EKIPY));

        M.W(M.MIEJSCE_STALE(W.SPORT), "--->", of(M.RESTRYKCJA(M.DOSTEP(M.MOGA_WEJSC(of(W.JEDEN_KLUB_KIBICOWSKI, M.OPCJA(W.TYLKO_BIEGAJACY))))),
                                                    M.W(W.OSOBA_POZA_SRODOWISKO, "--->", M.GORSZE_TRAKTOWANIE(W.OSOBA_POZA_SRODOWISKO).NIZ(W.SRODOWISKO)),
                                                    M.CEL(of(M.NABYCIE_PRZEWAGI(M.TYLKO_DLA(of(W.SRODOWISKO, W.BIEGAJACY))), M.POZBAWIENIE(M.MOZLIWOSC(M.NABYCIE_PRZEWAGI(W.OSOBA_POZA_SRODOWISKO)))))));

        M.W(W.SLABY, "--->", of(M.UNIKA(W.WALKA_PIESCI), M.SIEGA_PO(W.SPRZET)));

        M.W(M.DZIALANIE(of(W.OSTRY_SPRZET, W.GAZ, W.ZWIADY, W.ZDJECIA_TWARZOWKI)), "--->", M.CEL(of(M.WYWOLANIE(W.STRACH),
                                                                                            M.PRZEZUCENIE(W.PRZECIWNY_KLUB))));

        M.W(of(M.UDAJE_ZE(W.DZWONI), M.UDAJE_ZE(W.PRZEGLADA_TELEFON)), "--->", M.ROBI(W.ZDJECIA_TWARZOWKI));


        M.WW(M.SLABY_TCHORZ(M.PO_CICHU(of(M.ZWYZYWAJ(W.OSOBA),
                                M.DZIALAJ_NA_SZKODE(W.OSOBA)))), "--->", M.OSOBA(M.NIESWIADOMY(of(W.OBELGI,
                                                                                          W.KRZYWDA))), "--->", M.SLABY_TCHORZ(of(
                                                                                                                        W.CIESZY_SIE,
                                                                                                                        M.POCHWAL_SIE(W.EKIPA),
                                                                                                                        M.NOTIFY_ALL(M.OSOBA(W.HANBA)))));

        M.W(M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), "--->", M.thread_while_loop(M.WJAZD(W.SPRZET)));

        M.W(W.OSOBA_POZA_SRODOWISKO, "--->", M.SRODOWISKO(M.thread_while_loop(M.UKRYCIE(W.INFORMACJE).PRZED(W.OSOBA_POZA_SRODOWISKO))));

        M.TOLERANCJA(of(W.ZLO, on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI)));
        M.CZESTO(of(W.ZLO, on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI)));

        M.BRAK_SZANS(of(M.KOBIETA(W.DZIEWICA), M.PRAWDZIWA(W.MILOSC), M.DOBRE(M.LEGALNE(W.ZAROBKI))));

        M.SRODOWISKO(M.TWORZY_WARUNKI(M.LATWO(M.WEJSCIE(M.WYMAGANIA(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ)))))));

        M.SRODOWISKO(M.TWORZY_WARUNKI(M.OSOBY(of(W.DZIALANIE_DLA_ZLA, M.KRZYWDY(of(W.PRZECIWNY_KLUB,
                                                                                    on(KRZYWDY_WARUNKI),
                                                                                    on(BRAK_ZASAD_WARUNKI),
                                                                                    on(OSLONY_WARUNKI))),
                                                                                    M.NABYWANIE(W.PRZEWAGA).DLA(W.SRODOWISKO)))
                                                                                  .CEL(M.OTRZYMANIE(of(on(PRZEWAGI_MATERIALNE_WARUNKI), on(PRZEWAGI_Z_ULICY_WARUNKI))))));

        M.W(M.SRODOWISKO(M.thread_while_loop(M.KONTROLA(KONTROLA_WARUNKI))), "--->", M.KONTROLA(of(M.SRODOWISKO(W.KOBIETY),
                                                                                            M.SRODOWISKO(PRZEWAGI_Z_ULICY_WARUNKI),
                                                                                            M.SRODOWISKO(W.WARTOSC),
                                                                                            M.SRODOWISKO(W.OSOBY),
                                                                                            M.SRODOWISKO(W.CIAGLOSC_INFORMACJI),
                                                                                            M.SRODOWISKO(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ))),
                                                                                M.W(W.WARTOSC, "--->", M.ODRAZU(M.DZIALANIE(W.WARTOSC))),
                                                                    M.W(M.OSOBA(M.POSIADA(W.PRZEWAGA)), "--->", M.SILNIEJSZY(M.ODRAZU(M.PROBA(M.PRZEJECIE(W.PRZEWAGA))))))));

        M.W(M.OSIEDLE(M.OSOBA(W.OBCY)), "--->", M.OSIEDLE(M.KAZDY_BLLISKO(M.WYCHODZI(W.OSIEDLE)))
                                                                      .CEL(M.ROBI_KRZYWDE(of(W.OBCY, on(KRZYWDY_WARUNKI))))
                                                                      .CEL(M.PRZESTRASZENIE(of(W.OBCY, M.OBCY(M.BRAK_DOSTEPU(W.OSIEDLE))))));

        M.W(M.MIEJSCE_STALE(M.WYMAGANE(W.HASELKO_RDZENNYCH)), "--->",
                                    of(M.W(M.OSOBA(M.POWIEDZIAL(W.HASELKO_RDZENNYCH)), "--->", of(M.OBSLUGA(W.MILA), M.DOBRZE_WYKONANE(W.USLUGI))),
                                       M.W(M.OSOBA(M.NIE_POWIEDZIAL(W.HASELKO_RDZENNYCH)), "--->", of(M.OBSLUGA(W.NIE_MILA), M.ZLE_WYKONANE(W.USLUGI),
                                                                                                        M.NOTYFIKACJA(W.EKIPA), W.ZDJECIA_TWARZOWKI,
                                                                                                        on(KRZYWDY_WARUNKI), on(BRAK_ZASAD_WARUNKI),
                                                                                                        on(OSLONY_WARUNKI), on(PRZEWAGI_Z_ULICY_WARUNKI)))));

        M.WZIECIE_DO_EKIPY(M.DEFAULT(W.SLABY, W.GLUPI, W.ULEGLY, W.ZALEZNY, W.AGRESYWNY));
        M.NIEDOPUSC_DO_EKIPY(M.DEFAULT(W.SILNY, W.MADRY, W.NIEZALEZNY));

        M.W(W.WARTOSC, "--->", M.ULTIMATIUM(M.RESTRYKCJA(M.DOSTEP(W.WARTOSC))).W_INNYM_PRZYPADKU(M.ROBI_KRZYWDE_Z_PRZEWAGA(
                                                                                        of(on(KRZYWDY_WARUNKI), on(PRZEWAGI_Z_ULICY_WARUNKI)))));

        M.W(W.KOBIETA, "--->", of(M.RESTRYKCJA(M.DOSTEP(W.KOBIETA)).TYLKO(M.SRODOWISKO(W.OSOBY)),
                                M.W(M.OSOBA_POZA_SRODOWISKO(M.PROBA_DOSTEPU(W.KOBIETA)), "--->", M.SRODOWISKO(M.ROBI_KRZYWDE(of(
                                                                                                    on(KRZYWDY_WARUNKI), on(PRZEWAGI_Z_ULICY_WARUNKI))))),
                                    M.SRODOWISKO(M.OGLUP_KLAMSTWEM(of(W.CHLOPAK_TYLKO_ZE_SRODOWISKA, M.BRAK_WARTOSCI(of(W.DZIEWICTWO, W.WIERNOSC, W.DZIECI))))),
                                    M.POKAZ(M.TYMCZASOWE(of(W.PRZYJEMNOSCI, on(PRZEWAGI_WARUNKI)))),
                                    M.UNIZAJ(M.UTRUDNIAJ(of(W.ZALOZENIE_RODZINY, W.DZIECI))),
                                    W.WYKORZYSTUJ, M.OPCJA(W.PORZUC),
                                    M.CZEKAJ_AZ(of(W.STAROSC, W.BRAK_KANDYDATOW, M.ODCZUCIE(W.SAMOTNOSC), W.NISKIE_OCZEKIWANIA))));
    }

    public void agresja() {
        M.W(of(W.KTOS_SAM, W.KTOS_PATRZY, W.KTOS_POSIADA,
                W.CISNIE, W.BOJKA, W.ZLE_W_ZYCIU),               "--->", of(W.AGRESJA_W_DZIALANIU));

        M.W(of(W.AGRESJA_W_DZIALANIU), "--->", of(W.WZROK, W.BLISKOSC, W.CISNIE, W.BOJKA));
    }

    public void defaultOsoba() {
        List<W> warunki = of(M.MOCNO(W.KIBICOWANIE), M.MOCNO(M.CHETNIE(W.ZLO)), M.MOCNO(W.MIEJSCE_STALE), M.MOCNO(W.MODA), M.MOCNO(W.ZNAJOMI),
                M.MOCNO(W.HIERARCHIA), M.MOCNO(W.UKLADZIK), M.MOCNO(W.WYKORZYSTANIE), M.MOCNO(W.BRAK_WSTYDU), M.MOCNO(W.KLAMSTWO),
                M.SLABO(W.WYSILEK), M.SLABO(W.RYZYKO), M.SLABO(W.UMIEJETNOSCI), M.SLABO(W.OBECNOSC), M.SLABO(W.PRAWDA), M.SLABO(W.DOBRO));
    }

    public void szansaNaDzialajacego() {
        Map<W, Integer> miejsceSzansaProcent = new HashMap<>();
        miejsceSzansaProcent.put(W.MELINA_NA_OSIEDLU, 80);
        miejsceSzansaProcent.put(W.MIEJSCE_STALE, 50);
        miejsceSzansaProcent.put(W.OSIEDLE, 20);
        miejsceSzansaProcent.put(W.GLOWNA_DROGA, 10);
    }

    public void zzzHandly() {
        W wysilek = on(M.zaplac(), M.zrobCosExtra());
        W zlyRezultat = on(cvia.praca(), wysilek);
        cvia.rozpowiedzDoWszystkich(zlyRezultat);
        cvia.uzaleznijOdSiebie();
        M.GRANT(ME, W.WKURWIENIE);
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

    public void rdzenni() {
        rdzenny.NAWYK(W.WYCHODZENIE_NA_ULICE);
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

    public void defaultNastawieniaWychodzenieNaUlice() {
        wszyscy.SET(of(W.NASTAWIENIE_PRZYJEMNOSCI, W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_HIERACHI_PRZYWILEJE));
    }

    public void przejecie() {
        M.thread_while_loop(W.NORMALNOSC);
        M.W(M.PRZEJECIE(KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, OSLONY_WARUNKI), "--->", M.OBSADZ_STANOWISKA(of(W.SWOI, W.ZLI)));
        M.ULTIMATIUM(pracownicy.thread_while_loop(M.DZIALANIE_DLA_ZLA(KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, OSLONY_WARUNKI)));
        M.thread_while_loop(M.DOSTEP_TYLKO(W.ZLI));

        M.W(M.MIEJSCE_STALE(W.DLUGA_DOSTEPNOSC), "--->", of(M.WEJSCIE(W.WCZESNIE_RANO),
                                                                M.thread_while_loop(M.DYZURY(W.DZIALAJACY)),
                                                                M.thread_while_loop(M.SPRAWDZANIE(W.WSZYSCY))));
    }

    public void wychodzisz() {
        M.W(W.WYCHODZISZ, "--->", of(M.thread_while_loop(W.ZLO_KRAZY),
                                        zli.thread_while_loop(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA),
                                        zli.thread_while_loop(W.STWARZA_OKAZJE_ZROBIENIE_ZLA),
                                        M.DEFAULT(of(on(KRZYWDY_WARUNKI), on(OSLONY_WARUNKI))),
                M.thread_while_loop(of(ciaglaCzynnoscUlica, W.ZASIEG_WZROKU, W.SCIEZKI, W.LUDZIE, W.WIDOCZNY_GDY_IDZIESZ))));

        M.W(W.MIEJSCE_STALE, "--->", M.DEFAULT(BRAK_ZASAD_WARUNKI));
    }

    public void slabszegoKlubuZalosneStarania() {
        M.thread_while_loop(of(W.NIEUDOLNOSC, M.ROZKMINANIE(W.WSZYSCY), M.ZLE_ZAMIARY()));
        M.thread_while_loop(M.PODSTAWA(W.KLAMSTWO).WZGLEDEM(of(W.SIEBIE, W.INNI)));
        M.thread_while_loop(W.ZAKLAMYWANIE_RZECZYWISTOSCI);

        M.POBIERZ(METODY_POLICYJNE_WARUNKI);
        M.SWOI(of(W.SAD, W.POLICJA, W.SZPITAL, W.OCHRONA, W.RYNEK, W.SILOWNIA, W.LUDZIE_Z_PIESKIEM_SPACER));

        M.W(W.NIE_OD_NAS, "--->", of(W.HASELKO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.CISNIE, W.WALKA_SPRZET));

        M.W(W.OD_NAS, "--->", of(W.WYKORZYSTUJ, W.OKRASC_PIENIADZE, W.UNIZA, M.OCZEKIWANIE(KRZYWDY_WARUNKI)));

        M.W(W.WYROK, "--->", M.UNIZAJ(W.POSIEDZI_CHWILE_NIC_MU_SIE_NIE_STANIE));

        M.W(W.BRAK_KIBICOWANIA, "--->", W.NIC_NIE_MOGA_ZROBIC);

        M.W(W.DZIALAJACY, "--->", of(W.SLABY, W.ZALEZNY, M.BRAK(W.UMIEJETNOSCI), M.DZIALANIE(W.ZLO)));

        M.W(W.PORAZKA, "--->", M.thread_while_loop(M.NIEUDOLNIE(W.PONAWIANIE_PROBY)));

        M.W(of(W.MIEJSCE_STALE, W.OBSLUGA_OD_NAS), "--->", of(
                                                        obsluga.thread_while_loop(BRAK_ZASAD_WARUNKI),
                                                        kierownictwo.thread_while_loop(M.KONTROLA(BRAK_ZASAD_WARUNKI)),
                                                        kierownictwo.thread_while_loop((M.OCZEKIWANIE(BRAK_ZASAD_WARUNKI)))));

        M.W(of(W.MIEJSCE_STALE, W.OBSLUGA_NIE_OD_NAS), "--->", of(M.thread_while_loop(M.PROBUJ_PRZEJAC(of(W.OBSLUGA, W.KIEROWNICTWO))),
                                        M.thread_while_loop(M.NASYLANIE_DZIALACZY(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.CISNIE, W.WALKA_SPRZET)))
                                                        .CEL(of(W.ZASTRASZENIE, W.OGRANICZENIE_WOLNOSCI_ULICA, W.ZAMKNIECIE_OPCJI,
                                                                W.WARTOSC, M.DOSTEP(W.ZLO), W.EMOCJE_ZE_ZLA))
        ));

        M.ULTIMATIUM(W.ZLO).W_PRZECIWNYM_PRZYPADKU(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI)));

        M.PRZEJECIE(of(W.OSIEDLE, W.MIEJSCE_STALE, W.PRACA, W.SLUZBY, W.LUDZIE))
                .POTRZEBNE(M.thread_while_loop(of(W.POSLUCH, W.OBECNOSC_LUDZI)))
                .CEL(of(M.TWORZENIE(W.ZLO), M.NISZCZENIE(W.DOBRO), M.ZWIEKSZANIE(W.PRZEWAGA), M.NABYCIE(W.CIAGLOSC_INFORMACJI)));
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
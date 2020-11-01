package metoda;

import db.DB_Warunki;
import warunek.W;
import warunek.WarunkiKategoria;
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
    List<W> dazenia = of(W.STARCIE, W.DOMINACJA, W.RUCHANIE, W.W_TLE_DOSTEP);
    List<W> walka = of(
            M.walkaSila(of(W.ZAGRANICZNI, W.BURZUAZJA)),
            M.walkaWiedza(of(W.BIEGACZE, W.NIECHCACY_WPUSCIC))
    );
    List<W> typyLudzi = of(
            W.WYKOLEJONY, W.FEST, W.WIESNIAK, W.OSIEDLOWY_SLABY, W.NORMALNY, W.OSIEDLOWY_MOCNY, W.CZOLO
    );

    W ktoKogo = M.MOCNO(KTO_KOGO_WARUNKI);
    W kurestwo = M.MOCNO(KURESTWO_WARUNKI);
    W oslony = M.MOCNO(OSLONY_WARUNKI);

    List<W> podstawa = of(W.OGRANICZENIE_CZASOWE, W.DNI, W.TYGODNIE, W.LATA, W.OBECNOSC, W.DOSTEP, W.POZNANIE_CZLOWIEKA_WADAMI,
            W.ENUM, W.ANTY_FEST, W.ANTY_SYSTEM, W.ANTY_BURZUA, W.ANTY_KONFI, W.DEFAULT_WARUNKI, W.STARCIE, W.KTO_ZYSKUJE);

    List<W> prawa = of(W.DOMINACJA, W.GLUPIEGO_CZEKA_KARA, W.PRZEWAGA, W.DOSTEP, W.HIERARCHIA, W.JEDNOSC_PRZECIW_ZAZDROSCI);

    List<W> mojeDzialanie = of(M.wszystkoNaChlodno(), M.tyDobrze(), M.karzeszZaWadyZachowania());

    List<W> wchodzisz = of(M.dostepDoInformacjiPrzezManiury(), M.wstrzymajSieZWiezeciemKobiety(), M.szukajHakow());

    List<W> dobraJednostka = of(W.ZOBOWIAZANIA, W.OCZEKIWANIA, W.WYMAGANIA, W.OBECNOSC, W.CEL, W.ZDOLNY_DO_WALKI, W.ZDOLNY_DO_RYZYKA);
    List<W> holdYourPosition = of(M.reaguj(), M.spedzCzas(), M.utrzymajPozycje());

    List<W> popytPodaz = of(W.ZLODZIEJI_1_PROC, W.CZOLOWKI_5_PROC, W.KIBICOW_10_PROC, W.MLODYCH_30_PROC,
            W.OGARNIETA_JEDNOSTKA_RODZI_SIE_W_CIERPIENIU, W.LOKALNE_SRD_CZARY,
            W.PRACUJE_SIE_DLUGO_CIEZKO_MALO_OSOB_TO_MA_WARTOSC, W.MALO_CZASU_ULICA_MALE_SZANSE_WYROBIENIA,
            W.PRZEWAGA_IZOLACJI_LUDZI, W.STARE_GANGUSY_TEMPI_PODZIELENI, W.KAZDY_W_EKIPIE_CZEKA_NA_SZANSE,
            W.CO_JEST, W.CZEGO_NIE_MA,
            W.BRAK_CZASU, W.ODBIJANIE, W.UZYWKI);

    List<W> restrykcyjne = of(W.WEJSCIE_KAZDY_KLUB, W.WEJSCIE_BOKS, W.WEJSCIE_SILKA, W.WEJSCIE_OSIEDLE);

    List<W> metodyWzieciaNaSwaStrone = of(// todo
    );

    List<W> bledy = of(W.BLAD_POJEDYNCZY, W.BLAD_NIESWIADOMY_PRZYPADKOWY,
            W.BLAD_SPECJALNY, W.BLAD_LENISTWA, W.BLAD_ZLAMANIA_ZASAD);

    List<W> kogo = KOGO_WARUNKI;

    List<W> musiBycKara = WYMAGA_KARY_WARUNKI;

    List<WarunkiKategoria> rany = DB_Warunki.RANY;

    List<W> pointcut = of(W.MATERIALNE_ZNALEZIENIE_SIE, W.DEFAULT_ZACHOWANIE, W.DEFAULT_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNIE_ULATWIASZ, W.PRZEKONYWANIE, W.ULTIMATUM);

    List<W> warunek = of(
            W.ULTIMATUM, W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC, W.SILA, W.PRIORYTET
    );

    List<W> bojka = of(W.WYSILEK, W.BOL, W.RANY_ODNIESIONE, W.REGENERACJA, W.WROG, W.JEGO_KOLEDZY_TWOI_WROGOWIE);

    List<W> srodki = srodki();

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
        teoriaRywalizacji();
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
    }
    public List<W> srodki() {
        return of(

                M.W(of(W.WALKA_PIESCI),
                        of(
                                M.sondaDostepu(),
                                M.sondaZagrozenia(),
                                M.sondaPrzypalu(KRYTERIA_PRZYPALU_WARUNKI),
                                M.poCichu(), M.II(), M.otwarteStacieF2F(),
                                M.NEEDED(of(
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
                                M.NEEDED(of(
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
                                M.NEEDED(of(
                                        W.AUTORYTET,
                                        W.ZLAMANIE_STANDARDU, W._II_, W.ZLAMANIE_PRAWA,
                                        W.DLUGA_DOSTEPNOSC, W.LUDZIE, W.PRZEKONANE_OTOCZENIE)
                                )
                        )
                ),
                M.W(of(W.KLAMSTWO, W._88_, W.PRZEKONYWANIE),
                        of(
                                M.poCichu(),
                                M.NEEDED(of(
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
                                M.NEEDED(of(
                                        W.POINTCUT, W.EKIPA_DLUGA_DOSTEPNOSC,
                                        W.EKIPA_RYZYKO, W.EKIPA_WALKA, W.OGARNIECI_ZA_TOBA)
                                )
                        )
                ),
                M.W(of(W.POZBAWIENIE_PRZEWAGI, W.KOSZTA, W.CIERPIENIE_DLUGOTERMINOWE, W.PRZEJEBANE),
                        of(
                                M.ultimatum(of(W.RODZINA, W.BLISKIE_OSOBY, W.SRODOWISKO, W.PRACA, W.PIENIADZE)),
                                M.dokrecanieSruby(),
                                M.wjezdzanieNaCalyCyklDnia(),
                                M.dlugRosnie(),
                                M.NEEDED(of(
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
                                M.NEEDED(of(W.LUDZIE_WOKOL, W.LUDZIE_ZA_TOBA))
                        )
                )
        );
    }

    public List<W> afterTop() {
        return of(
                W.SWOJA_EKIPA, W.PRZECIWNA_EKIPA, W.PSY, W.KAZDE_DZIALANIE_OCENIANE, W.PILNOWANIE_HIERARCHII, W.PILNOWANIE_PRZEWAG,
                W.WPROWADZANIE_ZASAD, W.ULTIMATUM, W.TWORZENIE_WARUNKOW, W.TWORZENIE_POINTCUTOW, W.ZMANIURAMI_PO_INFORMACJE,
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
                of(W.DUZO_IF_OW),
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

        List<W> kryteriaPrzypalu = KRYTERIA_PRZYPALU_WARUNKI;
        List<W> metodaStarcieReakcja = METODA_STARCIE_REAKCJA_WARUNKI;
        List<W> obronaStarcie = OBRONA_STARCIE_WARUNKI;
        List<WarunkiKategoria> rany = RANY_WARUNKI;
        List<W> ktoKogo = KTO_KOGO_WARUNKI;

        List<W> sprzety = of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                             M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)));

        M.W(of(W.POMSZCZENIE, W.NOTYFIKACJA_EKIPA, W.FOTY,
                W.OBRAZENIA_FIZYCZNE, W.STARCIE_WIELU_NA_JEDNEGO,
                W.SPRZET, W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI), "--->", M.PARALIZUJE(of(W.SLABY, W.NIESWIADOMY)));

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
    }
    public void przewagi(){
        W przewagaGlobal = W.PRZEWAGA_LOCAL;
        List<W> potrzebneWarunki = of(W.STALA_PLANSZA, W.WIELE_INTERAKCJI, W.WIELE_OSOB, W.OSOBA_ODSLANIAJACA_SIE);

        M brakZasad = M.NIEWAZNE(KURESTWO_WARUNKI).MIMO_TO(M.WAZNE(of(W.PRZEWAGA, W.ZYSK, W.WARUNEK_SPRZYJAJACY)));

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
                        M.GRANT(ME, of(W.TWORZENIE_WARUNKOW, W.TWORZENIE_POINTCUTOW, W.ZBIERANIE_WARTOSCI,
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
                        M.sonda(W.Z_KIM),
                        M.sonda(W.SWIADOMOSC), // 1: FEST
                        M.sonda(W.SILA_SPRAWCZA), // WPLYW: 0
                        M.sonda(W.ROZMIAR),
                        M.sonda(W.ZLO_DOBRO), // UZASADNIENIE: 0
                        M.sonda(W.WIEK),
                        M.sonda(W.CZY_CWEL), // NICNIEMOZE : 0
//                            M.sonda(W.SRODOWISKO),
//                            M.sonda(W.CZYNY_DZIALANIA)
                        M.sonda(W.GDZIE)
                )
        );

        M.W(of(W.KOBIETA),
                of(
                        M.sonda(W.ROZMIAR),
                        M.sonda(W.LADNA),
                        M.sonda(W.STWARZA_POINTCUT),
                        //-------------------------
                        M.sonda(PATOLOGIE_WSTEPNE_KOBIET, PATOLOGIE_UTRZYMANIA_KOBIET)
                )
        );
    }

    public void sonda(){
        M.W(of(W.SONDA_ZASOBU), "--->", of(W.WARTOSC, W.TRUDNOSC_UTRZYMANIA));

        M.W(of(W.SONDA_DZIALANIA), "--->", of(W.WARTOSC, W.BEZPIECZENSTWO, W.KONSEKWENCJE,
                W.CZESTOTLIWOSC,W.EFEKTYWNOSC));

        M.W(of(W.ZLY, W._88_, W.PATRZY), "--->", of(W.SONDA_POD_ZROBIENIE_ZLA));


        M.W(of(W.LADNY, W._88_, W.BRAK_CIERPIENIA),
                of(
                        M.GRANT(ME, W.NIEGODNY_POPATRZENIA)
                )
        );
        M.W(of(W.LADNY, W._88_, W.BRAK_CIERPIENIA, W._88_, W.PRZEWAGA, W._II_, W.PATRZY),
                of(
                        M.celownik(osoba)
                )
        );
        M.W(of(W._NOT_, W.ZLODZIEJKA, W._II_, W.KIBICOWANIE, W._II_, W.DOBRZE_ZMYSLY, W._88_, W.SPORT, W._II_, W.ZDOLNY_DO_WALKI),
                of(
                        osoba.SET(W.FEST)
                )
        );
        M.W(of(W.ZE_WSI, W._88_, W.BRAK_WYSILKU_FIZYCZNEGO),
                of(
                        osoba.SET(of(W.NIEPATRZY_GLOBALNIE, W.ZAMKNIETY_W_SWOIM_POKOJU))
                )
        );
        M.WW(of(W.WIDZISZ_ZASOB),
                of(
                        M.sondaKtoZyskuje()
                ),
                of(M.nalezyDo(of(W.FEST, W._II_, W.BURZUAZJA, W._II_, W.SYSTEMOWIEC))),
                of(
                        M.pracaNadZasobem(W.WIEDZA),
                        M.bierzZasobNaSwaStrone(metodyWzieciaNaSwaStrone)
                )
        );
        M.W(of(W.WIDZISZ_BLAD),
                of(
                        M.sondaBledu(bledy)
                )
        );
        M.W(of(W.SONDA_KOGO),
                of(
                        M.sondaKogo(kogo)
                )
        );
        M.W(of(W.SONDA_DZIALACZY),
                of(
                        M.jebac(),
                        M.raczkaDoGory()
                )
        );
        M.WW(of(W.CZLOWIEK),
                of(
                        M.DEFAULT(W.ZLY)

                ),
                of(W.FEST, W._II_, W.NIEPRZYDATNY),
                of(
                        M.GRANT(ME, W.SWOJA_OBECNOSCIA_POGRAZA)
                )
        );
        M.W(of(W.CZYN),
                of(
                        M.jakDuze(W.PRZECIWNOSCI),
                        M.jakDuze(W.WARUNKI_OSIAGNIETE),
                        M.jakie(W.WARUNKI_POCZATKOWE),
                        M.ile(W.CZAS)
                )
        );
        M.W(of(W.BIEGACZE),
                of(
                        M.GRANT(YOU, of(W.BRAK_PIENIEDZY, W.GLUPI, W.NUDA, W.ZLY, W.DOSTEP_OGRANICZONY))
                )
        );
        M.W(of(W.MEZCZYZNA_Z_KOBIETA),
                of(
                        M.GRANT(YOU, of(W.UMIE_BAJEROWAC, W.ZNAJOMI, W.SRODOWISKO))
                )
        );

    }
    public void przeplywInformacji(){
        M.W(of(W.STALO_SIE),
                of(
                        M.dodajDoHotTopics(W.STALO_SIE),
                        M.powiazZ(osoba),
                        M.zapamietaj()
                )
        );

        M.W(of(W.SPOTKANY_ZNAJOMY),
                of(
                        M.wezOstatnieHotTopics(),
                        M.rozpowiedz(znajomy, W.STALO_SIE, osoba)
                )
        );

        M.wezOsobyKojarzace(osoba).forEach(kojarzacy -> {
            M.rozpowiedz(kojarzacy, W.STALO_SIE, osoba);
        });
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
        M.W(of(W.WZGL_IZOLACJA, W._II_, W.ZNAJOMI, W._88_, W.CZAS, W._88_, W.PODBIJASZ),
                of(
                        M.GRANT(ME, W.SZANSA_POZNANIE)
                )
        );
        M.thread_while_loop(W.UTRZYMANIE_RELACJI);
        M.W(of(W._NOT_, W.UTRZYMANIE_RELACJI),
                of(
                        M.REMOVE(ME, W.RELACJA),
                        M.REMOVE(ME, W.OSOBA),
                        M.REMOVE(ME, W.CZAS)
                )
        );
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
    public void teoriaRywalizacji(){
        M.W(of(W.NIKOGO),
                of(
                        M.GRANT(ME, W.ZLE)
                )
        );
        M.W(W.KTOS,
                of(
                        M.thread_while_loop(W.RYWALIZACJA)
                )
        );
        M.W(of(W.NOWA_OSOBA),
                of(
                        M.zniszczJakNajwiecej(rany),
                        M.zabierzJakNajwiecej()
                )
        );
    }
    public void teoriaPrzewagUlicy(){
        Map<Integer, W> przewagi = new HashMap<>();
        przewagi.put(3, W.ILOSC_OSOB);
        przewagi.put(2, W.WALKA_SPRZET);
        przewagi.put(1, W.WALKA_PIESCI);
        przewagi.put(1, W.ROZMIAR);
    }
    public void algorytmUlicy() {
        List<W> budujacyHierarchieDecyzyjni = of(W.MORDERCY, W.DLUGO_WIEZIENIE,
                W.RUMUNI, W.BANDYCI, W.NIESPRAWIEDLIWI, W.AGRESYWNI, W.PRZEWAGA_NA_STARCIE);

        List<W> cele = of(W.WDUPCENIE_JAKNAJWIECEJ_OSOB_W_BIEGANIE, W.WDUPCENIE_JAKNAJWIECEJ_OSOB_W_CPANIE);
        List<W> przyczynyBiegania = of(W.MODA, W.STARSI, W.WYKLUCZENIE_ZE_SRODOWISKA, W.AGRESJA, W.KORZYSCI, W.WADY, W.NUDA);
        List<W> klimatBiegania = of(W.NARKOTYKI, W.WYROK, W.KONFIDENCI, W.PIENIADZE, W.KONTUZJA, W.CIERPIENIE, W.ORIENT);

        M.W(of(W.WEJSCIE),
                of(
                        M.GRANT(ME, W.FALSZYWE_KORZYSCI)
                )
        );
        M.oglup(of(W.DOSTEP_DO_PLANSZY, W.NARKOTYKI));
        M.przestrzel(osoba);
        M.wezDoSrodowiska(osoba);
        M.GRANT(ME, of(W.ZRODELKO, W.STOZEK_SZCZEGOLU, W.SUBSCRIBES_INFORMACJE, W.BLISKOSC, W.TELEFONY, W.PRZEWAGA));

        M.thread_while_loop(W.KONTROLA);
        me.thread_while_loop(W.WYMAGANIE_DZIALANIA_DLA_ZLA);
        me.thread_while_loop(W.GNOJ_POSTRONNYCH);  me.thread_while_loop(W.GNOJ_EKIPA_NIZSI_OD_CIEBIE);
        me.thread_while_loop(W.GNOJ_EKIPA);
        me.thread_while_loop(W.UNIZAJ_CZYNY);

        M.sonda(W.ILE_SIE_DA); M.odkryjWady(osoba); M.wdupcDoHierarchiiPodToba(osoba);
        M.thread_while_loop(W.WYKORZYSTUJ);
        osoba.otoczKorzysc(W.WALKA_SPRZET);
        M.W(of(W.WYJSCIE),
                of(
                        M.GRANT(ME, of(W.SAMOTNOSC, W.PRZEJEBANE, W.WALKA_SPRZET))
                )
        );
    }
    public void kibicowanieUjecie() {
        M.W(W.NIE_WYKORZYSTUJA,
                of(
                        M.thread_while_loop(W.GNOJA)
                )
        );
        M.W(of(W.NIE_ZNAJA),
                of(
                        M.zaklecie(),
                        M.foty()
                )
        );
        M.W(of(W.BRAK_ZAKLECIA),
                of(
                        M.dziwadlo(osoba),
                        M.gorszeTraktowanieNizReszta(osoba),
                        M.zamkniecieSytuacjiBezpowrotnie(),
                        M.naklejka()
                )
        );
        M.W(of(W.SLABY),
                of(
                        M.zaklecie(i++),
                        M.foty(i++)
                )
        );

        M.GRANT(SOMEONE, of(W.WZGLEDNA_IZOLACJA_RDZENNI, W.ZRODELKO));
        M.GRANT(SOMEONE, of(W.ZEZWOLENIE_NA_GNOJENIE_INNYCH, W.PRZEWAGA_EKIPY_SPRZETU));
        M.GRANT(SOMEONE, of(W.ALL_DANY_OBSZAR_DO_ZRODELKA, W.WSZYSCY_SIE_ZNAJA));

        M.OTHERWISE(of(W.PUSTKA, W.FESTY, W.BEZ_PIENIEDZY, W.SLABI));
    }
    public void krajobrazUlicy() {
        List<W> conditions = of(W.PUSTKA, W.BRAK_PIENIEDZY, W.NARKOTYKI, W.KAZDE_DOBRO_NA_DOL);

        M.thread_while_loop(W.KUMULUJACA_SIE_PATOLOGIA);
        M.tlo(of(W.AGRESJA, W.WKURWIENIE, W.ZLO, W.DOSTEP));
    }
    public void dojscieDoWalki() {
        M.NEEDED(of(W.BEZPRZYPALOWE_MIEJSCE, W.OPPONENT_NIEPRZESTRASZONY, W.BLISKOSC_70PROC));
    }
    public void ulicaRelacjeWarunkow() {
        M.NIGDY_MALO(of(W.KASA, W.SEX, W.PRZYJEMNOSCI)); // MATERIALNE
        M.NIGDY_MALO(of(W.ZLO, W.DOBRO, W.NIENAWISC, W.MILOSC, W.AGRESJA_W_DZIALANIU, W.CIERPLIWOSC)); // MORALNE
        M.WW(M.DEFAULT(M.thread_while_loop(W.WSZYSCY_CHCA_CIE_ROZJEBAC)), "--->", W.HASELKO, "--->",  W.STATUS_QUO);

        M.WW(W.SONDA, "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);

        M.W(of(W.PIERWSZA_REAKCJA, W.REAKCJA_PO_SONDZIE, W.REAKCJA_PO_NARADZIE), "--->", of(W.REAKCJA));

        M.DUZY_WARUNEK(of(W.TRAUTO, W.KOBIETA, W.MIEJSCE_STALE, W.OSIEDLE, W.PRZEWAGA, W.SILA));

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

        M.W(of(W.SAM) , "--->", of(W.LATWY_CEL, W.BRAK_PRZEWAG, W.MALA_SZANSA_POZNANIE));

        M.W(M.SPOTKANY(goscZHanba), "--->", M.ZAWSZE_GDY_BLISKOSC(of(W.CISNIE, W.WYPOMNIENIE_HANBY)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).OTHERWISE(W.PRZYPAL));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));
    }

    public void wokolDzialaczaSrodowiska() {
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
                M.oddalanieSieOdWalkiZagrozenia(of(W.SKAZYWANIE_SAMOTNOSC, W.PRZEWAGA, W.PRZYJEMNOSC)),
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

        M.WW(of(W.AGRESJA, W.BRAK_PIENIEDZY,
                W.GLUPOTA, W.SLUCHAJ_KOLEGOW), "--->",  of(W.EKIPA), "---->", of(W.WYKONYWANIE_ROZKAZOW_DLA_HAJSU_ZLA,
                W.WYROK, W.OGRANICZONE_INFORMACJE,
                W.PRZEWAGA_SILY, W.PRZEWAGA_EKIPY_SPRZETU));

        M.W(of(W.ZLO), "--->", of(W.ROB_NAJWIEKSZA_KRZYWDE, W.ROZPOWIEDZ_DO_NAJWIEKSZEJ_LICZBY_OSOB, W.PRZEKONAJ_NAJWIECEJ_OSOB));

        M.W(of(W.BLISKOSC, W._88_, W.WROGOSC), "--->", KTO_KOGO_WARUNKI);

        M.W(of(W.SIEDZENIE_W_SRODOWISKU), "--->", of(W.BEZPIECZENSTWO, W.STREFA_KOMFORTU, W.POTRZEBA_EMOCJI,
                W.ZNUDZENIE_OSOBAMI, W.POTRZEBA_NOWYCH_OSOB));

        o(M.WWW(on(W.DZIALAJACY, W._88_, W.ZROBIONE_ZLO), "--->", W.CZEKA_NA_EFEKT,
                                                            "--->", W.BRAK_REAKCJI, "--->", W.ZACHETA_DO_ZLA))
                                                                .otherwise(of(W.REAKACJA, W.KARA, M.OPCJA(W.UKAZANIE),
                                                                W.ZAPRZESTANIE_ZLA, W.SMUTEK, W.WYLACZENIE_DZIALACZA,
                                                                                        M.OPCJA(W.CHEC_POMSZCZENIA)));

        M.W(M.WOKOL_TYLKO(zli), "--->", of(wszyscy.SLUCHAJA(najwyzszyHierarchiaWokol),
                                        M.GRANT(najwyzszyHierarchiaWokol, of(W.SILA_SPRAWCZA, W.TWORZENIE_WARUNKOW))));

        M.W(of(W.MIEJSCE_STALE_DZIALAJACE, W._II_, W.SRODOWISKO), "--->", M.thread_while_loop(of(W.KOMFORT, W.INFORMACJE)));

        M.W(M.INFORMACJA(W.KRZYWDA_DRUGIEJ_STRONY), "--->", of(W.NASTAWIENIE_WSPARCIE, W.WESELE, W.CHCEMY_WIECEJ, W.ZA_CIOSEM));

        M.W(of(M.WOKOL_TYLKO(swoi), W.ZLO, W._88_, W.INTERAKCJA), "--->", of(W.NOTYFIKACJA_EKIPA, W.WSPARCIE_OSLONY, W.PRZEKONYWANIE_PRZECIW));

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

        M.W(of(W.WYJSCIE_NA_ULICE, W._88_, W.KIBICOWANIE, W.MAGICZNE_ZAKLECIE,  W.EMOCJE_ZE_ZLA,
                W.ZNAJOMI, W.SRODOWISKO, W.ZWIAZEK), "--->", of(W.BRAK_NUDY));
    }

    public void tchorzSchemat() {
        M.W(W.MIEJSCE_STALE, "--->", W.SONDA_ILE_MOZNA);
        W nastawienie = M.pobierzNastawienie();
        M.W(nastawienie, "--->", W.AGRESJA_W_DZIALANIU);
    }

    public void nieZnam() {
        M.W(of(W.NIE_ZNAM), "--->", of(W.DRUGA_STRONA, W.NIE_MA_DOSTEPU, W.PRZESTRZELIC, W.ROZKMINIC));
    }

    public void rdzenni() {
        rdzenny.NAWYK(W.WYCHODZENIE_NA_ULICE);
    }

    public void tworzenieWarunkow() {
        polskiRzad.tworzyWarunki(of(W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, W.PRAWO));
        grubasPrzewaga.tworzyWarunki(of(W.KLAMSTWO, W.SLABY, W.WADY, W.DZIALAJACY, W.ZMYSLY_DLA_ZLA, oraz(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI)));

        grubasPrzewaga.tworzyWarunki(M.ZAPOTRZEBOWANIE(of(W.ZLO, on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI), on(KTO_KOGO_WARUNKI))));
        dzialacz.zwiekszaSzanse(of(W.ZLO, on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI), on(KTO_KOGO_WARUNKI)));

        grubasPrzewaga.tworzy(W.SRODOWISKO).CEL(of(
                M.ZWIEKSZANIE(W.PRZEWAGA), M.MATERIALIZOWANIE_ZLA_DZIEKI(W.PRZEWAGA), M.WYKLUCZENIE(osobyPozaSrodowisko),
                M.KTO_KOGO_Z_PRZEWAGA(osobyPozaSrodowisko, KTO_KOGO_WARUNKI),
                M.NABYCIE(of(W.SILA_SPRAWCZA, W.PRZEWAGA_SILY, W.POSLUCH)),
                M.NABYCIE(W.PRZYJEMNOSCI),
                M.NISZCZENIE(W.DOBRO),
                M.TWORZENIE(W.ZLO)
        ));

        fest.tworzyWarunki(of(W.WYWYZSZENIE_SLABYCH));
    }

    public void defaultNastawieniaWychodzenieNaUlice() {
        wszyscy.SET(of(W.NASTAWIENIE_PRZYJEMNOSCI, W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_HIERACHI_PRZYWILEJE));
    }

    public void przejecie() {
        M.thread_while_loop(W.NORMALNOSC);
        M.W(M.PRZEJECIE(KTO_KOGO_WARUNKI, KURESTWO_WARUNKI, OSLONY_WARUNKI), "--->", M.OBSADZ_STANOWISKA(of(W.SWOI, W.ZLI)));
        M.ULTIMATIUM(pracownicy.thread_while_loop(M.DZIALANIE_DLA_ZLA(KTO_KOGO_WARUNKI, KURESTWO_WARUNKI, OSLONY_WARUNKI)));
        M.thread_while_loop(M.DOSTEP_TYLKO(W.ZLI));
    }

}
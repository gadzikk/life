package metoda;

import db.DB_Warunki;
import warunek.W;
import warunek.WarunkiKategoria;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.SOMEONE;
import static typy_bazowe.TypOsoby.YOU;

/**
 * Created by gadzik on 04.01.20.
 */
public class CPU_UL extends AbstractCPU {
    List<W> dazenia = of(W.STARCIE, W.DOMINACJA, W.RUCHANIE, W.W_TLE_DOSTEP);
    List<String> walka = of(
            M.walkaSila(of(W.ZAGRANICZNI, W.BURZUAZJA)),
            M.walkaWiedza(of(W.BIEGACZE, W.NIECHCACY_WPUSCIC))
    );

    List<W> podstawa = of(W.OGRANICZENIE_CZASOWE, W.DNI, W.TYGODNIE, W.LATA, W.OBECNOSC, W.DOSTEP, W.POZNANIE_CZLOWIEKA_WADAMI,
            W.ENUM, W.ANTY_FEST, W.ANTY_SYSTEM, W.ANTY_BURZUA, W.ANTY_KONFI, W.DEFAULT_WARUNKI, W.STARCIE, W.KTO_ZYSKUJE);
    List<W> prawa = of(W.DOMINACJA, W.GLUPIEGO_CZEKA_KARA, W.PRZEWAGA, W.DOSTEP, W.HIERARCHIA, W.JEDNOSC_PRZECIW_ZAZDROSCI);
    List<String> mojeDzialanie = of(M.wszystkoNaChlodno(), M.tyDobrze(), M.karzeszZaWadyZachowania());

    List<String> wchodzisz = of(M.dostepDoInformacjiPrzezManiury(), M.wstrzymajSieZWiezeciemKobiety(), M.szukajHakow());

    List<W> afterTop = of(W.SWOJA_EKIPA, W.PRZECIWNA_EKIPA, W.PSY, W.KAZDE_DZIALANIE_OCENIANE, W.PILNOWANIE_HIERARCHII, W.PILNOWANIE_PRZEWAG,
            W.WPROWADZANIE_ZASAD, W.ULTIMATUM, W.TWORZENIE_WARUNKOW, W.TWORZENIE_POINTCUTOW, W.ZMANIURAMI_PO_INFORMACJE);
    List<W> dobraJednostka = of(W.ZOBOWIAZANIA, W.OCZEKIWANIA, W.WYMAGANIA, W.OBECNOSC, W.CEL, W.ZDOLNY_DO_WALKI, W.ZDOLNY_DO_RYZYKA);
    List<String> holdYourPosition = of(M.reaguj(), M.spedzCzas(), M.utrzymajPozycje());

    List<W> popytPodaz = of(W.ZLODZIEJI_1_PROC, W.CZOLOWKI_5_PROC, W.KIBICOW_10_PROC, W.MLODYCH_30_PROC,
            W.OGARNIETA_JEDNOSTKA_RODZI_SIE_W_CIERPIENIU, W.LOKALNE_SRD_CZARY,
            W.PRACUJE_SIE_DLUGO_CIEZKO_MALO_OSOB_TO_MA_WARTOSC, W.MALO_CZASU_ULICA_MALE_SZANSE_WYROBIENIA,
            W.PRZEWAGA_IZOLACJI_LUDZI, W.STARE_GANGUSY_TEMPI_PODZIELENI, W.KAZDY_W_EKIPIE_CZEKA_NA_SZANSE,
            W.CO_JEST, W.CZEGO_NIE_MA,
            W.BRAK_CZASU, W.ODBIJANIE, W.UZYWKI);

    List<W> restrykcyjne = of(W.WEJSCIE_KAZDY_KLUB, W.WEJSCIE_BOKS, W.WEJSCIE_SILKA, W.WEJSCIE_OSIEDLE);

    List<String> metodyWzieciaNaSwaStrone = of(// todo
    );

    List<W> bledy = of(W.BLAD_POJEDYNCZY, W.BLAD_NIESWIADOMY_PRZYPADKOWY,
            W.BLAD_SPECJALNY, W.BLAD_LENISTWA, W.BLAD_ZLAMANIA_ZASAD);

    List<W> kogo = of(W.ZAGRANICZNI_CIEMNI, W.ZAGRANICZNI_JASNI,
            W.BURZUA_DZIALAJACA, W.BURZUA_NIESWIADOMA, W.DZIALACZE_PRZECIWNI, W.DUZI_TEMPI);

    List<W> musiBycKara = of(W.MONOSRODOWISKO, W.BRAK_STRESU, W.BRAK_TRUDNOSCI, W.KOMFORT, W.BEZPIECZENSTWO,
            W.WCZESNIE_ZWIAZEK, W.NIEZDOLNY_WALKA_SPRZET, W.GLUPOTA, W.UZYWKI,
            W.ZAJECIE_SIE_LOKALNYMI_SRPAWAMI, W.WSTYD);

    List<WarunkiKategoria> rany = DB_Warunki.RANY;


    List<WM> srodki = of(
            new WM(of(W.WALKA_PIESCI),
                    of(
                            M.sondaDostepu(),
                            M.sondaZagrozenia(),
                            M.sondaPrzypalu(kryteriaPrzypalu),
                            M.poCichu(), M.II(), M.otwarteStacieF2F(),
                            M.NEEDED(of(
                                    W.ZDOLNY_DO_WALKI,
                                    W.MALY_DOSTEP, W.MALE_ZAGROZENIE, W.MALY_PRZYPAL, W.ZGODA_OTOCZENIA)
                            )
                    )
            ),
            new WM(of(W.WALKA_SPRZET),
                    of(
                            M.skasowanieDostepu(),
                            M.postawienieNajwiekszejPrzewagiWKrotkimCzasie(),
                            M.nieDajSzansObrony(),
                            M.poCichu(), M.zZaskoczenia(), M.zUkrycia(),
                            M.NEEDED(of(
                                    W.ZDOLNY_WALKA_SPRZET,
                                    W.DOBRE_MIEJSCE, W.DOBRA_GODZINA,
                                    W.WARTOSC ,W.ZLAMANIE_ZASAD, W.ZGODA_GORY)
                            )
                    )
            ),
            new WM(of(W.STANDARDY, W._II_, W.PRAWO),
                    of(
                            M.przestrzeganie(of(W.STANDARDY, W._II_, W.PRAWO)),
                            M.oparcieSie(of(W.STANDARDY, W._II_, W.PRAWO)),
                            M.poCichu(),
                            M.NEEDED(of(
                                    W.AUTORYTET,
                                    W.ZLAMANIE_STANDARDU,W._II_, W.ZLAMANIE_PRAWA,
                                    W.DLUGA_DOSTEPNOSC, W.LUDZIE , W.PRZEKONANE_OTOCZENIE)
                            )
                    )
            ),
            new WM(of(W.KLAMSTWO, W._88_, W.PRZEKONYWANIE),
                    of(
                            M.poCichu(),
                            M.NEEDED(of(
                                    W.WARTOSC, W.LUDZIE_ZA_TOBA)
                            )
                    )
            ),
            new WM(of(W.OCZY, W.USZY, W.CIERPIENIE, W.POZBAWIENIE_BEZPIECZENSTWA, W.POZBAWIENIE_DOSTEPOW),
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
            new WM(of(W.POZBAWIENIE_PRZEWAGI, W.KOSZTA, W.CIERPIENIE_DLUGOTERMINOWE, W.PRZEJEBANE),
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
            new WM(of(W.POZBAWIANIE_AUTORYTETU),
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

    public void run(){
        new WM(of(W._NOT_, W.CZOLO, W.OGARNIECI),
                of(
                        M.GRANT(ME, of(W.MOCNI_NIE_LICZACY_SIE, W.CHETNE_PIONKI, W.PIONKI, W.MLODE_PIONKI,
                                W.FEST, W.BANAN, W.SYSTEMOWY_BURZUJ, W.WYGODNIS))
                )
        );

        new WM(of(W._NOT_, W.ULICA),
                of(
                        M.GRANT(SOMEONE, of(W.SYSTEMOWIEC, W.BURZUAZJA))
                )
        );

        new WM(of(W.WIECZNY_IMIGRANT),
                of(
                        M.DEFAULT(_100osob.wyklucz(W.WIECZNY_IMIGRANT))
                )
        );

        new WMWM(of(W.ZLY),
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

        new WMWM(of(W._NOT_, W.DZIALANIE_W_EKIPIE),
                of(
                        M.GRANT(ME, W.THREAD_WHILE_LOOP_PUSTKA)
                ),
                of(W.KONTAKT_TEL),
                of(
                        M.GRANT(ME, W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U)
                )
        );
        new WM(of(W.POTENCJALNA_IZOLACJA_WIELE_RAZY, W._88_, W.POTENCJALNE_ZYSKANIE_PRZEWAGI),
                of(
                        M.wstrzymajSie()
                )
        );
        new WM(of(W.ZMARNOWANA_SZANSA),
                of(
                        M.skreslaj(osoba)
                )
        );
        new WM(of(W.OBECNOSC, W.ZASADY, W.PRACA),
                of(
                        M.GRANT(ME, of(W.SRODOWISKO, W.HIERARCHIA, W.RYWALIZACJA))
                )
        );

        shortest();
        tworzaceJakosc();
        zachowanie();
        starcie();
        gadka();
        fest();
        przewagi();
        sonda();
        dzialajacy();
    }
    public void shortest(){
        List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);
        List<W> shrtOsobaSonda = of(W.TEZYNA_FIZYCZNA, W.UBRANIE, W.OSOBOWOSC, W.WARTOSCI_ZYCIOWE, W.SRODOWISKO, W.SPEDZANIE_WOLNEGO_CZASU, W.RODZENSTWO);

        new WMWM(of(W._01, W._II_, W._NOT_, W.BENEFICJENT),
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

        new WMWM(of(W.TRACE),
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
        new WMWMWM(of(W.SILNY),
                of(
                        M.wychodzisz(),
                        M.odslaniasz()
                ),
                of(W.DUZO_IF_OW),
                of(
                        M.wydluzajCzas(),
                        M.estymuj(), M.maloLazBezCelu()
                ),
                of(W.KONDYCJA),
                of(
                        M.duzoGetAndCompare(),
                        M.od_8_do_22()
                )
        );
        new WM(of(W.BRAK_WSTYDU, W._88_, W.WYCHOWANIE_NA_ULICY),
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

        M.thread_while_loop(W.ANTY_FEST);
        M.thread_while_loop(W.ANTY_SYSTEM);
        M.thread_while_loop(W.ANTY_BURZUA);

        // informacja bodziec
        new WMWMWM(of(W._01, W._II_, W._NOT_, W.BENEFICJENT),
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
        new WMWM(of(W.LUDZIE),
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
            new WMWM(of(W.NIEODZYWASZ_SIE),
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
            new WM(of(W.KTOS_WAZNY, W.COS_WAZNEGO),
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
            List<W> kryteriaPrzypalu = DB_Warunki.KRYTERIA_PRZYPALU.getWarunki();

            new WMWMWM(of(W.KTOS_SZKODZI),
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
            new WMWMWM(of(W.KLOTNIA),
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
            new WMWM(of(W.MOZLIWOSC_PRZERWANIA_MOWY),
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
            new WMWM(of(W.ZLA_JEDNOSTKA),
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
            new WM(of(W.SIEDZA, W._88_, W.DZIALAJACY, W._88_, W.MIEJSCE_STALE),
                    of(
                            M.niszczWieczor(),
                            M.postawCiezkiWarunek(srodki),
                            M.GRANT(ME, W.PO_EKIPE_NIEZDARZY),
                            M.GRANT(ME, W.PO_PSY_NIEZDARZY),
                            M.GRANT(ME, W.SAM_NIEJEST_WSTANIE_SIE_BRONIC)
                    )
            );
            new WM(of(W.STARCIE_NA_MIEJSCU),
                    of(
                            M.GRANT(ME, W.MOZLIWOSC_STRATY_DOSTEPU_MIEJSCA),
                            M.GRANT(ME, W.MOZLIWOSC_PSOW)
                    )
            );
            new WMWM(of(W.CISNIE, W._II_, W.USMIECH_ZNIEWAZAJACY),
                    of(
                            M.odpowiedz(),
                            M.ukazWadyWStarciuSlownym()
                    ),
                    of(W.CISNIE_MOCNO),
                    of(
                            M.starcie(rany), M.II(), M.starcieBezZasad()
                    )
            );
            new WMWM(of(W.BEKA, W._88_, W.NIEZNASZ_GO),
                    of(
                            M.ucinaj()
                    ),
                    of(W.BEKA_Z_CIEBIE),
                    of(
                            M.starcie(rany)
                    )
            );
            new WMWM(of(W.AKCJA),
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
            new WM(of(W.SILNY),
                    of(
                            M.czekajNaBlad(W.WIEDZA),
                            M.odlaczDostep(W.BLAD)
                    )
            );
            new WMWM(of(W._1SPOJRZENIE),
                    of(
                            M.patrzCzyZnam()
                    ),
                    of(W._2SPOJRZENIA),
                    of(
                            M.probaZdobyciaInformacji(),
                            M.szykowanieStarcia()
                    )
            );
            new WMWM(of(W.GANGUS, W._88_, W._1SPOJRZENIE),
                    of(
                            M.cisnie()
                    ),
                    of(W.GANGUS, W._88_, W.ODPOWIEDZ),
                    of(
                            M.starcie(rany),
                            M.tworzKonsekwencje()
                    )
            );
            new WM(of(W.LADNY),
                    of(
                            zly.zabij()
                    )
            );
            new WM(of(W.KOLECZKO_WZAJEMNEJ_ADORACJI),
                    of(
                            M.punktujWady(), M.II(), M.wprowadzCosLepszego(), M.II(), M.rozdupcSila()
                    )
            );
            new WM(of(W.STARZY_LUDZIE, W._II_, W.FESTY),
                    of(
                            M.GRANT(ME, W.MOZLIWOSC_PRZYPAL)
                    )
            );
            new WM(of(W.STARCIE),
                    of(
                            M.przestroga(),
                            M.konsekwencje(opponent)
                    )
            );
        }
        public void fest(){
            List<W> festWarunki = DB_Warunki.FEST.getWarunki();

            M.sondujWady();
            M.sondujWartoscioweRzeczy();
            M.sondujWarunkiSprzyjajace();
            M.sondujWarunkiNiesprzyjajace();
            M.sondujLudziWokol();

            M.wypracujLepszaPozycje();
            M.ukryjDobra();
            M.wdupcWNajgorszeWarunki();
            M.zajmijPozycjeIWarunki();
        }
        public void przewagi(){
            W przewagaGlobal = W.PRZEWAGA_LOCAL;
            List<W> potrzebneWarunki = of(W.STALA_PLANSZA, W.WIELE_INTERAKCJI, W.WIELE_OSOB, W.OSOBA_ODSLANIAJACA_SIE);

            new WMWM(of(W.NIEZNAJOMY, W._88_, W.NIEWSTANIE_OBRONIC_PRZEWAGI),
                    of(
                            M.bierzPrzewage()
                    ),
                    of(W.BAZUJE_NA_PRZEWADZE),
                    of(
                            M.kasujMuPrzewage()
                    )
            );
            new WMWM(of(W.WADA),
                    of(
                            M.DEFAULT(M.zapamietaj())
                    ),
                    of(W.WADA, W._88_, W.ZLY),
                    of(
                            M.dziurkaDoJakNajwiekszejLiczbyOsob()
                    )
            );
            new WMWM(of(W.NEUTRAL),
                    of(
                            M.neutral()
                    ),
                    of(W.DOBRY),
                    of(
                            M.wspieramPrzewage()
                    )
            );
            new WM(of(W.DOBRY, W._88_, W.BRAK_PRZEWAGI_X, W._88_, W.MAM_PRZEWAGE_X),
                    of(
                            M.podzielSie(W.PRZEWAGA)
                    )
            );
            new WM(of(W.BRAK_PRZEWAG),
                    of(
                            M.praca(of(W.WYSILEK, W.CIERPLIWOSC, W.CIERPIENIE))
                    )
            );
            new WM(of(W.BRAK_ZAKLECIA),
                    of(
                            M.srodowiskoWaliBuca(),
                            M.srodowiskoRobiCierpienie()
                    )
            );
            new WM(of(W.PRZEWAGA_OPIERAJACA_SIE_NA_LUDZIACH),
                    of(
                            M.GRANT(ME, W.MOZLIWA_ULOTNOSC),
                            M.dzialajSzybkoZZaskoczenia(),
                            M.przejmij(),
                            M.utrzymaj()
                    )
            );
            new WMWM(of(W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU, W._II_, W.DUZA_PRZEWAGA_STARCIA, W.DUZY_POSLUCH, W.DUZA_PRZYCHYLNOSC),
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
                            M.utrzymaj(afterTop)
                    )
            );
            new WM(of(W.RESTRYKCJA),
                    of(
                            M.sredniaRestrykcja(of(W.SKLEP, W.RESTAURACJA, W.KLUB)),
                            M.mocnaRestrykcja(of(W.ULICA, W.BLOKI, W.PRZYSTANEK, W.TRAUTO))
                    )
            );

            new WM(of(W.MIEJSCE_STALE, W._88_, W.KIBICOWANIE),
                    of(
                            M.zeSrodowiska(W.OK),
                            M.fest(W.KUP_COS),
                            M.drugaStrona(W.WYPAD),
                            M.drugaStronaDzialajacy(W.SZPITAL)
                    )
            );
        }

        public void sonda(){
            new WM(of(W._NOT_, W.ZLODZIEJKA, W._II_, W.KIBICOWANIE, W._II_, W.DOBRZE_ZMYSLY, W._88_, W.SPORT),
                    of(
                            osoba.set(W.FEST)
                    )
            );
            new WMWM(of(W.WIDZISZ_ZASOB),
                    of(
                            M.sondaKtoZyskuje()
                    ),
                    of(M.nalezyDo(of(W.FEST, W._II_, W.BURZUAZJA, W._II_, W.SYSTEMOWIEC))),
                    of(
                            M.pracaNadZasobem(W.WIEDZA),
                            M.bierzZasobNaSwaStrone(metodyWzieciaNaSwaStrone)
                    )
            );
            new WM(of(W.WIDZISZ_BLAD),
                    of(
                            M.sondaBledu(bledy)
                    )
            );
            // TODO CASY NA POSZCZEGOLNY BLAD, obsluga bledu
            new WM(of(W.SONDA_KOGO),
                    of(
                            M.sondaKogo(kogo)
                    )
            );
            new WM(of(W.SONDA_DZIALACZY),
                    of(
                            M.jebac(),
                            M.raczkaDoGory()
                    )
            );
            // TODO SONDA KOBIETY
            // if(ladna && stara) tysiac razy wyruchana po kilku zwiazkach
            // if(czula cierpienie) dbaj(); robDobrze(); else robCierpienie();
            new WMWM(of(W.CZLOWIEK),
                    of(
                            M.DEFAULT(W.ZLY)

                    ),
                    of(W.FEST, W._II_, W.NIEPRZYDATNY),
                    of(
                            M.GRANT(ME, W.SWOJA_OBECNOSCIA_POGRAZA)
                    )
            );
            new WM(of(W.CZYN),
                    of(
                            M.jakDuze(W.PRZECIWNOSCI),
                            M.jakDuze(W.WARUNKI_OSIAGNIETE),
                            M.jakie(W.WARUNKI_POCZATKOWE),
                            M.ile(W.CZAS)
                    )
            );
            new WM(of(W.BIEGACZE),
                    of(
                            M.GRANT(YOU, of(W.BRAK_PIENIEDZY, W.GLUPI, W.NUDA, W.ZLY, W.DOSTEP_OGRANICZONY))
                    )
            );
            new WM(of(W.MEZCZYZNA_Z_KOBIETA),
                    of(
                            M.GRANT(YOU, of(W.UMIE_BAJEROWAC, W.ZNAJOMI, W.SRODOWISKO))
                    )
            );

        }
        public void dzialajacy(){
            new WM(of(W.DZIALAJACY),
                    of(
                            dzialacz.siejZlo(),
                            dzialacz.uzaleznijSieOdSrd(),
                            dzialacz.dzialanieWsrodDzialaczy(),
                            dzialacz.zdobadzInformacjeZeSrodowiskaNaKurestwie(),

                            dzialacz.WHILE(W.DOSTEP),
                            dzialacz.ukryjDostep(),
                            dzialacz.wbijNaMuke(),
                            dzialacz.skazNaIzolacje(),
                            dzialacz.patrzJakCierpi(),
                            dzialacz.cieszSieJegoCierpieniem(),
                            dzialacz.baluj(),
                            dzialacz.siejZlo(),
                            dzialacz.WHILE_END()
                    )
            );
        }
}
package metoda;


import typy_bazowe.TypMiejsce;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.*;

/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_1 extends AbstractCPU {
    List<W> rzeczywistosc = of(W._1_OSOBA__DUZO, W.POPRUSZONE_NA_MIEJSCACH, W.X, W.KONTEKST);

    List<W> plansza = PLANSZA_WARUNKI;
    List<W> essentials = ESSENTIALS_SYTUACJE;

    List<W> allSprzyjajace = SPRZYJAJACE_WARUNKI;
    List<W> allNiesprzyjajace = NIE_SPRZYJAJACE_WARUNKI;

    List<W> extremalne = EXTREMALNE_SYTUACJE;
    List<W> reakcjeKobiet = REAKCJA_KOBIET_WARUNKI;
    List<W> chcianeSytuacje = CHCIANA_SYTUACJE;

    List<W> dopuszczenie = ZBIOR_DOPUSZCZENIE_WARUNKI;

    List<W> mojeCechy = of(W.SPRYT, W.SZYBKOSC, W.SILA, W.ANTY_POSLUSZNOSC, W.ZMUSZASZ, W.WYJEBKA_NA_WLASNE_ZMECZENIE);
    List<W> osobaChcianeCechy = of(W.REAGUJE, W.STWARZA_POINTCUT, W.SWIADOMOSC);

    List<W> typySytuacji = TYPY_SYTUACJI;

    List<W> spojrzenia = of(M.spojrzenie_1(W.BEST_CASE), M.spojrzenie_2(W.NORMAL_CASE));
    List<W> zaproszenieRandka = of(M.podkreslJejZlaSytuacje(of(W.NUDA, W.MONOTONIA)), M.podkreslSwojeStrania(), M.znamySie(),
            M.obrazSieJakNieOdpowie(), M.ultimatum(W.KARA));

    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.KOJARZENIE_Z_DOBREGO, W.ZNAJOMI, W.POTRZEBA, W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<Object> sytuacja = of(W.LUDZIE, essentials, W.OPCJA_PRZEJSCIE, allSprzyjajace, spojrzenia, jakoscSytuacji);

    W cel = W.ZMIANA_SYTUACJI_DEFAULTOWEJ;

    List<W> malyDuzy = of(M.MALY_WARUNEK(of(W.WYCHODZENIE, W.OBECNOSC)), M.DUZY_WARUNEK(W.ZAGADANIE));

    List<W> schemaDzialania = of(W.DOBRA_PLANSZA, W.LADNA, W.CHETNOSC,
            W.MOWA, W.KOMPLEMENT, W.WNIOSKI, W.EMOCJE, W.BECZKA,
            W.DRUGI_RAZ, W.KONTAKT
    );

    M schemaSytuacji00 = new M().sytuacja().Is().podbitka()
            .lub().sytuacja().Is().przeminelo();

    M schemaSytuacji1 = o(essentials, W._II_, allSprzyjajace, "-", W.PRZEJSCIE, "-", W.MOWA)
            .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
            .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji2 = o(W.OPCJA_PRZEJSCIE, "-", W.PRZEJSCIE, "-", W.MOWA)
            .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
            .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

    W schemaRelacji = o(W.KOBIETA, "-", jakoscSytuacji, W._II_, W.CHETNOSC, "-", W.RELACJA);

    public void run(){
        W nastawienie = M.ODRAZU(W.BLISKOSC);

        nastawienie = M.WYBOR(of(W.BIERZESZ_CO_JEST, W.WG_OCZEKIWANIA,
                                 W.BEZ_POPATRZENIA, W.NA_POPATRZENIE, W.NA_CHETNOSC, W.NA_ZNAJOMOSC));

        List<W> mainFlow = of(W.GLOWNA_DROGA, W.MIEJSCE_STALE);

        M.W(
                of(M.namierzenie(), M.nieOddalaszWzroku()),
                of(W.THREAD_WHILE_LOOP_ZASIEG_WZROKU)
        );

        M.W(
                of(W.WSTYD, W._II_, W.NIEDOSTEPNA,W._II_, W.NIECHCE_SIE),
                of(M.REMIND(ME,of(W.STATYSCI,W.SZANSA,W.SAVE_TIME,W.PROC_30_DOBRYCH)))
        );
        M.W(
                of(W.TLUM),
                of(
                        M.REMIND(ME,of(W.STATYSCI,W.SZANSA,W.SAVE_TIME,W.PROC_30_DOBRYCH)),
                        M.II(),
                        M.izoluj()
                )
        );
        M.W(
                of(W.ZLE_WYGLADA, W._II_, W.SWOJE_RZECZY),
                of(M.cipa())
        );
        M.W(
                of(M.odrazuPochwycenie(W.SYTUACJA), M.odrazuNozki(), M.odrazuMowa(), M.pomysl(of(W.PRZESKOCZENIE)), M.dzialanie(mojeCechy)),
                of(W.BEDZIE_CIEKAWIE, W.ANTY_PARTYZANTKA, W.ANTY_POSLUSZNOSC, W.NIENAWISC_FESTOW, W.JA_DOSTAJE)
        );
        M.W(
                of(W.PODBIJASZ, W._88_, W.BRAK_JAKOSCI_PLANSZY),
                of(
                        M.DEFAULT(ona.opieraSie(), ona.odpowiadaOdNiechcenia(), ona.nieufna())
                )
        );
        M.WW(
                of(W.NIE_DA_SIE_ZOBACZYC_PIERSCIONKA),
                of(
                        M.podbijasz()
                ),
                of(W.PIERSCIONEK),
                of(
                        ona.znikaZPlanszy()
                )
        );
        M.WW(
                of(W.DOPUSZCZA_ODPISUJE),
                of(
                        M.piszesz(),
                        M.probujeszSieUstawic()
                ),
                of(W.DOPUSZCZA_MOWA),
                of(
                        M.gadka(tematy, kombo),
                        M.finalizujeszZaproszeniemLubKontakt(zaproszenieRandka)
                )
        );
        M.WW(
                of(W.SZYBKO, W._88_, W.ODSTEP_0_5s, W._88_, W.PRZEWIDYWANIE, W._88_, W.REZULTAT),
                of(
                        M.GRANT(ME, W.EFEKTYWNA_GADKA),
                        M.GRANT(ME, W.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA)
                ),
                of(W.EFEKTYWNA_GADKA),
                of(
                        M.GRANT(ME, W.SZANSA_KONTAKT)
                )
        );
        M.WW(
                of(W.NIEODPOWIEDZIALA, W._II_, W.UCINA),
                of(
                        M.ponow(),
                        M.zalagodzNeturalTematem(),
                        M.tyrajZNiejBeke(),
                        M.rozgladnijSieZaSytuacja(),
                        M.GRANT(ME, W.LOOKING_FORWARD_NEVER_BACK)
                ),
                of(W.NIEODPOWIEDZIALA_NA_MIEJSCU),
                of(
                        M.zobowiazanie(W.NAJWIECEJ_NA_MIEJSCU)
                )
        );
        M.W(
                of(W.NIEPODBIJASZ),
                of(
                        M.GRANT(ME, W.CONTINUE_NUDA),
                        M.REMOVE(ME, W.SYTUACJA),
                        M.REMOVE(ME, W.POTENCJALNA_PRZEWAGA),
                        M.GRANT(SRODOWISKO, W.POTENCJALNA_PRZEWAGA),
                        M.GRANT(ALL, W.PODZIW_SZACUNEK)
                )
        );

// do cpulicy
//        if(banda) podbijasz
//        if(dobra jednostka) probujesz robic dziurke

        rewir();
        wzglIzolacja();
        trauto();
        sklep();
        utrudnienia2strony();
        pokazujaSie();
        parzenie();
        nozki();
        zagadanie();
    }

    public void rewir() {
        List<W> essentials = of(W.MUSI_CI_SIE_CHCIEC, W.CONAJMNIEJ_2H, W.WALKA_O_WZGL_IZOLACJE);
        M.BFS_terytorium(W.PODBIJASZ);
    }

    public void wzglIzolacja(){
        List<W> sprzyjajace = of(W.DLUGA_DOSTEPNOSC,  W.BEZRUCH, W.SZANSA_NA_SPOTKANIE_WZROKIEM, W.KONTEKST);
        List<W> extremalneWzgl = of(W.UWAGA_NA_TOBIE, W.ROZWALENIE_CISZY);

        M.W(
                of(W.WZGL_IZOLACJA),
                of(
                        M.GRANT(ME, W.X_100),
                        M.zwazNaSzczegoly(),
                        M.pokazSie()
                )
        );
        M.W(
                of(W._1SPOJRZENIE),
                of(
                        M.GRANT(ME, W.ENOUGH),
                        M.pokazZainteresowanie(),
                        M.prefix(prefixes, pdstw),
                        M.gadka(tematy, kombo)
                )
        );
        M.WW(
                of(W.PATRZYSZ),
                of(
                        M.wypracujDobraSytuacje(W.OGRANICZENIE_CZASOWE),
                        M.II(),
                        M.oczekujNaSpojrzenie(W.OGRANICZENIE_CZASOWE),
                        M.II(),
                        M.wlozDoKubelka()),
                of(W.PASS,W._88_, W.BLISKOSC),
                of(M.GRANT(ME, W.X_1000))
        );
        M.W(
                of(W.GADAJA_ZE_SOBA),
                of(M.GRANT(ME, W.WIECEJ_NIZ_POPATRZENIE))
        );

        M.W(
                of(W.SIEDZA),
                of(
                        M.GRANT(YOU, W.KOMFORT),
                        M.GRANT(ME, W.PRZYSZLY_SIE_POKAZAC),
                        M.przechodziszTylkoRaz(),
                        M.omijaszPartyzantke(),
                        M.podbicieZJednejProby())
        );
        M.W(
                of(W.MIEJSCE_STALE),
                of(
                        M.kontekst(),
                        M.stajesz2s(),
                        M.sondaGdzie(),
                        M.bijesz()
                )
        );
        M.WWW(
                of(W.SYTUACJA, W._88_, W.MIEJSCE_STALE, W._88_, W.ODPUSZCZSZ),
                of(
                        M.GRANT(ME, W.WORST_CASE),
                        M.partyzantka_on()
                ),
                of(W.PARTYZANTKA),
                of(
                        M._3xWchodziszDopieroZnowSytuacja()
                ),
                of(W.BOISZ_SIE, W._88_, W.NIEPRZYGOTOWANY),
                of(
                        M.GRANT(ME, W.PARTYZANTKA)
                )
        );
        M.W(
                of(W.SLUCHAWKI),
                of(M.niePrzestraszenie(), M.dzialajJakbyNieBylo())
        );
        M.W(
                of(W.CZORCIK),
                of(M.GRANT(ME, W.SZANSA_BECZKA_ZNAJOMOSC))
        );
    }
    public void trauto(){
        W rzeczywistosc = W.BAHNA_1_DO_2_KOBIET;
        List<W> extremalneTrauto = of(W.SIEDZISZ_PRZEJSCIE, W.PRZECIWNY_PRZYSTANEK);
        W schemaTrauto = M.WWW(M.zczytajStrefy(), "-", M.wyborStrefy(), "-", M.przejscie(), "-", M.mowa());

        List<W> sprzjajace = of(W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.SZANSA_NA_SPOTKANIE_WZROKIEM, W.STREFY_PRZEGUBOWE_3, W.KONTEKST);
        List<W> normalne = of(W.CISZA, W.TLUM, W.CHODZAC_ROZMOWA_UWAGA_NA_TOBIE, W.BIEDACY);
        List<W> niesprzyjajace = of(W.ULOTNOSC, W.ZARAZ_WYSIADZIE, W.ZARAZ_WYCIAGNIE_SLUCHAWKI);

        // THREAD WHILE LOOP.START()
        M.WW(
                of(W.TRAUTO),
                of(
                        M.szukanieDobrejPlanszy()
                ),
                of(W.LEPSZA_OPCJA),
                of(
                        M.popierdalaszObecna(),
                        M.odrazuPochwycenie(W.SYTUACJA)
                )
        );
        M.WW(
                of(W.BAHNA),
                of(
                        M.pobierzInformacjeStrefy(),
                        M.wybierzStrefe(),
                        M.sondaPrzystanekKoncowy()
                ),
                of(W.STARA_BAHNA),
                of(
                        M.opcje(of(W.SIEDZENIE_PRZED, W.SIEDZENIE_OBOK, W.STOISZ_NAD_SIEDZENIEM, W.STOISZ_OBOK))
                )
        );
        M.WW(of(W.WEJSCIE, W.PRZYSTANEK),
                of(
                        M.rozgladniecie()
                ),
                of(W.SZCZYT),
                of(
                        M.skupiaszNaPrzystankach()
                )
        );
        // THREAD WHILE LOOP.END()
        // NAMIERZONA

        M.WWW(
                of(M.odrazuPoWejsciu()),
                of(
                        W.OSZCZEDNOSC_CZASU, W.MNIEJSZE_SZANSE,
                        W.NIETRZEBA_TRZYMAC_ORIENT, W.BRAK_GLUPICH_UCZUC, W.WIEKSZA_SZANSA_LINCZ
                ),
                of(M.poJakimsCzasie()),
                of(
                        W.MNIEJ_CZASU, W.WIEKSZE_SZANSE,
                        W.TRZYMASZ_ORIENT, W.GLUPIE_UCZUCIA
                ),
                of(M.odrazuPoWyjsciu()),
                of(
                        W.MNIEJ_CZASU, W.MNIEJSZE_SZANSE,
                        W.BRAK_CISZY, W.BRAK_STATYSTOW_WOKOL,
                        W.TRZYMASZ_ORIENT, W.IDZIE, W.MUSISZ_DOGONIC, W.BRAK_KOMFORTU
                )
        );
        // todo przenies do wzgl izolacja
        M.WW(
                of(W.Z_KIMS, W._88_, W.PATRZY),
                of(
                        M.GRANT(ME, W.X_100),
                        M.sciagajGadke()

                ),
                of(W.WIDZIALA, W._88_, W.WYCHODZI),
                of(
                        M.lecZaNia(),
                        M.dogon()
                )
        );
        M.W(
                of(W.BRAK_SLUCHAWEK),
                of(
                        M.docen()
                )
        );
        M.WW(
                of(W.SIEDZISZ),
                of(
                        M.wstanie(),
                        M.przejscie(),
                        M.pokazSie()

                ),
                of(W.SIEDZIMY),
                of(
                        M.sondujWarunekDodatni(),
                        M.zwrocUwage(),
                        M.podbicieZJednejProby()
                )
        );
        M.WW(
                of(W.PATRZY, W._88_, W.WRAZLIWA),
                of(
                        M.GRANT(ME, W.PATRZY_ULAMEK_SEKUNDY)
                ),
                of(W.CISZA),
                of(
                        M.abyInniMysleliZeZnasz()
                )
        );
        M.W(
                of(W.POZNALES_KOGOS),
                of(
                        M.wchodziszWychodzisz(W.MIEJSCE)
                )
        );

        // END NAMIERZONA
    }
    public void utrudnienia2strony(){
        M.WW(
                of(W.ODWRACA_WZROK, W._II_, W.SPECJALNE_NIEWIDZENIE),
                of(
                        M.prefixMimoWszystko(prefixes, pdstw)
                ),
                of(W.OLEWKA_PODBICIA, W._II_, W.ODPOWIEDZ_ODCZEP),
                of(
                        M.temat_x3(tematy),
                        M.przewidywanie_x3()
                )
        );
    }

    public void sklep(){
        List<W> sprzjajace = of(W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.SZANSA_NA_SPOTKANIE_WZROKIEM, W.KONTEKST);
        List<W> normalne = of(W.CISZA, W.TLUM, W.CHODZAC_ROZMOWA_UWAGA_NA_TOBIE);
        List<W> niesprzyjajace = of(W.SLABY_FOCUS, W.OGLADANIE_RZECZY, W.ZAJETA_OSOBA_TOWARZYSZACA);

        M.ORIENT(of(W.KASA, W.KOLEJKA, W.UJSCIE));
        M.kolkoWokol(W.SKLEP);

        M.W(
                of(W.OBSLUGA,
                        W.ZARAZ_STACI_FOCUS, W.ZARAZ_KTOS_WEJDZIE),
                of(M.odrazuJakObsluguje())
        );
        M.W(
                of(W.GALERIA),
                of(
                        M.CEL(W.SKLEPY_DLA_KOBIET),
                        M.jednoWejscieJednoPodbicie()
                )
        );
    }
    public void pokazujaSie(){
        M.WWW(
                of(W.IDA_KOLEZANKI),
                of(
                        M.GRANT(ME, W.X_100)
                ),
                of(W.PROBUJE_SIE_POKAZAC),
                of(
                        M.GRANT(ME, W.X_1000)
                ),
                of(W.NIEPATRZY_W_OCZY_ALE_TWOJA_STRONE, W._II_,W.PATRZY_W_OCZY_CZESTO, W._II_,W.PIERSCIONEK_ALE_PATRZY),
                of(
                        M.GRANT(ME, W.POKAZUJE_SIE)
                )
        );
        M.W(
                of(W.WYKAZALA_ZAINTERESOWANIE, W._88_, W.MAM_CHLOPAKA),
                of(
                        M.komplement_x2(),
                        M.temat(),
                        M.ponowienie()
                )
        );
    }

    public void parzenie(){
        M.WW(
                of(W.OPCJA_PARZENIE),
                of(
                        M.GRANT(ME, W.SZANSA_POKAZANIE_GADKI),
                        M.GRANT(ME, W.SZANSA_POTENCJALNY_ZWIAZEK),
                        M.ogladneLadnaBuzie(),
                        M.powiemDobrego(),
                        M.gadka(codzienne, kombo)
                ),
                of(W.DOBRA_JEDNOSTKA),
                of(
                        M.GRANT(ME, W.ZOBOWIAZANIE_DO_GADANIA)
                )
        );
        M.W(
                of(W.SRODOWISKO),
                of(
                        M.zblizPrzezLudzi()
                )
        );
        M.W(
                of(W.NIE_PARZYSZ),
                of(
                        M.REMOVE(ME, W.SYTUACJA),
                        M.partyzantka_on(),
                        M.GRANT(SOMEONE, W.PARZENIE)
                )
        );
    }
    public void nozki(){
        W rzeczywistosc = W.POL_GODZINY_1_DO_2_KOBIET;
        List<W> extremalne = of(W.UWAGA_NA_TOBIE, W.ROZWALENIE_CISZY,
                W.IDZIESZ_ZAWRACASZ, W.SIEDZISZ_PRZEJSCIE, W.ONA_SWOJE_GRONO);
        W schemaTrauto = M.WWW(M.przewidzenieDrogi(), "-", M.odbicieNaNozkach(), "-", M.przejscie(), "-", M.mowa());

        List<W> sprzjajace = of(W.NAJNIZSZY_POZIOM_WARSTWY, W.WLASNE_TERYTORIUM);
        List<W> normalne = of(W.CHODZENIE_WSROD_PUSTKI);
        List<W> niesprzyjajace = of(W.ULOTNOSC, W.IDZIE, W.BRAK_REKACJI);

        List<TypMiejsce> wychodzaLudzie = of(
                TypMiejsce.SAMOCHOD, TypMiejsce.TRAUTO, TypMiejsce.MIESZKANIE,
                TypMiejsce.SKLEP, TypMiejsce.LUMPEX, TypMiejsce.LODY, TypMiejsce.POCZTA, TypMiejsce.BANK,
                TypMiejsce.PRACA_BUDYNEK, TypMiejsce.SZKOLA, TypMiejsce.RESTAURACJA,
                TypMiejsce.PARKING, TypMiejsce.STACJA_BENZYNOWA

        );
        List<W> nozkiMetody = of(M.zatrzymaj(), M.obroc(), M.podejdz(), M.wejdzPrzed(coTakPatrzysz),
                M.szukajUjscia(), M.szukajHotspot()
        );

        ona.on(W.TRANS);
        ona.max(W.POPATRZENIE_X2);

        M.WW(
                of(W._NOT_, W.WZGL_IZOLACJA, W.SKLEP, W.TRAUTO),
                of(
                        M.GRANT(ME, W.JALOWY_ON)
                ),
                of(W.JALOWY_ON),
                of(
                        M.ekstremalneRzeczy(),
                        M.podbieganieZawracanie(),
                        M.podbijaszGdyRobiaSwojego()
                )
        );
        M.W(of(W.IDZIESZ_NAPRZECIWKO, W._88_, W._2_WZROKOWE),
                of(
                        M.baczek()
                )
        );
        M.WW(of(W.WIDZISZ_SYTUACJE),
                of(
                        M.odrazuPochwycenie(W.SYTUACJA)
                ),
                of(W.CHCIANA),
                of(
                        M.GRANT(ME, W.X_100), M.GRANT(ME, W.BEST_POZYCJA)
                )
        );
        M.W(of(W.WIDZISZ_TYL, W._II_, W.NIEPATRZA_GADAJA),
                of(
                        M.sciagajGadke(),
                        M.pprefix(prefixes, kombo),
                        M.namierzZareagowana(),
                        M.oswajaj()
                )
        );
        M.W(of(W.ZASIEG_WZROKU, W._88_, W.STOISZ, W._88_, W.MIEJSCE_PRZECHODNIE ),
                of(
                        M.odbicieNaNozkach(),
                        M.idzieszWczesniejWJejStrone(),
                        M.zrownanie(),
                        M.prefix(prefixes, pdstw)
                )
        );
        M.W(of(W.ZASIEG_WZROKU, W._II_, W.PRZEWIDZIALES_DROGE),
                of(
                        M.czas_start(), M.GRANT(ME, W.SYTUACJA),
                        M.ida(W._3s),
                        M.idzieSzybko(W._2s),
                        M.idzieTwojaStrone(W._1s, W.IDZIESZ_ZA_NIA),
                        M.idzieDobreMiejscePrzech(W._30s),
                        M.dluzejTylko(W.WZGL_IZOLACJA)
                )
        );
        M.W(of(W.IDZIESZ_W_MIEJSCE_STALE),
                of(
                        M.GRANT(ME, W.WIECEJ_OKAZJI_DROGA)
                )
        );
    }
    public void zagadanie(){
        M.WW(of(W.LEKKIE),
                of(
                        M.bucikiCel()
                ),
                of(W.MOCNIEJSZE),
                of(
                        M.bucikiDeep()
                )
        );
    }
}

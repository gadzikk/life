package metoda;

import db.DB_Warunki;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 23.08.20.
 */
public class CPU_LUDZI extends AbstractCPU {
    List<W> silneWiezyCzlowieka = SILNE_WIEZY_CZLOWIEKA_WARUNKI;

    public void run() {
        relacjeWarunkowLudzi();
        srodki();
        ochrona();
        defaultZleZachowanie();
        endCasyWarunkow();
        opisZachowanTypOsoby();
        teoriaZla();
        fest();
        dzialajacy();
        czlowiekCierpienia();
        postawyLudzkie();
        walkaKlas();
        osobaCechyMozliweDzialania();
        osobaPrzewag();
        wyrok();
    }

    public void relacjeWarunkowLudzi() {
        // WADY WYCHOWANIE
        M.W(of(W.ZLE_WYCHOWANIE, W._II_, W.WYCHOWANIE_POD_KLOSZEM, W._II_, W.ROZPASANIE_ROZPIESZCZANIE, W._II_, W.SLABI_RODZICE),
                "--->", of(W.BRAK_CIERPIENIA, W.BRAK_PRACY, W.ZAZDROSC, W.BRAK_POZNANIA_NAUKI, W.BRAK_SPORTU, W.CHEC_BEZPIECZENSTWA));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA), "--->", of(W.EMOCJE_FIRST, W.WRAZLIWOSC, W.DZIECKO, W.ZMIENNOSC));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA, W.BRAK_DOBREGO_WYCHOWANIA),
                "--->", of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI));

        M.W(of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI),
                "--->", of(W.DZIWNA_PASJA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY));

        M.W(of(W.CHEC_BEZPIECZENSTWA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY),
                "--->", of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.HIERARCHIA_FIRST));

        M.W(of(W.ZAZDROSC, W.WRAZLIWOSC, W.NIEPOSLUSZONSC_B, W.SILNIEJSZY_B), "--->", of(W.WYKLUCZA, W.WYLACZY_DOSTEP));

        // ****

        M.W(of(W.POZNANIE_WARTOSCI_PIENIADZA, W.FAZA_Z_NAUKI, W.FART, W.DZIWNA_PASJA), "--->", of(W.DOBRY_ZAWOD));

        M.W(of(W.ZNAJOMI_PRZESTEPCY, W.CHECI), "--->", of(W.JUMA));

        M.W(of(W.JUMA, W.PRACA), "--->", of(W.POZNANIE_WARTOSCI_PIENIADZA));

        M.W(of(W.POZNANIE_NAUKI), "--->", of(W.FAZA_Z_NAUKI));

        M.W(of(W.SUMIENIE, W.DOBRE_CZYNY, W.MODLITWA), "--->", of(W.PRZYCHYLNOSC_BOGA));

        M.W(of(W.PRZYCHYLNOSC_BOGA), "--->", of(W.FART));

        // ZALETY WYCHOWANIE
        M.W(of(W.DOBRE_WYCHOWANIE, W._88_, W.SILNI_RODZICE),
                "--->", of(W.CIERPIENIE, W.PRACA, W.ZARADNOSC, W.POZNANIE_NAUKI, W.SPORT, W.SZCZESLIWE_DZIECINSTWO));

        M.W(of(W.PRACA, W.CIERPIENIE), "--->", of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA));

        M.W(of(W.PRACA, W.CIERPIENIE, W.DOBRE_WYCHOWANIE),
                "--->", of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA));

        M.W(of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA),
                "--->", of(W.PRAWDZIWA_PASJA, W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA));

        M.W(of(W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA),
                "--->", of(W.MOCNA_JEDNOSTKA, W.SILNA_JEDNOSTKA_FIRST));

        M.W(of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA), "--->", of(W.DOBRE_WYBORY, W.OSIAGNIETE_CELE));

        // ****

        // ULICA
        M.W(of(W.SLABI_RODZICE), "--->", of(W.SLABY_GEN, W.PATOLOGIA, W.UZYWKI));

        M.W(of(W.SLABY_GEN, W.PATOLOGIA, W.UZYWKI), "--->", of(W.GLUPOTA, W.SLABY, W.AGRESJA));

        M.W(of(W.GLUPOTA, W.SLABY, W.AGRESJA), "--->", of(W.SPRZET, W.ZALEZNOSC_OD_EKIPY));

        M.W(of(W.SPRZET, W.ZALEZNOSC_OD_EKIPY),"--->", of(W.WYROK, W.ZLA_PRACA, W.BRAK_PIENIEDZY, W.NIESTABILNOSC_MATERIALNA,
                W.SLABA_MANIURA,W.BLISKOSC, W.MONOSRODOWISKO, W.UZALEZNIENIE));

        M.W(of(W.ZLA_PRACA, W.BRAK_PIENIEDZY, W.BRAK_PERSPEKTYW, W.CHECI), "--->", of(W.ZLAMANIE_PRAWA));

        M.W(of(W.ZYSK, W.PRZEWAGA, W.SPODOBANIE_SIE), "--->", of(W.UTRZYMANIE_RELACJI));

        M.W(of(W.NIESPODOBANIE_SIE, W.BLISKOSC),"--->", of(W.WALKA_PIESCI));

        M.W(of(W.NIESPRAWIEDLIWE_PRZEWAGI),"--->", of(W.KOLEJNE_NIESPRAWIEDLIWE_PRZEWAGI, W.KURESTWO, W.ZACHETA_DO_ZLA));

        // ***

        // POSIADANIE

        M.W(of(W.SILA_SPRAWCZA_PRACA, W._II_, W.SILA_SPRAWCZA_ULICA),"--->", of(W.SUPERPOZYCJA));

        M.W(of(W.POSIADACZ, W.WADY),"--->", of(W.PRYWATNY_FOLWARK, W.NADUZYWANIE_WYSOKIEJ_POZYCJI));

        M.W(of(W.POSIADACZ, W._88_,
                W.UNDERDOG, W.OD_ZERA_DO_MILIONERA_PRZEZ_CIERPIENIE),"--->", of(W.ANTY_FOLWARK, W.NAJWIEKSZA_WIEDZA_STOPIEN_PO_STOPNIU,
                W.SWIADOMOSC_PIENIADZ_NIC, W.SWIADOMOSC_SILA_SPRAWCZA_DUZO,
                W.MATERIA_DUZO, W.OKAZJA_DUZO, W.LOKALNOSC_DUZO));

        M.W(of(W.SUPERPOZYCJA), "--->", of(W.REALNY_WPLYW_NA_WYDARZENIA, W.REALNY_WPLYW_NA_LUDZI,
                W.ULGA_DLA_SWOICH, M.Option(W.PODKOPANIE_INNYCH),
                W.SILA_SPRAWCZA_W_MIEJSCU_POD_WARUNKAMI, W.OCHRONA_SWEJ_POZYCJI,
                W.INFORMACJA, W.MIEJSCE_STALE));

        M.W(of(W.SUPERPOZYCJA, W.PRZEWAGA_SILY, W.ATRAKCYJNA_EGOISTKA),"--->", of(W.BEZKARNOSC, W.NIE_PAMIETA_SWOICH_OFIAR,
                M.Option(W.PYSZNY), M.Option(W.NIEOGLADA_SIE_NA_KONKURENCJE)));

        M.W(of(W.ROZMIAR, W.SILA_FIZYCZNA, W.SILNE_UDERZENIE,
                W.ZAPASY, W.OBRONA, W.ZDOLNI_DO_WALKI_ZNAJOMI),"--->", of(W.PRZEWAGA_SILY));

        // ***

        // SWIADOMOSC

        M.W(of(W.SIEDZENIE_MIEJSCA_RESTRYKCYJNE, W.SIEDZENIE_OSOBY_RESTRYKCYJNE),"--->", of(W.INFORMACJA));

        M.W(of(W.WNIOSKI_HISTORIA, W.WLASCIWA_OCENA, W.TRZEZWOSC,
                W.ZNAJOMOSC_OTOCZENIA, W.WNIOSKI_DOSWIADCZENIA, W.INFORMACJA),"--->", of(W.TRAFNE_DECYZJE));
        // ***

        M.W(W.OSOBA, "--->", of(W.SRODOWISKO, W._II_, W.RODZINA)).W_PRZECIWNYM_PRZYPADKU(W.SAMOTNOSC);

        M.W(M.WIECEJ(W.LAT), "--->", M.WIECEJ(W.CIERPIENIE));
    }

    public void srodki() {
        List<W> srodkiFest = of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.WSPARCIE, W.ZNAJOMOSC_FESTOW, W.WYKLUCZENIE,
                W.ZLAMANIE_STANDARDU, W.OSZUKANIE_WDUPCENIE, W.OBGADAC);
        List<W> antyFest = of(W.ROZWALENIE_KOLKA_ADORACJI, W.ZNAJOMOSC_RDZENNYCH, W.SILA);

        List<W> srodkiSlaby = of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.WSPARCIE, W.ZNAJOMOSC_SLABYCH, W.WYKLUCZENIE,
                W.ZLAMANIE_STANDARDU, W.OSZUKANIE_WDUPCENIE, W.PO_CICHU, W.OBGADAC);
        List<W> antySlaby = of(W.OTWARTE_STARCIE, W.SILA, W.ZNAJOMOSC_RDZENNYCH, W.ROZWALENIE_KOLKA_ADORACJI);

        List<W> srodkiRdzenny = of(W.WALKA_PIESCI, W.WALKA_SPRZET, W.ZNAJOMOSC_RDZENNYCH, W.NIEBOI_SIE_WYROKU);
        List<W> antyRdzenny = of(W.CZOLO, W.PSYCHO, W.BRAK_SENSU);

        List<W> srodkiPosiadacz = of(
                M.W(of(W.WARTOSC),"--->", of(W.USTALA_ZASADY)),
                M.W(of(W.NIE_PRZESTRZEGANIE_ZASAD),"--->", of(W.ODCIECIE_DOSTEPU_WARTOSC))
        );
        List<W> antyPosiadacz = of(W.ZNISZCZ_WARTOSC, W.ROB_STARTE, W.ZABURZ_SPOKOJ);
    }

    public void ochrona() {
        M.OCHRONA(M.W(of(W.PRZEJEBANOSC_REGIONU), "--->", of(W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE, W.SPRZET, W.AGRESJA_W_DZIALANIU, W.ZLO)));
        M.OCHRONA(M.W(of(W.SEX), "--->", of(W.WALKA_PIESCI, W.SKAZYWANIE_SAMOTNOSC, W.OBGADAC, W.EMOCJE_ZE_ZLA)));
        M.OCHRONA(M.W(of(W.PRACA), "--->", of(W.PRZYDUPASZENIE, W.WYKONYWANIE_PRACY)));
    }

    public void defaultZleZachowanie() {
        M.ukryjZlo();
        M.ukryjWady();
        M.aktywujEmocje();
        M.wezNajwiecejDlaSiebie();
        M.W(of(W.NIEZNAJOMY),
                of(
                        M.naklejka(),
                        M.foty()
                )
        );
        M.W(of(W.NIEZNAJOMY, W._88_, W.PRZEWAGA, M.Option(W.AGRESJA)),
                of(
                        M.zwyzywaj(),
                        M.pobij()
                )
        );
        M.W(of(W.ZNAJOMI),
                of(
                        M.wykorzystaj()
                )
        );
    }

    public void endCasyWarunkow() {
        M.W((W.DEFAULT),
                of(
                        W.TEMPOTA,
                        W.GLUPOTA,
                        W.NIEODPOWIADA,
                        W.NIESWIADOMOSC,
                        W.ZALEZNY
                )
        );
        M.W((W.OSIEDLE),
                of(
                        W.ANTY_NORMALNOSC,
                        W.HIERARCHIA,
                        W.ZAZDROSC,
                        W.ZLO,
                        W.NUDA
                )
        );
        M.W((W.PASJA),
                of(
                        W.TYLKO_TO,
                        W.STYL_ZYCIA,
                        W.ODERWANIE_OD_RZECZYWISTOSCI
                )
        );
        M.W((W.STUDIA),
                of(
                        W.ODERWANIE_OD_RZECZYWISTOSCI,
                        W.BRAK_CHETNOSCI,
                        W.MARZY_OBCOKRAJOWIEC
                )
        );
        M.W((W.RODZINA),
                of(
                        W.KONTROLA
                )
        );
    }

    public void opisZachowanTypOsoby() {
        M.W(on(W.MIESZANIEC, W.FEST),
                of(
                        M.pobierzNieswiadomosc(), M.pobierzLukiOsobowosci(),
                        M.wyklucz(of(W.RDZENNI, W.SILNIEJSI)), M.utrudniaj(of(W.RDZENNI, W.SILNIEJSI)),
                        M.stworzKolkoAdoracji(),
                        M.thread_while_loop(W.POSLUSZNY)
                )
        );
        M.W(W.RDZENNY_DOBRY,
                of(
                        M.pobierzPatologie(),
                        M.wyklucz(of(W.MIESZANIEC, W.FEST)), M.utrudniaj(of(W.MIESZANIEC, W.FEST)),
                        M.wezPrzewage(), M.pracuj(W.PRZEWAGA),
                        M.przemoc(W.OBRONA),
                        M.thread_while_loop(of(W.ANTY_POSLUSZNOSC, W.ANTY_PUSTKA, W.ANTY_NUDA))
                )
        );
        M.W(W.ZLY,
                of(
                        M.pobierzHierarchie(),
                        M.dzialajDlaZla(), M.tworzPatologie(),
                        M.walZPrzewaga(W.NIEDZIALAJACY),
                        M.przemoc(W.DOMINACJA),
                        M.thread_while_loop(W.DOMINACJA)
                )
        );
        M.W(W.AGRESOR,
                of(
                        M.DEFAULT(W.AGRESJA),
                        M.zaczepSprowokuj(osoba),
                        M.wrocZPrzewaga(),
                        M.walZPrzewaga(osoba, W.PRZEWAGA),
                        M.rozpowiedz(W.WSZYSCY),
                        M.thread_while_loop(W.DOMINACJA)
                )
        );
    }

    public void teoriaZla() {
        List<W> essentials = of(W.KTO_SZYBSZY_TEN_LEPSZY);

        List<W> endCaseZla = of(
                W.ZLE_SAMOPOCZUCIE, W.STRATY_MATERIALNE, W.STRATY_MORALNE, W.STRATA_MIEJSCA_W_HIERARCHII,
                W.PRZERWA_KONTUZJA, W.USUNIECIE_Z_PLANSZY
        );
        M.W(of(W.NOWA_OSOBA),
                of(
                        M.pierwszaReakcja(of(W.ROZKMINIA, W.MAGICZNE_ZAKLECIE, W.ZDJECIA_TWARZOWKI, W.NOTYFIKACJA_EKIPA,
                                W.PROWOKUJE, W.CISNIE, W.WYPROWADZA_Z_ROWNOWAGI, W.WALKA_PIESCI))
                )
        );
        M.W(of(W.KTOS_MI_COS_ZROBIL, W._II_, W.ZAZDROSC),
                of(
                        M.reakcjaMocniejNizszemuWHierarchii(ZBIOR_RANY)
                )
        );

        M.sondaPrzewagPodZrobienieZla();
        M.zniszczJakNajwiecej(ZBIOR_RANY);
        M.zabierzJakNajwiecej();

        M.W(of(W.OBRONA),
                of(
                        M.brakReakcji(W.WYZSZE_DOBRO),
                        M.II(),
                        M.reakcjaMocniej(ZBIOR_RANY)
                )
        );
    }

    public void fest() {
        List<W> festWarunki = DB_Warunki.FEST;
        List<W> festEndCase = of(W.PODROZE, W.WYGODY, W.PRZEKAZANIE_ZLEGO_GENU, W.NABICIE_KABZY_KAPITALISCIE);

        M.W(of(W.RODZINA, W.KONTROLA, W.PIENIADZE),
                of(
                        M.ochronaPrzed(W.CIERPIENIE),
                        M.GRANT(SOMEONE, of(W.FEST, W.BURZUA)),
                        M.GRANT(SOMEONE, of(W.NIESWIADOMOSC, W.LUKI_OSOBOWOSCI))
                )
        );
        M.W(of(W.POSIADACZ),
                of(
                        M.GRANT(SOMEONE, of(W.PRYWATNY_FOLWARK, W.SUPERPOZYCJA, W.WYDAWANIE_WYROKOW))
                )
        );

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

    public void dzialajacy() {
        M.W((W.DZIALAJACY),
                of(
                        M.DEFAULT(W.ZEROWY_DOSTEP),
                        M.DEFAULT(dzialacz.thread_while_loop(W.NORMALNOSC)),

                        M.WARUNKI_WSTEPNE(of(
                                dzialacz.akceptacjaBiegania(),
                                dzialacz.akceptacjaCpania(),
                                dzialacz.akceptacjaHierarchii(),
                                dzialacz.SET(of(W.BRAK_PIENIEDZY, W.NUDA, W.ZLY, W.AGRESJA, W.NIESWIADOMOSC, W.DOSTEP_OGRANICZONY))
                        )),

                        M.WARUNKI_UTRZYMANIA(of(
                                dzialacz.thread_while_loop(M.znoszenieGnojenia()),
                                dzialacz.thread_while_loop(M.tworzEmocje()),
                                dzialacz.thread_while_loop(M.robKrzywde(KRZYWDY_WARUNKI)),
                                dzialacz.thread_while_loop(M.dajZarobekGrubasowi()),
                                dzialacz.thread_while_loop(M.ochronaGrubasa()),
                                dzialacz.thread_while_loop(M.wykonujeRozkazy(W.GORA)),
                                dzialacz.thread_while_loop(M.uznajeHierarchie()),
                                dzialacz.thread_while_loop(M.zdobywanieHierarchii(M.CZESTO(KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, M.OPCJA(OSLONY_WARUNKI))))
                        )),
                        dzialacz.thread_while_loop(M.DOSTEP(of(W.INFORMACJE, W.KONTAKT_TEL, W.OBECNOSC))),
                        dzialacz.SET(W.NIE_ZATRZYMA_SIE),
                        dzialacz.SET(of(W.WYKRECENIE, W.WADY_FIZYCZNE, W.WADY_UMYSLOWE, W.OGRANICZENIE_WOLNOSCI_ULICA, W.KROTKOWZROCZNOSC_CZYNOW)),
                        dzialacz.SET(KRZYWDY_WARUNKI),
                        dzialacz.SET(M.OPCJA(BRAK_ZASAD_WARUNKI)),
                        dzialacz.SET(CECHY_RDZENNY_WARUNKI),
                        dzialacz.SET(PATOLOGIE_OSIEDLE_WARUNKI),
                        dzialacz.SET(TEMATY_RDZENNYCH_WARUNKI),
                        dzialacz.SET(WADY_ZLYCH_WARUNKI),
                        dzialacz.policja(W.ZERO),

                        dzialacz.thread_while_loop(M.rozkminianie(wszyscy)),

                        M.W(W.INFORMACJA, "--->", dzialacz.notyfikacjaEkipa()),
                        M.WW(W.INFORMACJA, "--->", of(dzialacz.notyfikacja(W.GORA),
                                                            grubasPrzewaga.decyzja(W.ROZKAZ)), "--->", dzialacz.wykonuje(W.ROZKAZ)),

                        M.W(dzialacz.otrzymujePrzewagiZDzialania(), "--->", dzialacz.lubiDzialanie()),

                        dzialacz.WYBOR(of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                                M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)))),

                        dzialacz.ULTIMATUM(dzialacz, W.SPRZET),

                        srodowisko.thread_while_loop(M.wsparcie(of(W.DZIALANIE_DLA_ZLA, W.SLEPE_DZIALANIE, W.KROTKOWZROCZNOSC_CZYNOW))),
                        srodowisko.thread_while_loop(M.wsparcie(dzialacz)),

                        srodowisko.thread_while_loop(M.wplyw(dzialacz)),
                        dzialacz.thread_while_loop(M.wplyw(srodowisko)),

                        srodowisko.thread_while_loop(M.wzajemneOddzialywanie(srodowisko)),
                        srodowisko.thread_while_loop(M.KONTROLA(dzialacz)),

                        srodowisko.thread_while_loop(M.moda()),
                        srodowisko.thread_while_loop(M.komfort()),
                        srodowisko.thread_while_loop(M.oczekiwania(W.AGRESJA_W_DZIALANIU, dzialacz)),
                        srodowisko.thread_while_loop(M.zagluszaSumienie(dzialacz)),

                        srodowisko.thread_while_loop(M.postawNajgorszeWarunki(drugaStrona,
                                KRZYWDY_WARUNKI, BRAK_ZASAD_WARUNKI, OSLONY_WARUNKI)),

                        srodowisko.ULTIMATUM(dzialacz).W_PRZECIWNYM_PRZYPADKU(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))),
                        srodowisko.OCZEKIWANIE_POPRAWY(dzialacz).W_PRZECIWNYM_PRZYPADKU(of(
                                srodowisko.ZAMKNIECIE(dzialacz), srodowisko.WYKLUCZ(dzialacz),
                                srodowisko.ROBI_KRZYWDE_Z_PRZEWAGA(dzialacz, KRZYWDY_WARUNKI)
                        )),

                        M.W(srodowisko.CZESTO(M.WZAJEMNE_RANY(ZBIOR_RANY)), "--->", srodowisko.TOLERANCJA(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI)),
                        srodowisko.WHILE(dzialacz.thread_while_loop(of(W.SLUCHAJA, W.OBECNOSC_LUDZI, M.wykonujeRozkazy(W.GORA), M.KRZYWDY(osobyPozaSrodowisko, KRZYWDY_WARUNKI)))),

                        M.W(M.INFORMACJA(W.WROG), "--->", dzialajcyBliskoMiejsca.forEach(of(M.NABYCIE(W.BLISKOSC), W.CISNIE, W.WALKA_PIESCI, W.WALKA_SPRZET))),

                        dzialacz.siejZlo(), M.w_przeciwnym_przypadku(W.POJECHANE, 0),
                        dzialacz.uzaleznijSieOdSrd(),
                        dzialacz.dzialanieWsrodDzialaczy(),
                        dzialacz.zdobadzInformacjeZeSrodowiskaNaKurestwie(),

                        dzialacz.WHILE(of(W.DOSTEP, W.OSOBA_POZA_SRODOWISKO)),
                        dzialacz.zamknijZasob(),
                        dzialacz.ukryjDostep(),
                        dzialacz.wbijNaMuke(),
                        dzialacz.wyklucz(),
                        dzialacz.skazNaIzolacje(),
                        dzialacz.naklejNalepke(),
                        dzialacz.uniz(),
                        dzialacz.cisnij(),
                        dzialacz.notyfikacjaEkipa(),
                        dzialacz.ROBI_KRZYWDE_Z_PRZEWAGA(osobyPozaSrodowisko, KRZYWDY_WARUNKI),

                        M.W(osobyPozaSrodowisko.nieposlusznosc(), "--->", M.WYBOR(of(dzialacz.walkaPiesci(), dzialacz.sprzet()))),

                        dzialacz.patrzJakCierpi(),
                        dzialacz.cieszSieJegoCierpieniem(),
                        dzialacz.baluj(),
                        dzialacz.siejZlo(),
                        dzialacz.WHILE_END(),

                        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", of(W.MIEJSCE_STALE, W.ZLY, W.PRZEKONYWANIE_PRZECIW), "--->", M.OSOBA(W.ZLO))
                )
        );

        List<W> dzialajcyZycie = of(
                M.WHILE(),
                W.PRZYJEMNOSCI,
                W.PRZEWAGA,
                W.PRZEWAGA_ZE_ZLA_OD_ROBIENIA_ZLA,
                M.WHILE_END()
        );

        List<W> dzialajcyPrzewagi = of(W.KLUB, W.MLODE_KOBIETY, W.SRODOWISKO, W.ZNAJOMI, W.EMOCJE, W.GNOJENIE, W.PRACA_PO_ZNAJOMOSCI);

        List<W> dzialajcySlabosci = of(W.BRAK_ZDROWIA, W.BRAK_SUMIENIA, W.PIEKLO);


        M.W(of(W.DZIALAJACY, W._88_, W.BLISKOSC), "--->", W.NASTAWIENIE_AGRESJA);
    }

    public void czlowiekCierpienia() {
        M.W(M.DLUGO(M.CIEZKO(of(W.CIERPIENIE, W.BOL))), "--->", M.WZIECIE_SPRAWIEDLIWOSCI(of(W.SILA, W.MADROSC, W.DOSWIADCZENIA)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).W_PRZECIWNYM_PRZYPADKU(W.PRZYPAL));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));
    }

    public void sprawiedliwy() {
        List<W> sprawiedliwy = DEFAULT_WARUNKI;
    }

    public void postawyLudzkie() {
        M.DEFAULT(of(M.UKRYCIE(W.WADY), M.POKAZ(W.FALSZYWE_WRAZENIE), M.SKUPIENIE(W.PRZYJEMNOSCI)));

        M.ZLE(of(M.UKRYCIE(W.SLABOSC), M.POKAZ(W.SILA), M.SKUPIENIE(of(W.PRZEWAGA, on(KRZYWDY_WARUNKI)))));

        M.DOBRE(of(M.PRACA_NAD(W.WADY), M.POKAZ(W.PRAWDA), M.SKUPIENIE(of(W.CEL, W.BYCIE_LEPSZYM))));
    }

    public void walkaKlas() {
        M.W(of(W.FEST, W.BLISKOSC, W.RDZENNY), "--->", of(fest.ROBI_KRZYWDE(rdzenny, KRZYWDY_WARUNKI),
                                                            rdzenny.ROBI_KRZYWDE(fest, KRZYWDY_WARUNKI)));

        M.W(of(W.SUPERPOZYCJA, W.BLISKOSC, W.RDZENNY), "--->", of(superPozycjaOsoby.ROBI_KRZYWDE_Z_PRZEWAGA(rdzenny, KRZYWDY_WARUNKI)));

        M.W(of(W.BIEGACZ, W.BLISKOSC, W.RDZENNY), "--->", of(biegacz.ROBI_KRZYWDE_Z_PRZEWAGA(rdzenny, KRZYWDY_WARUNKI)));

    }

    public void osobaCechyMozliweDzialania() {
        // todo
    }

    public void osobaPrzewag() {
        M.W(M.OSOBA_Z(PRZEWAGI_WARUNKI), "--->", of(M.SLABY(W.PODLIZYWANIE_SIE), M.SILNY(W.WSPARCIE)));

        M.W(M.OSOBA(M.BRAK(W.PRZEWAGA)), "--->", of(M.SLABY(KRZYWDY_WARUNKI), M.SILNY(M.SONDA_GLEBOKA(izolowanaOsoba))));

        M.W(M.DOPOKI(of(on(PRZEWAGI_WARUNKI), W.KOMFORT, W.OBECNOSC_LUDZI)), "--->", W.BAWIMY_SIE);

        M.W(M.GDY(M.BRAK(W.PRZEWAGA)), "--->", of(W.SMUTEK, W.MYSLENIE, W.WNIOSKI));

        M.WW(W.OSOBA, "--->", M.OSOBY_Z_PRZEWAGAMI(M.SONDA(M.OSOBA(PRZEWAGI_WARUNKI))), "--->", of(M.W(W.DUZA_PRZEWAGA, "--->", of(M.SRODOWISKO(M.AKCEPTACJA(W.OSOBA)),
                                                                                                                                             M.SRODOWISKO(M.WSPARCIE(W.OSOBA)))),

                                                                                                        M.W(W.MALA_PRZEWAGA, "--->", of(M.SRODOWISKO(M.ODRZUCENIE(W.OSOBA)),
                                                                                                                                        M.SRODOWISKO(M.KRZYWDY(W.OSOBA))))));
        M.thread_while_loop(M.OSOBY_Z_PRZEWAGAMI(M.PRZEBYWANIE(M.OSOBA(W.PRZEWAGA))));

        M.thread_while_loop(M.OSOBY_BEZ_PRZEWAG(M.PRZEBYWANIE(M.OSOBA(W.BRAK_PRZEWAG))));
    }

    public void wyrok() {
        M.W(M.WYROK_POWYZEJ_LAT(3), "--->", of(M.DLUGOTRWALE(W.CIERPIENIE), M.MOZLIWOSC(of(W.SZCZEGOLNIE_NIEBEZPIECZNY, W.KAMIKADZE,
                                                                                    W.WIEDZA_LUDZIE_CHARAKTER, W.PSYCHIKA_ZRYTA))));
    }
}

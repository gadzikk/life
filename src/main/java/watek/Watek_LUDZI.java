package watek;

import db.DBP;
import db.DBW;
import metoda.M;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 23.08.20.
 */
public class Watek_LUDZI extends AbstractWatek {
    W wazne = M.WAZNE(DBW.SILNE_WIEZY_CZLOWIEKA_WARUNKI());

    List<W> codzienneAktywnosci = of(M.INTERAKCJA(W.RODZINA), M.OPCJA(M.INTERAKCJA(W.ZNAJOMI)), DBW.PRZYMUS_WARUNKI());

    public void run() {
        relacjeWarunkowLudzi();
        osobaSrodki();
        standardoweZleZachowanie();
        standardoweSkutkiWarunkow();
        opisZachowanTypOsoby();
        fest();
        dzialajacy();
        czlowiekCierpienia();
        postawyLudzkie();
        walkaKlasSpolecznych();
        osobaCechyMozliweDzialania();
        osobaPrzewag();
        wyrok();
        podsumowanieLudzie();
        superpozycja();
    }

    public void relacjeWarunkowLudzi() {
        M.W(W.OSOBA, "--->", of(W.SRODOWISKO, W._II_, W.RODZINA)).W_PRZECIWNYM_PRZYPADKU(W.SAMOTNOSC);

        M.W(M.WIECEJ(W.LAT), "--->", M.WIECEJ(W.CIERPIENIE));

        M.W(M.DLUGOTRWALE(of(DBW.CIERPIENIA_WARUNKI(), W.PRZYMUS, W.ULICA)), "--->", M.OSOBA(W.SILNA_JEDNOSTKA));

        M.W(M.OSOBA(W.WIECZNY_IMIGRANT), "--->", of(M.NAJWIEKSZA(W.WIEDZA), M.NAJWIECEJ(W.DOSWIADCZENIE), M.OSOBY(M.WYKLUCZA(W.WIECZNY_IMIGRANT))));

        M.W(M.OSOBA(W.CECHY), "--->", M.MOZLIWOSC((M.DOKONANIE(W.CZYNU))));

        M.W(M.OSOBA(W.ZLE_W_ZYCIU), "--->", of(W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH, W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI,
                                                            W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC));

        M.WW(M.OSOBA(W.SLABY), "--->", M.SPOTKANY(W.PROBLEM), "--->", M.OSOBA(of(W.UCIECZKA, W.PODDANIE)));
        M.WW(M.OSOBA(W.SILNY), "--->", M.SPOTKANY(W.PROBLEM), "--->", M.OSOBA(of(M.PROBA_ROZWIAZANIA(W.PROBLEM), M.PRACA(W.PROBLEM))));

        // WADY WYCHOWANIE
        M.W(of(W.ZLE_WYCHOWANIE, W._II_, W.WYCHOWANIE_POD_KLOSZEM, W._II_, W.ROZPASANIE_ROZPIESZCZANIE, W._II_, W.SLABI_RODZICE),
                "--->", of(W.BRAK_CIERPIENIA, W.BRAK_PRACY, W.ZAZDROSC, W.BRAK_POZNANIA_NAUKI, W.BRAK_SPORTU, W.CHEC_BEZPIECZENSTWA));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA), "--->", of(W.EMOCJE_FIRST, W.WRAZLIWOSC, W.DZIECKO, W.ZMIENNOSC));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA, W.BRAK_DOBREGO_WYCHOWANIA),
                "--->", of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI));

        M.W(of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI),
                "--->", of(W.DZIWNA_PASJA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY));

        M.W(of(W.CHEC_BEZPIECZENSTWA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY),
                "--->", of(W.SRODOWISKO_WZAJEMNEGO_WSPARCIA, W.HIERARCHIA_FIRST));

        M.W(of(W.ZAZDROSC, W.WRAZLIWOSC, W.NIEPOSLUSZONSC_B, W.SILNIEJSZY_B), "--->", of(W.WYKLUCZA, W.WYLACZY_DOSTEP));

        // ****

        M.W(of(W.POZNANIE_WARTOSCI_PIENIADZA, W.FAZA_Z_NAUKI, W.FART, W.DZIWNA_PASJA), "--->", of(W.DOBRY_ZAWOD));

        M.W(of(W.ZNAJOMI_PRZESTEPCY, W.CHECI), "--->", of(W.ZLODZIEJKA));

        M.W(of(W.ZLODZIEJKA, W.PRACA), "--->", of(W.POZNANIE_WARTOSCI_PIENIADZA));

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

    }

    public void osobaSrodki() {
        M.W(M.OSOBA(W.FEST), "--->", of(W.SRODOWISKO_WZAJEMNEGO_WSPARCIA, W.WSPARCIE, W.ZNAJOMOSC_FESTOW, W.WYKLUCZENIE,
                                            W.ZLAMANIE_STANDARDU, W.OSZUKANIE_WYKORZYSTANIE, W.OBGADAC));

        M.W(M.SRODKI_PRZECIW(W.FEST), "--->", of(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI(), W.OTWARTE_STARCIE, W.ZNAJOMOSC_RDZENNYCH, W.SILA));

        M.W(M.OSOBA(W.SLABY), "--->", of(W.SRODOWISKO_WZAJEMNEGO_WSPARCIA, W.WSPARCIE, W.ZNAJOMOSC_SLABYCH, DBW.KRZYWDY_POSREDNIE_WARUNKI()));

        M.W(M.SRODKI_PRZECIW(W.SLABY), "--->", of(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI(), W.OTWARTE_STARCIE, W.SILA, W.ZNAJOMOSC_RDZENNYCH, W.ROZWALENIE_KOLKA_ADORACJI));

        M.W(M.OSOBA(W.RDZENNY), "--->", of(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI(), W.WALKA_SPRZET, W.ZNAJOMOSC_RDZENNYCH, W.NIEBOI_SIE_WYROKU));

        M.W(M.SRODKI_PRZECIW(W.RDZENNY), "--->", of(W.CZOLO, W.KAMIKADZE, M.SILNIEJSZA(W.EKIPA), W.BRAK_SENSU_DZIALANIA));

        M.W(M.OSOBA(W.POSIADACZ), "--->", of(W.USTALA_ZASADY, W.ODCIECIE_DOSTEPU_WARTOSC));

        M.W(M.SRODKI_PRZECIW(W.POSIADACZ), "--->", of(W.ZNISZCZ_WARTOSC, W.ROB_STARTE, W.ZABURZ_SPOKOJ));
    }



    public void standardoweZleZachowanie() {
        M.UKRYCIE(of(W.ZLO, W.WADY));

        M.aktywujEmocje();
        M.wezNajwiecejDlaSiebie();
        M.W(of(W.NIEZNAJOMY), "--->", DBW.KRZYWDY_POSREDNIE_WARUNKI());

        M.W(of(W.NIEZNAJOMY, W._88_, DBW.PRZEWAGI_CHWILI_WARUNKI()), "--->", DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI());

        M.W(W.ZNAJOMY, "--->", M.WYKORZYSTANIE(W.ZNAJOMY));
    }

    public void standardoweSkutkiWarunkow() {
        M.W((W.STANDARDOWO),
                of(
                        W.TEMPOTA,
                        W.GLUPOTA,
                        M.KOBIETA(W.NIEODPOWIADA),
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
                        M.KOBIETA(W.MARZY_OBCOKRAJOWIEC)
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
                        M.CALY_CZAS(W.POSLUSZNY)
                )
        );
        M.W(W.RDZENNY_DOBRY,
                of(
                        M.pobierzPatologie(),
                        M.wyklucz(of(W.MIESZANIEC, W.FEST)), M.utrudniaj(of(W.MIESZANIEC, W.FEST)),
                        M.wezPrzewage(), M.pracuj(W.PRZEWAGA),
                        M.przemoc(W.OBRONA),
                        M.CALY_CZAS(of(W.ANTY_POSLUSZNOSC, W.ANTY_PUSTKA, W.ANTY_NUDA))
                )
        );
        M.W(W.ZLY,
                of(
                        M.pobierzHierarchie(),
                        M.dzialajDlaZla(), M.tworzPatologie(),
                        M.walZPrzewaga(W.NIEDZIALAJACY),
                        M.przemoc(W.DOMINACJA),
                        M.CALY_CZAS(W.DOMINACJA)
                )
        );
        M.W(W.AGRESOR,
                of(
                        M.ZWYKLE(W.AGRESJA),
                        M.zaczepSprowokuj(osoba),
                        M.wrocZPrzewaga(),
                        M.walZPrzewaga(osoba, W.PRZEWAGA),
                        M.rozpowiedz(W.WSZYSCY),
                        M.CALY_CZAS(W.DOMINACJA)
                )
        );
    }


    public void fest() {
        W festWarunki = DBW.FEST_WARUNKI();
        List<W> festKoncoweWarunki = of(W.PODROZE, W.WYGODY, W.PRZEKAZANIE_ZLEGO_GENU, W.NABICIE_KABZY_KAPITALISCIE);

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
        M.wprowadzWNajgorszeWarunki();
        M.zajmijPozycjeIWarunki();
    }

    public void dzialajacy() {
        M.W((W.DZIALAJACY),
                of(
                        M.ZWYKLE(W.ZEROWY_DOSTEP),
                        M.ZWYKLE(dzialacz.caly_czas(W.NORMALNOSC)),

                        M.WARUNKI_WSTEPNE(of(
                                dzialacz.akceptacjaBieganiaSprzet(),
                                dzialacz.akceptacjaCpania(),
                                dzialacz.akceptacjaHierarchii(),
                                dzialacz.SET(of(W.AGRESJA, W.CHETNY_DZIALANIA, W.BRAK_PIENIEDZY, W.POSLUSZNY, W.OGRANICZONE_INFORMACJE, W.NUDA))
                        )),

                        M.WARUNKI_UTRZYMANIA(of(
                                dzialacz.caly_czas(M.znoszenieGnojenia()),
                                dzialacz.caly_czas(M.tworzEmocje()),
                                dzialacz.caly_czas(M.robKrzywde(DBW.KRZYWDY_WARUNKI())),
                                dzialacz.caly_czas(M.dajZarobekGrubasowi()),
                                dzialacz.caly_czas(M.ochronaGrubasa()),
                                dzialacz.caly_czas(M.wykonujeRozkazy(W.GORA)),
                                dzialacz.caly_czas(M.uznajeHierarchie()),
                                dzialacz.caly_czas(M.zdobywanieHierarchii(M.CZESTO(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(), M.OPCJA(DBW.OSLONY_WARUNKI())))
                        )),
                        dzialacz.caly_czas(M.DOSTEP(of(W.INFORMACJE, W.KONTAKT_TEL, W.OBECNOSC))),
                        dzialacz.SET(W.NIE_ZATRZYMA_SIE),
                        dzialacz.SET(of(W.WYKRECENIE, W.WADY_FIZYCZNE, W.WADY_UMYSLOWE, W.OGRANICZENIE_WOLNOSCI_ULICA, W.KROTKOWZROCZNOSC_CZYNOW)),
                        dzialacz.SET(DBW.KRZYWDY_WARUNKI()),
                        dzialacz.SET(M.OPCJA(DBW.OSLONY_WARUNKI())),
                        dzialacz.SET(DBW.CECHY_RDZENNY_WARUNKI()),
                        dzialacz.SET(DBP.PATOLOGIE_OSIEDLE()),
                        dzialacz.SET(DBW.TEMATY_RDZENNYCH_WARUNKI()),
                        dzialacz.SET(DBW.WADY_ZLYCH_WARUNKI()),
                        dzialacz.policja(W.BRAK_DOSTEPU),

                        dzialacz.caly_czas(M.rozkminianie(wszyscy)),

                        M.W(W.INFORMACJA, "--->", dzialacz.notyfikacjaEkipa()),
                        M.WW(W.INFORMACJA, "--->", of(dzialacz.notyfikacja(W.GORA),
                                                            czolowkaUlica.decyzja(W.ROZKAZ)), "--->", dzialacz.wykonuje(W.ROZKAZ)),

                        M.W(dzialacz.otrzymujePrzewagiZDzialania(), "--->", dzialacz.lubiDzialanie()),

                        dzialacz.WYBOR(of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                                M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)))),

                        dzialacz.ULTIMATUM(dzialacz, W.SPRZET),

                        srodowisko.caly_czas(M.wsparcie(of(W.DZIALANIE_DLA_ZLA, W.SLEPE_DZIALANIE, W.KROTKOWZROCZNOSC_CZYNOW))),
                        srodowisko.caly_czas(M.wsparcie(dzialacz)),

                        srodowisko.caly_czas(M.wplyw(dzialacz)),
                        dzialacz.caly_czas(M.wplyw(srodowisko)),

                        srodowisko.caly_czas(M.wzajemneOddzialywanie(srodowisko)),
                        srodowisko.caly_czas(M.KONTROLA(dzialacz)),

                        srodowisko.caly_czas(M.moda()),
                        srodowisko.caly_czas(M.komfort()),
                        srodowisko.caly_czas(M.oczekiwania(W.AGRESJA_W_DZIALANIU, dzialacz)),
                        srodowisko.caly_czas(M.zagluszaSumienie(dzialacz)),

                        srodowisko.caly_czas(M.postawCiezkieWarunki(M.SRODOWISKO(W.PRZECIWNA_STRONA),
                                of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(), DBW.OSLONY_WARUNKI(), DBW.PRZEWAGI_Z_ULICY_WARUNKI()))),

                        srodowisko.ULTIMATUM(dzialacz).W_PRZECIWNYM_PRZYPADKU(of(DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI())),
                        srodowisko.OCZEKIWANIE_POPRAWY(dzialacz).W_PRZECIWNYM_PRZYPADKU(of(
                                srodowisko.ZAMKNIECIE(dzialacz), srodowisko.WYKLUCZ(dzialacz),
                                srodowisko.ROBI_KRZYWDE_Z_PRZEWAGA(dzialacz, DBW.KRZYWDY_WARUNKI())
                        )),

                        M.W(srodowisko.CZESTO(M.WZAJEMNE_RANY(DBW.ZBIOR_RANY())), "--->", srodowisko.TOLERANCJA(DBW.KRZYWDY_WARUNKI())),
                        srodowisko.DOPOKI(dzialacz.caly_czas(of(W.SLUCHAJA, W.OBECNOSC_LUDZI, M.wykonujeRozkazy(W.GORA), M.KRZYWDY(osobyPozaSrodowisko, DBW.KRZYWDY_WARUNKI())))),

                        M.W(M.INFORMACJA(W.WROG), "--->", dzialajcyBliskoMiejsca.KAZDY(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI())),

                        dzialacz.siejZlo(), M.w_przeciwnym_przypadku(W.POJECHANE, 0),
                        dzialacz.uzaleznijSieOdSrd(),
                        dzialacz.dzialanieWsrodDzialaczy(),
                        dzialacz.zdobadzInformacjeZeSrodowiskaNaKurestwie(),

                        dzialacz.DOPOKI(of(W.DOSTEP, W.OSOBA_POZA_SRODOWISKO)),
                        dzialacz.zamknijZasob(),
                        dzialacz.ukryjDostep(),
                        dzialacz.wbijNaMuke(),
                        dzialacz.wyklucz(),
                        dzialacz.skazNaIzolacje(),
                        dzialacz.naklejNalepke(),
                        dzialacz.uniz(),
                        dzialacz.cisnij(),
                        dzialacz.notyfikacjaEkipa(),
                        dzialacz.ROBI_KRZYWDE_Z_PRZEWAGA(osobyPozaSrodowisko, DBW.KRZYWDY_WARUNKI()),

                        M.W(osobyPozaSrodowisko.nieposlusznosc(), "--->", M.WYBOR(of(dzialacz.walkaPiesci(), dzialacz.sprzet()))),

                        dzialacz.patrzJakCierpi(),
                        dzialacz.cieszSieJegoCierpieniem(),
                        dzialacz.baluj(),
                        dzialacz.siejZlo(),

                        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", of(W.MIEJSCE_STALE, W.ZLY, W.PRZEKONYWANIE_PRZECIW), "--->", M.OSOBA(W.ZLO))
                )
        )));

        List<W> dzialajcyZycie = of(
                M.DOPOKI(W.DZIALA),
                W.PRZYJEMNOSCI,
                W.PRZEWAGA,
                W.PRZEWAGA_ZE_ZLA_OD_ROBIENIA_ZLA
        );

        List<W> dzialajcyPrzewagi = of(W.KLUB, W.MLODE_KOBIETY, W.SRODOWISKO, W.ZNAJOMI, W.EMOCJE, W.PRACA_PO_ZNAJOMOSCI);

        List<W> dzialajcySlabosci = of(W.BRAK_ZDROWIA, W.BRAK_SUMIENIA);


        M.W(of(W.DZIALAJACY, W._88_, W.BLISKOSC), "--->", W.NASTAWIENIE_AGRESJA);
    }

    public void czlowiekCierpienia() {
        M.W(M.DLUGO(M.CIEZKO(of(W.CIERPIENIE, W.BOL))), "--->", M.WZIECIE_SPRAWIEDLIWOSCI(of(W.SILA, W.MADROSC, W.DOSWIADCZENIA)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).W_PRZECIWNYM_PRZYPADKU(W.DZWONIENIE_NA_POLICJE));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));
    }

    public void sprawiedliwy() {
        W sprawiedliwy = DBW.STARTOWE_WARUNKI();
    }

    public void postawyLudzkie() {
        M.ZWYKLE(of(M.UKRYCIE(W.WADY), M.POKAZ(W.FALSZYWE_WRAZENIE), M.SKUPIENIE(W.PRZYJEMNOSCI)));

        M.ZLE(of(M.UKRYCIE(W.SLABOSC), M.POKAZ(W.SILA), M.SKUPIENIE(of(W.PRZEWAGA, DBW.KRZYWDY_WARUNKI()))));

        M.DOBRE(of(M.PRACA_NAD(W.WADY), M.POKAZ(W.PRAWDA), M.SKUPIENIE(of(W.CEL, W.BYCIE_LEPSZYM))));
    }

    public void walkaKlasSpolecznych() {
        M.W(of(W.FEST, W.BLISKOSC, W.RDZENNY), "--->", of(M.OSOBA(W.FEST).ROBI_KRZYWDE(of(M.OSOBA(W.RDZENNY), DBW.KRZYWDY_WARUNKI())),
                                                                M.OSOBA(W.RDZENNY).ROBI_KRZYWDE(of(M.OSOBA(W.FEST), DBW.KRZYWDY_WARUNKI()))));

        M.W(of(W.SUPERPOZYCJA, W.BLISKOSC, W.RDZENNY), "--->", of(M.OSOBA(W.SUPERPOZYCJA).
                                                                        ROBI_KRZYWDE_Z_PRZEWAGA(of(M.OSOBA(W.RDZENNY), DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI()))));

        M.W(of(W.BIEGAJACY_SPRZET, W.BLISKOSC, W.RDZENNY), "--->", of(M.OSOBA(W.BIEGAJACY_SPRZET).ROBI_KRZYWDE_Z_PRZEWAGA(of(M.OSOBA(W.RDZENNY) , DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI()))));

        M.W(of(W.BOGATY, W.BLISKOSC, W.BIEDNY), "--->", of(M.OSOBA(W.BOGATY).ROBI_KRZYWDE_Z_PRZEWAGA(of(M.OSOBA(W.BIEDNY), DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI()))));
    }

    public void osobaCechyMozliweDzialania() {
        // todo
    }

    public void osobaPrzewag() {
        M.W(M.OSOBA_Z(DBW.PRZEWAGI_WARUNKI()), "--->", of(M.SLABY(W.PODLIZYWANIE_SIE), M.SILNY(W.WSPARCIE)));

        M.W(M.OSOBA(M.BRAK(W.PRZEWAGA)), "--->", of(M.SLABY(DBW.KRZYWDY_WARUNKI()), M.SILNY(M.SONDA_GLEBOKA(izolowanaOsoba))));

        M.W(M.DOPOKI(of(DBW.PRZEWAGI_WARUNKI(), W.KOMFORT, W.OBECNOSC_LUDZI)), "--->", W.BAWIMY_SIE);

        M.W(M.GDY(M.BRAK(W.PRZEWAGA)), "--->", of(W.SMUTEK, W.MYSLENIE, W.WNIOSKI));

        M.WW(W.OSOBA, "--->", M.OSOBY_Z_PRZEWAGAMI(M.SONDA(M.OSOBA(DBW.PRZEWAGI_WARUNKI()))), "--->", of(M.W(W.DUZA_PRZEWAGA, "--->", of(M.SRODOWISKO(M.AKCEPTACJA(W.OSOBA)),
                                                                                                                                             M.SRODOWISKO(M.WSPARCIE(W.OSOBA)))),

                                                                                                        M.W(W.MALA_PRZEWAGA, "--->", of(M.SRODOWISKO(M.ODRZUCENIE(W.OSOBA)),
                                                                                                                                        M.SRODOWISKO(M.KRZYWDY(W.OSOBA))))));
        M.CALY_CZAS(M.OSOBY_Z_PRZEWAGAMI(M.PRZEBYWANIE(M.OSOBA(W.PRZEWAGA))));

        M.CALY_CZAS(M.OSOBY_BEZ_PRZEWAG(M.PRZEBYWANIE(M.OSOBA(W.BRAK_PRZEWAG))));

        M.W(M.OSOBA(of(W.SLABY, W.CHWIEJNY)), "--->", M.ZWYKLE(W.IDZIE_ZA_PRZEWAGA));
    }

    public void wyrok() {
        M.W(M.WYROK_POWYZEJ_LAT(3), "--->", of(M.DLUGOTRWALE(DBW.CIERPIENIA_WARUNKI()), M.MOZLIWOSC(of(W.SZCZEGOLNIE_NIEBEZPIECZNY, W.KAMIKADZE,
                                                                                                    W.WIEDZA_LUDZIE_CHARAKTER, W.PSYCHIKA_ZRYTA))));
    }

    public void podsumowanieLudzie() {
        M.W(W.DOBRY, "--->", of(M.wykorzystujeOkazjeDobro(), M.dobro()));
        M.W(W.ZLY, "--->", of(M.stwarzaOkazjeZlo(), M.zlo()));

        M.W(W.FEST, "--->", of(M.budzaceEmocjeWow(), M.oszukiwanieOstatnichKolegow()));
        M.W(W.WIESNIAK, "--->", of(M.bezpieczneBezSensu(), M.strefaKomfortu(), M.cisnieIleMozna()));
        M.W(W.BURZUA, "--->", of(M.impreza(), M.melanz(), M.zwiazki(), M.znajomi(), M.przyjemnosci()));
        M.W(W.OSIEDLOWY_SLABY, "--->", of(M.nieudolneDzialanie(), M.wszystkoSlabo(), M.strefaKomfortu()));
        M.W(W.BIEGAJACY_SPRZET, "--->", of(M.wjazd(), M.cpanie(), M.mecz(), M.siedzenieOsiedle()));
        M.W(W.OSIEDLOWY_MOCNY, "--->", of(M.dobreDzialanie(), M.wszystkoDobrze(), M.pozaStrefaKomfortu()));
        M.W(W.GRUBAS_Z_PRZEWAGA, "--->", of(M.rozkazyNizszym(), M.bawiSie()));
        M.W(W.PRACOWNIK_KORPORACJI, "--->", of(M.praca(), M.podroze(), M.dom()));
        M.W(W.PYSZNY_POSIADACZ, "--->", of(M.odbierzWartosc(), M.dzialaWedleWidzimisie()));
        M.W(W.MANAGER, "--->", of(M.wykorzystajZasob(), M.ukryjDostep()));
    }

    public void superpozycja(){
        if (W.MIEJSCE == W.MIEJSCE_PRZESTRZEGANIA_PRAWA) {
            wysokaPozycja.SET(W.SILA_SPRAWCZA);
        } else {
            silaFizyczna.SET(W.SILA_SPRAWCZA);
        }

        M.W(of(W.SUPERPOZYCJA),
                of(
                        M.niszczZPerspektywyPozycji(),
                        M.twojeZdanieWazniejsze(),
                        M.tyKogosPodkopujOnCiebieNieMoze(),
                        M.ukryjOklam(),
                        M.wykorzystaj(),
                        M.wonty(),
                        M.brakPochwaly()
                )
        );

        M.WARUNKI_WSTEPNE(of(W.POSLUSZNY, W.UZNAJE_HIERARCHIE));
        pracownicy.caly_czas(M.poparcie(W.SUPERPOZYCJA));

        superPozycjaOsoby.caly_czas(M.gnojenieZPerspektywyPozycji(pracownicy));
        pracownicy.caly_czas(M.gnojenie(pracownicy));

        superPozycjaOsoby.naginaniePrawa();
        W prawo = superPozycjaOsoby.pisaniePrawa();

        wszyscy.caly_czas(M.przestrzeganie(prawo)
                .w_przeciwnym_przypadku(W.KONSEKWENCJE));

        M.of(prawo).szkodzi(wszyscy);

        superPozycjaOsoby.SET(of(
                W.ODDANIE_SIE_ZA_PIENIADZE, W.BRAK_WSTEPU_RDZENNI, W.LECZY_KOMPLEKSY_W_PRACY,
                W.TWARDOGLOWOSC, W.POCZUCIE_SUKCESU, W.PIENIADZE
        ));

        superPozycjaOsoby.SET(of(
                W.DUZO_OBOWIAZKOW, W.MALO_CZASU, W.NIE_PAMIETA_SWOICH_OFIAR, W.OCZEKIWANIA
        ));

        M.W(of(W.SLEPA_LOJALNOSC, W.UZNAJE_HIERARCHIE, W.DUZO_UMIEJETNOSCI, W.MIEJSCE), "--->", of(W.SUPERPOZYCJA));

        M.W(of(W.BRAK_SUPERPOZYCJI), "--->", of(W.NIEWOLNIK, W.TWOJE_ZDANIE_NIC_NIE_ZNACZY));

        M.W(W.WYSOKA_POZYCJA, "--->", M.ZWYKLE(M.BRAK_DOSTEPU(W.SWIAT), M.DOSTEP(W.FIRMA), M.SILA_SPRAWCZA(W.FIRMA)));
    }
}

package watek;

import db.DBP;
import db.DBW;
import metoda.M;
import warunek.W;
import z_inne.OH;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static typy_bazowe.TypOsoby.ME;

/**
 * Created by gadzik on 04.01.20.
 */
public class Watek_ULICA extends AbstractWatek {
    W wazne = M.WAZNE(of(W.OBECNOSC, W.HIERARCHIA_ULICA, W.KIBICOWANIE, W.KRYMINAL, M.ILE_ZROBIL(W.EKIPA), DBW.ZASADY_WARUNKI(), DBW.PRZEWAGI_WARUNKI(), DBW.WALKA_WARUNKI()));

    W krzywdy = M.MOCNO(DBW.KRZYWDY_WARUNKI());
    W brakZasad = M.MOCNO(DBW.BRAK_ZASAD_WARUNKI());
    W oslony = M.MOCNO(DBW.OSLONY_WARUNKI());
    W przewagiUlica = M.MOCNO(DBW.PRZEWAGI_Z_ULICY_WARUNKI());

    List<W> dazenia = of(W.STARCIE, W.DOMINACJA, W.ZWIAZKI, M.TLO(W.DOSTEP));

    W ciaglaCzynnoscUlica = M.CALY_CZAS(M.WYBOR(of(W.IDZIESZ, W.STOISZ_BRAMA, W.STOISZ_MIEJSCE_STALE, W.JEDZIESZ_TRAUTO)));

    List<W> podstawa = of(M.OGRANICZENIE_CZASOWE(of(W.DNI, W.TYGODNIE, W.LATA)), W.OBECNOSC, W.DOSTEP, W.SONDA, W.STARCIE,
                          W.WALKA_Z_FESTAMI, W.WALKA_Z_SYSTEMEM, W.WALKA_Z_WYGODNYMI, W.WALKA_Z_KONFIDENTAMI);

    Integer atrakcyjnosc = c(M.SILNE(W.DOBRO), ">", M.OBECNOSC(W.ULICA), ">", W.ZLODZIEJKA, ">", W.KIBICOWANIE, ">", on(W.DILL, W.DZIALANIE_DLA_ZLA));

    List<W> prawaUlicy = of(W.DOMINACJA, W.GLUPIEGO_CZEKA_KARA, W.PRZEWAGA, W.DOSTEP, W.HIERARCHIA, W.JEDNOSC_PRZECIW_ZAZDROSCI);

    List<W> popytPodazUlica = of(
            M.DOJRZEWA_W_CIERPIENIU(W.SILNA_JEDNOSTKA), M.LOKALNE_SRODOWISKO(M.NAJWIECEJ(W.EMOCJE)),
            M.WYROBIENIE_CHARAKTERU(M.WYMAGA(M.DUZO(M.DOSWIADCZENIA(of(W.ULICA, W.CIERPIENIE, W.WALKA))))),
            M.DLUGO(M.CIEZKO(M.PRACUJE(M.MALO_OSOB(M.POSIADA(W.WARTOSC))))),

            M.PODZIELONA(M.TEMPA(M.STARA(M.AGRESYWNA(W.CZOLOWKA_EKIPY)))), M.KAZDY_W_EKIPIE(M.CZEKA_NA(W.SZANSA_OD_LOSU)),
            M.ZLODZIEJE(1, W.PROCENT), M.CZOLOWKA(5, W.PROCENT), M.KIBICE(10, W.PROCENT), M.MLODZI(30, W.PROCENT),
            W.POPYT, W.PODAZ,
            W.BRAK_CZASU, W.ODBIJANIE_OD_EKIP, W.UZYWKI, M.OSZUKIWANIE(W.SWOI));

    W warunekiWejsciowe = M.CALY_CZAS(of(W.PUSTKA, W.MALO_OSOB, W._1_OSOBA_DUZO, W.ZLE_W_ZYCIU, W.ZLO_NA_WEJSCIU,
            W._100PROCENT_WYSILKU_10PROCENT_OTRZYMUJESZ, W.CALE_ZYCIE_CIERPIENIE,

            W.STARZEJESZ_SIE, W.MIESZKANIE_300TYS_WYPLATA_3TYS,
            W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, M.MALA_SZANSA(W.ZDOBYCIE_PRACY_NEUTRALNY_RZUT),
            W.LUDZIE_CHCA_TWOJEJ_KRZYWDY, W.KTOS_CIEBIE_LUB_TY_JEGO, W.WIEKSZOSC_DZIALA_DLA_ZLA,
            W.PRZEWAGA_ZROBIONA_NA_KRZYWDZIE_LUB_BRAKU_ZASAD, W.SLABSZA_PRZEWAGA_ULEGA_MOCNIEJSZEJ_W_MOMENCIE_PRZY_WARUNKACH,
            W.BIJESZ_KTOS_MOZE_ODDAC_MOCNIEJ,
            W.CHETNOSC_ZERO, M.DZIALAJACE(W.KOBIETY), M.MALA_SZANSA(W.PODERWANIE_KOBIETY_NEUTRALNY_RZUT), DBP.PATOLOGIE_WSTEPNE_KOBIETA()
    ));

    List<W> szansaNaWarunek = of(W.OBECNOSC, W.STANDARDOWE_ZACHOWANIE, W.STANDARDOWE_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNE_ULATWIENIE, W.PRZEKONYWANIE, W.ULTIMATUM);

    List<W> warunek = of(W.ULTIMATUM, W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC, W.SILA, W.PRIORYTET);

    W typyLudzi = DBW.TYPY_LUDZI_KROTKO_WARUNKI();
    W zarobekNielegalny = DBW.ZAROBEK_NIELEGALNY_WARUNKI();


    public void run(){
        M.W(of(W.SILNA_JEDNOSTKA, W._88_, W.DZIALANIE_W_EKIPIE), "--->", M.DOSTEP(of(W.CZOLO, W.OGARNIECI)));

        M.W(M.BRAK(M.DOSTEP(of(W.CZOLO, W.OGARNIECI))), "--->", M.ZWYKLE(W.MOCNI_NIE_LICZACY_SIE, W.NORMALNY, M.MLODE(M.CHETNE(W.PIONKI)),
                                                                                            W.FEST, W.ROZPIESZCZONY_BANAN, W.SYSTEMOWIEC, W.WYGODNY));

        M.W(of(W.MOCNY_WZROK), "--->", of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY));
        M.W(of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY), "--->", of(W.KREGOSLUP_MORALNY, W.ZDOLNOSC_DO_WYSILKU, W.ZDOLNY_DO_WALKI, W.WNIOSKI, W.PODSWIADOMOSC, W.WIEDZA_SPORT));
        M.W(of(W.CIERPIENIE, W._88_, W.Z_MIASTA, W._88_, W.DOSTEP_DO_PLANSZY), "--->", of(W.ZDOLNY_WALKA_SPRZET, W.ZDOLNY_DO_RYZYKA, W.WIEDZA_ULICA, W.DOBRA_JEDNOSTKA));

        M.W(W.SILNA_JEDNOSTKA, "--->", of(W.ZOBOWIAZANIA, W.OCZEKIWANIA, W.WYMAGANIA, W.OBECNOSC, W.CEL, W.ZDOLNY_DO_WALKI, W.ZDOLNY_DO_RYZYKA));

        M.W(M.BRAK(W.DZIALANIE_W_EKIPIE), "--->", M.CALY_CZAS(W.PUSTKA));

        M.W(M.SRODOWISKO(W.KONTAKT_TEL), "--->", M.CALY_CZAS(W.BLISKOSC_ULICA));

        M.W(of(W.OBECNOSC, W.ZASADY, W.PRACA), "--->",of(W.SRODOWISKO, W.HIERARCHIA, W.RYWALIZACJA));

        M.W(W.RDZENNI, "--->", M.RDZENNY(M.NAWYK(W.WYCHODZENIE_NA_ULICE)));

        tworzaceJakosc();
        wychodzisz();
        najkrotszaSonda();
        sonda();
        starcie();
        ulicaRelacjeWarunkow();
        wokolDzialaczaSrodowiska();
        algorytmUlicy();
        kibicowanieKrotkieUjecie();
        tworzenieWarunkow();
        krajobrazUlicy();
        przeplywInformacji();
        hierarchiaOsiedle();
        agresja();
        dzialanieKrotko();
        przewagi();
        ANTY_60_sledztwoPolicyjne();
        przejecieMiejsceStale();
        terytoriumWroga();
        sprzet();
        zwyklaOsobaZOsiedla();
        tchorzSchemat();
        ochrona();
        nuda();
        nieZnam();
        srodki();
        gadka();
        poWejsciuDoCzlowki();
    }

    public void tworzaceJakosc() {
        M.W(W.SILNY, "--->", M.CZESTO(W.WYCHODZISZ));

        M.W(DBW.DUZO_SIE_DZIEJE_ULICA_WARUNKI(), "--->",of(M.DLUGO(W.OBECNOSC),
                                                                M.ESTYMACJA(W.CZAS),
                                                M.OPCJA(of(W.CEL, W.MIEJSCE_STALE, M.MIEJSCE_STALE(W.UJSCIE), W.Z_KIMS))));

        M.W(W.KONDYCJA, "--->",of(M.DUZO(of(W.INFORMACJA, W.WNIOSKI)),
                                    M.OD_RANA_DO_WIECZORA(M.OBECNOSC(W.ULICA))));

        M.W(of(W.BRAK_WSTYDU, W._88_, W.WYCHODZENIE_NA_ULICE), "--->", of(W.PROBA, W.WNIOSKI, W.WIEDZA));
    }

    public void wychodzisz() {
        M.W(W.WYCHODZISZ, "--->", of(M.CALY_CZAS(W.ZLO_KRAZY),
                ZLE_OSOBY.caly_czas(W.SZUKA_OFIAR_NA_ZROBIENIE_ZLA),
                ZLE_OSOBY.caly_czas(W.STWARZA_OKAZJE_ZROBIENIE_ZLA),
                M.ZWYKLE(of(DBW.KRZYWDY_WARUNKI(), DBW.OSLONY_WARUNKI())),
                M.CALY_CZAS(of(ciaglaCzynnoscUlica, W.ZASIEG_WZROKU, W.SCIEZKI, W.LUDZIE, W.WIDOCZNY_GDY_IDZIESZ))));

        List<W> warunkiWyjscia = of(
                M.NIEBOISZ_SIE(W.POMSZCZENIE), M.NIEBOISZ_SIE(W.NOTYFIKACJA_EKIPA), M.NIEBOISZ_SIE(W.ZDJECIA_TWARZOWKI),
                M.NIEBOISZ_SIE(W.OBRAZENIA_FIZYCZNE), M.NIEBOISZ_SIE(W.STARCIE_WIELU_NA_JEDNEGO),
                M.NIEBOISZ_SIE(M.MOZLIWOSC(W.SPRZET)),
                M.NIEBOISZ_SIE(of(W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI)),
                M.CALY_CZAS(M.PRZYGOTOWANY(W.DZIALANIE_POD_PRESJA)),
                M.PRIORYTET(W.WYCHODZENIE_U_SIEBIE), M.ORIENT(W.RZECZY_WARTOSCIOWE), M.DZIALANIE(W.RZECZY_WARTOSCIOWE));

        M.W(M.MIEJSCE_STALE(W.KIBICOWANIE), "--->", M.ZWYKLE(DBW.BRAK_ZASAD_WARUNKI()));
    }

    public void najkrotszaSonda(){
        M.W(of(W.MEZCZYZNA),
                of(
                        M.MOCNO(M.sonda(W.OCZY)),
                        M.sonda(W.ROZMIAR),
                        M.MOCNO(M.sonda(W.HASLO_RDZENNYCH)),
                        M.sonda(W.Z_KIM),
                        // ----------------------------------
                        M.sonda(W.SWIADOMOSC),
                        M.sonda(W.SILA_SPRAWCZA),
                        M.sonda(W.ZLO_DOBRO),
                        M.sonda(W.WIEK),
                        M.sonda(W.CZY_CWEL),
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
                        M.sonda(of(DBP.PATOLOGIE_WSTEPNE_KOBIETA(), DBP.PATOLOGIE_UTRZYMANIA_KOBIETA()))
                )
        );
    }

    public void sonda(){
        W sondaKrotka = DBW.SONDA_KROTKA_WARUNKI();
        W sondaGdy = DBW.SONDA_GDY_WARUNKI();
        W sondaPo = DBW.SONDA_PO_WARUNKI();
        W kogo = DBW.SONDA_KOGO_WARUNKI();
        W przyczyny = DBW.SONDA_PRZYCZYN_WARUNKI();
        W wymagaKary = DBW.SONDA_WYMAGA_KARY_WARUNKI();
        W sondaDzialacza = DBW.SONDA_DZIALACZA_WARUNKI();
        W kryteriaWroga = DBW.KRYTERIA_WROGA_WARUNKI();
        W oceniaWedlug = DBW.OCENIA_WEDLUG_WARUNKI();
        W reakcje = DBW.REAKCJE_WARUNKI();

        M.WWW(W.INFORMACJA, "--->", W.SONDA, "--->", M.NASTAWIENIE(DBW.NASTAWIENIA_WARUNKI()), "--->", W.DZIALANIE);

        M.W(of(W.SONDA_ZASOBU), "--->", M.SONDA(of(W.WARTOSC, W.TRUDNOSC_UTRZYMANIA, W.KTO_POSIADA, W.KTO_ZYSKUJE, W.KTO_TRACI)));

        M.W(of(W.SONDA_DZIALANIA), "--->", M.SONDA(of(W.WARTOSC, W.BEZPIECZENSTWO, W.KONSEKWENCJE, W.CZESTOTLIWOSC, W.EFEKTYWNOSC)));

        M.W(M.MIEJSCE_STALE(DBW.WZGL_IZOLACJA_WARUNKI()), "--->", M.SONDA_GLEBOKA(izolowanaOsoba));

        M.W(W.CZYN, "--->", M.SONDA(of(M.jakie(W.WARUNKI_POCZATKOWE),
                                            M.jakie(W.PRZYCZYNY),
                                            M.jakDuze(W.PRZECIWNOSCI),
                                            M.jakDuze(W.ULATWIENIA),
                                            M.ile(W.CZAS),
                                            M.jakDuze(W.WARUNKI_OSIAGNIETE))));

        M.W(M.WIDZISZ(W.WARUNEK), "--->", M.SONDA(of(W.POCZATEK, W.KONIEC, W.SILA, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC)));

        M.W(M.OSOBA(W.MOWI), "--->", M.SONDA(DBW.SONDA_KROTKA_WARUNKI()));

        M.W(W.POKAZUJE_EMOCJE, "--->", W.SLABY);

        M.W(W.NIE_UMIE_KLAMAC, "--->", W.MALO_PRZEZYL);

        M.W(of(W.ZLY, W._88_, W.PATRZY), "--->", M.SONDA(W.ZROBIENIE_ZLA).CEL(of(DBW.KRZYWDY_WARUNKI(), M.OPCJA(DBW.BRAK_ZASAD_WARUNKI()))));

        M.WW(M.INFORMACJA(W.OSOBA), "--->", M.SONDA(W.HASLO_RDZENNYCH), "--->", of(M.OSOBA(W.OD_NAS), W._II_,
                                                                                                M.OSOBA(W.WROG), W._II_,
                                                                                                M.OSOBA(W.NIESTWARZA_ZAGROZENIA)));

        M.W(M.INFORMACJA(W.WROG), "--->", M.OSOBY(M.BLISKO(W.DZIALAJACY)).KAZDY(DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI()));

        M.WW(W.OSOBA, "--->", of(M.SONDA(DBW.SONDA_KROTKA_WARUNKI()),
                                    M.SONDA(DBW.PRZEWAGI_WARUNKI())), "--->", of(M.W(W.MOCNY, "--->", of(M.AKCEPTACJA(W.OSOBA), M.WSPARCIE(W.OSOBA))),
                                                                            M.W(W.SLABY, "--->", of(M.ODRZUCENIE(W.OSOBA), M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI()))))));
        M.W(W.WIDZISZ_BLAD, "--->", M.SONDA(DBW.BLEDY_WARUNKI()));

        M.W(M.OSOBA(W.SRODOWISKO), "--->", M.SONDA(DBW.SONDA_DZIALACZA_WARUNKI()));

        M.W(W.MEZCZYZNA_Z_KOBIETA, "--->", M.OSOBA(of(W.UMIE_BAJEROWAC, W.ZNAJOMI, W.SRODOWISKO)));

        M.W(M.POTRZEBA(W.WALKA_PIESCI), "--->", M.SONDA(DBW.SONDA_KOGO_WARUNKI()));


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

        M.W(W.BIEGAJACY_SPRZET, "--->", of(W.BRAK_PIENIEDZY, W.GLUPI, W.NUDA, W.ZLY, W.DOSTEP_OGRANICZONY));
    }

    public void starcie(){
        W dzialanie = M.NAJMNIEJSZY_CZAS(W.NAJWIEKSZA_KRZYWDA);
        W konfrontacja = DBW.KONFRONTACJA_WARUNKI();
        W ktoKogo = DBW.KRZYWDY_WARUNKI();
        List<W> rany = DBW.ZBIOR_RANY();
        List<W> srodki = srodki();
        W sytuacjeStarcie = DBW.SYTUACJE_STARCIE_WARUNKI();
        W sondaPrzypalu = DBW.SONDA_PRZYPALU_WARUNKI();
        W metodaStarcieReakcja = DBW.METODA_STARCIE_REAKCJA_WARUNKI();
        W ulicaPrzewagaReakcja = DBW.ULICA_PRZEWAGA_SPOSOB_WARUNKI();
        W obronaStarcie = DBW.OBRONA_STARCIE_WARUNKI();
        W zachowanieRezulat = DBW.ZACHOWANIE_REZULTAT_ULICA_WARUNKI();
        W wymuszenieReakcji = DBW.WYMUSZENIE_REAKCJI_WARUNKI();
        W przewagiDanejChwili = DBW.PRZEWAGI_CHWILI_WARUNKI();
        W zasiegPrzewagiUlica = DBW.ZASIEG_PRZEWAGI_ULICA_WARUNKI();

        M.STARCIE(M.PRZYCZYNY(of(W.EMOCJE, DBW.PRZEWAGI_MATERIALNE_WARUNKI(), W.DOMINACJA)));

        M.W(M.ZASIEG_WZROKU(W.OSOBA), "--->", of(M.SONDA(W.OSOBA), M.NABYCIE(W.BLISKOSC), DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI()));

        M.W(of(W.POMSZCZENIE, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI,
                W.OBRAZENIA_FIZYCZNE, W.STARCIE_WIELU_NA_JEDNEGO,
                W.SPRZET, W.WYJSCIE, W.STARCIE, W.NIESPRAWIEDLIWE_PRZEWAGI), "--->", M.PARALIZUJE(of(W.SLABY, W.NIESWIADOMY)));

        M.W(W.WALKA_PIESCI, "--->", M.ULTIMATIUM(W.BRONI_SIE)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);
        M.W(W.CISNIE, "--->", M.ULTIMATIUM(W.ODPOWIADA)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);
        M.W(W.STRATA, "--->", M.ULTIMATIUM(W.POMSZCZENIE)).W_PRZECIWNYM_PRZYPADKU(W.HANBA);

        M.WW(M.WIDZISZ(W.OSOBY), "--->", DBW.SYTUACJE_STARCIE_WARUNKI(), "---->", W.STARCIE, "---->", of(W.WYGRANA, W._II_, W.PRZEGRANA,
                                                                                                                M.OPCJA(DBW.STRATY_MATERIALNE_WARUNKI()),
                                                                                                                M.OPCJA(DBW.STRATY_MORALNE_WARUNKI())));
        M.W(W.STARCIE, "--->", of(M.WYGRANY(of(W.EMOCJE, W.DOMINACJA)), M.OPPONENT(W.STRACH),
                                       M.PRZEGRANY(of(W.STRACH, DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI(), M.OPCJA(W.CHEC_POMSZCZENIA)))));



        M.W(W.WIDZISZ, "--->", of(M.POBIERZ(DBW.NASTAWIENIA_WARUNKI()), M.SONDA_PRZYPALU(DBW.SONDA_PRZYPALU_WARUNKI()), M.PLAN(of(W.ODDALENIE_SIE, W.UKRYCIE_SIE)),
                                                                            M.PRZEWIDZENIE(W.DROGA),
                                                                            M.NABYCIE(W.BLISKOSC),
                                                                            M.ROBOTA(DBW.ZBIOR_RANY()),
                                                                            M.ODDALENIE_SIE(W.MIEJSCE),
                                                                            M.UKRYCIE()));

        M.W(M.OSOBA(DBW.KRYTERIA_WROGA_WARUNKI()), "--->", of(M.UTRUDNIAJ(M.OSOBA(W.ZYCIE)),
                                                             M.UTRUDNIAJ(M.OSOBA(W.DOSTEP)),
                                                             M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI()))));

        List<W> sprzety = of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                             M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)));

        M.W(of(W.KLOTNIA), "--->", of(M.powtarzajGlosnoSensowneArgumenty(),
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

        M.W(W.USMIECH_ZNIEWAZAJACY, "--->", M.ODRAZU(DBW.CISNIE_WARUNKI()));

        M.W(of(W.AKCJA), "--->",  of(M.pamiecOBolach(),
                                          M.widzisz(),
                                          M.liczysz(),
                                          M.kontrolaSiebieKrokZaKrokiem(),
                                          M.leciszZZaskoczenia()));

        M.W(M.UZYCIE(W.KOMINIARKA), "--->", M.zobligowanyDoDzialania());

        M.W(W.SILNY, "--->", of(M.czekajNaBlad(W.WIEDZA), M.odlaczDostep(W.BLAD)));

        M.W(W._1SPOJRZENIE, "--->", M.OSOBA(M.SONDA(W.ZNAJOMOSC)));

        M.W(W._2SPOJRZENIA, "--->", of(M.probaZdobyciaInformacji(), M.II(),   M.przygotowywanieStarcia()));

        M.W(of(W.STARZY_LUDZIE, W._II_, W.FESTY), "--->", M.MOZLIWOSC(W.DZWONIENIE_NA_POLICJE));

        M.W(of(W.BLISKOSC, W.CISNIECIE, W.WALKA_PIESCI, W.WALKA_SPRZET), "--->", of(dzialaczMocny.pomsci(),
                                                                                        dzialaczMocny.ultimatumEkipie()));

        M.W(M.POBITY(W.OSOBA), "--->", of(M.KOLEJKA_DO(M.POBICIE(W.OSOBA)), M.POINFORMUJ_WSZYSTKICH(W.HANBA), W.DLUG_MORALNY, W.CHEC_POMSZCZENIA,
                                                                    M.ZNAJOMY(M.PRZESTAJE(W.WSPARCIE)), M.ZNAJOMY(M.ZACZYNA(W.PRZECIW)), M.SILNIEJSZY(M.GNOJI(W.OSOBA)));

        M.WALKA_SILA(of(W.ZAGRANICZNI, W.WYGODNY));
        M.WALKA_WIEDZA(of(W.BIEGAJACY_SPRZET, W.NIECHCACY_WPUSCIC));
    }

    public void ulicaRelacjeWarunkow() {
        M.NIGDY_MALO(of(W.PIENIADZE, W.SEX, W.PRZYJEMNOSCI)); // MATERIALNE
        M.NIGDY_MALO(of(W.ZLO, W.DOBRO, W.NIENAWISC, W.MILOSC, W.AGRESJA_W_DZIALANIU, W.CIERPLIWOSC)); // MORALNE

        M.W(M.ZWYKLE(M.CALY_CZAS(W.WSZYSCY_CHCA_CIE_TWOJEJ_KRZYWDY)), "--->",of(M.W(W.HASLO_RDZENNYCH, "--->",  W.NEUTRALNOSC),
                                                                                 M.W(M.BRAK(W.HASLO_RDZENNYCH), "--->", DBW.KRZYWDY_WARUNKI())));

        M.WW(W.SONDA, "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);

        M.W(of(W.PIERWSZA_REAKCJA, W.REAKCJA_PO_SONDZIE, W.REAKCJA_PO_NARADZIE), "--->", of(W.REAKCJA));

        M.DUZY_WARUNEK(of(W.TRAUTO, W.KOBIETA, W.MIEJSCE_STALE, W.OSIEDLE, W.PRZEWAGA, W.SILA));

        M.W(M.CALY_CZAS(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)), "--->", M.CALY_CZAS(M.PRZEWAGA(W.CIAGLOSC_INFORMACJI)));

        M.W(W.SLABY, "--->", M.ZWYKLE(W.CEL_ATAKU));
        M.W(W.SILNY, "--->", M.ZWYKLE(M.CALY_CZAS(M.WYBOR_CELU(W.SLABSI))));

        M.RZECZYWISTOSC(M.ZWYKLE(of(M.MOCNO(DBW.PRZYCZYNY_ZLA_WARUNKI()), M.SLABO(DBW.PRZYCZYNY_DOBRA_WARUNKI()))));

        M.W(of(W.MILY_TEAMT, W.ZARTY, W.POCHWALA, W.WSPARCIE, W.DOBRE_EMOCJE,
                W.TEMAT_ZGODNY_Z_WARTOSCIAMI, W.TEMAT_ZGODNY_Z_EMOCJAMI, W.TEMAT_NIEPODWAZALNY), "--->", of(W.DOBRA_ROZMOWA));

        M.W(of(W.STANDARDOWA_REAKCJA_NA_ZLO), "--->", W.ZNIECZULICA);

        M.W(of(W.STANDARDOWA_REAKCJA_NA_DOBRO), "--->", M.ZNISZCZENIE(W.DOBRO));

        M.W(of(W.KOBIETA_W_ZWIAZKU), "--->", W.NAPEWNO_DAJE);

        M.W(of(W.ZLE_W_ZYCIU), "--->", of(W.ROBI_GORZEJ_INNYM,
                                            W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC,
                                            W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH));

        M.W(of(W.CIEKAWOSC_LUDZI, W.CIEKAWOSC_REAKCJI_EMOCJI_ZACHOWAN_SYTUACJI), "--->", of(W.ATRAKCYJNOSC_ULICY));

        M.W(of(W.MALO_CZASU, W.NIE_ODZYWA_SIE), "--->", of(W.BRAK_SONDY));

        M.W(of(W.DOSTRZEZENIE_OKAZJI, W.NASTAWIENIE), "--->", of(W.ZAMKNIECIE_SYTUACJI));

        M.W(of(W.BEZKARNOSC, W.EMOCJE_ZE_ZLA, W.PRZEWAGA, W.NARKOTYKI), "--->", of(W.ZACHETA_DO_ZLA));

        M.W(of(W.OBECNOSC, W.ZOBACZENIE_WARTOSCI, W.DZIALANIE,
                W.NIEDANIE_WYBORU, W._II_, W.ZDOMINOWANIE, W.UTRZYMANIE), "--->", of(W.OSIAGNIECIE_WARUNKU));

        M.W(of(M.DLUGOTRWALE(DBW.SPORT_WARUNKI())), "--->", of(W.UZALEZNIENIE_OD_SPORTU));

        M.W(of(W.OSOBA_ZASIEG_WZROKU), "--->", of(W.SONDA_PO_WADACH));

        M.WW(W.OSOBA, "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SLABY), "--->", of(W.OSZUKANIE_WYKORZYSTANIE, W.WYKLUCZENIE));

        M.WW(W.OSOBA, "--->", of(W.SONDA_POD_ZROBIENIE_ZLA, W._88_, W.SILNY), "--->", of(W.OTWARTE_STARCIE, W.WALKA_PIESCI));

        M.W(of(W.SAM) , "--->", of(W.LATWY_CEL, W.BRAK_PRZEWAG));

        M.W(M.SPOTKANY(M.OSOBA(W.HANBA)), "--->", M.ZAWSZE_GDY_BLISKOSC(of(W.CISNIE, W.WYPOMNIENIE_HANBY)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).W_PRZECIWNYM_PRZYPADKU(W.DZWONIENIE_NA_POLICJE));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));

        M.WW(W.OSIEDLE, "--->", W.MIEJSCE_RESTRYKCYJNE_OSIEDLE, "--->", of(M.WIDZISZ(W.OSIEDLOWE_SRD), W.ZNASZ));

        M.W(W.NARKOTYKI, "--->", W.NIESTABILNOSC_UMYSLOWA);

        M.W(M.MIEJSCE_STALE(DBW.WZGL_IZOLACJA_WARUNKI()), "--->", of(M.WPLYW(W.LUDZIE), M.MOZLIWOSC(DBW.RELACJE_WARUNKI()), M.MOZLIWOSC(M.INTERAKCJA(W.OSOBY)),
                                                                          M.INFORMACJA(W.OSOBY), M.INFORMACJA(W.MIEJSCE_STALE)));

        M.W(of(M.BRAK(W.ORIENT), W.DZIALANIE,
                M.OPCJA(W.ZUCHWALOSC), M.OPCJA(M.BRAK(W.WIEDZA))), "--->", M.SZYBKO(W.KARA));

        M.W(W.OBCY, "--->", M.SZANSA_NA(of(W.STARCIE, M.SRODOWISKO(W.BOJA_SIE), W.EMOCJE_ZE_ZLA, W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)));

        M.WW(M.WALKA_DWOCH_OSOB((of(DBW.KRZYWDY_WARUNKI(),
                            M.OPCJA(DBW.BRAK_ZASAD_WARUNKI()),
                            M.OPCJA(DBW.OSLONY_WARUNKI()),
                            M.OPCJA(DBW.PRZEWAGI_CHWILI_WARUNKI()),
                            M.OPCJA(DBW.PRZEWAGI_Z_ULICY_WARUNKI())))), "--->", M.WALKA(W.ZLO.PRZECIW(W.ZLO)), "---->",
                                                                                                    M.REZULTAT(M.OBOJE(of(
                                                                                                        DBW.STRATY_MORALNE_WARUNKI(),
                                                                                                        DBW.STRATY_MATERIALNE_WARUNKI(),
                                                                                                        W.ZERO_ZYSKU))));

        M.W(M.NIEZDOLNOSC(of(W.WALKA_PIESCI, W.WALKA_SPRZET)), "--->", M.BRAK(W.SILA_SPRAWCZA_ULICA));

        M.W(W.POTRZEBA, "--->", M.WRAZENIE(M.UZASADNIENIE_OBECNOSCI(W.POTRZEBA)));
    }

    public void wokolDzialaczaSrodowiska() {
        //  WEJSCIE
        M.W(M.OSOBA(of(M.MOCNO(of(W.AGRESJA, W.CHETNY_DZIALANIA)),
          W.BRAK_PIENIEDZY, W.POSLUSZNY, W.OGRANICZONE_INFORMACJE, W.NUDA)), "--->",  M.WEJSCIE(W.EKIPA));

        M.WW(M.WEJSCIE(W.EKIPA), "--->", M.NABYWANIE(DBW.PRZEWAGI_Z_ULICY_WARUNKI()), "--->", M.CALY_CZAS(of(M.ROBI_KRZYWDE_Z_PRZEWAGA(of(W.PRZECIWNY_KLUB,
                                                                                                                    DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI(),
                                                                                                                    DBW.BRAK_ZASAD_WARUNKI(), DBW.OSLONY_WARUNKI())),
                                                                                                                    M.REZULTAT(M.OSOBA(M.OTRZYMANIE(M.DOSTEP(DBW.PRZEWAGI_Z_ULICY_WARUNKI())))))));
        M.CZOLOWKA_EKIPY(M.ULTIMATIUM(M.OSOBY(of(W.DZIALANIE_DLA_ZLA, M.KRZYWDY(of(W.PRZECIWNY_KLUB,
                                                                        DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(),
                                                                        DBW.PRZEWAGI_CHWILI_WARUNKI(), DBW.OSLONY_WARUNKI()))))))
                                                        .W_PRZECIWNYM_PRZYPADKU(of(M.SRODOWISKO(of(W.OSOBA, DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI())),
                                                         M.REZULTAT(of(W.OSOBA, DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI()))));

        M.W(M.OSOBA(M.PRZESTAJE(of(M.WYKONUJE(W.ROZKAZ), M.DZIALANIE(W.ZLO)))), "--->", M.SRODOWISKO(of(W.OSOBA, M.BRAK_DOSTEPU(DBW.PRZEWAGI_Z_ULICY_WARUNKI()),
                                                                                                                     M.KRZYWDY(DBW.KRZYWDY_WARUNKI()))));
        M.CZOLOWKA_EKIPY(M.CALY_CZAS(M.UKRYCIE(W.INFORMACJE))).PRZED(W.SRODOWISKO);

        M.W(W.OSOBA_POZA_SRODOWISKO, "--->", M.SRODOWISKO(M.CALY_CZAS(M.UKRYCIE(W.INFORMACJE).PRZED(W.OSOBA_POZA_SRODOWISKO))));

        M.SRODOWISKO(M.TWORZY_WARUNKI(M.LATWO(M.WEJSCIE(M.WYMAGANIA(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ)))))));

        M.SRODOWISKO(M.OSOBY(of(W.DZIALANIE_DLA_ZLA, M.KRZYWDY(of(W.PRZECIWNY_KLUB, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(),
                                                                                     DBW.PRZEWAGI_CHWILI_WARUNKI(), DBW.OSLONY_WARUNKI())),
                                                                                        M.NABYWANIE(W.PRZEWAGA).DLA(W.SRODOWISKO)
                                                                .CEL(M.SRODOWISKO(M.OTRZYMANIE(of(DBW.PRZEWAGI_MATERIALNE_WARUNKI(), DBW.PRZEWAGI_Z_ULICY_WARUNKI())))),
                                                                M.REZULTAT(M.PRZECIWNY_KLUB(of(DBW.STRATY_MATERIALNE_WARUNKI(), DBW.STRATY_MORALNE_WARUNKI()))))));

        M.W(M.SRODOWISKO(M.CALY_CZAS(M.KONTROLA(DBW.KONTROLA_WARUNKI()))), "--->", M.KONTROLA(of(M.SRODOWISKO(W.KOBIETY),
                                                                                          M.SRODOWISKO(DBW.PRZEWAGI_Z_ULICY_WARUNKI()),
                                                                                          M.SRODOWISKO(W.WARTOSC),
                                                                                          M.SRODOWISKO(W.OSOBY),
                                                                                          M.SRODOWISKO(W.CIAGLOSC_INFORMACJI),
                                                                                          M.SRODOWISKO(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ))),
                                                                                          M.W(W.WARTOSC, "--->", M.ODRAZU(M.DZIALANIE(W.WARTOSC))),
                                                                                          M.W(M.OSOBA(M.POSIADA(W.PRZEWAGA)), "--->", M.SILNIEJSZY(M.ODRAZU(M.PROBA(M.PRZEJECIE(W.PRZEWAGA))))))));
        M.W(M.NAUCZ((M.OSOBA(of(
                DBW.ZAROBEK_NIELEGALNY_WARUNKI(),
                DBW.KRZYWDY_WARUNKI(),
                DBW.BRAK_ZASAD_WARUNKI())))), "---->", M.CEL(of(M.WYKORZYSTUJE(W.OSOBA), M.OKRASC(W.OSOBA), M.OSOBA(M.DZIALANIE_DLA(W.SRODOWISKO)))));

        M.W((M.OSOBA(W.DZIALANIE_POZA_DOSTEPEM)), "--->", M.SRODOWISKO(M.ROBI_KRZYWDE(of(W.OSOBA, DBW.KRZYWDY_WARUNKI()))));

        M.W(M.SRODOWISKO(of(M.NIE_WYKORZYSTUJE(W.OSOBA), W._88_,M.ZNA(W.OSOBA))), "--->", M.SRODOWISKO(M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI()))));

        M.W(M.DZIALANIE(of(W.OSTRY_SPRZET, W.GAZ, W.ZWIADY, W.ZDJECIA_TWARZOWKI)), "--->", M.CEL(of(M.WYWOLANIE(W.STRACH),
                                                                                                        M.PRZEZUCENIE(W.PRZECIWNY_KLUB))));
        M.PRZEJECIE(of(W.OSIEDLE, W.MIEJSCE_STALE, W.PRACA, W.SLUZBY, W.LUDZIE))
                .POTRZEBNE(M.CALY_CZAS(of(W.POSLUCH, W.OBECNOSC_LUDZI, M.SILNA(W.EKIPA))))
                .CEL(of(M.TWORZENIE(W.ZLO), M.NISZCZENIE(W.DOBRO), M.ULEPSZANIE(W.PRZEWAGA), M.NABYCIE(W.CIAGLOSC_INFORMACJI)));

        M.W(M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), "--->", M.CALY_CZAS(M.WJAZD(W.SPRZET)));

        M.W(M.OSOBA(W.NIE_OD_NAS), "--->", of(M.ROZKMINANIE(of(W.HASLO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)), M.OPCJA(of(W.CISNIE, W.WALKA_SPRZET))));

        M.W(M.OSOBA(W.OD_NAS), "--->", of(W.WYKORZYSTUJ, W.OKRASC_PIENIADZE, M.UNIZAJ(W.CZYNY), M.OCZEKIWANIE(DBW.KRZYWDY_WARUNKI())));

        // ***

        // FUNKCJONOWANIE NA CODZIEN

        M.TOLERANCJA(of(W.ZLO, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()));
        M.CZESTO(of(W.ZLO, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()));

        M.W(M.SLABY(W.DZIALAJACY), "--->", W.WSPARCIE);
        M.W(M.SILNY(W.NIE_DZIALAJACY), "--->", M.KRZYWDY(DBW.KRZYWDY_WARUNKI()));

        of(M.NIEWAZNE(W.PRAWDA), M.WAZNE(W.DOBRO_EKIPY));

        M.BRAK_SZANS(of(M.KOBIETA(W.DZIEWICA), M.PRAWDZIWA(W.MILOSC), M.DOBRE(M.LEGALNE(W.ZAROBKI))));

        // ***

        // RESTRYKCJA WARTOSCI

        M.W(M.OSIEDLE(M.OSOBA(W.OBCY)), "--->", M.OSIEDLE(M.KAZDY_BLLISKO(M.WYCHODZI(W.OSIEDLE)))
                                                        .CEL(M.ROBI_KRZYWDE(of(W.OBCY, DBW.KRZYWDY_WARUNKI())))
                                                        .CEL(M.PRZESTRASZENIE(of(W.OBCY, M.OBCY(M.BRAK_DOSTEPU(W.OSIEDLE))))));

        M.W(W.WARTOSC, "--->", M.ULTIMATIUM(M.RESTRYKCJA(M.DOSTEP(W.WARTOSC)))
                                    .W_INNYM_PRZYPADKU(M.ROBI_KRZYWDE_Z_PRZEWAGA(of(DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI()))));

        M.W(W.KOBIETA, "--->", of(M.RESTRYKCJA(M.DOSTEP(W.KOBIETA)).TYLKO(M.SRODOWISKO(W.OSOBY)),
                                    M.W(M.OSOBA_POZA_SRODOWISKO(M.PROBA_DOSTEPU(W.KOBIETA)), "--->", M.SRODOWISKO(M.ROBI_KRZYWDE(of(DBW.KRZYWDY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI())))),
                                    M.SRODOWISKO(M.OGLUP_KLAMSTWEM(of(W.CHLOPAK_TYLKO_ZE_SRODOWISKA, M.BRAK_WARTOSCI(of(W.DZIEWICTWO, W.WIERNOSC, W.DZIECI))))),
                                    M.POKAZ(M.TYMCZASOWE(of(W.PRZYJEMNOSCI, DBW.PRZEWAGI_WARUNKI()))),
                                    M.UNIZAJ(M.UTRUDNIAJ(of(W.ZALOZENIE_RODZINY, W.DZIECI))),
                                    W.WYKORZYSTUJ, M.OPCJA(W.PORZUC),
                                    M.CZEKAJ_AZ(of(W.STAROSC, W.BRAK_KANDYDATOW, M.ODCZUCIE(W.SAMOTNOSC), W.NISKIE_OCZEKIWANIA))));

        // MIEJSCE STALE

        M.W(M.MIEJSCE_STALE(DBW.WZGL_IZOLACJA_WARUNKI()), "--->", of(M.CALY_CZAS(M.KONTROLA(W.OSOBY)),
                                                                    M.CALY_CZAS(M.SONDA(W.OSOBY)),
                                                                    M.CALY_CZAS(M.ORIENT(W.WARTOSC)),
                                                                    M.W(W.WARTOSC, "--->", M.DZIALANIE(W.WARTOSC)),
                                                                    M.W(W.OSOBA,"--->", of(M.zeSrodowiska(W.OK),
                                                                                                M.fest(W.KUP_COS),
                                                                                                M.drugaStrona(W.WYPAD),
                                                                                                M.drugaStronaDzialajacy(W.SZPITAL)))));


        M.W(of(W.MIEJSCE_STALE, W.OBSLUGA_OD_NAS), "--->", of(M.OBSLUGA(M.CALY_CZAS(DBW.BRAK_ZASAD_WARUNKI())),
                                                                M.KIEROWNICTWO(M.CALY_CZAS(M.KONTROLA(M.OBSLUGA(DBW.BRAK_ZASAD_WARUNKI())))),
                                                                M.KIEROWNICTWO(M.CALY_CZAS((M.OCZEKIWANIE(M.OBSLUGA(DBW.BRAK_ZASAD_WARUNKI())))))));

        M.W(of(W.MIEJSCE_STALE, W.OBSLUGA_NIE_OD_NAS), "--->", of(M.CALY_CZAS(M.PROBUJ_PRZEJAC(of(W.OBSLUGA, W.KIEROWNICTWO))),
                                                        M.CALY_CZAS(M.NASYLANIE_DZIALACZY(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.CISNIE, W.WALKA_SPRZET)))
                                                        .CEL(of(W.ZASTRASZENIE, W.OGRANICZENIE_WOLNOSCI_ULICA, W.ZAMKNIECIE_OPCJI, M.PROBUJ_PRZEJAC(W.MIEJSCE_STALE)))));


        M.W(M.MIEJSCE_STALE(of(M.WOKOL_TYLKO(W.SWOI), W.ZLO, W._88_, W.INTERAKCJA)), "--->", of(W.NOTYFIKACJA_EKIPA, W.WSPARCIE_OSLONY, W.PRZEKONYWANIE_PRZECIW));

        M.W(M.MIEJSCE_STALE(W.SPORT), "--->", of(M.RESTRYKCJA(M.DOSTEP(M.MOGA_WEJSC(of(W.JEDEN_KLUB_KIBICOWSKI, M.OPCJA(W.TYLKO_BIEGAJACY_SPRZET))))),
                                                      M.W(W.OSOBA_POZA_SRODOWISKO, "--->", M.GORSZE_TRAKTOWANIE(W.OSOBA_POZA_SRODOWISKO).NIZ(W.SRODOWISKO)),
                                    M.CEL(of(M.NABYCIE_PRZEWAGI(M.TYLKO_DLA(of(W.SRODOWISKO, W.BIEGAJACY_SPRZET))), M.POZBAWIENIE(M.MOZLIWOSC(M.NABYCIE_PRZEWAGI(W.OSOBA_POZA_SRODOWISKO)))))));

        M.WW(M.MIEJSCE_STALE(M.WOKOL_TYLKO(W.ZLI)), "--->", M.WSZYSCY(M.SLUCHAJA(W.NAJWYZSZY_HIERARCHIA)), "--->", M.NAJWYZSZY_HIERARCHIA(M.OTRZYMUJE(of(W.SILA_SPRAWCZA, W.TWORZENIE_WARUNKOW))));

        M.W(of(W.MIEJSCE_STALE_DZIALAJACE, W._II_, W.SRODOWISKO), "--->", M.CALY_CZAS(of(W.KOMFORT, W.CIAGLOSC_INFORMACJI)));

        // ***

        // HASELKO

        M.W(W.HASLO_RDZENNYCH, "--->", of(M.SPRAWDZANIE(W.SWOI), M.SPRAWDZANIE(W.WROG),
                                                M.UPEWNIENIE_SIE(M.BEZ_KONSEKWENCJI(M.W_SRODOWISKU(DBW.KRZYWDY_WARUNKI())))));

        M.W(M.MIEJSCE_STALE(M.WYMAGANE(W.HASLO_RDZENNYCH)), "--->",
                                                of(M.W(M.OSOBA(M.POWIEDZIAL(W.HASLO_RDZENNYCH)), "--->", of(M.OBSLUGA(W.MILA), M.DOBRZE_WYKONANE(W.USLUGI))),
                                                    M.W(M.OSOBA(M.NIE_POWIEDZIAL(W.HASLO_RDZENNYCH)), "--->", of(M.OBSLUGA(W.NIE_MILA), M.ZLE_WYKONANE(W.USLUGI),
                                                                                                                        M.NOTYFIKACJA(W.EKIPA), W.ZDJECIA_TWARZOWKI,
                                                                                                                        DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(),
                                                                                                                        DBW.OSLONY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI()))));

        M.WW(M.INFORMACJA(W.OSOBA), "--->", M.SONDA(W.HASLO_RDZENNYCH), "--->", of(M.OSOBA(W.OD_NAS), W._II_,
                                                                                              M.OSOBA(W.WROG), W._II_,
                                                                                              M.OSOBA(W.NIESTWARZA_ZAGROZENIA)));

        M.W(M.OSOBA(M.BRAK(W.HASLO_RDZENNYCH)), "--->", of(M.OSOBA(W.NIE_OD_NAS), M.SRODOWISKO(M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())))));

        // ***

        // ZWIADY

        M.W(W.ZWIADY, "--->", of(M.WEJSCIE(M.REJON(W.PRZECIWNY_KLUB)),
                                          M.W(M.ZASIEG_WZROKU(W.OSOBA), "--->", of(M.NOTYFIKACJA(W.EKIPA), M.NABYCIE(W.BLISKOSC))),
                                          M.W(W.BLISKOSC, "--->", W.ZDJECIA_TWARZOWKI)));

        M.WW(W.ZDJECIA_TWARZOWKI, "--->", M.PORTAL_DZIALAJACYCH(M.DOSTEP(M.WSZYSCY(W.DZIALAJACY))), "--->", of(M.DZIALJACY(M.OTRZYMANIE(W.INFORMACJA)),
                                                                                                                          M.DZIALJACY(W.INFORMACJA_ZWROTNA)));

        M.W(M.INFORMACJA_ZWROTNA(M.OSOBA(W.PRZECIWNY_KLUB)), "--->", M.AKCJA_PRZECIW(of(W.OSOBA, DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(),
                                                                                                        DBW.OSLONY_WARUNKI(), DBW.PRZEWAGI_CHWILI_WARUNKI())));
        M.W(M.INFORMACJA_ZWROTNA(M.OSOBA(W.NIE_DZIALAJACY)), "--->", W.BRAK_AKCJI);

        M.W(M.INFORMACJA_ZWROTNA(M.OSOBA(W.HANBA)), "--->", M.POINFORMUJ_WSZYSTKICH(M.OSOBA(W.HANBA)));

        M.W(of(M.UDAJE_ZE(W.DZWONI), M.UDAJE_ZE(W.PRZEGLADA_TELEFON)), "--->", M.ROBI(W.ZDJECIA_TWARZOWKI));

        M.W(W.POTRZEBA, "--->", M.WRAZENIE(M.UZASADNIENIE_OBECNOSCI(W.POTRZEBA)));

        // ***

        // SLABY_DZIALACZ

        M.W(M.SLABY(W.DZIALAJACY), "--->", of(W.ZALEZNY, M.BRAK(W.UMIEJETNOSCI), M.DZIALANIE(W.ZLO)));

        M.W(M.DZIALAJACY(M.SONDA(DBW.PRZEWAGI_WARUNKI())), "--->", M.DZIALJACY(of(M.W(W.BRAK_PRZEWAG, "--->", W.BRAK_DZIALANIA),
                M.W(W.MALO_PRZEWAG, "--->", M.UKRYTE(W.DZIALANIE)),
                M.W(W.DUZO_PRZEWAG, "--->", M.OTWARTE(W.DZIALANIE)))));

        M.W(M.DZIALAJACY(W.STARCIE), "--->", of(M.zaczepSprowokuj(osoba),
                                                    M.wrocZPrzewaga(),
                                                    M.walZPrzewaga(osoba, W.PRZEWAGA),
                                                    M.rozpowiedz(W.WSZYSCY),
                                                    M.CALY_CZAS(W.DOMINACJA)));

        M.W(W.PORAZKA, "--->", M.CALY_CZAS(M.NIEUDOLNIE(W.PONAWIANIE_PROBY)));
        M.OPCJA(M.CALY_CZAS(of(W.NIEUDOLNOSC, M.ROZKMINANIE(W.WSZYSCY), M.ZLE_ZAMIARY())));
        M.OPCJA(M.CALY_CZAS(M.PODSTAWA(W.KLAMSTWO).WZGLEDEM(of(W.SIEBIE, W.INNI))));
        M.OPCJA(M.CALY_CZAS(W.ZAKLAMYWANIE_RZECZYWISTOSCI));

        M.W(W.SLABY, "--->", of(M.UNIKA(W.WALKA_PIESCI), M.SIEGA_PO(W.SPRZET)));

        M.WW(M.SLABY_TCHORZ(M.PO_CICHU(of(M.ZWYZYWAJ(W.OSOBA),
                M.DZIALAJ_NA_SZKODE(W.OSOBA)))), "--->", M.OSOBA(M.NIESWIADOMY(of(W.OBELGI,W.KRZYWDA))), "--->", M.SLABY_TCHORZ(of(
                                                                                                                                   W.CIESZY_SIE,
                                                                                                                                   M.POCHWAL_SIE(W.EKIPA),
                                                                                                                            M.POINFORMUJ_WSZYSTKICH(M.OSOBA(W.HANBA)))));
        M.W(of(W.WADY_UMYSLOWE,W.WADY_FIZYCZNE, W.AGRESJA_W_DZIALANIU,
                W.DOMINACJA, W.NIE_ODKRYTY, W.BRAK_TRUDNOSCI, W.NIE_ODKRYCIE_WAD,
                W.BRAK_SUMIENIA, W.ZYSK_Z_DZIALANIA,
                W.EGOISTA, W.CHEC_KRZYWDY, W.NIEZWRACA_UWAGI_NA_KRZYWDE_INNYCH,
                W.LEKCEWAZY_INNYCH, W.UNIZA, W.ZUCHWALY),                  "--->", M.SLABY(W.DZIALAJACY));

        M.W(of(W.SRODOWISKO, W.UMNIEJSZANIE_WAD, W.WZAJEMNE_WSPARCIE,
                M.oddalanieSieOdWalkiZagrozenia(of(M.OSOBA(W.SKAZYWANIE_SAMOTNOSC), W.PRZEWAGA, W.PRZYJEMNOSC)),
                M.oddalanieOdKonkurencji(of(W.SIEDZENIE_MELINY, W.PRZYCHYLNOSC,
                        W.OGLUPIANIE, W.KLAMSTWO, W.PO_CICHU, W.ZAMKNIJ_ZASOB)),
                W.OSZUKANIE_WYKORZYSTANIE, W.WYKLUCZENIE, W.SPRZET, W.AGRESJA_W_DZIALANIU, W.ZLO),   "--->", of(M.SLABY(W.DZIALAJACY),
                                                                                                            W.NIESPRAWIEDLIWI,
                                                                                                            W.NIESPRAWIEDLIWE_PRZEWAGI,
                                                                                                            W.EMOCJE_ZE_ZLA));

        M.W(of(W.ZLY, W._88_, W.PRZEWAGA), "--->", of(W.WALI_OSOBE_BEZ_PRZEWAGI, W.BEZKARNOSC));

        M.W(of(W.SLABY, W._88_, W.BLISKOSC, W.SILNA_JEDNOSTKA), "--->", M.SLABY(M.PO_CICHU(of(W.SILNA_JEDNOSTKA, DBW.KRZYWDY_POSREDNIE_WARUNKI()))));

        M.W(of(W.NUDA, W.KTOS_CIEBIE_LUB_TY_JEGO,
                W.AGRESJA_W_DZIALANIU, W.EMOCJE_ZE_ZLA), "--->", of(W.WALI_OSOBE_BEZ_PRZEWAGI, W.OSZUKIWANIE_WYKORZYSTANIE, W.BEZKARNOSC, W.GLUPOTA));

        // OKOLOKIBICOWSKIE

        M.W(W.BRAK_KIBICOWANIA, "--->", W.NIC_NIE_MOGA_ZROBIC);

        M.W(M.DZIALJACY(M.WYPARCIE_SIE(W.KLUB_KIBICOWSKI)), "--->", M.BRAK_DOSTEPU(DBW.PRZEWAGI_Z_ULICY_WARUNKI()));

        M.W(M.OSOBA(W.DZIALAJACY), "--->", M.ZOBOWIAZANIE(of(W.BIEGANIE_SPRZET, M.ROZKMINANIE(of(W.HASLO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)))));

        M.W(W.WYROK, "--->", M.UNIZAJ(W.POSIEDZI_CHWILE_NIC_MU_SIE_NIE_STANIE));

        M.W(M.INFORMACJA(W.KRZYWDA_DRUGIEJ_STRONY), "--->", of(W.NASTAWIENIE_WSPARCIE, W.WESELE, W.CHCEMY_WIECEJ, W.ZA_CIOSEM));

        M.OPCJA(M.POBIERZ(DBW.METODY_POLICYJNE_WARUNKI()));

        M.OPCJA(M.SWOI(of(W.SAD, W.POLICJA, W.SZPITAL, W.OCHRONA, W.RYNEK, W.SILOWNIA, W.LUDZIE_Z_PIESKIEM_SPACER)));

        M.W(of(W.SIEDZENIE_W_SRODOWISKU), "--->", of(W.BEZPIECZENSTWO, W.STREFA_KOMFORTU, W.POTRZEBA_EMOCJI,
                                                        W.ZNUDZENIE_OSOBAMI, W.POTRZEBA_NOWYCH_OSOB));
        M.W(of(M.OSOBA(W.BIEGAJACY_SPRZET),
                W.BLISKOSC,
                M.OSOBA(W.NIE_BIEGAJACY)), "--->", M.OSOBA(W.BIEGAJACY_SPRZET).ROBI_KRZYWDE(of(M.OSOBA(W.NIE_BIEGAJACY), DBW.KRZYWDY_WARUNKI())));

        M.W(of(W.BLISKOSC, W._88_, W.WROGOSC), "--->", DBW.KRZYWDY_WARUNKI());

        M.WZIECIE_DO_EKIPY(M.ZWYKLE(W.SLABY, W.GLUPI, W.ULEGLY, W.ZALEZNY, W.AGRESYWNY));
        M.NIEDOPUSC_DO_EKIPY(M.ZWYKLE(W.SILNY, W.MADRY, W.NIEZALEZNY));

        // RESZTA

        W ulicaPrzewagaSposob = DBW.ULICA_PRZEWAGA_SPOSOB_WARUNKI();
        W zachowanieRezultatUlica = DBW.ZACHOWANIE_REZULTAT_ULICA_WARUNKI();
        W zasiegPrzewagiUlica = DBW.ZASIEG_PRZEWAGI_ULICA_WARUNKI();
        W cechyRdzenny = DBW.CECHY_RDZENNY_WARUNKI();
        W przewagiDanejChwili = DBW.PRZEWAGI_CHWILI_WARUNKI();

        // ***
    }

    public void algorytmUlicy() {
        List<W> budujacyHierarchieDecyzyjni = of(M.DLUGO(W.STRATA_WOLNOSCI), M.DUZO(M.ZROBIL_DLA(W.EKIPA)),
                M.DLUGO(W.POZA_PRAWEM), W.NIESPRAWIEDLIWI, W.AGRESYWNI, DBW.PRZEWAGI_WARUNKI());

        List<W> cele = of(W.WZIECIE_JAKNAJWIECEJ_OSOB_DO_BIEGANIA_SPRZET, W.WZIECIE_JAKNAJWIECEJ_OSOB_W_NARKOTYKI, M.SILNA(W.EKIPA), W.PIENIADZE, W.SILA_SPRAWCZA);
        List<W> przyczynyBiegania = of(W.MODA, W.STARSI, W.WYKLUCZENIE_ZE_SRODOWISKA, W.AGRESJA, W.KORZYSCI, W.WADY, W.NUDA);
        List<W> klimatBiegania = of(W.NARKOTYKI, W.WYROK, W.KONFIDENCI, W.PIENIADZE, W.KONTUZJA, W.CIERPIENIE, M.CALY_CZAS(W.ORIENT));

        M.W(W.WEJSCIE, "---->", of(M.OTRZYMANIE(of(W.FALSZYWE_KORZYSCI, DBW.PRZEWAGI_Z_ULICY_WARUNKI()))));

        M.oglup(of(W.DOSTEP_DO_PLANSZY, W.KLAMSTWO, W.NARKOTYKI));
        M.przestrzel(osoba);
        M.wezDoSrodowiska(osoba);
        M.GRANT(ME, of(W.ZRODELKO, W.STOZEK_SZCZEGOLU, W.SUBSCRIBES_INFORMACJE, W.BLISKOSC, W.TELEFONY, W.PRZEWAGA));

        M.CALY_CZAS(W.KONTROLA);
        M.CALY_CZAS(W.WYMAGANIE_DZIALANIA_DLA_ZLA);
        M.CALY_CZAS(W.GNOJ_POSTRONNYCH);  me.caly_czas(W.GNOJ_EKIPA_NIZSI_OD_CIEBIE);
        M.CALY_CZAS(W.GNOJ_EKIPA);
        M.CALY_CZAS(W.UNIZAJ_CZYNY);

        M.sonda(W.ILE_SIE_DA); M.odkryjWady(osoba); M.wstawDoHierarchiiPodToba(osoba);
        M.CALY_CZAS(M.WYKORZYSTUJE(W.OSOBA));
        M.CALY_CZAS(M.otoczPrzewage(W.WALKA_SPRZET));
        M.W(W.WYJSCIE, "--->", of(W.SAMOTNOSC, W.POJECHANE, W.WALKA_SPRZET));
    }

    public void kibicowanieKrotkieUjecie() {
        M.W(M.SRODOWISKO(M.NIE_WYKORZYSTUJE(W.OSOBA)), "--->", M.KRZYWDY(of(W.OSOBA, DBW.KRZYWDY_WARUNKI())));

        M.W(M.NIE_ZNAJA(W.OSOBA), "--->", M.ROZKMINANIE(of(W.HASLO_RDZENNYCH, W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI)));

        M.W(M.OSOBA(M.BRAK(W.HASLO_RDZENNYCH)), "--->", of(M.GORSZE_TRAKTOWANIE_NIZ_RESZTA(W.OSOBA),
                                                                    M.ZAMKNIECIE_DOSTEPU_BEZPOWROTNIE(W.OSOBA),
                                                                    M.CISNIE(W.OSOBA)));

        M.W(W.SLABY, "--->", M.DUZE_SZANSE(M.PO_CICHU(of(M.SPRAWDZANIE(W.HASLO_RDZENNYCH), W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI))));
        M.W(W.SILNY, "--->", M.DUZE_SZANSE(M.OTWARTE(W.STARCIE)));

        M.WEJSCIE(W.EKIPA).W_PRZECIWNYM_PRZYPADKU(of(W.PUSTKA, W.FESTY, W.BEZ_PIENIEDZY, W.SLABI));
    }

    public void tworzenieWarunkow() {
        polskiRzad.tworzyWarunki(of(W.CHRONICZNE_BEZROBOCIE, W.NISKIE_PENSJE, W.PRAWO));
        czolowkaUlica.tworzyWarunki(of(W.KLAMSTWO, W.WADY, M.SLABY(W.DZIALAJACY), W.ZMYSLY_DLA_ZLA, M.NASYLANIE_DZIALACZY()));

        czolowkaUlica.tworzyWarunki(M.ZAPOTRZEBOWANIE(of(W.ZLO, DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI(), DBW.KRZYWDY_WARUNKI())));
        czolowkaUlica.tworzyWarunki(M.TOLERANCJA(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())).CEL(M.CZESTO(of(W.WYKORZYSTANIE, W.DZIALANIE_DLA_ZLA))));

        M.W(czolowkaUlica.tworzyWarunki(M.KONTROLA(DBW.KONTROLA_WARUNKI())), "--->", M.KONTROLA(of(M.SRODOWISKO(W.KOBIETY),
                                                                                                    M.SRODOWISKO(DBW.PRZEWAGI_Z_ULICY_WARUNKI()),
                                                                                                    M.SRODOWISKO(W.WARTOSC),
                                                                                                    M.SRODOWISKO(W.OSOBY),
                                                                                                    M.SRODOWISKO(W.CIAGLOSC_INFORMACJI),
                                                                                                    M.SRODOWISKO(of(W.DZIALANIE_DLA_ZLA, M.WYKONYWANIE(W.ROZKAZ))))));

        dzialacz.zwiekszaSzanse(of(W.ZLO, DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI(), DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()));

        czolowkaUlica.tworzy(W.SRODOWISKO).CEL(of(
                M.ULEPSZANIE(DBW.PRZEWAGI_Z_ULICY_WARUNKI()), M.MATERIALIZOWANIE_ZLA_DZIEKI(W.PRZEWAGA), M.WYKLUCZENIE(osobyPozaSrodowisko),
                M.ROBI_KRZYWDE_Z_PRZEWAGA(osobyPozaSrodowisko, DBW.KRZYWDY_WARUNKI()),
                M.NABYCIE(of(W.SILA_SPRAWCZA, W.PRZEWAGA_SILY, W.POSLUCH)),
                M.NABYCIE(M.WPLYW(W.LUDZIE)),
                M.NABYCIE(M.MOZLIWOSC(DBW.RELACJE_WARUNKI())),
                M.NABYCIE(W.PRZYJEMNOSCI),
                M.NABYCIE(W.CIAGLOSC_INFORMACJI),
                M.NISZCZENIE(W.DOBRO),
                M.TWORZENIE(W.ZLO),
                M.ULTIMATIUM(W.ZLO).W_PRZECIWNYM_PRZYPADKU(of(DBW.STRATY_MORALNE_WARUNKI(), DBW.STRATY_MATERIALNE_WARUNKI())),
                osoby.DZIALANIE(W.ZLO)
                        .CEL(of(W.KOMFORT, W.PRZEWAGA, W.PRZYJEMNOSCI, W.BRAK_CIERPIENIA))
                        .REZULTAT(of(M.USPRAWIEDLIWIENIE(W.ZLE_CZYNY), W.WARTOSC_MATERIALNA))
        ));

        fest.tworzyWarunki(of(W.WYWYZSZENIE_SLABYCH));
    }

    public void krajobrazUlicy() {
        M.CALY_CZAS(of(W.KUMULUJACA_SIE_PATOLOGIA, W.PUSTKA, W.BRAK_PIENIEDZY, W.NARKOTYKI, W.KAZDE_DOBRO_NA_DOL));
        M.tlo(of(W.AGRESJA, W.NERWY, W.ZLO, W.DOSTEP));
    }

    public void przeplywInformacji(){
        M.W(W.STALO_SIE, "--->", of(M.dodajDoGoraceTematy(W.STALO_SIE),
                M.powiazZ(osoba),
                M.zapamietaj()));

        M.W(of(W.SPOTKANY_ZNAJOMY), "--->",of(M.wezOstatnieGoraceTematy(),
                                                M.rozpowiedz(znajomy, W.STALO_SIE, osoba)));
    }

    public void hierarchiaOsiedle(){
        List<W> warunki = of(W.ANTY_NORMALNOSC, W.HIERARCHIA, W.ZAZDROSC, W.BRAK_ZASAD, W.TWORZENIE_WZAJEMNEGO_CIERPIENIA,
                W.ZLO, W.NUDA, W.EMOCJE_ZE_ZLA);

        Map<W, Integer> miejsceSzansaProcent = new HashMap<>();
        miejsceSzansaProcent.put(W.MIEJSCE_RESTRYKCYJNE_OSIEDLE, 80);
        miejsceSzansaProcent.put(W.MIEJSCE_STALE, 50);
        miejsceSzansaProcent.put(W.OSIEDLE, 20);
        miejsceSzansaProcent.put(W.GLOWNA_DROGA, 10);

        M.PRZEWAGA(3, W.ILOSC_OSOB);
        M.PRZEWAGA(2, W.WALKA_SPRZET);
        M.PRZEWAGA(1, W.WALKA_PIESCI);
        M.PRZEWAGA(1, W.ROZMIAR);

        OH ogarniety = new OH(of(slabyDzialacz, slabyDzialacz2, slabyDzialacz3));
        OH ogarniety2 = new OH(of(slabyDzialacz4, slabyDzialacz5, slabyDzialacz6));
        OH ogarniety3 = new OH(of(slabyDzialacz7, slabyDzialacz8, slabyDzialacz9));

        OH gangusZPrzewaga = new OH(of(ogarniety, ogarniety2, ogarniety3));
    }

    public void agresja() {
        M.POTRZEBNE(of(W.BEZPIECZNE_MIEJSCE_BRAK_POLICJI, W.OPPONENT_NIEPRZESTRASZONY, M.OPPONENT(W.BLISKOSC)));

        M.W(of(W.KTOS_SAM, W.KTOS_PATRZY, W.KTOS_POSIADA,
                W.CISNIE, W.BOJKA, W.ZLE_W_ZYCIU),               "--->", M.MOZLIWOSC(W.STARCIE));

        M.W(W.STARCIE, "--->", DBW.KRZYWDY_BEZPOSREDNIE_WARUNKI());
    }

    public void dzialanieKrotko(){
        List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);
        W sondaKrotka = DBW.SONDA_KROTKA_WARUNKI();

        M.W(of(W._01, W._II_, W.TRACISZ), "--->", W.REAKACJA);

        M.W(W.ZASZKODZIL,"--->", of(M.zapamietaj(),
                                        M.postawCiezkiWarunek(srodki()),
                                        M.nieCzekaj(),
                                        M.wyprzedz(), M.szybkoDzialaj()));
    }

    public void przewagi(){
        W przewagi = DBW.PRZEWAGI_WARUNKI();
        W slabosci = DBW.SLABOSCI_WARUNKI();

        M.W(W.PRZEWAGA_LOKALNA, "--->", W.PRZEWAGA_GLOBALNA);

        List<W> potrzebneWarunki = of(W.STALA_PLANSZA, W.WIELE_INTERAKCJI, W.WIELE_OSOB, W.OSOBA_ODSLANIAJACA_SIE);

        W brakZasad = M.NIEWAZNE(DBW.BRAK_ZASAD_WARUNKI()).MIMO_TO(M.WAZNE(of(W.PRZEWAGA, W.ZYSK, W.WARUNEK_SPRZYJAJACY)));

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

        M.W(of(W.RESTRYKCJA), of(M.sredniaRestrykcja(of(W.SKLEP, W.RESTAURACJA, W.KLUB)), M.mocnaRestrykcja(of(W.ULICA, W.BLOKI, W.PRZYSTANEK, W.TRAUTO))));

        M.W(of(W.MIEJSCE_STALE, W._88_, W.KIBICOWANIE), "--->", of(M.zeSrodowiska(W.OK),
                                                                        M.pozaSrodowisko(W.KUP_COS),
                                                                        M.drugaStrona(W.WYPAD),
                                                                        M.drugaStronaDzialajacy(W.SZPITAL)));

        M.W(W.PRZEWAGA_NA_STARCIE, "--->", M.CALY_CZAS(W.UTRZYMANE_PRZEWAGI_OD_SZKOLY));
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

        W konsekwetnie = M.CALY_CZAS(M.TRZYMANIE_DO_KONCA(W.JEDNA_WERSJA_WYDARZEN)
                                    .MIMO(of(W.DOWODY_OBCIAZAJACE, M.MOZLIWOSC(W.STRATA_WOLNOSCI))));

        // kryterium oceny zachowania

        M.WWW(W.ZDARZENIE, "->", W.SPRAWA_W_SADZIE,
                                        "--->", M.OSOBA(M.BRAK(M.WSPOLPRACA(W.POLICJA))), "--->", M.OPCJA(W.WYROK_SADU), "--->", M.OSOBA(W.OK));

        M.WWW(W.ZDARZENIE, "->", W.SPRAWA_W_SADZIE,
                                        "--->", M.OSOBA(M.WSPOLPRACA(W.POLICJA)), "--->", M.WYROK_SKAZUJACY(W.WINNY), "--->", M.OSOBA(W.KONFIDENT));

        M.REZULTAT(of(
                M.WW(M.WYROK_SKAZUJACY(M.OSOBA(W.OK)), "--->", M.OSOBA(M.TYMCZASOWE(W.STRATA_WOLNOSCI)), "--->", M.DOSTEP(of(W.SRODOWISKO, W.PRZEWAGA, W.ZNAJOMI))),

                M.W(M.OSOBA(W.KONFIDENT), "--->", M.OSOBA(M.DOZYWOTNIO(of(W.WYKLUCZENIE, W.HANBA, M.BRAK_DOSTEPU(of(W.SRODOWISKO, W.PRZEWAGA, W.ZNAJOMI))))))
        ));

        // DPK
        M.W(W.DOBROWOLNE_PODDANIE_SIE_KARZE, "--->", M.POTRZEBNE(W.ZGODA_WSZYSTKICH_OSKARZONYCH_NA_DPK))
                                                         .W_INNYM_PRZYPADKU(M.OSOBA(M.WSPOLPRACA(W.POLICJA)));
    }

    public void przejecieMiejsceStale() {
        M.CALY_CZAS(W.NORMALNOSC);
        M.W(M.PRZEJECIE(M.MIEJSCE_STALE(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(), DBW.OSLONY_WARUNKI()))), "--->", M.OBSADZ_STANOWISKA(of(W.SWOI, W.ZLI)));
        M.ULTIMATIUM(pracownicy.caly_czas(M.DZIALANIE_DLA_ZLA(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI(), DBW.OSLONY_WARUNKI()))));
        M.CALY_CZAS(M.DOSTEP_TYLKO(of(M.POTRZEBNE(W.HASLO_RDZENNYCH), M.OSOBY(W.SWOI))));

        // DLUGA_DOSTEPNOSC

        M.W(M.MIEJSCE_STALE(W.DLUGA_DOSTEPNOSC), "--->", of(M.WEJSCIE(M.EKIPA(M.SPRZET(W.WCZESNIE_RANO))),
                                                                M.CALY_CZAS(M.DYZURY(W.DZIALAJACY)),
                                                                M.CALY_CZAS(M.SPRAWDZANIE(W.WSZYSCY))));
    }

    public void terytoriumWroga() {
        M.CZESTO(M.ZWIADY(W.OSIEDLE));
        M.CZESTO(M.OSIEDLE(W.ZDJECIA_TWARZOWKI));

        M.CZESTO(M.ZWIADY(W.MIEJSCA_STALE));
        M.CZESTO(M.MIEJSCE_STALE(W.ZDJECIA_TWARZOWKI));

        M.CZESTO(M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)));
        M.CZASEM(M.WJAZD(M.OSIEDLE(W.SPRZET)));

        M.CALY_CZAS(M.PROBUJ(M.PRZEJECIE(of(W.OSIEDLE, W.MIEJSCE_STALE, W.PRACA, W.SLUZBY, W.LUDZIE))));
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

    public void zwyklaOsobaZOsiedla() {
        List<W> warunki = of(M.MOCNO(W.KIBICOWANIE), M.MOCNO(M.CHETNIE(W.ZLO)), M.MOCNO(W.MIEJSCE_STALE), M.MOCNO(W.MODA), M.MOCNO(W.ZNAJOMI),
                M.MOCNO(W.HIERARCHIA), M.MOCNO(W.UKLADZIK), M.MOCNO(W.WYKORZYSTANIE), M.MOCNO(W.BRAK_WSTYDU), M.MOCNO(W.KLAMSTWO),
                M.SLABO(W.WYSILEK), M.SLABO(W.RYZYKO), M.SLABO(W.UMIEJETNOSCI), M.SLABO(W.OBECNOSC), M.SLABO(W.PRAWDA), M.SLABO(W.DOBRO));

        M.OSOBA(M.SET(of(W.NASTAWIENIE_PRZYJEMNOSCI, W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_HIERACHI_PRZYWILEJE)));
    }

    public void tchorzSchemat() {
        M.W(W.MIEJSCE_STALE, "--->", W.SONDA_ILE_MOZNA);

        M.W(W.NASTAWIENIE, "--->", M.JEZELI_MOZNA(M.LATWO(DBW.KRZYWDY_WARUNKI())));
    }

    public void ochrona() {
        M.OCHRONA(M.W(of(W.PRZESTEPCZOSC_REGIONU), "--->", of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI())));
        M.OCHRONA(M.W(of(W.ZWIAZEK), "--->", of(W.WALKA_PIESCI, W.SKAZYWANIE_SAMOTNOSC, W.OBGADAC, W.EMOCJE_ZE_ZLA)));
        M.OCHRONA(M.W(of(W.PRACA), "--->", of(W.LOJALNOSC, W.WYKONYWANIE_PRACY)));
    }

    public void nuda() {
        M.W(W.WYJSCIE_NA_ULICE, "--->", W.NUDA);

        M.W(of(W.WYJSCIE_NA_ULICE, W._88_, DBW.PRZEWAGI_Z_ULICY_WARUNKI()), "--->", of(W.BRAK_NUDY));
    }


    public void nieZnam() {
        M.W(of(W.NIE_ZNAM), "--->", of(W.DRUGA_STRONA, W.NIE_MA_DOSTEPU, W.PRZESTRZELIC, W.ROZKMINIC));
    }

    public List<W> srodki() {
        return of(

                M.W(of(W.WALKA_PIESCI),
                        of(
                                M.sondaDostepu(),
                                M.sondaZagrozenia(),
                                M.SONDA(DBW.SONDA_PRZYPALU_WARUNKI()),
                                M.poCichu(), M.II(), M.otwarteStacie(),
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
                                M.ZAMKNIECIE_DOSTEPU_BEZPOWROTNIE(),
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
                                M.glosno(),
                                M.obrazanie(obelgi),
                                M.ukazanieZlychCech(),
                                M.wspominanieZlychWydarzen(),
                                M.zartowanie(zarty),
                                M.otwarteStacie(),
                                M.terror(DBW.TERROR_WARUNKI()),
                                M.ktoZNimTenPojechane(),
                                M.shanbienie(),
                                M.POTRZEBNE(of(W.LUDZIE_WOKOL, W.LUDZIE_ZA_TOBA))
                        )
                )
        );
    }

    public void gadka(){
        M.CALY_CZAS(W.NADRZEDNY_NURT_ROZMOWY);
        M.CALY_CZAS(W.DOMINACJA_W_ROZMOWIE);
        M.CALY_CZAS(W.NAJBARDZIEJ_CIEKAWY_TEMAT);
        M.CALY_CZAS(W.WEDROWKA_PO_POKOJACH);

        List<W> ograniczenia = of(W.OGRANICZENIE_CZASOWE, W.OGRANICZENIE_UWAGI);

        osoba.pobierz(W.NADRZEDNY_NURT_ROZMOWY); M.II(); osoba.stworz(W.ZRODLO_GADKI);

        M.kontrubutujesz();
        M.wyborOsob();
        M.glos();
        M.odMalegoDoDuzego();
        M.akcentujCoWazne();
        M.OPCJA(M.docenDostep());
        M.izolujJednostki(); M.II(); M.angazujJednostki();
        M.stworzWartosc();
        M.W(of(W._NIE_, W.KTOS_WAZNY, W.COS_WAZNEGO), "--->", M.sciagajRozmowe());

        M.W(of(W.MOZLIWOSC_PRZERWANIA_MOWY), "--->", of(M.mowSzybko(), M.uwagaNaSobie()));

        M.W(W.NIEODZYWASZ_SIE, "--->", of(W.UNIKASZ_WALKI, W.NEUTRAL, W.TOCZY_SIE_BEZ_INGERENCJI, W.POZA_HIERARCHIA_ROZMOWY));


    }

    public List<W> poWejsciuDoCzlowki() {
        return of(M.CALY_CZAS(M.ORIENT(of(W.SWOJA_EKIPA, W.PRZECIWNA_EKIPA, W.PSY))),
                W.KAZDE_DZIALANIE_OCENIANE, W.PILNOWANIE_HIERARCHII, W.PILNOWANIE_PRZEWAG,
                M.DOSTEP(of(W.WPROWADZANIE_ZASAD, W.ULTIMATUM, W.TWORZENIE_WARUNKOW, W.TWORZENIE_SZANS)),
                W.ZMANIURAMI_PO_INFORMACJE, W.ZADNEJ_LITOSCI
        );
    }

}
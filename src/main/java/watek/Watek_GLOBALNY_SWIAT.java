package watek;

import db.DBP;
import db.DBW;
import metoda.M;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 02.01.20.
 */
public class Watek_GLOBALNY_SWIAT extends AbstractWatek {
    W wazne = M.WAZNE(of(W.RODZINA, W.KOBIETA, W.PRACA, W.DOM));

    List<W> wymaganiaWstepne = DBW.ZBIOR_WYMAGANIA_WSTEPNE();
    List<W> wymaganiaUtrzymania = DBW.ZBIOR_WYMAGANIA_UTRZYMANIA();
    List<W> koncowe = DBW.ZBIOR_WARUNKI_KONCOWE();

    W startowe = DBW.STARTOWE_WARUNKI();
    List<W> czas = DBW.ZBIOR_CZAS();
    W duzoSieDzieje = DBW.DUZO_SIE_DZIEJE_ULICA_WARUNKI();
    W ksztaltowanieDzielnicy = DBW.KSZTALTOWANIE_DZIELNICY_WARUNKI();
    List<W> emocjeUczucia = DBW.ZBIOR_EMOCJE_UCZUCIA();
    List<W> rozrywkiZart = DBW.ZBIOR_ROZRYWKI_ZART();
    W przymus = DBW.PRZYMUS_WARUNKI();
    W potrzeby = DBW.POTRZEBY_WARUNKI();
    W zagrozenia = DBW.ZAGROZENIA_WARUNKI();
    W cierpienia = DBW.CIERPIENIA_WARUNKI();
    W przewagi = DBW.PRZEWAGI_WARUNKI();
    W slabosci = DBW.SLABOSCI_WARUNKI();
    W calyCzas = DBW.CALY_CZAS_WARUNKI();
    W typySytuacji = DBW.TYPY_SYTUACJI_WARUNKI();
    List<W> typyLudzi = DBW.ZBIOR_TYPY_LUDZI();
    W wspomnienia = DBW.WSPOMNIENIA_WARUNKI();
    List<W> tematy = DBW.ZBIOR_TEMATY();
    List<W> wiedza = DBW.ZBIOR_WIEDZA();
    W spedzanieCzasu = DBW.SPEDZANIE_CZASU_DOBRE();

    List<W> globalnaPlanszaSwiata = of(W.SWIAT, W.KONTYNENT, W.KRAJ, W.MIASTO, W.DZIELNICA, W.OSIEDLE,
                                       W.CZAS_W_HISTORII,
                                       W.LUDZIE, DBW.SILNE_WIEZY_CZLOWIEKA_WARUNKI(), DBW.PRZEWAGI_WARUNKI(), DBW.SLABOSCI_WARUNKI(), on(DBW.ZBIOR_EMOCJE_UCZUCIA()),
                                                 DBW.RELACJE_WARUNKI(), DBW.WALKA_WARUNKI(),
                                        DBW.GLOBAL_PLANSZA_LUDZIE_WARUNKI(), DBW.GLOBAL_PLANSZA_PRACA_WARUNKI(),
                                        DBW.KSZTALTOWANIE_CZLOWIEKA_WARUNKI(), DBW.KSZTALTOWANIE_DZIELNICY_WARUNKI());


    List<W> warunkiWyjscia = of(W.PORA_ROKU, W.CZAS, W.DOSTEPNOSC, W.ZOBACZENIE, W.BLISKOSC, W.KONTAKT);

    List<W> warunki = of(W.OBECNOSC, W.PLANSZA, W.CZAS_START,W.CZAS_KONIEC, W.SKUPIENIE, W.ZMECZENIE, W.BLISKOSC, W.DOSTEPNOSC);
    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.ZNAJOMI, W.POTRZEBA,W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    W przyczyny = DBW.SONDA_PRZYCZYN_WARUNKI();

    List<W> szansaNaWarunek = of(W.OBECNOSC, W.STANDARDOWE_ZACHOWANIE, W.STANDARDOWE_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNE_ULATWIENIE, W.PRZEKONYWANIE, W.ULTIMATUM);
    List<W> warunek = of(W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC);

    W orient = M.ORIENT(of(W.KONCOWY_WARUNEK, W.OBJECIE_POCZATEK_KONIEC, W.PRZEWIDZENIE_KONSEKWENCJI));
    List<W> okazja = of(W.DOBRO, W.POZNANIE, W.WALKA_PIESCI);

    W niesprawiedliwosc = DBW.NIESPRAWIEDLIWOSC_WARUNKI();
    List<W> patologie = DBP.ZBIOR_PATOLOGIE();

    List<W> otaczajacyLudzie = of(W.LUDZIE_RODZINA, W.LUDZIE_PRACA, W.LUDZIE_DZIELNICA, W.ZNAJOMI_DZIELNICA, W.OBSLUGA);

    W wartosciowaRzecz = M.KOLEJKA_DO(W.WARTOSC).SRODKI(of(W.WYSILEK, W.WALKA, W.UTRZYMANIE_SILA, W.UTRZYMANIE_EMOCJAMI));

    W silaSprawcza = M.KOLEJKA_DO(W.SILA_SPRAWCZA).SRODKI(of(W.HIERARCHIA, W.WALKA, W.UTRZYMANIE_SILA));

    List<W> glowneNurty = of(W.GRUPA_PRZESTEPCZA, W.DOBRA_PRACA, W.STUDIA, W.KLUBY_DYSKOTEKA, W.KLUBY_KIBICOWSKIE, W.RESTAURACJA, W.WAKACJE_WODA, W.ZWIAZKI,
                            W.ZNAJOMI, W.SLUZBA_ZROWIA, W.SLUZBY_MUNDUROWE, W.INTERNET, W.TELEWIZJA);

    List<W> randomowe = of(W.RESET, W.ZMIANA, W.NIE_PRZEWIDZISZ_PRZYSZLOSCI);

    public void run() {
        M.WWW(W.INFORMACJA, "--->", M.SONDA(W.INFORMACJA), "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);
        M.WW(W.DZIALANIE, "--->", M.OSIAGNIECIE(W.WARUNEK), "--->", M.ZASIEG(M.NOWY(of(W.WARUNEK, W.INFORMACJA))));

        M.WW(W.POTRZEBA, "--->", of(M.WYMAGANE(W.WARUNKI), W.PODJECIE_DECZYJI,
                                M.OPCJA(W.WIEDZA), M.OPCJA(M.SONDA(W.SZANSE_NA_SUKCES))), "--->", of(W.DZIALANIE, M.PROBA(M.REALIZACJA(W.POTRZEBA))));

        M.W(W.WARTOSC, "--->", of(M.DLUGO(M.CIEZKO(of(W.CIERPIENIE, W.PRACA))), M.MALO_OSOB(M.POSIADA(W.WARTOSC))));

        M.W(of(DBW.PRZEWAGI_WARUNKI(), W.WARUNEK_SPRZYJAJACY), "--->", M.WIEKSZE_SZANSE(M.OSIAGNIECIE(W.WARUNEK)));
        M.W(of(DBW.SLABOSCI_WARUNKI(), W.WARUNEK_NIESPRZYJAJACY) ,"--->", M.MNIEJSZE_SZANSE(M.OSIAGNIECIE(W.WARUNEK)));

        M.W(M.ZAUWAZYLEM(M.USLYSZALEM(W.INFORMACJA)), "--->", of(W.PRZEWAGA_CZASU, W.PRZEWAGA_INFORMACJI,
                                                                                    M.pochwycenie(),
                                                                                    M.dzialanie(W.WIEDZA),
                                                                                    M.osiagniecie(),
                                                                                    M.utrzymanie()));

        M.W(of(M.ZAUWAZYLEM(M.USLYSZALEM(W.INFORMACJA)),
                              W._88_, W.BRAK_DZIALANIA), "--->", of(W.STRACONA_SZANSA, M.INNA_OSOBA(M.OTRZYMANIE(W.SZANSA))));

        M.W(W.NIESWIADOMOSC, "--->", W.NIESZCZESCIE);

        M.W(M.OSOBA(W.OBECNOSC), "--->", M.MOZLIWOSC(of(W.INFORMACJA, W.DZIALANIE)));

        M.W(M.DUZO(of(W.INFORMACJE, W.WIEDZA, W.DOSWIADCZENIA)), "--->", W.MADROSC);

        M.W(of(M.WYKONYWANIE(W.PRACA), W._II_, W.NA_MIEJSCU), "--->", of(M.wszystkoAbyOtrzymacRezultat(),
                                                                                                      M.doSedna(),
                                                                                                      M.doKonca()));

        M.W(of(DBW.PRZEWAGI_WARUNKI(),
               DBW.SLABOSCI_WARUNKI(),
               DBW.KRZYWDY_WARUNKI(),
               DBW.BRAK_ZASAD_WARUNKI(),
               on(DBW.ZBIOR_EMOCJE_UCZUCIA()),
               DBW.RELACJE_WARUNKI(),
               DBW.WALKA_WARUNKI(),
               DBW.CIERPIENIA_WARUNKI(),
               W.PUSTKA),  "-------->", M.DOTYCZA(M.UDERZAJA(W.KAZDEGO_CZLOWIEKA)));

        M.WW(W.SENS_ZYCIA, "--->", of(M.NABYCIE(DBW.PRZEWAGI_MATERIALNE_WARUNKI()), W.ZALOZENIE_RODZINY, M.DOBRE_WYCHOWYWANIE(M.DUZO(W.DZIECI))), "--->", W.SZCZESCIE);

        M.W(of(DBW.KRZYWDY_WARUNKI(), DBW.BRAK_ZASAD_WARUNKI()), "--->", W.BRAK_SENSU);


        M.W(of(W._NIE_, W.WARUNEK_A), "--->", M.dzialanieNad(W.WARUNEK_B));

        M.W(of(W.ZAGROZENIE), "--->", of(M.widziszTylkoPlusy(),
                                              M.namierzPotencjalnyZysk(),
                                              M.namierzZagrozenia(),
                                              M.praca()));

        M.W(M.CALY_CZAS(W.NORMALNA_SYTUACJA), "--->", M.niedopuscDoZlejSytuacji(W.WIEDZA));

        M.W(W.ZLA_SYTUACJA, "--->", M.zbijaj(W.WIEDZA));

        M.W(of(W.WYCHODZISZ_Z_PRACY), "---->", of(M.estymacja(of(W.CZAS,W.SILY)),
                                                       M.poinformuj(W.ZNAJOMI),
                                                       M.priorytety(of(W.ULICA, W.KOBIETA, W.PRACA, W.NAUKA))));

        M.W(W.PLAN, "--->", of(M.POTRZEBNE(of(W.CZAS, W.BLISKOSC, W.DLUGOSC_DOSTEPU)),
                                                M.najszybszaWprowadzenieWZycie(),
                                                M.ominOdlozenieNaPozniej(),
                                                M.ocenWedleCoGorzej()));

        M.W(W.BRAK_WYKONANIA_PLANU, "--->", M.przechodziDoKolejnegoPokojuCzasu(W.PLAN));

        M.W(W.CHCESZ_NORMALNA_KOBIETE, of(M.pokazujSie(of(W.NORMALNE_MIEJSCE, W.NORMALNA_PORA)),
                                          M.poznawaj()));

        M.W(M.WZAJEMNE(W.WARTOSC), "--->", W.STATUS_QUO);
        M.W(M.BRAK(W.WARTOSC), "--->", W.STARCIE);

        M.W(W.ILOSC, "--->", W.JAKOSC);

        M.W(W.OSOBA, "--->", of(W.OBECNOSC, W.ENERGIA, W.CHECI, W.DZIALANIE));

        M.W(M.SMIERC(W.BLISKA_OSOBA), "--->", of(M.PERMANENTNA(W.STRATA), DBW.EMOCJE_NEGATYWNE_WARUNKI(), DBW.UCZUCIA_NEGATYWNE_WARUNKI()));

        M.W(M.OSOBA(W.INNA_RASA), "--->", M.ZWYKLE(of(W.RASIZM, M.GORSZE_TRAKTOWANIE(W.OSOBA))));

        M.W(M.POZNANIE(W.OSOBA), "--->", M.NABYCIE(W.RELACJA));

        M.W(W.SILA_RZADZI, "--->", of(M.PRAWDZIWA(W.WARTOSC), W.PRAWDA));
        M.W(M.BRAK(W.SILA_RZADZI), "--->", of(M.BRAK(W.WARTOSC), W.KLAMSTWO, W.FEST_RZADZI));

        M.W(of(W.WIEDZA, W.INFORMACJA, M.WNIOSKI(W.DOSWIADCZENIA),
               W.SONDA, W.WLASCIWA_OCENA, W.ZNAJOMOSC_OTOCZENIA,
                             W.TRZEZWOSC, M.WNIOSKI(W.HISTORIA)),"--->", W.TRAFNE_DECYZJE);

        M.W(W.NIEZNAJOMY, "--->", W.STANDARDOWA_SYTUACJA);
        M.W(W.ZNAJOMY, "--->", W.SRODOWISKOWA_SYTUACJA);
        M.W(W.WARUNEK_SPRZYJAJACY, "--->", W.CHCIANA_SYTUACJA);

        waznyTrudnyWarunek();
        najwiekszaStrata();
        zNieswiadomosci();
        rozmowa();
        zasobZjawiskoStandardowo();
    }
    public void waznyTrudnyWarunek() {
        of(
                M.PERSPEKTYWA(W.ULICA).MALY_WARUNEK(W.PIENIADZE),
                M.WAZNE(W.RODZINA),
                M.WAZNE(of(W.INFORMACJA, W.CZAS)),
                M.WAZNE(of(W.ULICA, W.SILA, W.ZNAJOMI)),
                M.WAZNE(of(W.ROZWOJ_UMYSLOWY, W.ROZWOJ_FIZYCZNY)),
                M.WAZNE(of(W.WYCHODZENIE, W.OBECNOSC)),
                M.WAZNE(W.POZNANIE),

                M.TRUDNO(M.MEZCZYZNA(W.ZWIAZEK)),
                M.LATWO(M.KOBIETA(W.ZWIAZEK)),
                M.LATWO(W.EMIGRACJA),
                M.TRUDNO(W.PRACA_KRAJ),
                M.TRUDNO(W.POZNANIE).GDY(W.MALE_SKUPISKO_LUDZI),
                M.TRUDNO(W.TRZEZWOSC),
                M.LATWO(W.UZYWKI)
        );
    }

    public void najwiekszaStrata() {
        M.W(of(W.ULICA), "--->", of(W.SPRZET, W.KONTUZJA));

        M.W(of(W.PRACA), "--->", of(W.ZWOLNIENIE, W.SPRAWA_W_SADZIE));
    }

    public void zNieswiadomosci() {
        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", M.SPOTKANY(W.ZLY), "--->", M.OSOBA(W.ZLO));
        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", M.SPOTKANY(W.DOBRY), "--->", M.OSOBA(W.DOBRO));
        M.WW(M.OSOBA(W.NIESWIADOMOSC), "--->", M.POZNANIE(W.CIEZKA_PRACA), "--->", M.OSOBA(W.PRACA));
    }

    public void rozmowa() {
        M.CALY_CZAS(W.SYTUACJA_SRODOWISKOWA);

        M.WSPOMNIJ(W.SYTUACJA).POWIAZ_Z(W.OSOBA).WSPOMIJ(W.REZULTAT)
                                                .WSPOMIJ(W.SKOJARZONE);
    }

    public void zasobZjawiskoStandardowo() {
        M.W(W.OSOBA, "--->", M.ZWYKLE(of(W.ZLY, W.GLUPI)));

        M.W(W.OSOBA, "--->", M.ZWYKLE(W.CIEZKO_W_ZYCIU));

        M.W(W.DZIALANIE, "--->", M.ZWYKLE(of(W.ZLE, W.GLUPIE)));

        M.W(W.NOWA_OSOBA, "--->", M.ZWYKLE(DBW.KRZYWDY_WARUNKI()));

        M.W(W.DZIALANIE, "--->", M.ZWYKLE(M.DZIALANIE(W.ZA_CIOSEM)));
    }
}

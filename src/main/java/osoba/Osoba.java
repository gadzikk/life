package osoba;

import metoda.Metoda;
import miejsce.Miejsce;
import typy_bazowe.*;
import warunek.Przewaga;
import warunek.Warunek;
import z_inne.*;

import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Osoba {
    TypKolorSkory kolorSkory;
    TypRasa rasa;
    TypNarodowsc narodowosc;
    TypPlec plec;

    Wychowanie wychowanie;
    Warunek priorytet;
    List<TypOsoby> typyOsoby;
    List<Warunek> oceniaWg;

    TypIlosc iloscPrzewag;
    List<Warunek> przewagi;
    TypIlosc iloscPrzezyc;
    List<Miejsce> planszeOdwiedzone;
    List<Metoda> metody;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypJakosc pamiec;

    TypPriorytetoweSrodowisko priorytetoweSrodowisko;
    List<TypUmiejetnosc> umiejetnosci;

    boolean arcyZlo;
    boolean dlaDiabla;

    boolean zlo;
    boolean reagujeNaZlo;
    boolean dobro;
    boolean reagujeNaDobro;

    boolean wiocha;
    boolean miasto;

    boolean wysilekFizyczny;
    boolean wysilekUmyslowy;
    boolean mocnyWzrok;
    boolean dobryGen;
    boolean swiadomosc;
    boolean swiadomoscZagrozen;
    boolean swiadomoscUlicy;
    boolean swiadomoscPrzewag;
    boolean swiadomoscRynkuPracy;
    boolean swiadomoscPatologiiZwiazkow;
    boolean madrosc;
    boolean wiedza;
    boolean sila;
    boolean spryt;
    boolean szybkosc;
    boolean cel;

    boolean zKims;
    boolean zWaznym;

    boolean czynny;
    boolean bierny;
    boolean stwarzaPointCut;
    boolean stwarzaPointCutWzokiem;
    boolean stwarzaPointCutMowa;
    boolean stwarzaPointCutKontaktem;
    boolean stwarzaPointCutRandka;

    boolean chceLepszegoZycia;
    boolean chceWygod;

    boolean wkurwionyZyciem;
    boolean nuda;
    boolean kurestwo;
    BrakZasad brakZasad;
    boolean kregoslupMoralny;
    boolean sprzet;

    boolean wiecznyImigrant;
    boolean osiedloweSrd;
    boolean bliskosc;
    boolean dostepDobreJednostki;
    boolean dostepBiegacze;
    boolean magiczneZaklecia;
    boolean odkogoJestes;

    boolean poCichu;
    boolean zdolnyWalka;
    boolean zdolnyRyzyko;
    boolean stwarzaZagrozenie;
    boolean bezposredniosc;
    boolean odwaga;
    boolean umieKlucic;
    boolean umieCisnac;

    boolean broniHierarchii;
    boolean broniGlobalu;

    boolean wyklucza;
    boolean ukrywaDobra;
    boolean skreslaNaZawsze;
    boolean staleDokrecaSrube;
    boolean zdolnyDoOdpuszczenia;
    boolean resetAble;

    boolean posluszny;
    boolean przekonywalny;
    boolean niezaleznosc;

    boolean glupi;
    boolean traktowanieZGory;
    boolean ignorowanieInformacji;

    boolean lukiOsobowosci;
    boolean egoista;
    boolean wstyd;
    boolean zazdrosc;
    boolean agresja;
    boolean klamstwo;
    boolean niestabilnoscUmyslowa;
    boolean brakOkresleniaSkali;
    boolean brakCheci;

    boolean hajsWDomu;
    boolean bogaty;
    boolean jedynak;
    boolean systemowiec;
    boolean studia;

    boolean bezpieczenstwo;
    boolean bagatelizujeZagrozenie;
    boolean nieznaCierpienia;
    boolean zuchwaly;
    boolean sztuczny;

    boolean biedny;
    boolean brakPerspektyw;
    boolean zycieZDniaNaDzien;
    boolean wyjebane;

    boolean wrazliwy;
    boolean wolnoscLekkosc;
    boolean europejski;
    boolean rasista;

    boolean czas;
    boolean brakCzasu;
    TypIlosc dostepnosc;
    boolean praca;
    boolean pasja;

    boolean nalog;
    boolean narkotyki;
    boolean palenie;
    boolean picie;
    boolean trzezwosc;

    boolean brzydki;
    boolean ladny;
    List<TypSex> sexZ;
    TypWyjezdzenie wyjezdzenie;
    boolean dziewictwo;

    boolean mily;
    boolean otwartyNaZwiazek;
    boolean restrykcjaZnajomych;
    boolean dopuszczaNieznajomych;

    boolean usmiechaSie;
    boolean smiejeSie;

    boolean odwracaWzrok;
    boolean neutralWzrok;
    boolean patrzy;
    boolean reagujeNaBodzce;

    boolean samotny;
    boolean zajety;
    TypIlosc iloscPartnerow;
    boolean dzieci;
    Integer iloscDzieci;

    boolean przestrzegaPrawa;
    boolean standardZachowania;

    boolean wyrok;
    Przerwa przerwa;

    boolean konfi;

    DzienCodzienny dzienCodzienny;
    TypIlosc iloscZnajomych;
    TypIlosc iloscDobrziZnajomi;
    Srodki srodki;
    Majatek majatek;
    Miejsce miejsceZamieszkania;
    OsobyOrazWarunki wyjebaneNa;
    OsobyOrazWarunki dbaO;
    Oczekiwania oczekiwania;
    TypPunktZerowy punktZerowy;

}
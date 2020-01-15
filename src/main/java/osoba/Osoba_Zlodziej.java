package osoba;

import typy_bazowe.*;
import warunek.W;
import z_inne.Wychowanie;

/**
 * Created by gadzik on 15.01.20.
 */
public class Osoba_Zlodziej extends Osoba {
    public Osoba_Zlodziej() {
        kolorSkory = TypKolorSkory.BIALY;
        rasa = TypRasa.SLOWIANIN;
        narodowosc = TypNarodowsc.POLSKA;
        plec = TypPlec.M;

        wychowanie = new Wychowanie(TypDziecinstwo.BRAK, of(TypMiejsce.SZKOLA, TypMiejsce.OSIEDLOWE_SRD, TypMiejsce.DOM,
                TypMiejsce.PRACA_BUDYNEK), true, true, true,
                false, false, true, true, false, true, true,
                true, true, true, true, true, false, false, false);
        priorytet = of(W.ZASADY, W.UMIEJETNOSCI, W.WSPIERANIE_SWOJEJ_KLASY);
        typyOsoby = of(TypOsoby.ZLODZIEJ, TypOsoby.PATOLOG, TypOsoby.CZOLO, TypOsoby.RDZENNY_DOBRY);
        oceniaWg = of(W.DOBRO, W.UMIEJETNOSC, W.PODOBIENSTWO);

        //      iloscPrzewag;
        //      przewagi;
        //      slabosci;

        iloscPrzezyc = TypIlosc.BARDZO_DUZA;
        planszeOdwiedzone = of(TypMiejsce.ULTRAUNIKALNE, TypMiejsce.WYWOLUJACE_STRACH_CIERPIENIE);

        iloscCierpienia = TypIlosc.BARDZO_DUZA;
        iloscBurzuazji = TypIlosc.BARDZO_MALA;
        pamiec = TypJakosc.BARDZO_DOBRA;

        priorytetoweSrodowisko = TypPriorytetoweSrodowisko.DZIELNICA;
        gadanie = of(W.TWORZY_NADRZEDNY_FLOW, W.TWORZY_ZRODELKO);

//        arcyZlo;
//        dlaDiabla;

//        zlo;
//        reagujeNaZlo;
        dobro = true;
        reagujeNaDobro = true;

//        wiocha;
        miasto = true;

        wysilekFizyczny = true;
        wysilekUmyslowy = true;
        mocnyWzrok = true;
//        dobryGen;
        swiadomosc = true;
        swiadomoscZagrozen = true;
        swiadomoscUlicy = true;
        swiadomoscPrzewag = true;
//        swiadomoscRynkuPracy;
        swiadomoscPatologiiZwiazkow = true;
        madrosc = true;
        wiedza = true;
        sila = true;
        spryt = true;
        szybkosc = true;
        cel = true;
        zobowiazanie = true;
        oczekiwanie = true;
        wymaganie = true;
        zdolnyDoUltimatum = true;
        miejsceHierarchia = true;

        zKims = true;
        zWaznym = true;

        czynny = true;
//        bierny;
        stwarzaPointCut = true;
        stwarzaPointCutWzokiem = true;
        stwarzaPointCutMowa = true;
        stwarzaPointCutKontaktem = true;
        stwarzaPointCutRandka = true;

        chceLepszegoZycia = true;
//        chceWygod;

        wkurwionyZyciem = true;
//        nuda;
//        kurestwo;
        tepiKurestwo = true;
//        brakZasad;
        zasady = true;
        kregoslupMoralny = true;
        sprzet = true;

        wiecznyImigrant = true;
        mocnaJednostka = true;
//        osiedloweSrd;
//        bliskosc;
//        dostepDobreJednostki;
//        dostepBiegacze;
        magiczneZaklecia = true;
        odkogoJestes = true;

//        poCichu;
        zdolnyWalka = true;
        zdolnyRyzyko = true;
        stwarzaZagrozenie = true;
        bezposredniosc = true;
        odwaga = true;
        umieKlucic = true;
        umieCisnac = true;

//        chetnyDoBojki;
//        agresjaCzynna;

//        broniHierarchii;
        broniGlobalu = true;

//        wyklucza;
//        ukrywaDobra;
//        skreslaNaZawsze;
//        staleDokrecaSrube;
        zdolnyDoOdpuszczenia = true;
//        resetAble;

//        posluszny;
//        przekonywalny;
        odporny = true;
        niezaleznosc = true;

//        glupi;
//        traktowanieZGory;
//        ignorowanieInformacji;

//        lukiOsobowosci;
//        egoista;
//        wstyd;
//        zazdrosc;
//        agresja;
//        klamstwo;
//        niestabilnoscUmyslowa;
//        brakOkresleniaSkali;
//        brakCheci;

//        hajsWDomu;
//        bogaty;
//        jedynak;
//        systemowiec;
//        studia;

//        bezpieczenstwo;
//        bagatelizujeZagrozenie;
//        nieznaCierpienia;
//        zuchwaly;
//        zadufanyWSobie;
//        sztuczny;

//        biedny;
//        brakPerspektyw;
//        zycieZDniaNaDzien;
//        wyjebane;

//        wrazliwy;
//        wolnoscLekkosc;
//        europejski;
        rasista = true;

//        czas;
        brakCzasu = true;
        dostepnosc = true;
        praca = true;
//        pasja;

//        nalog;
//        narkotyki;
//        palenie;
//        picie;
        trzezwosc = true;

//        brzydki;
        ladny = true;
        sexZ = of(TypSex.BRAK, TypSex.Z_PARTNEREM);
//        szlauf;
//        worekNaSpermeZagranicznych;
//        wyjezdzenie;
        dziewictwo = true;

        mily = true;
        otwartyNaZwiazek = true;
        restrykcjaZnajomych = true;
        dopuszczaNieznajomych = true;

        usmiechaSie = true;
        smiejeSie = true;

//        odwracaWzrok;
//        neutralWzrok;
        patrzy = true;
        reagujeNaBodzce =true;

//        samotny;
//        zajety;
        iloscPartnerow = TypIlosc.MALA;
//        dzieci;
        iloscDzieci = 0;

//        przestrzegaPrawa;
//        standardZachowania;

//        wyrok;
//        przerwa;

//        potencjalnyKonfi;
//        konfi;

        iloscZnajomych = TypIlosc.SREDNIA;
        iloscDobrziZnajomi = TypIlosc.MALA;
        srodki = of(W.WALKA_PIESCI, W.WALKA_SPRZET, W.CISNIE);
//        majatek;
//        miejsceZamieszkania;
//        wyjebaneNa;
//        dbaO;
//        oczekiwania;
        punktZerowy = TypPunktZerowy.BARDZO_WYSOKO;
//        dzienCodzienny;
        wpiszPrzewagiSlabosci();
    }
}

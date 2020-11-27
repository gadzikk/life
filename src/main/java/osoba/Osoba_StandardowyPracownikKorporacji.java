package osoba;

import typy_bazowe.*;
import warunek.W;
import z_inne.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by gadzik on 19.12.19.
 */
public class Osoba_StandardowyPracownikKorporacji extends Osoba {
    public Osoba_StandardowyPracownikKorporacji() {
        kolorSkory = TypKolorSkory.BIALY;
        rasa = TypRasa.SLOWIANIN;
        narodowosc = TypNarodowsc.POLSKA;
        plec = TypPlec.MK;

        wychowanie = new Wychowanie(TypDziecinstwo.DOBRE, of(TypMiejsce.SZKOLA, TypMiejsce.STUDIA, TypMiejsce.TRAUTO,
                TypMiejsce.DOM, TypMiejsce.PRACA_BUDYNEK, TypMiejsce.KOSCIOL), false, false, false,
                true, true, false, false, false,
                false, false, false, false, false, false,
                false, true, true, false);
        priorytet = of(W.PIENIADZE, W.WYGODY, W.WSPIERANIE_SWOJEJ_KLASY);
        typyOsoby = of(TypOsoby.FEST, TypOsoby.BANAN, TypOsoby.SYSTEMOWY_BURZUJ, TypOsoby.WYGODNIS, TypOsoby.BURZUJ_NIESWIADOMY,
                TypOsoby.BURZUJ_DZIALACZ);
        oceniaWg = of(W.PRZEWAGA, W.ZLO, W.PODOBIENSTWO);

//        iloscPrzewag;
//        przewagi;
//        slabosci;

        iloscPrzezyc = TypIlosc.MALA;
        planszeOdwiedzone = of(TypMiejsce.WAKACJE, TypMiejsce.IMPREZY);
//        metody;

        iloscCierpienia = TypIlosc.MALA;
        iloscBurzuazji = TypIlosc.DUZA;
        pamiec = TypJakosc.SREDNIA;

        priorytetoweSrodowisko = TypPriorytetoweSrodowisko.RODZINA;
        gadanie = of(W.NA);

//        arcyZlo;
//        dlaDiabla;

        zlo = true;
        reagujeNaZlo = true;
//        dobro;
//        reagujeNaDobro;

        wiocha = true;
//        miasto;

//        wysilekFizyczny;
        wysilekUmyslowy = true;
        mocnyWzrok = true;
//        dobryGen;
//        swiadomosc;
        swiadomoscZagrozen = true;
//        swiadomoscUlicy;
        swiadomoscPrzewag = true;
        swiadomoscRynkuPracy = true;
        swiadomoscPatologiiZwiazkow = true;
//        madrosc;
        wiedza = true;
//        sila;
//        spryt;
//        szybkosc;
        cel = true;
//        zobowiazanie;
//        oczekiwanie;
//        wymaganie;
//        zdolnyDoUltimatum;
//        miejsceHierarchia;

        zKims = true;
//        zWaznym;

        czynny = true;
//        bierny;
//        stwarzaPointCut;
        stwarzaPointCutWzokiem = true;
        stwarzaPointCutMowa = true;
//        stwarzaPointCutKontaktem;
//        stwarzaPointCutRandka;

//        chceLepszegoZycia;
        chceWygod = true;

//        zdenerwowanyZyciem;
        nuda = true;
        kurestwo = true;
//        tepiKurestwo;
        brakZasad = new BrakZasad(false,false,false,
                false,false,true);
//        zasady;
//        kregoslupMoralny;
//        sprzet;

//        wiecznyImigrant;
//        mocnaJednostka;
//        osiedloweSrd;
//        bliskosc;
//        dostepDobreJednostki;
//        dostepBiegacze;
//        magiczneZaklecia;
//        odkogoJestes;

        poCichu = true;
//        zdolnyWalka;
//        zdolnyRyzyko;
//        stwarzaZagrozenie;
//        bezposredniosc;
//        odwaga;
        umieKlucic = true;
//        umieCisnac;

//        chetnyDoBojki;
//        agresjaCzynna;

        broniHierarchii = true;
//        broniGlobalu;

        wyklucza = true;
        ukrywaDobra = true;
        skreslaNaZawsze = true;
//        staleDokrecaSrube;
        zdolnyDoOdpuszczenia = true;
        resetAble = true;

        posluszny = true;
        przekonywalny = true;
//        odporny;
//        niezaleznosc;

//        glupi;
        traktowanieZGory = true;
//        ignorowanieInformacji;

        lukiOsobowosci = true;
        egoista = true;
//        wstyd;
        zazdrosc = true;
//        agresja;
        klamstwo = true;
//        niestabilnoscUmyslowa;
        brakOkresleniaSkali = true;
//        brakCheci;

        hajsWDomu = true;
        bogaty = true;
        jedynak = true;
        systemowiec = true;
        studia = true;
        bezpieczenstwo = true;
        bagatelizujeZagrozenie = true;
        nieznaCierpienia = true;
        zuchwaly = true;
        zadufanyWSobie = true;
        sztuczny = true;

//        biedny;
//        brakPerspektyw;
//        zycieZDniaNaDzien;
//        nieObchodzi;

        wrazliwy = true;
        wolnoscLekkosc = true;
        europejski = true;
//        rasista;

//        czas;
        brakCzasu = true;
//        dostepnosc;
        praca = true;
        pasja = true;

//        nalog;
//        narkotyki;
        palenie = true;
        picie = true;
//        trzezwosc;

//        brzydki;
        ladny = true;
        sexZ = of(TypSex.Z_PARTNEREM, TypSex.Z_ZAGRANICZNYMI);
//        szlauf;
//        worekNaSpermeZagranicznych;
         wyjezdzenie = TypWyjezdzenie.POWYZEJ_100X;
//        dziewictwo;

        mily = true;
//        otwartyNaZwiazek;
        restrykcjaZnajomych = true;
//        dopuszczaNieznajomych;

//        usmiechaSie;
//        smiejeSie;

        odwracaWzrok = true;
        neutralWzrok = true;
//        patrzy;
//        reagujeNaBodzce;

//        samotny;
        zajety = true;
        iloscPartnerow = TypIlosc.SREDNIA;
//        dzieci;
        iloscDzieci = 0;

        przestrzegaPrawa = true;
        standardZachowania = true;

//        wyrok;
//        przerwa;

//        konfi;
        potencjalnyKonfi = true;

        iloscZnajomych = TypIlosc.SREDNIA;
        iloscDobrziZnajomi = TypIlosc.BARDZO_MALA;
        srodki = of(W.LUDZIE_ZA_TOBA, W.PRZEKONYWANIE, W.KLAMSTWO, W.CISNIE, W.STANDARDY, W.PRAWO);

//        majatek;
//        miejsceZamieszkania;
//        nieObchodziGo;
//        dbaO;
//        oczekiwania;
        punktZerowy = TypPunktZerowy.WYSOKO;

        List<Zadanie> zEg = Arrays.asList(
                new Zadanie(TypZadania.JEDZENIE, 7, 1, null),
                new Zadanie(TypZadania.SZYKOWANIE, 7, 1, null)
        );

        List<Zadanie> zOb = new ArrayList<>();
        if (praca){
            zOb.add(new Praca(TypZadania.PRACA, TypPraca.BIUROWA, TypPlaca.DOBRZE_PLATNA, true,
                    5, 8, false, false, null));
        }
        List<Zadanie> zOp = new ArrayList<>();
        if (!iloscZnajomych.equals(TypIlosc.BARDZO_MALA)){
            zOp.add(new Zadanie(TypZadania.ZNAJOMI, 3, 2, null));
        }
        if (wysilekFizyczny){
            zOp.add(new Zadanie(TypZadania.TRENING, 2, 2, true, true, null));
        }
        zOp.add(new Zadanie(TypZadania.ZAKUPY, 1, 3, null));
        dzienCodzienny = new DzienCodzienny(zEg, zOb, zOp);

        wpiszPrzewagiSlabosci();
    }
}

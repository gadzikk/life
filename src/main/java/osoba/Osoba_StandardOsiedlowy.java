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
public class Osoba_StandardOsiedlowy extends Osoba {

    public Osoba_StandardOsiedlowy() {
        kolorSkory = TypKolorSkory.BIALY;
        rasa = TypRasa.SLOWIANIN;
        narodowosc = TypNarodowsc.POLSKA;
        plec = TypPlec.M;

        wychowanie = new Wychowanie(TypDziecinstwo.ZLE, of(TypMiejsce.SZKOLA, TypMiejsce.OSIEDLOWE_SRD, TypMiejsce.DOM,
                TypMiejsce.PRACA_BUDYNEK), true, false, false,
                false, true, true, true, false,
                true, false, false, true, false, false,
                true, true, true, true);
        priorytet = of(W.OSIEDLOWE_SRD);
        planszeOdwiedzone = of(TypMiejsce.WAKACJE_POLSKA, TypMiejsce.DOBRE_KLUBY_1_STRONA, TypMiejsce.MECZ_1_STRONA);
        typyOsoby = of(TypOsoby.OSIEDLOWY_WYKRECONY, TypOsoby.OSIEDLOWY_BURZUJ, TypOsoby.OSIEDLOWY_NORMAL);
        oceniaWg = of(W.EKIPA, W.PRZEWAGA, W.PODOBIENSTWO, W.ZLO);

        //      iloscPrzewag;
        //      przewagi;
        //      slabosci;

        iloscPrzezyc = TypIlosc.SREDNIA;
        planszeOdwiedzone = of(TypMiejsce.WAKACJE_POLSKA, TypMiejsce.DOBRE_KLUBY_1_STRONA, TypMiejsce.MECZ_1_STRONA, TypMiejsce.OSIEDLOWE_SRD);

        iloscCierpienia = TypIlosc.SREDNIA;
        iloscBurzuazji = TypIlosc.SREDNIA;
        pamiec = TypJakosc.SLABA;

        priorytetoweSrodowisko = TypPriorytetoweSrodowisko.DZIELNICA;
        gadanie = of(W.TWORZY_ZRODELKO, W.AKTYWNY_NA_ANGAZ, W.ODPOWIADA_NA_ANGAZ);

//        arcyZlo;
//        dlaDiabla;

        zlo = true;
        reagujeNaZlo = true;
//        dobro;
//        reagujeNaDobro;

//        wiocha;
        miasto = true;

        wysilekFizyczny = true;
//        wysilekUmyslowy;
        mocnyWzrok = true;
//        dobryGen;
//        swiadomosc;
        swiadomoscZagrozen = true;
//        swiadomoscUlicy;
        swiadomoscPrzewag = true;
//        swiadomoscRynkuPracy;
        swiadomoscPatologiiZwiazkow = true;
//        madrosc;
//        wiedza;
//        sila;
        spryt = true;
//        szybkosc;
//        cel;
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
//        stwarzaPointCutWzokiem;
//        stwarzaPointCutMowa;
//        stwarzaPointCutKontaktem;
//        stwarzaPointCutRandka;

        chceLepszegoZycia = true;
        chceWygod = true;

//        zdenerwowanyZyciem;
        nuda = true;
        kurestwo =true;
//        tepiKurestwo;
        brakZasad = new BrakZasad(false,false,false,
                false,false,true);
//        zasady
//        kregoslupMoralny;
        sprzet = true;

//        wiecznyImigrant;
        osiedloweSrd = true;
        bliskosc = true;
//        dostepDobreJednostki;
        dostepBiegacze = true;
        magiczneZaklecia = true;
        odkogoJestes = true;

        poCichu = true;
        zdolnyWalka = true;
        zdolnyRyzyko = true;
        bezposredniosc = true;
//        odwaga;
//        umieKlucic;
        umieCisnac = true;

        chetnyDoBojki = true;
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

        glupi = true;
        traktowanieZGory = true;
//        ignorowanieInformacji;

//        lukiOsobowosci;
//        egoista;
//        wstyd;
        zazdrosc = true;
        agresja = true;
        klamstwo = true;
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
        zuchwaly = true;
//        sztuczny;

        biedny = true;
//        brakPerspektyw;
//        zycieZDniaNaDzien;
        niePrzejmujeSie = true;

//        wrazliwy;
//        wolnoscLekkosc;
//        europejski;
        rasista = true;

//        czas;
        brakCzasu = true;
//        dostepnosc;
        praca = true;
//        pasja;

        nalog = true;
        narkotyki = true;
        palenie = true;
        picie = true;
//        trzezwosc;

        brzydki = true;
//        ladny;
        sexZ = of(TypSex.BRAK, TypSex.Z_PARTNEREM);
//        szlauf;
//        worekNaSpermeZagranicznych;
//        wyjezdzenie;
//        dziewictwo;

//        mily;
//        otwartyNaZwiazek;
        restrykcjaZnajomych = true;
//        dopuszczaNieznajomych;

        usmiechaSie = true;
        smiejeSie = true;

//        odwracaWzrok;
//        neutralWzrok;
        patrzy = true;
        reagujeNaBodzce = true;

//        samotny;
        zajety = true;
        iloscPartnerow = TypIlosc.SREDNIA;
//        dzieci;
        iloscDzieci = 0;

//        przestrzegaPrawa;
//        standardZachowania;

//        wyrok;
//        przerwa;

//        potencjalnyKonfi;
//        konfi;

        iloscZnajomych = TypIlosc.SREDNIA;
        iloscDobrziZnajomi = TypIlosc.SREDNIA;
        srodki = of(W.LUDZIE_ZA_TOBA, W.PRZEKONYWANIE, W.WALKA_PIESCI, W.WALKA_SPRZET, W.KLAMSTWO, W.CISNIE, W.STANDARDY, W.PRAWO);
//        majatek;
//        miejsceZamieszkania;
//        nieObchodziGo;
//        dbaO;
//        oczekiwania;
        punktZerowy = TypPunktZerowy.NA_SWOIM_POZIOMIE;

        List<Zadanie> zEg = Arrays.asList(
                new Zadanie(TypZadania.JEDZENIE, 7, 1, null),
                new Zadanie(TypZadania.SZYKOWANIE, 7, 1, null)
        );

        List<Zadanie> zOb = new ArrayList<>();
        if (praca)
            zOb.add(new Praca(TypZadania.PRACA, TypPraca.FIZYCZNA, TypPlaca.SREDNIO_PLATNA, false,
                    5, 8, true, true, null));

        List<Zadanie> zOp = new ArrayList<>();
        if (!iloscZnajomych.equals(TypIlosc.BARDZO_MALA)){
            zOp.add(new Zadanie(TypZadania.ZNAJOMI, 3, 2, null));
        }
        if (wysilekFizyczny){
            zOp.add(new Zadanie(TypZadania.TRENING, 2, 2, true, true, null));
        }
        zOp.add(new Zadanie(TypZadania.ZAKUPY, 1, 3, null));
        zOp.add(new Zadanie(TypZadania.MELANZ, 2, 2, null));

        dzienCodzienny = new DzienCodzienny(zEg, zOb, zOp);
        wpiszPrzewagiSlabosci();
    }
}

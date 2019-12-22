import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 19.12.19.
 */
public class Osoba_DefaultOsiedlowy extends Osoba {

    public Osoba_DefaultOsiedlowy() {
        KolorSkory kolorSkory = KolorSkory.BIALY;
        Rasa rasa = Rasa.SLOWIANIN;
        Narodowosc narodowsc = Narodowosc.POLSKA;
        Plec plec = Plec.M;

        Wychowanie wychowanie = new Wychowanie(false, true, true, true,
                false, false, true, false, false,
                true, false, true, true, false, true,
                true);

        Priorytet priorytet = Priorytet.SRODOWISKO;
        List<String> planszeOdwiedzone;
        List<TypOsoby> typy = Arrays.asList(TypOsoby.OSIEDLOWY, TypOsoby.OSIEDLOWY_BURZUJ);
        List<Przewaga> przewagi;

        boolean zlo = true;
        boolean dobro;

        boolean wiocha;
        boolean miasto = true;

        boolean wysilekFizyczny = true;
        boolean wysilekUmyslowy;
        boolean mocnyWzrok = true;
        boolean dobryGen;
        boolean swiadomosc;
        boolean madrosc;
        boolean wiedza;
        boolean sila;
        boolean cel;

        boolean czynny;
        boolean bierny = true;
        boolean stwarzaPointCut;

        boolean chceLepszegoZycia = true;
        boolean chceWygod = true;

        boolean nuda = true;
        boolean brakZasad;
        boolean kurestwo = true;
        boolean kregoslupMoralny;
        boolean sprzet = true;

        boolean wiecznyImigrant;
        boolean osiedloweSrd = true;
        boolean bliskosc = true;
        boolean dostepDobreJednostki;
        boolean dostepBiegacze = true;
        boolean magiczneZaklecia = true;
        boolean odkogoJestes = true;

        boolean poCichu = true;
        boolean zdolnyWalka = true;
        boolean zdolnyRyzyko = true;
        boolean bezposredniosc = true;
        boolean odwaga;
        boolean umieKlucic;
        boolean umieCisnac = true;

        boolean wyklucza = true;
        boolean ukrywaDobra = true;
        boolean skreslaNaZawsze = true;
        boolean staleDokrecaSrube;
        boolean zdolnyDoOdpuszczenia = true;

        boolean posluszny = true;
        boolean przekonywalny = true;
        boolean niezaleznosc;

        boolean glupi = true;
        boolean traktowanieZGory;
        boolean ignorowanieInformacji;

        boolean lukiOsobowosci;
        boolean egoista;
        boolean wstyd;
        boolean zazdrosc = true;
        boolean agresja = true;
        boolean klamstwo = true;
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
        boolean wyjebane = true;

        boolean wrazliwy;
        boolean wolnoscLekkosc;
        boolean europejski;
        boolean rasista = true;

        boolean czas;
        boolean brakCzasu = true;
        TypIlosc dostepnosc = TypIlosc.SREDNIA;
        boolean praca = true;

        boolean nalog = true;
        boolean narkotyki = true;
        boolean palenie = true;
        boolean picie = true;
        boolean trzezwosc;

        boolean brzydki = true;
        boolean ladny;
        boolean dupodajka;
        boolean sklonnoscDoSexu = true;
        boolean dziewictwo;

        boolean mily;
        boolean otwartyNaZwiazek = true;
        boolean restrykcjaZnajomych = true;
        boolean dopuszczaNieznajomych;

        boolean usmiechaSie = true;
        boolean smiejeSie = true;

        boolean odwracaWzrok;
        boolean neutralWzrok;
        boolean patrzy = true;
        boolean reagujeNaBodzce = true;

        boolean samotny;
        boolean zajety = true;
        Integer iloscPartnerow = 3;
        boolean dzieci;
        Integer iloscDzieci = 0;

        boolean przestrzegaPrawa;
        boolean standardZachowania;

        boolean wyrok;
        Przerwa przerwa;

        boolean konfi;

        TypIlosc iloscZnajomych = TypIlosc.SREDNIA;
        Integer liczbaZnajomych = 10;
        Integer liczbaDobrziZnajomi = 3;

        Srodki srodki = new Srodki(true, true, true, true, true, true,
                true, false);
        Majatek majatek;
        Miejsce miejsceZamieszkania;

        List<Zadanie> zEg = Arrays.asList(
                new Zadanie(TypZadania.JEDZENIE, 7, 1, null),
                new Zadanie(TypZadania.SZYKOWANIE, 7, 1, null)
        );

        List<Zadanie> zOb = new ArrayList<>();
        if (praca)
            zOb.add(new Praca(TypZadania.PRACA, TypPraca.FIZYCZNA, TypPlaca.SREDNIO_PLATNA, false,
                    5, 8, true, true, null));

        List<Zadanie> zOp = new ArrayList<>();
        if (liczbaZnajomych > 0)
            zOp.add(new Zadanie(TypZadania.ZNAJOMI, 3, 2, null));

        if (wysilekFizyczny)
            zOp.add(new Zadanie(TypZadania.TRENING, 2, 2, true, true, null));
        zOp.add(new Zadanie(TypZadania.ZAKUPY, 1, 3, null));
        zOp.add(new Zadanie(TypZadania.MELANZ, 2, 2, null));

        DzienCodzienny dzienCodzienny = new DzienCodzienny(zEg, zOb, zOp);
    }
}

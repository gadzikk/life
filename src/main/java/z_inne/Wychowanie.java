package z_inne;

import miejsce.Miejsce;
import typy_bazowe.TypDziecinstwo;

import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Wychowanie {
    public TypDziecinstwo dziecinstwo;
    public List<Miejsce> odwiedzoneMiejsca;

    public boolean patologiaWDomu;
    public boolean gorzejNizWszyscy;
    public boolean zGoryPrzegrany;

    public boolean bylaNauka;
    public boolean byliRodzice;
    public boolean bylaWalka;
    public boolean byloCierpienie;

    public boolean podkloszem;
    public boolean czestoWychodzil;
    public boolean dostepDoWieluPlansz;

    public boolean mowiPrawde;
    public boolean slowaCzyny;
    public boolean dobreSerce;
    public boolean umiejetnosc;

    public boolean klapsy;
    public boolean kary;

    public boolean dostawalPieniadze;
    public boolean narkotyki;

    public Wychowanie(TypDziecinstwo dziecinstwo, List<Miejsce> odwiedzoneMiejsca, boolean patologiaWDomu, boolean gorzejNizWszyscy, boolean zGoryPrzegrany, boolean bylaNauka, boolean byliRodzice, boolean bylaWalka, boolean byloCierpienie, boolean podkloszem, boolean czestoWychodzil, boolean dostepDoWieluPlansz, boolean mowiPrawde, boolean slowaCzyny, boolean dobreSerce, boolean umiejetnosc, boolean klapsy, boolean kary, boolean dostawalPieniadze, boolean narkotyki) {
        this.dziecinstwo = dziecinstwo;
        this.odwiedzoneMiejsca = odwiedzoneMiejsca;
        this.patologiaWDomu = patologiaWDomu;
        this.gorzejNizWszyscy = gorzejNizWszyscy;
        this.zGoryPrzegrany = zGoryPrzegrany;
        this.bylaNauka = bylaNauka;
        this.byliRodzice = byliRodzice;
        this.bylaWalka = bylaWalka;
        this.byloCierpienie = byloCierpienie;
        this.podkloszem = podkloszem;
        this.czestoWychodzil = czestoWychodzil;
        this.dostepDoWieluPlansz = dostepDoWieluPlansz;
        this.mowiPrawde = mowiPrawde;
        this.slowaCzyny = slowaCzyny;
        this.dobreSerce = dobreSerce;
        this.umiejetnosc = umiejetnosc;
        this.klapsy = klapsy;
        this.kary = kary;
        this.dostawalPieniadze = dostawalPieniadze;
        this.narkotyki = narkotyki;
    }

    public Wychowanie(boolean patologiaWDomu, boolean gorzejNizWszyscy, boolean zGoryPrzegrany, boolean bylaNauka, boolean byliRodzice, boolean bylaWalka, boolean byloCierpienie, boolean podkloszem, boolean czestoWychodzil, boolean dostepDoWieluPlansz, boolean mowiPrawde, boolean slowaCzyny, boolean dobreSerce, boolean umiejetnosc, boolean klapsy, boolean kary, boolean dostawalPieniadze, boolean narkotyki) {
        this.patologiaWDomu = patologiaWDomu;
        this.gorzejNizWszyscy = gorzejNizWszyscy;
        this.zGoryPrzegrany = zGoryPrzegrany;
        this.bylaNauka = bylaNauka;
        this.byliRodzice = byliRodzice;
        this.bylaWalka = bylaWalka;
        this.byloCierpienie = byloCierpienie;
        this.podkloszem = podkloszem;
        this.czestoWychodzil = czestoWychodzil;
        this.dostepDoWieluPlansz = dostepDoWieluPlansz;
        this.mowiPrawde = mowiPrawde;
        this.slowaCzyny = slowaCzyny;
        this.dobreSerce = dobreSerce;
        this.umiejetnosc = umiejetnosc;
        this.klapsy = klapsy;
        this.kary = kary;
        this.dostawalPieniadze = dostawalPieniadze;
        this.narkotyki = narkotyki;
    }

    public boolean isBylaNauka() {
        return bylaNauka;
    }

    public boolean isByliRodzice() {
        return byliRodzice;
    }

    public boolean isBylaWalka() {
        return bylaWalka;
    }

    public boolean isByloCierpienie() {
        return byloCierpienie;
    }

    public boolean isPodkloszem() {
        return podkloszem;
    }
}

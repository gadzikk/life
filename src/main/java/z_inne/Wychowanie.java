package z_inne;

import miejsce.Miejsce;
import typy_bazowe.TypDziecinstwo;

import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Wychowanie {
    TypDziecinstwo dziecinstwo;
    List<Miejsce> odwiedzoneMiejsca;

    boolean patologiaWDomu;
    boolean gorzejNizWszyscy;
    boolean zGoryPrzegrany;

    boolean bylaNauka;
    boolean byliRodzice;
    boolean bylaWalka;
    boolean byloCierpienie;

    boolean podkloszem;
    boolean czestoWychodzil;
    boolean dostepDoWieluPlansz;

    boolean mowiPrawde;
    boolean slowaCzyny;
    boolean dobreSerce;
    boolean umiejetnosc;

    boolean klapsy;
    boolean kary;

    boolean dostawalPieniadze;
    boolean narkotyki;

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
}

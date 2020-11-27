package z_inne;

/**
 * Created by gadzik on 24.12.19.
 */
public class BrakZasad {
    boolean nieObchodziGoMiejsce;
    boolean nieObchodziGoOkolicznosc;
    boolean nieObchodzaGoOsoby;
    boolean nieObchodziGoTwojWysilek;
    boolean nieObchodziGoIlePracowales;
    boolean wykorzystujeBrakPrzewag;

    public BrakZasad(boolean nieObchodziGoMiejsce, boolean nieObchodziGoOkolicznosc, boolean nieObchodzaGoOsoby, boolean nieObchodziGoTwojWysilek, boolean nieObchodziGoIlePracowales, boolean wykorzystujeBrakPrzewag) {
        this.nieObchodziGoMiejsce = nieObchodziGoMiejsce;
        this.nieObchodziGoOkolicznosc = nieObchodziGoOkolicznosc;
        this.nieObchodzaGoOsoby = nieObchodzaGoOsoby;
        this.nieObchodziGoTwojWysilek = nieObchodziGoTwojWysilek;
        this.nieObchodziGoIlePracowales = nieObchodziGoIlePracowales;
        this.wykorzystujeBrakPrzewag = wykorzystujeBrakPrzewag;
    }
}

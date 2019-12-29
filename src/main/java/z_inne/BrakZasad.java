package z_inne;

/**
 * Created by gadzik on 24.12.19.
 */
public class BrakZasad {
    boolean pierdoliGoMiejsce;
    boolean pierdoliGoOkolicznosc;
    boolean pierdolaGoOsoby;
    boolean pierdoliGoTwojWysilek;
    boolean pierdoliGoIlePracowales;
    boolean wykorzystujeBrakPrzewag;

    public BrakZasad(boolean pierdoliGoMiejsce, boolean pierdoliGoOkolicznosc, boolean pierdolaGoOsoby, boolean pierdoliGoTwojWysilek, boolean pierdoliGoIlePracowales, boolean wykorzystujeBrakPrzewag) {
        this.pierdoliGoMiejsce = pierdoliGoMiejsce;
        this.pierdoliGoOkolicznosc = pierdoliGoOkolicznosc;
        this.pierdolaGoOsoby = pierdolaGoOsoby;
        this.pierdoliGoTwojWysilek = pierdoliGoTwojWysilek;
        this.pierdoliGoIlePracowales = pierdoliGoIlePracowales;
        this.wykorzystujeBrakPrzewag = wykorzystujeBrakPrzewag;
    }
}

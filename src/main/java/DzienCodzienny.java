import java.util.List;

/**
 * Created by gadzik on 19.12.19.
 */
public class DzienCodzienny {
    List<Zadanie> zadaniaEgzystencjonalne;
    List<Zadanie> zadaniaObowiazkowe;
    List<Zadanie> zadaniaOpcja;

    public DzienCodzienny(List<Zadanie> zadaniaEgzystencjonalne, List<Zadanie> zadaniaObowiazkowe, List<Zadanie> zadaniaOpcja) {
        this.zadaniaEgzystencjonalne = zadaniaEgzystencjonalne;
        this.zadaniaObowiazkowe = zadaniaObowiazkowe;
        this.zadaniaOpcja = zadaniaOpcja;
    }
}

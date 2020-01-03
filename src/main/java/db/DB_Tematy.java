package db;

import metoda.CPU_TOPIC;
import temat.TT;
import typy_bazowe.TypT;

import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class DB_Tematy {
    static CPU_TOPIC cpu = new CPU_TOPIC();

    public static List<TypT> PREFIXES = cpu.PREFIXES;
    public static List<TypT> PDSTW = cpu.PDSTW;
    public static List<TypT> UTRZYMYWACZE = cpu.UTRZYMYWACZE;

    public static List<TypT> NAD_TEMATY = cpu.NAD_TEMATY;
    public static List<TypT> HIERARCHIA = cpu.HIERARCHIA;

    public static List<TT> TEMATY = cpu.TEMATY;
    public static List<TT> KOMBO = cpu.KOMBO;

    public static List<TT> CODZIENNE = cpu.CODZIENNE;
}

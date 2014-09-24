package no.kantega.java8.oppgave4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

/**
 * Created by frosta on 22.09.2014.
 */
public class GroupByTest {

    private Transaksjon nok1;
    private Transaksjon nok2;
    private Transaksjon eur1;
    private Transaksjon eur2;
    private Transaksjon eur3;
    private List<Transaksjon> transaksjoner;

    @Before
    public void setup() {

        nok1 = new Transaksjon(Valuta.NOK, 100);
        nok2 = new Transaksjon(Valuta.NOK, 200);
        eur1 = new Transaksjon(Valuta.EUR, 10);
        eur2 = new Transaksjon(Valuta.EUR, 20);
        eur3 = new Transaksjon(Valuta.EUR, 30);

        transaksjoner = Arrays.asList(nok1, eur1, eur2, nok2, eur3);
    }

    @Test
    public void skalGruppereTransaksjonerEtterValuta() {

        //TODO
        Map<Valuta, List<Transaksjon>> gruppert = null;

        Map<Valuta, List<Transaksjon>> expected = new HashMap<>();
        expected.put(Valuta.NOK, Arrays.asList(nok1, nok2));
        expected.put(Valuta.EUR, Arrays.asList(eur1, eur2, eur3));

        Assert.assertEquals(expected, gruppert);
    }

    @Test
    public void skalSummereAlleNorskeTransaksjoner() {

        //Hint: Stream.mapToInt er en nyttig metode
        //TODO
        int sum = -1;

        Assert.assertEquals(300, sum);

    }

    @Test
    public void skalGruppereOgTelleAlleTransaksjoner() {

        //TODO
        Map<Valuta, Long> antallTranserPerValuta = null;

        Map<Valuta, Long> expected = new HashMap<>();
        expected.put(Valuta.NOK, 2L);
        expected.put(Valuta.EUR, 3L);

        Assert.assertEquals(expected, antallTranserPerValuta);
    }

    @Test
    public void skalGruppereOgSummereAlleTransaksjoner() {

        //TODO
        Map<Valuta, Integer> summer = null;

        Map<Valuta, Integer> expected = new HashMap<>();
        expected.put(Valuta.NOK, 300);
        expected.put(Valuta.EUR, 60);

        Assert.assertEquals(expected, summer);

    }

}


enum Valuta { NOK, SEK, USD, GBP, EUR };

class Transaksjon {

    private Valuta valuta;
    private int belop;

    Transaksjon(Valuta valuta, int belop) {
        this.valuta = valuta;
        this.belop = belop;
    }

    public Valuta getValuta() {
        return valuta;
    }

    public int getBelop() {
        return belop;
    }

    @Override
    public String toString() {
        return "Transaksjon{" +
                "valuta=" + valuta +
                ", belop=" + belop +
                '}';
    }
}
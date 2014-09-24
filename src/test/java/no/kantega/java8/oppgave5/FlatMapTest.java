package no.kantega.java8.oppgave5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Created by frosta on 22.09.2014.
 */
public class FlatMapTest {

    private Ansatt ola;
    private Ansatt kari;
    private Ansatt knut;
    private Ansatt marit;
    private Firma firma;

    @Before
    public void setup() {

        ola = new Ansatt("Ola");
        kari = new Ansatt("Kari");
        knut = new Ansatt("Knut");
        marit = new Ansatt("Marit");
        firma = new Firma(
                new Avdeling(ola, kari),
                new Avdeling(knut, marit));

    }


    @Test
    public void skalFinneAlleAnsatteImperativt() {

        List<Ansatt> alleAnsatte = new ArrayList<>();
        for (Avdeling avdeling : firma.getAvdelinger()) {
            for (Ansatt ansatt : avdeling.getAnsatte()) {
                alleAnsatte.add(ansatt);
            }
        }

        List<Ansatt> expected = Arrays.asList(ola, kari, knut, marit);

        Assert.assertEquals(expected, alleAnsatte);

    }

    @Test
    public void skalFinneAlleAnsatteFunksjonelt() {

        //Hint: Bruk Stream.flatMap. Sjekk signaturen.
        //TODO
        List<Ansatt> alleAnsatte = null;

        List<Ansatt> expected = Arrays.asList(ola, kari, knut, marit);

        Assert.assertEquals(expected, alleAnsatte);

    }


}

class Ansatt {

    private String navn;

    Ansatt(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Ansatt{" +
                "navn='" + navn + '\'' +
                '}';
    }
}

class Avdeling {

    private List<Ansatt> ansatte;

    Avdeling(Ansatt... ansatte) {
        this.ansatte = Arrays.asList(ansatte);
    }

    public List<Ansatt> getAnsatte() {
        return ansatte;
    }
}

class Firma {

    private List<Avdeling> avdelinger;

    Firma(Avdeling... avdelinger) {
        this.avdelinger = Arrays.asList(avdelinger);
    }

    public List<Avdeling> getAvdelinger() {
        return avdelinger;
    }
}
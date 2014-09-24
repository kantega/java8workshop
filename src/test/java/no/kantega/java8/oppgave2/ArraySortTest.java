package no.kantega.java8.oppgave2;

import no.kantega.java8.common.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

/**
 * Created by frosta on 22.09.2014.
 */
public class ArraySortTest {

    private Person ola;
    private Person kari;
    private Person knut;
    private Person[] personer;

    @Before
    public void setup() {
        ola = new Person(18, "Ola");
        kari = new Person(21, "Kari");
        knut = new Person(10, "Knut");
        personer = new Person[] { ola, kari, knut };
    }

    @Test
    public void skalSortereEtterNavn() {

        //TODO
        //Arrays.sort(personer, <lambda>);

        Person[] expected = { kari, knut, ola };
        Assert.assertArrayEquals(expected, personer);

    }

    @Test
    public void skalSortereEtterAlder() {

        //TODO
        //Arrays.sort(personer, comparing(<method reference>));

        Person[] expected = { knut, ola, kari };
        Assert.assertArrayEquals(expected, personer);

    }


}


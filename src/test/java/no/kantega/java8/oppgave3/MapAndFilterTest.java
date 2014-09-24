package no.kantega.java8.oppgave3;

import no.kantega.java8.common.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by frosta on 22.09.2014.
 */
public class MapAndFilterTest {

    private Person ola;
    private Person kari;
    private Person knut;
    private List<Person> personer;

    @Before
    public void setup() {
        ola = new Person(18, "Ola");
        kari = new Person(21, "Kari");
        knut = new Person(10, "Knut");
        personer = Arrays.asList(ola, kari, knut);
    }

    @Test
    public void skalMappeFraPersonTilNavn() {

        //TODO
        List<String> navn = null;

        List<String> expected = Arrays.asList("Ola", "Kari", "Knut");
        Assert.assertEquals(expected, navn);

    }

    @Test
    public void skalFinneAlleMyndigePersoner() {

        //TODO
        List<Person> myndige = null;

        List<Person> expected = Arrays.asList(ola, kari);
        Assert.assertEquals(expected, myndige);
    }

    @Test
    public void skalFinneNavnPaaAlleMyndigePersonerISortertRekkefolge() {

        //TODO
        List<String> navnPaaMyndige = null;

        List<String> expected = Arrays.asList("Kari", "Ola");
        Assert.assertEquals(expected, navnPaaMyndige);
    }

}


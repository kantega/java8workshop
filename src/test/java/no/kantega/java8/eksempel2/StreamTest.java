package no.kantega.java8.eksempel2;

import no.kantega.java8.common.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by frosta on 22.09.2014.
 */
public class StreamTest {

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
    public void skalFinneNavnPaaAlleMyndigePersoner() {

        List<String> navnPaaMyndige = personer.stream().filter((p) -> p.getAlder() >= 18).map(Person::getNavn).collect(toList());

        List<String> expected = Arrays.asList("Ola", "Kari");
        Assert.assertEquals(expected, navnPaaMyndige);
    }

}


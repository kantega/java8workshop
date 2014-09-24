package no.kantega.java8.eksempel4;

import no.kantega.java8.common.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;


/**
 * Created by frosta on 23.09.2014.
 */
public class CollectTest {

    private Person ola;
    private Person kari;
    private Person knut;
    private Person marit;
    private List<Person> personer;

    @Before
    public void setup() {
        ola = new Person(18, "Ola");
        kari = new Person(21, "Kari");
        knut = new Person(10, "Knut");
        marit = new Person(21, "Marit");
        personer = Arrays.asList(ola, kari, knut, marit);
    }


    @Test
    public void skalGrupperePersonerEtterAlder() {

        Map<Integer, List<Person>> gruppertEtterAlder = personer.stream().collect(groupingBy(Person::getAlder, toList()));

        Map<Integer, List<Person>> expected = new HashMap<>();
        expected.put(18, Arrays.asList(ola));
        expected.put(21, Arrays.asList(kari, marit));
        expected.put(10, Arrays.asList(knut));

        Assert.assertEquals(expected, gruppertEtterAlder);

    }

    @Test
    public void skalGruppereOgTellePersonerEtterAlder() {

        Map<Integer, Long> antallPersonerMedAlder = personer.stream().collect(groupingBy(Person::getAlder, counting()));

        Map<Integer, Long> expected = new HashMap<>();
        expected.put(18, 1L);
        expected.put(21, 2L);
        expected.put(10, 1L);

        Assert.assertEquals(expected, antallPersonerMedAlder);

    }

}

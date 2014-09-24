package no.kantega.java8.eksempel1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by frosta on 22.09.2014.
 */
public class GroupByAndCountTest {

    private List<String> list;
    private Map<String, Long> expected;

    @Before
    public void setup() {
        list = Arrays.asList("Foo", "Bar", "Zoo", "Foo", "Foo", "Bar");
        expected = new HashMap<>();
        expected.put("Foo", 3L);
        expected.put("Bar", 2L);
        expected.put("Zoo", 1L);

    }

    @Test
    public void skalGruppereOgTelleForekomsterImperativt() {

        Map<String, Long> result = new HashMap<>();

        for (String string : list) {
            Long value = result.get(string);
            if (value == null) {
                value = 0L;
            }
            result.put(string, value + 1);
        }

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testGroupByFunctions() {

        Map<String, Long> result = list.stream().collect(groupingBy(identity(), counting()));

        Assert.assertEquals(expected, result);

    }

 }

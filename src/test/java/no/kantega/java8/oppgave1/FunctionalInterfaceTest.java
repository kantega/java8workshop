package no.kantega.java8.oppgave1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.Comparator.comparing;

/**
 * Created by frosta on 17.09.2014.
 */
public class FunctionalInterfaceTest {

    @Test
    public void skalInitialisereFunctionalInterfaces() {

        //TODO: Initialisér alle variablene nedenfor ved å bruke følgende lambdas og method references:

        /*

        () -> new Foo()
        Foo::getBar
        Foo::isValid
        (foo) -> System.out.println(foo)
        (String s) -> s.length()

         */

        Function<Foo, String> function = null;
        Predicate<Foo> predicate = null;
        Consumer<Foo> consumer = null;
        Supplier<Foo> supplier = null;
        MyFunctionalInterface myFunctionalInterface = null;

        Runnable runnable = () -> System.out.println("Hello, world");
        Callable callable = () -> 42;
        Comparator<Foo> comparator = comparing(Foo::getBar);

        List<Object> functionalInterfaces = Arrays.asList(
                function,
                predicate,
                consumer,
                supplier,
                myFunctionalInterface,
                runnable,
                callable,
                comparator
        );

        /*
        long count = 0;
        for (Object object : functionalInterfaces) {
            if (object != null) {
                count++;
            }
        }
        Assert.assertEquals(all.size(), count);
        */

        long count = functionalInterfaces.stream().filter(object -> object != null).count();
        Assert.assertEquals(functionalInterfaces.size(), count);

    }

}

class Foo {

    private String bar;

    Foo() {
    }

    Foo(String bar) {
        this.bar = bar;
    }

    public String getBar() { return bar; }
    public boolean isValid() { return bar != null; }

}

@FunctionalInterface
interface MyFunctionalInterface {

    int foo(String s);

}
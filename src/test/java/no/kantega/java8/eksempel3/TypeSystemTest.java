package no.kantega.java8.eksempel3;

import no.kantega.java8.common.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by frosta on 23.09.2014.
 */
public class TypeSystemTest {

    @Test
    public void skalKonvertereLambdaTilFunctionalInterface() {

        //Object lambda = (Person p) -> p.getNavn();

        Foo lambda1 = (Person p) -> p.getNavn();

        Assert.assertTrue(lambda1 instanceof Foo);

        Bar lambda2 = (Person p) -> p.getNavn();

        Assert.assertTrue(lambda2 instanceof Bar);

        Function<Person, String> lambda3 = (Person p) -> p.getNavn();

        Assert.assertTrue(lambda3 instanceof Function);

        Predicate<Person> predicate = (p) -> p.getAlder() >= 18;

        Assert.assertTrue(predicate instanceof Predicate);

    }

    @Test
    public void skalKonvertereMethodReferenceTilFunctionalInterface() {

        //Object methodReference = Person::getNavn;

        Foo methodReference1 = Person::getNavn;

        Assert.assertTrue(methodReference1 instanceof Foo);

        Bar methodReference2 = Person::getNavn;

        Assert.assertTrue(methodReference2 instanceof Bar);

        Function<Person, String> methodReference3 = Person::getNavn;

        Assert.assertTrue(methodReference3 instanceof Function);

    }

}

@FunctionalInterface
interface Foo {
    String gnat(Person p);
}

@FunctionalInterface
interface Bar {
    String gnu(Person p);
}

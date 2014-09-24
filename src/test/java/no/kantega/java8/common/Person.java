package no.kantega.java8.common;

/**
 * Created by frosta on 23.09.2014.
 */
public class Person {

    private int alder;
    private String navn;

    public Person(int alder, String navn) {
        this.alder = alder;
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Person{" +
                "alder=" + alder +
                ", navn='" + navn + '\'' +
                '}';
    }

}

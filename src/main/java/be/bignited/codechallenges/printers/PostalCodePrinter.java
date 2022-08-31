package be.bignited.codechallenges.printers;

import be.bignited.codechallenges.localities.Locality;

import java.util.List;

public class PostalCodePrinter {
    public static void printPostalCodes(List<Locality> localities) {
        localities.stream().forEach(l -> System.out.println(l.getPostalCode() + " " + l.getLocalityName()));
    }
}

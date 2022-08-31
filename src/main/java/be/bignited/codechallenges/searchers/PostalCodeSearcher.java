package be.bignited.codechallenges.searchers;

import be.bignited.codechallenges.localities.Locality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PostalCodeSearcher {


    private final List<Locality> localities = new ArrayList<>();

    public PostalCodeSearcher() throws IOException {
        InputStream is = PostalCodeSearcher.class.getClassLoader().getResourceAsStream("postalcodes.txt");
        InputStreamReader streamReader =
                new InputStreamReader(is, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        String line;
        while ((line = reader.readLine()) != null) {
            String[] splittedLine = line.split("\t");
            localities.add(new Locality(splittedLine[0], splittedLine[1]));
        }
    }

    public List<Locality> findMatchingLocalities(String partialPostalcode) {
        return localities.stream().filter(l -> l.getPostalCode().contains(partialPostalcode)).sorted(Comparator.comparing(Locality::getPostalCode)).collect(Collectors.toList());
    }
}

package codechallenges.searchers;

import be.bignited.codechallenges.localities.Locality;
import be.bignited.codechallenges.searchers.PostalCodeSearcher;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class PostalCodeSearcherTest {

    @Test
    public void testSingleLocality() throws IOException {
        List<Locality> localities = new PostalCodeSearcher().findMatchingLocalities("9255");
        Assert.assertEquals(2, localities.size());
        Assert.assertEquals(new Locality("9255", "BUGGENHOUT"), localities.get(0));
        Assert.assertEquals(new Locality("9255", "Opdorp"),localities.get(1));
    }
}

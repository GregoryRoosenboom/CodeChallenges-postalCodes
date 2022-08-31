package be.bignited.codechallenges.localities;

public class Locality {
    private final String postalCode;
    private final String localityName;

    public Locality(String postalCode, String localityName) {
        this.postalCode = postalCode;
        this.localityName = localityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getLocalityName() {
        return localityName;
    }
}

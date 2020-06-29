public class Ladderklimmen extends Attractie implements GokAttractie {

    public Ladderklimmen() {
        this.naam = "Ladderklimmen";
        this.prijs = 5.00;
    }

    @Override
    public double kansSpelBelastingBetalen() {
        double teBetalenBelasting = this.omzet * 0.3;
        System.out.println("Te betalen belasting: " + teBetalenBelasting);
        return teBetalenBelasting;
    }
}

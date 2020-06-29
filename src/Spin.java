public class Spin extends RisicoRijkeAttractie implements GokAttractie {

    public Spin() {
        this.naam = "Spin";
        this.prijs = 2.25;
        opstellingsKeuring();
    }

    @Override
    public double kansSpelBelastingBetalen() {
        double teBetalenBelasting = this.omzet * 0.3;
        System.out.println("Te betalen belasting: " + teBetalenBelasting);
        return teBetalenBelasting;
    }
}

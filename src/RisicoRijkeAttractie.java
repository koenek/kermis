public abstract class RisicoRijkeAttractie extends Attractie {
    protected int draaiLimiet;

    public int ritjes() throws ZesdeOfElfdeKaartjeException {
        if (aantalRitjes == 6 || aantalRitjes == 11) {
            throw new ZesdeOfElfdeKaartjeException("6e of 11e kaartje");
        }
        return aantalRitjes;
    }

    public void opstellingsKeuring() {
        System.out.println("Monteur: Opstellingskeuring uitgevoerd aan " + this.naam + ". Ready to go!");
    }
}

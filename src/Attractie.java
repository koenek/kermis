public class Attractie {
    protected String naam;
    protected double prijs;
    protected int oppervlakte;
    protected double omzet;
    protected int aantalKaartjes;
    protected int aantalRitjes = 0;

    public void draaien() {
        System.out.println("De attractie " + naam + " draait");
        this.omzet += prijs;
        this.aantalKaartjes += 1;
        this.aantalRitjes += 1;
    }

    public double omzet() {
        return omzet;
    }

    public int kaartjes() {
        return aantalKaartjes;
    }

}

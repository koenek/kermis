public class Kassa {

    public void kassaOmzet(Attractie b, Attractie spin, Attractie sp, Attractie sh, Attractie h, Attractie l) {
        System.out.println("Omzet: " + (b.omzet() + spin.omzet() + sp.omzet() + sh.omzet() + h.omzet() + l.omzet()));
    }

    public void kassaKaartjes(Attractie b, Attractie spin, Attractie sp, Attractie sh, Attractie h, Attractie l) {
        System.out.println("Aantal verkochte kaartjes: " + (b.kaartjes() + spin.kaartjes() + sp.kaartjes() + sh.kaartjes() + h.kaartjes() + l.kaartjes()));
    }
}

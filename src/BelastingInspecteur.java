public class BelastingInspecteur {

    public void langsGaan(GokAttractie a) {
        // genereer een random nummer tussen 1 en 15
        int randomNum = (int) (Math.floor(Math.random() * 15) + 1);
        if (randomNum == 1) {
            a.kansSpelBelastingBetalen();
        }
    }

}

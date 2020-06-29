import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kassa kassa = new Kassa();
        BelastingInspecteur belastingPersoontje = new BelastingInspecteur();
        Attractie botsauto = new Botsauto();
        RisicoRijkeAttractie spin = new Spin();
        Attractie spiegelpaleis = new Spiegelpaleis();
        Attractie spookhuis = new Spookhuis();
        RisicoRijkeAttractie hawaii = new Hawaii();
        Attractie ladderklimmen = new Ladderklimmen();

        while (true) {
            System.out.println("Welke attractie?");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    botsauto.draaien();
                    break;
                case "2":
                    spin.draaien();
                    belastingPersoontje.langsGaan((GokAttractie) spin);
                    try {
                        spin.ritjes();
                    } catch(ZesdeOfElfdeKaartjeException e) {
                        while (true) {
                            System.out.println(e.getMessage());
                            System.out.println("Bel een Monteur met [m]");
                            String monteurInput = scanner.nextLine();
                            if (monteurInput.equals("m")) {
                                System.out.println("Monteur: Ik heb de keuring uitgevoerd en de attractie gereset. Alles prima!");
                                break;
                            }
                        }
                    }
                    break;
                case "3":
                    spiegelpaleis.draaien();
                    break;
                case "4":
                    spookhuis.draaien();
                    break;
                case "5":
                    hawaii.draaien();
                    try {
                        hawaii.ritjes();
                    } catch(ZesdeOfElfdeKaartjeException e) {
                        while (true) {
                            System.out.println(e.getMessage());
                            System.out.println("Bel een Monteur met [m]");
                            String monteurInput = scanner.nextLine();
                            if (monteurInput.equals("m")) {
                                System.out.println("Monteur: Ik heb de keuring uitgevoerd en de attractie gereset. Alles prima!");
                                break;
                            }
                        }
                    }
                    break;
                case "6":
                    ladderklimmen.draaien();
                    belastingPersoontje.langsGaan((GokAttractie) ladderklimmen);
                    break;
                case "o":
                    kassa.kassaOmzet(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen);
                    break;
                case "k":
                    kassa.kassaKaartjes(botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen);
                    break;
            }
        }
    }
}

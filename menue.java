/*
 * Gerüst für ein kleines Java-Menue um mit Git VCS zu lernen
 * Michael Sauer, 22.01.2016
 *
 */
import java.util.Scanner;
/**
 *
 * @author mike
 */

public class menue{
        public static void main(String[] args) {
            final int PROGRAMMENDE=0;
            boolean isEnde=false;
            Scanner scanner = new Scanner(System.in);
            while(!isEnde){
                int wahl = scanner.nextInt();
                switch (wahl) {
                    case PROGRAMMENDE:
                        System.out.println("Ciao");
                        isEnde=true;
                        break;
                    case 1:
                        System.out.println("Michael Sauer");
                        break;
                    case 12:
                        System.out.println("Patrick Plewka");
                        break;
                    case 22:
                        System.out.println("Roland Daidone");
                        break;
                    case 4:
                        System.out.println("Funda Erol");
                        break;
                    case 25:
                        System.out.println("Tobias Kiel");
                        break;
                    case 8:
                        System.out.println("Bleibt Annonym Uu.");
                        break;
                    case 100:
                        System.out.println("Dennis Groß");
                        break;
                    case 11:
                        System.out.println("Matthias Riegler");
                        break;
                    case 9:
                        System.out.println("Fabian Paul");
                        break;
                    case 33:
                        System.out.println("Anne-Kathrin Haag");
                        break;
                    case 38:
                        System.out.println("Alessio Ragusa");
                        break;
                    case 30:
                        System.out.println("Matthias Sennikow\n aka en rischtig krasser dude");
                        break;
                    case 2:
                        System.out.println("Niklas Schuetz");
                        break;
                    case 42:
                        System.out.println("Yasin Tatar")
                        break;
                    case 20:
                        System.out.println("mohammed");
                        break;
                    case 24:
                        System.out.println("Jannik Adam");
                        break;
                    case 19:
                        System.out.println("Julia Krier");
                        break;
                    case 27:
                        System.out.println("Christian Warken");
                        break;
                    case 29:
                        System.out.println("dddavid");
                        break;
                    case 9:
                        System.out.println("Jannik Schäfer");
                        break;
                    case 37:
                        System.out.println("Roman Pinkel");
                        break;
                    default:
                        System.out.println("Fehler: Kenne ich nicht!");
                    }

                }
                scanner.close();
        }
}
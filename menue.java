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
                        	case 2:
              //wer da sonst noch so wäre ...
                        	break;
                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
					}
				scanner.close();
			
        }
	}

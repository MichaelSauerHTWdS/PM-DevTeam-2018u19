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
                        	case 2:
              //wer da sonst noch so wäre ...
                        	break;
                            case 14:
                                    System.out.println("Shenna R W P");
                                    break;
                            case 36:
                                    System.out.println("Agra Bimantara");
                                    break;
                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
					}
				scanner.close();
			
        }
	}

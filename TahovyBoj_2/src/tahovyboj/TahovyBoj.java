/*
 *	       __          __                __            
 *	  ____/ /__ _   __/ /_  ____  ____  / /__ _________
 *	 / __  / _ \ | / / __ \/ __ \/ __ \/ //_// ___/_  /
 *	/ /_/ /  __/ |/ / /_/ / /_/ / /_/ / ,< _/ /__  / /_
 *	\__,_/\___/|___/_.___/\____/\____/_/|_(_)___/ /___/
 *                                                   
 *                                                           
 *      TUTORIÁLY  <>  DISKUZE  <>  KOMUNITA  <>  SOFTWARE
 * 
 *	Tento zdrojový kód je součástí tutoriálů na programátorské 
 *	sociální síti WWW.DEVBOOK.CZ - it network	
 *	
 *	Kód můžete upravovat jak chcete, jen zmiňte odkaz 
 *	na www.devbook.cz :-)  - it network
 *      pridan skritek zaskodik na ktereho nemohou utocit
 *      ten se rozhoduje pri kazdem utoku bojovnika zda ho vyleci ci podkopne
 */

package tahovyboj;

public class TahovyBoj {

    public static void main(String[] args) {
        
        // vytvoření objektů
        Kostka kostka = new Kostka(10);
        Skritek rumpleCimperCamper = new Skritek("RumpleCimperCamper", 60, 20, 30, kostka);        
        Bojovnik zalgoren = new Bojovnik("Zalgoren", 100, 20, 10, kostka);
        Mag gandalf = new Mag("Gandalf", 60, 15, 12, kostka, 30, 45);
        Arena arena = new Arena(zalgoren, gandalf, rumpleCimperCamper, kostka);
        // zápas
        arena.zapas();
        
    }
}

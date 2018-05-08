import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.*;

public class App {
        
        private static String shNames;

        public static void main(String[] args) {
                
                SpaceShip sp1 = new SpaceShip("Battlestar Galactica", 121454);
                SpaceShip sp2 = new SpaceShip("Enterprise", 3242);
                SpaceShip sp3 = new SpaceShip("Millenium Falcon", 1231785);

                Map<String, Set<String>> crew = new HashMap<>();
                SpaceShip[] spc = {sp1, sp2, sp3};
                String[][] crNames = {
                                {"William","Kara","Lee","Sharon","Gaius"},
                                {"Kirk","Spock","Sulu","Uhura","Chekov","Christine"},
                                {"Han","Chebacca","Luke","Leia","R2-D2","C-3PO"}                
                };
                
                String[] shNames=new String [spc.length];

                for (int i = 0; i < spc.length; i++) {
                        
                        
                        shNames[i] = spc[i].getName();
                        System.out.println(shNames[i]);
                        Set<String>crwNames = new LinkedHashSet<>();
                        for (String sn:crNames[i]) {
                                System.out.println(sn);
                                crwNames.add(sn);
                                }
                                                
                        crew.put(shNames[i], crwNames);
                        System.out. println ("∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗ Check Point ∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗");
                        for (String stk:crew.keySet()) {
                                
                                System.out.println(crew.get(stk));
                        }
                        
                        System.out.println ("∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗ Finish checking∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗∗\n");
                        
                }
                                
                for ( String spn: crew.keySet()) {
                        System.out. print ("SpaceShip: ") ;
                        System.out. print (spn + " ");
                        System.out. println () ;
                        Set<String> mbms = crew.get(spn);
                        for ( String mn: mbms) {
                        System.out. print (mn + " ");
                        }
                        System.out. println ("\n");
                        }
                
        }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.of.arrays;

/**
 *
 * @author Roshan
 */
public class ArrayOfArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] animals = {
            {"DanaDog","WallyDog","jessieDog","AlexisDog","LuckyDog"},
            {"BibsCat","DoodleCat","MillieCat","SimonCat"},
            {"ElyFish","CloieFish","GoldieFish","OscarFish",
                "ZippyFish","TedFish"},
            {"RascalMule","GeorgeMule","GracieMule","MontyMule","BuckMule",
                "RosieMule"}};
        for (int i =0;i<animals.length;i++){
            System.out.print(animals[i][0] + ":");
            for(int j =1; j< animals[i].length;j++){
                System.out.print(animals[i][j] + " ");
            }
            System.out.println();
            
            
        }
    }
    
}


public class TournamentSort {
    public static void main(String args[]) {
        System.out.println("Integers sorting:");
        Integer [] iArr = {5, 9, 13, 14, 2, 7, 1, 15, 18, 8, 4, 3, 50} ;
        Tournament<Integer> integerTournament = new Tournament<>(iArr);
        integerTournament.sort();
        integerTournament.printArray();

        System.out.println("\nDoubles sorting:");
        Double [] dArr = {5.5, 9.9, 13.13, 14.14, 2.2, 7.7, 1.1, 15.15, 18.18, 8.8, 4.6, 3.3, 50.50} ;
        Tournament <Double> doubleTournament = new Tournament(dArr);
        doubleTournament.sort();
        doubleTournament.printArray();

        System.out.println("\nChars sorting:");
        Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
        Tournament <Character> charTournament = new Tournament(cArr);
        charTournament.sort();
        charTournament.printArray();

        System.out.println("\nStrings sorting:");
        String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
        Tournament <String> stringTournament = new Tournament(sArr);
        stringTournament.sort();
        stringTournament.printArray();
    }
}

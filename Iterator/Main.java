package iterator_pattern;

import iterator_pattern.aggerate.Arts;
import iterator_pattern.aggerate.ISubject;
import iterator_pattern.aggerate.Science;
import iterator_pattern.iterator.IIterator;
import iterator_pattern.services.Helpers;

public class Main {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject scienceSubjects = new Science();
        ISubject artSubjects = new Arts();

        IIterator scienceIterators = scienceSubjects.createIterator();
        IIterator artIterators = artSubjects.createIterator();

        System.out.println("\nScience subjects");
        Helpers.displayHelper(scienceIterators);

        System.out.println("\nArt subjects");
        Helpers.displayHelper(artIterators);
    }
}

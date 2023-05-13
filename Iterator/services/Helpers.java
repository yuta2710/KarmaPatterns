package iterator_pattern.services;

import iterator_pattern.iterator.IIterator;

public class Helpers {
    public static void displayHelper(IIterator iterator){
        while(!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}

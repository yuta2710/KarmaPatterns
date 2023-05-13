package iterator_pattern.iterator;

public interface IIterator {
    void first(); // Reset to first element
    String next(); // next element
    Boolean isDone(); // End of collection check
    String currentItem(); // Retrieve current item

}

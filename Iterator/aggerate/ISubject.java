package iterator_pattern.aggerate;

import iterator_pattern.iterator.IIterator;

public interface ISubject{
    public IIterator createIterator();
}
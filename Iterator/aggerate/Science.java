package iterator_pattern.aggerate;

import iterator_pattern.iterator.IIterator;

import java.util.LinkedList;

public class Science implements ISubject{
    private LinkedList<String> subjects;

    public Science(){
        subjects = new LinkedList<>();
        subjects.addLast("Mathematics for engineering");
        subjects.addLast("Geometry Theory");
        subjects.addLast("Psychology in technology");
    }
    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }

    public class ScienceIterator implements IIterator{
        private LinkedList<String> subjects;
        private int position;

        public ScienceIterator(LinkedList<String> subjects){
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String currentItem() {
            return subjects.get(position);
        }
    }
}

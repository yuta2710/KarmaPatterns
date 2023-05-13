package iterator_pattern.aggerate;

import iterator_pattern.iterator.IIterator;

public class Arts implements ISubject{
    private String[] subjects;

    public Arts(){
        subjects = new String[2];
        subjects[0] = "User-centered designs";
        subjects[1] = "Academic in the arts";
    }

    public IIterator createIterator(){
        return new ArtsIterator(subjects);
    }

    public class ArtsIterator implements IIterator {
        private String[] subjects;
        private int position;

        public ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public void first() {
            position = 0;
        }

        @Override
        public String next() {
            return subjects[position++];
        }

        @Override
        public Boolean isDone() {
            return position >= subjects.length;
        }

        @Override
        public String currentItem(){
            return subjects[position];
        }
    } 
}


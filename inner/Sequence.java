interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(3);
        SomeClass sc1 = new SomeClass("Java");
        SomeClass sc2 = new SomeClass("PHP");
        SomeClass sc3 = new SomeClass("C++");

        sequence.add(sc1);
        sequence.add(sc2);
        sequence.add(sc3);

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}

class SomeClass {
    private String str;
    public SomeClass(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "str=" + str;
    }
}

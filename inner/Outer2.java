public class Outer2 {
    private final String str;

    public Outer2(String str) {
        this.str = str;
    }

    class Inner2 {
        @Override
        public String toString() {
            return "Outer string=" + str;
        }
    }

    public Inner2 getInner() {
        return new Inner2();
    }

    public void printOuter() {
        System.out.println("I am Outer class");
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2("JavaScript");
        Inner2 inner = outer.getInner();
        System.out.println(inner);
    }
}

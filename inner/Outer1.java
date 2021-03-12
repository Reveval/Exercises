public class Outer1 {
    class Inner1 {
        public void printInner() {
            System.out.println("I am Inner class");
        }
    }

    public Inner1 getInner() {
        return new Inner1();
    }

    public void printOuter() {
        System.out.println("I am Outer class");
    }

    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Inner1 inner = outer.getInner();

        outer.printOuter();
        inner.printInner();
    }
}

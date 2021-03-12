public class Outer3 {
    class Inner3 {

    }
}

class SomeClass1 {
    Outer3 outer = new Outer3();

    Outer3.Inner3 inner = outer.new Inner3();
}

package secPackage;

import by.mbicycle.MyInterface;

public class OtherClass {
    private class InnerClass implements MyInterface {
        @Override
        public void doSmth() {
            System.out.println("Hello");
        }
    }

    public InnerClass getInner() {
        return new InnerClass();
    }
}

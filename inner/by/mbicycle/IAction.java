package by.mbicycle;

public interface IAction {
    void method();
}

class SomeClass {
    public IAction getInterface() {
        class IActionImpl implements IAction {
            @Override
            public void method() {
                System.out.println("Realize method");
            }
        }
        return new IActionImpl();
    }

    public static void main(String[] args) {
        SomeClass sc = new SomeClass();
        IAction ac = sc.getInterface();
        ac.method();
    }
}

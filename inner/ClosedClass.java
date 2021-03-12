interface IOpenInterface {

}

public class ClosedClass {
    public IOpenInterface getInner() {
        return new InnerClosedClass();
    }

    private class InnerClosedClass implements IOpenInterface {

    }

    public static void main(String[] args) {
        ClosedClass cc = new ClosedClass();
        IOpenInterface icc = cc.getInner();
    }
}

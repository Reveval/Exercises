package thirdPackage;

import by.mbicycle.MyInterface;
import secPackage.OtherClass;

public class ExtendOtherClass extends OtherClass {
    public MyInterface getObj() {
        return getInner();
    }
}

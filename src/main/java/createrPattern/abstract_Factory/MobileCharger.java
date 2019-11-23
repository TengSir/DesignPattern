package createrPattern.abstract_Factory;

/**
 * 抽象充电器接口类型
 */
public interface MobileCharger {
    public void charge();
}
class MotoralaCharger implements  MobileCharger{
    public void charge() {
        System.out.println("for motorala  mobile charging");
    }
}
class NokiaCharger implements MobileCharger{

    public void charge() {
        System.out.println("for Nokia  mobile charging");
    }
}
class PhilipsCharger implements MobileCharger{

    public void charge() {
        System.out.println("for Philips  mobile charging");
    }
}
class SumsangCharger implements MobileCharger{

    public void charge() {
        System.out.println("for Sumsang  mobile charging");
    }
}


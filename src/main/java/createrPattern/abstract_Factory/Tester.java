package createrPattern.abstract_Factory;

import org.junit.Test;

public class Tester {
    @Test
    public void testMotoralaFactory(){
        MobileFactory factory=new MotoralaFactory();
        Mobile m=factory.makeMobile();
        MobileCharger mc=factory.makeMobileCharger();
        m.call();
        mc.charge();
    }
    @Test
    public void testNokiaFactory(){
        MobileFactory factory=new NokiaFactory();
        Mobile m=factory.makeMobile();
        MobileCharger mc=factory.makeMobileCharger();
        m.call();
        mc.charge();
}
}

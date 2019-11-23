package createrPattern.factory_method;

import org.junit.Test;

/**
 * 抽象工厂
 */
public interface MobileFactory {

    public Mobile makeMobile();
}
/**
 * 具体工厂类-每个工厂类只生产一种产品
 */
 class MotoralaFactory implements  MobileFactory {
    public Mobile makeMobile() {
        return new Motorala();
    }

    @Test
    public void testFactory(){
        Mobile  m=new MotoralaFactory().makeMobile();
        m.call();
    }
}


/**
 * 具体工厂类-每个工厂类只生产一种产品
 */
class NokiaFactory implements MobileFactory {
    public Mobile makeMobile() {
        return new Nokia();
    }
    @Test
    public void testFactory(){
        Mobile  m=new NokiaFactory().makeMobile();
        m.call();
    }
}
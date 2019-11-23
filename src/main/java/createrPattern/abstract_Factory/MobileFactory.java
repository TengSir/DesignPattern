package createrPattern.abstract_Factory;

/**
 * 抽象工厂接口类
 */
public interface MobileFactory {
    public Mobile makeMobile();
    public MobileCharger makeMobileCharger();
}

/**
 * 摩托罗拉抽象工厂实现类，负责生成摩托罗拉产品族系列产品
 */
class MotoralaFactory implements  MobileFactory{

    public Mobile makeMobile() {
        return new Motorala();
    }

    public MobileCharger makeMobileCharger() {
        return new MotoralaCharger();
    }

}
/**
 * 诺基亚抽象工厂实现类，负责生成摩托罗拉产品族系列产品
 */
class NokiaFactory implements  MobileFactory{

    public Mobile makeMobile() {
        return new Nokia();
    }

    public MobileCharger makeMobileCharger() {
        return new NokiaCharger();
    }
}


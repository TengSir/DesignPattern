package structurePattern.bridge_Pattern;

import org.junit.Test;

public abstract class Mobile {
    public Memory m;

    public void setM(Memory m) {
        this.m = m;
    }

    public abstract  void work();

}
class HuaweiMobile extends  Mobile{
    public void work() {
        System.out.println("huaweimobile使用"+ m.info()+"工作");;
    }
}
class XiaoMiMobile extends Mobile{
    public void work() {
        System.out.println("xiaomimobile使用"+ m.info()+"工作");;
    }
}

abstract  class Memory{
    public abstract  String info();
}
class Memory4G extends  Memory{
    public String info() {
        return "4g内存";
    }
}
class Memory6G extends  Memory{
    public String info() {
        return "6g内存";
    }
}
class Memory8G extends  Memory{
    public String info() {
        return "8g内存";
    }
}


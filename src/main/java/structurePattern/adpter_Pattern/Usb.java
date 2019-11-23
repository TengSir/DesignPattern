package structurePattern.adpter_Pattern;

import org.junit.Test;
import sun.nio.ch.Net;
/**
 * 适配器模式分为类适配器和对象适配器，类适配器主要解决类型之间的转化问题
 *
 * 如果无法知道源代码，或者不允许设计新类，或者无法继承的话，可以采用对象适配器解决，对象适配主要是采用has-a方式解决
 */

/**
 * usb设备，使用标准的usb接口做数据通讯
 */
public class Usb {
    public void transData(){
        System.out.println("遵循usb标准传输数据");
    }
    @Test
    public void testAdpater(){
        Usb  u=new Usb();u.transData();

        Adapter a=new Adapter();
        a.transferNetData();
    }
}

/**
 * 网络标准接口
 */
interface  Netpoint{
    public void transferNetData();
}

class Shuangjiaoxian    implements Netpoint{

    public void transferNetData() {
        System.out.println("按照网线接口传输网络数据");
    }
}

/**
 * 适配器，继承了被适配对象，同时实现了新的要转化到的接口
 */
class    Adapter extends Usb implements  Netpoint{

    public void transferNetData() {
        System.out.println("接入网络数据");
        System.out.println("数据转化成usb标准协议格式");
        super.transData();
    }
}
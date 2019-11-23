package structurePattern.adpter_Pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.lang.reflect.Type;

/**
 *
 * 如果无法知道源代码，或者不允许设计新类，或者无法继承的话，可以采用对象适配器解决，对象适配主要是采用has-a方式解决
 */
public class ObjectAdapter {
    @Test
    public void test(){
        Usb  u=new Usb();
        TypeC  c=new TypecPoint(u);
        c.transferData();
    }
}
interface  TypeC{
    public void transferData();
}
@AllArgsConstructor
@NoArgsConstructor
class TypecPoint implements TypeC{

    private Usb usb;
    public void transferData() {
        System.out.println("传输标准typec数据");
        System.out.println("typec数据转化成usb数据");
        usb.transData();
    }
}
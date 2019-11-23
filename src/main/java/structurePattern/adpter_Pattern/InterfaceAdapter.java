package structurePattern.adpter_Pattern;

import org.junit.Test;

/**
 * 接口适配模式也就是缺省适配模式的思想是，为一个接口提供缺省实现，这样子类可以从这个缺省实现进行扩展，而不必从原有接口进行扩展。
 */
public class InterfaceAdapter {
    @Test
    public void test(){
        FunctionInterface  f=new FunctionAdapter() {
            @Override
            public void a() {
                super.a();
            }

            @Override
            public void b() {
                super.b();
            }

            @Override
            public void c() {
                super.c();
            }

            @Override
            public void d() {
                super.d();
            }
        };
        FunctionInterface  ff=new FunctionAdapter() {
            @Override
            public void a() {
                super.a();
            }
        };
    }

}
interface FunctionInterface{
    void a();
    void b();
    void c();
    void d();
}
abstract  class FunctionAdapter implements  FunctionInterface{
    public void a() {

    }

    public void b() {

    }

    public void c() {

    }

    public void d() {

    }
}

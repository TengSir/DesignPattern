package createrPattern.simple_Factory;

import org.junit.Test;

public class SimpleFactory {
    /**
     * 工厂里面的生产产品的方法，根据传入的参数来造响应的产品
     * @param mobileType
     * @return
     */
    public static Mobile makeMobile(String mobileType){
        if(mobileType.equals("Motorala")){
            return  new Motorala();
        }else if(mobileType.equals("Nokia")){
            return  new Nokia();
        }else if(mobileType.equals("Philips")){
            return  new Philips();
        }else if(mobileType.equals("Sumsang")){
            return  new Sumsang();
        }else{
            return null;
        }
    }
    @Test
    public void  testSimpleFactory(){
        String customerWant="Nokia";
        Mobile nokia=SimpleFactory.makeMobile(customerWant);
        nokia.call();
    }
}

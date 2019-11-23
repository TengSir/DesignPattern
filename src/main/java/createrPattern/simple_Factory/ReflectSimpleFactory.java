package createrPattern.simple_Factory;

import org.junit.Test;

/**
 * 通过反射实现的简单工厂类
 */
public class ReflectSimpleFactory {

    /**
     * 反射实现的简单工厂类一定程度上通用性更好
     * @param classType
     * @return
     */
    public static Mobile makeMobile(Class<? extends Mobile> classType){
        try {
            Class  clazz= null;
            try {
                clazz = Class.forName(classType.getName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            Object obj=clazz.newInstance();
            if(obj instanceof Mobile){
                return (Mobile)obj;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  null;
    }


    @Test
    public void testSimpleFactory(){
       Mobile m= ReflectSimpleFactory.makeMobile(Philips.class);
       m.call();
    }
}

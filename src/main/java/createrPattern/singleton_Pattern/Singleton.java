package createrPattern.singleton_Pattern;

/**
 * 单例模式分为，懒汉式，饿汉式，还有饿汉式双重检查加锁版本,静态内部类饿汉式,枚举类型饿汉式
 */

/**
 * 饿汉式，指的是对象在类装载时就已经实例化该单例对象
 */
public class Singleton {
    private static Singleton  instance=new Singleton();
    private Singleton(){}

    public static Singleton getInstance(){return instance;}

}



/**
 * 懒汉式，指的是在调用获取实例对象方法时才实例化单例对象
 */
 class Singleton1 {
        private static Singleton1  instance;
    private Singleton1(){}

        public static Singleton1 getInstance(){
            if(instance==null){
                instance=new Singleton1();
            }
            return instance;
        }
}


/**
 * 饿汉式双重检查加锁版本,指的是为了防止多线程访问时出现创建多个实例的情况而设计的
 */
class Singleton2 {
    private static Singleton2  instance;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(instance==null){
           synchronized (Singleton2.class){
               if(instance==null){
                   instance=new Singleton2();
               }
           }
        }
        return instance;
    }
}

/**
 * 静态内部类饿汉式
 */
class Singleton3 {
    private static class StaticInstanceProducer{
        private static Singleton3  instance=new Singleton3();
    }
    private Singleton3(){}

    public static Singleton3 getInstance(){
        return StaticInstanceProducer.instance;
    }
}

/**
 * 枚举类型恶汉式
 */
enum Singleton4{
    Singleton4;
}

/**
 * 枚举饿汉式测试
 */
class Test{
    public static void main(String[] args) {
        Singleton4 instance=Singleton4.Singleton4;
    }
}
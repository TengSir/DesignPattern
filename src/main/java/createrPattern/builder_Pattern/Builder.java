package createrPattern.builder_Pattern;

/**
 * 抽象构建者接口
 */
public interface Builder {
    public Car c=new Car();
    public void buildEngine();
    public void buildWheel();
    public void buildDipan();
    public Car getAssembleCar();
}
class CarBuilder implements  Builder{

    public void buildEngine() {
        Engine e=new Engine();
        c.setEngine(e);
    }

    public void buildWheel() {
        Wheel[] ws= new Wheel[4];
        for(Wheel w:ws){
            w=new Wheel();
        }
        c.setWs(ws);
    }

    public void buildDipan() {
        Dipan d= new Dipan();
        c.setDipan(d);
    }

    public Car getAssembleCar() {
        return c;
    }
}
package createrPattern.builder_Pattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.junit.Test;

/**
 * 建造者模式中的指挥者，领导者，负责调用执行具体构造组件的方法，完成一个构造的
 */
@Setter
public class Leader {
    private Builder builder;
    public Car buildCar(){
        builder.buildDipan();
        builder.buildWheel();
        builder.buildEngine();
        return builder.getAssembleCar();
    }

    @Test
    public void testBuilderFactory(){
        Builder b=new CarBuilder();
        Leader l=new Leader();
        l.setBuilder(b);
        Car c=l.buildCar();
        c.run();
    }
}

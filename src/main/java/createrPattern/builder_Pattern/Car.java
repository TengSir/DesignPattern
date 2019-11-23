package createrPattern.builder_Pattern;

import lombok.*;

/**
 * 复杂构建对象（这里用汽车来模拟，汽车拥有很多独立的部件构成，每种部件都是一种类型）
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class Car {
    private String color;
    private String brand;
    private String type;
    private float price;
    private Dipan dipan;
    private Engine engine;
    private Wheel[] ws;
    public void run(){
        System.out.println(dipan.toString()+"承载车身"+"\t"+engine.toString()+"负责提供动力"+"\t"+ws.toString()+"负责驱动车子运动");
    }
}
class Engine{
    private float pailiang;
    private int qigangshu;
    private boolean wolunzenngya;
}
class Dipan{
    private String jiegou;
    private String cailiao;
    private String leixing;
}
class Wheel{
    private String size;
    private String type;
    private String cailiao;
}
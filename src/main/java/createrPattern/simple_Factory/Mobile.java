package createrPattern.simple_Factory;

import lombok.*;
@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public  class Mobile {
    private String brand;
    private String type;
    private String color;
    private float price;
    public  void call(){
        System.out.println("dial num  ,chat each other!");
    }
    public  void sms(){
        System.out.println("edit message,send it");
    }
    public  void takePhotot(){
        System.out.println("open camera application ,take pthoto");
    }
    public  void surfinginternet(){
        System.out.println("open application,get data from internet");
    }
}

class Motorala extends  Mobile{
    public  void call(){
        System.out.println("Motorala--dial num  ,chat each other!");
    }
}
class Nokia extends Mobile{
    public  void call(){
        System.out.println("Nokia--dial num  ,chat each other!");
    }
}
class Sumsang extends Mobile{
    public  void call(){
        System.out.println("Sumsang--dial num  ,chat each other!");
    }
}
class Philips extends  Mobile{
    public  void call(){
        System.out.println("Philips--dial num  ,chat each other!");
    }
}
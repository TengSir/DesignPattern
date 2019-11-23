package structurePattern.decorator_pattern;

public interface Car {
    public void zairen();
}

class Benz implements   Car{

    public void zairen() {
        System.out.println("载5个人到目的地");
    }
}

abstract class  RaceCar  implements  Car{
    private Car car;
    public void setCar(Car car){
        this.car=car;
    }

    public  abstract  void racing();
}
class FordRaceCar extends RaceCar{
    public void zairen() {
        System.out.println("载5个人到目的地");
    }
    public void racing() {
        System.out.println("参加比赛");
    }
}
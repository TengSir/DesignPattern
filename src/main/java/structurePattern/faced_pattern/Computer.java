package structurePattern.faced_pattern;

public class Computer {
    private Cpu  cpu;
    private Memory memory;
    private Disk disk;
    public Computer(){
        cpu=new Cpu();
        memory=new Memory();
        disk=new Disk();
    }
    public void start(){
        System.out.println("通电，开始启动bios");
        cpu.start();
        memory.start();
        disk.start();
    }
    public void shutdown(){
        System.out.println("发送关机信号");
       cpu.shutdown();
       memory.shutdown();
       disk.shutdown();
    }

    public static void main(String[] args) {
        Computer c=new Computer();
        c.start();
        c.shutdown();
    }
}
class Cpu{
    public void start(){
        System.out.println("cpu starting...");
    }
    public void shutdown(){
        System.out.println("cpu  shutdown...");
    }
}
class Memory{
    public void start(){
        System.out.println("Memory starting...");
    }
    public void shutdown(){
        System.out.println("Memory  shutdown...");
    }
}
class Disk{
    public void start(){
        System.out.println("Disk starting...");
    }
    public void shutdown(){
        System.out.println("Disk  shutdown...");
    }
}
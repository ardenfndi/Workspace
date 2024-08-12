package NestedClasses;
public class App {
    public static void main(String[] args) throws Exception {
        Computer computer = new Computer();
        Computer.CPU cpu = computer.new CPU();
        Computer.RAM ram = computer.new RAM();

        System.out.println(cpu.getSpeed());
        System.out.println(ram.getMemorySize());
    }
}

package homework_32.model;

public class Computer extends Stock {

    protected String cpu;
    protected int ram;
    protected int hdd;


    public Computer(long id, String model, double price, int quantity, String cpu, int ram, int hdd) {
        super(id, model, price, quantity);
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return hdd;
    }

    public void setSsd(int ssd) {
        this.hdd = ssd;
    }

    @Override
    public double calculateTotalPrice() {
        return 0;
    }
}

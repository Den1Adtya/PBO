package Tugas_6;

public class Macbook implements Laptop {
     private int volume;
    boolean is_power_on;

    public Macbook() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        is_power_on = true;
        System.out.println("Laptop is On");
        System.out.println("Welcome in Macbook");
    }

    @Override
    public void powerOff() {
        is_power_on = false;
        System.out.println("Shutting Down...");
    }

    @Override
    public void volumeUp() {
        if (is_power_on) {
            if (this.volume == MAX_VOL) {
            System.out.println("VOLUME IS FUL!!!.");
        } else {
            this.volume += 10;
            System.out.println("Volume is:" + this.getVolume());
        }
        }
    }

    @Override
    public void volumeDown() {
        if (is_power_on) {
            if (this.volume == MIN_VOL) {
            System.out.println("LAPTOP IN SILENCE!!!.");
        } else {
            this.volume -= 10;
            System.out.println("Volume is:" + this.getVolume());
        }
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
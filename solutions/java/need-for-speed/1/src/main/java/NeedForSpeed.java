class NeedForSpeed {

    int speed;
    int batteryDrain;
    int battery;
    int distanceDriven;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
        this.distanceDriven = 0;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int numberOfDrives = (int) Math.ceil((double) distance / car.speed);
        int batteryNeeded = numberOfDrives * car.batteryDrain;

        return batteryNeeded <= 100;
    }
}
public class Lorry extends Transport {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;
    private int liftCapacity;

    public Lorry (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed, int liftCapacity) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.liftCapacity = liftCapacity;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }



    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }

    @Override
    public void printType() {
        if (liftCapacity == 0) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Грузоподъёмность -" + liftCapacity);
        }
    }
    @Override
    public boolean service(){
        return Math.random()>0.75;
    }
}
import java.util.Objects;

public class Bus extends Transport {
    private final int pitStopTime;
    private final int bestLapTime;
    private final int maxSpeed;
    private int capacity;

    public Bus (String brand, String model, int engineCapacity, int pitStopTime, int bestLapTime, int maxSpeed, int capacity) {
        super(brand, model, engineCapacity);


        this.pitStopTime = pitStopTime;
        this.bestLapTime = bestLapTime;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Модель - " + getModel()+ ", бренд - " + getBrand() + ", объём двигателя - " + getEngineCapacity() + ".";
    }
    @Override
    public int hashCode(){
        return Objects.hash (getModel(), getBrand(), getEngineCapacity());
    }

    @Override
    public void printType() {
        if (capacity == 0) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость -" + capacity);
        }
    }
    @Override
    public boolean service(){
        System.out.println("Автобус " + getBrand() + getModel() + " в диагностике не нуждается");
        return true;
    }
} 
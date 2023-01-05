public abstract class Transport {
    private String brand;
    private String model;
    private int engineCapacity;


    public Transport (String brand, String model, int engineCapacity) {


        if (brand==null) {
            this.brand = "Информация не указана";
        } else {
            this.brand = brand;
        }
        if (model==null) {
            this.model = "Информация не указана";
        } else {
            this.model = model;
        }
        if (engineCapacity==0) {
            this.engineCapacity = 0;
        } else {
            this.engineCapacity = engineCapacity;
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public abstract void printType();

    public abstract boolean service();
}


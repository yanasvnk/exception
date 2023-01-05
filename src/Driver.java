public abstract class Driver {
    private final String name;
    private final boolean hasLicense;
    private final int experience;

    private final String category;

    protected Driver(String name, boolean hasLicense, int experience, String category) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experience = experience;
        this.category = setCategory(category);
    }

    public String getName() {
        return name;
    }

    public boolean HasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    public String getCategory() {
        return category;
    }

    private String setCategory(String category) {
        if (category ==null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        return category;
    }

    abstract String start();
    abstract String stop();
    abstract String refuel();

}
public class Main {
    public static void main(String[] args) {
        boolean success = Data.validate("test", "test", "test");
        if (success) {
            System.out.println("Данные валидны.");
        } else {
            System.out.println("Данные невалидны!");
        }

            Car car = new Car("Toyota", "B-901", 45, 3, 7, 250, "SEDAN" );

            Lorry lorry = new Lorry("Ленинград", "SD-678", 90, 4, 9, 145, 120);

            Bus bus = new Bus("Жигули", "NM-45", 60, 5, 10, 130, 70);

            Driver driver = new Driver("Иванов Иван", true, 4, null) {
                @Override
                String start() {
                    return null;
                }

                @Override
                String stop() {
                    return null;
                }

                @Override
                String refuel() {
                    return null;
                }
            };


        service(car, lorry, bus);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }
        private static void serviceTransport (Transport transport) {
                try {
                    if (!transport.service()) {
                        throw new RuntimeException("Транспорт " + transport.getBrand() + transport.getModel() + " не прошёл диагностику.");
                    }
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        }




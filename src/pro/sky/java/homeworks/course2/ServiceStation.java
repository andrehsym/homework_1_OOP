package pro.sky.java.homeworks.course2;

public class ServiceStation implements ServiceStationForTransport {

    public void checkTransport(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");

    }

    @Override
    public void check(Bicycle bicycle) {
        checkTransport(bicycle);
    }

    @Override
    public void check(Car car) {
        checkTransport(car);
        checkEngine();
        }


    @Override
    public void check(Truck truck) {
        checkTransport(truck);
            checkEngine();
            checkTrailer();
        }
}

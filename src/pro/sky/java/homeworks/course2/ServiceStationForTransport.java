package pro.sky.java.homeworks.course2;

public interface ServiceStationForTransport {
    void check(Bicycle bicycle);

    void check(Car car);

    void check(Truck truck);

    void updateTyre();

    void checkEngine();

    void checkTrailer();
}

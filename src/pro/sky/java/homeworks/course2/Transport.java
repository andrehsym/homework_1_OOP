package pro.sky.java.homeworks.course2;

public abstract class Transport {

    private String setModelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.setModelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return setModelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.setModelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}

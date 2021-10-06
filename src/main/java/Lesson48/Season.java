package Lesson48;

public enum Season {
    SUMMER(25), WINTER(-15), SPRING(15), AUTUMN(10);
    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    Season(int temperature) {
        this.temperature = temperature;
    }
}

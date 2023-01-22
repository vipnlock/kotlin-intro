package ch.study;

public class Weather {

    private final String description;
    private Color color;

    public Weather(int degrees) {
        String description;
        Color color;
        if (degrees < 10) {
            description = "cold";
            color = Color.BLUE;
        } else if (degrees < 25) {
            description = "mild";
            color = Color.ORANGE;
        } else {
            description = "hot";
            color = Color.RED;
        }
        this.description = description;
        this.color = color;
    }

    public enum Color {
        BLUE,
        ORANGE,
        RED;
    }
}

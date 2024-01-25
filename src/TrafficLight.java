public class TrafficLight {
    public static final String RED = "Red";
    public static final String YELLOW = "Yellow";
    public static final String GREEN = "Green";
    private String color;
    private int duration;
    public TrafficLight(String initialColor, int initialDuration) {
        this.color = initialColor;
        this.duration = initialDuration;
    }
    public String getColor() {
        return color;
    }
    public int getDuration() {
        return duration;
    }
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }
    public boolean isRed() {
        return color.equals(RED);
    }

    public boolean isGreen() {
        return color.equals(GREEN);
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(RED, 30);

        System.out.println("Traffic Light Details:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        System.out.println("Is it Red? " + trafficLight.isRed());
        System.out.println("Is it Green? " + trafficLight.isGreen());

        trafficLight.changeColor(GREEN, 45);

        System.out.println("\nUpdated Traffic Light Details:");
        System.out.println("Color: " + trafficLight.getColor());
        System.out.println("Duration: " + trafficLight.getDuration() + " seconds");

        System.out.println("Is it Red? " + trafficLight.isRed());
        System.out.println("Is it Green? " + trafficLight.isGreen());
    }
}

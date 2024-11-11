package Car;

public class Car {
    private String model;
    private String color;
    private int year;
    private static int totalCars = 0;

    public Car() {
        this.model = "Unknown";
        this.color = "Unknown";
        this.year = 2024;
        totalCars++;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        setYear(year);
        totalCars++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 0 && year <= 2024) {
            this.year = year;
        }
    }

    public static int getTotalCars() {
        return totalCars;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return year == car.year && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public String toString() {
        return "Car [Model: " + model + ", Color: " + color + ", Year: " + year + "]";
    }
}

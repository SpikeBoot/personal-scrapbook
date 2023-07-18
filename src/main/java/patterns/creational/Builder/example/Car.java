package patterns.creational.Builder.example;

public class Car {
    private final String model;
    private final int year;
    private final String color;
    private final int horsePower;

    private Car(Builder carBuilder) {
        this.model = carBuilder.getModel();
        this.year = carBuilder.getYear();
        this.color = carBuilder.getColor();
        this.horsePower = carBuilder.getHorsePower();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    static class Builder {
        private String model;
        private int year;
        private String color;
        private int horsePower;

        Builder() {
        }

        public Car build() {
            return new Car(this);
        }

        public String getModel() {
            return model;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public int getYear() {
            return year;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public String getColor() {
            return color;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public Builder setHorsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }
    }
}

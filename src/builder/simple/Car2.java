package builder.simple;

/**
 * Created by mateusz on 2017-02-05.
 */
public class Car2 {

    public String color;

    private Car2(Builder builder) {
        this.color = builder.color;
    }

    public static class Builder {

        private String color;

        public Builder() {
        }

        public Car.Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
        //comment
    }
}

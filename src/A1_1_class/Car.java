package A1_1_class;

public class Car {
    private String owner;
    private double mileage;

    public Car(String owner) {
        this.owner = owner;
        this.mileage = 0.0;
    }

    public Car(String owner, double mileage) {
        this.owner = owner;
        this.mileage = mileage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        System.out.println("Das Setzen der Mileage ist nicht erlaubt");
    }

    public void drive(double timeInHours, double speedInKmH) {
        if (timeInHours > 0 && speedInKmH > 0) {
            this.mileage += timeInHours * speedInKmH;
        }
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Das Auto von " +  this.owner + " ist " + this.mileage + " weit gefahren";
    }
}

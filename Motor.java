public class Motor {
    private int rpm;

    public Motor(int rpm) {
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    @Override
    public String toString() {
        return "RPM : " + rpm;
    }
}
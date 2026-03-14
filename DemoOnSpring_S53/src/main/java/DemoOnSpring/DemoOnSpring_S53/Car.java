package DemoOnSpring.DemoOnSpring_S53;

public class Car {

    private Engine engineOb;

    // Constructor Injection
    public Car(Engine engineOb) {
        this.engineOb = engineOb;
    }

    public Engine getEngineOb() {
        return engineOb;
    }

    public void setEngineOb(Engine engineOb) {
        this.engineOb = engineOb;
    }

    public void displayEngineType() {
        System.out.println("Type of car engine is " + engineOb.getEngineType());
    }
}

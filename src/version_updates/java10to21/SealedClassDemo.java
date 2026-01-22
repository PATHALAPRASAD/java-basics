package version_updates.java10to21;

public class SealedClassDemo {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bike();
        vehicle1.go();

        Vehicle vehicle2 = new Car();
        vehicle2.go();

        Vehicle vehicle3 = new Bus();
        vehicle3.go();

        Vehicle vehicle4 = new Vehicle();
        vehicle4.go();
    }
}

sealed class Vehicle permits Bike, Bus, Car {
    void go() {
        System.out.println("Going...!");
    }
}

final class Bike extends Vehicle {
}

non-sealed class Car extends Vehicle {
}

sealed class Bus extends Vehicle permits A {
}

final class A extends Bus {
}

class Person { // Person cannot extend Vehicle class as it didn't permit
}

sealed interface X permits Y, Z {
}

non-sealed interface Y extends X {
}

sealed interface Z extends X permits P {
}

non-sealed interface P extends Z {
}

// normal interface (which not prefixed with 'sealed' or 'non-sealed') cannot extend sealed interface (X)
//interface Q extends X {
//}
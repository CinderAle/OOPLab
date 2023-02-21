public class Main {
    //Classes represent different types of transport, trailer and engine
    //Each transport class except trailer contains a field of the engine class
    //Ground transport classes contain a field of the trailer class
    class Engine{
        private int cylinders, horsepower, torque;
        private String manufacturer;
    }

    class Transport {
        protected String brand, model, color, interior, ownerName, modifications, specifications;
        protected int seats, manufactureYear, mileage, mass;
    }

    class AirTransport extends Transport {
        protected int maxHeight, maxDistance;
        protected Engine[] engines;
    }

    class Helicopter extends AirTransport {
        private int blades;
        private String rotorsType;
    }

    class Airplane extends AirTransport {
        private String airplaneClass;
        private int landings;
    }

    class SeaTransport extends Transport {
        protected int volumeDisplacement, massDisplacement, normalDisplacement, fullDisplacement;
        protected Engine engine;
    }

    class Trailer extends Transport {
        private String trailerType;
        private int height, width;
    }
    class GroundTransport extends Transport {
        protected int wheels, fuelTankVolume, highwayConsumption, cityConsumption, gears;
        protected String wheelDrive, gearboxType, gearboxManufacturer, soundSystem;
        protected Engine engine;
        protected boolean leftSided;
    }

    class PassengerCar extends GroundTransport {
        private String bodyType, rimsType, tyresType, assembly, equipment;
        private int rimsRadius, acceleration;
        private Trailer trailer;
    }

    class Truck extends GroundTransport {
        private Trailer trailer;
        private String trailerConnection;
    }
}
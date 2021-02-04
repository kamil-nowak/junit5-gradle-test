import component.Processor;
import component.ProcessorProducent;

public class Phone {

    private final String producent;
    private final String model;
    private final String size;
    private final short battery;
    private final short RAM;
    private final short memory;
    private final Processor processor;
    private final boolean jack;
    private final ReleaseDate releaseDate;

    private Phone(String producent, String model, String size, short battery, short RAM,
                 short memory, Processor processor, boolean jack, ReleaseDate releaseDate) {
        this.producent = producent;
        this.model = model;
        this.size = size;
        this.battery = battery;
        this.RAM = RAM;
        this.memory = memory;
        this.processor = processor;
        this.jack = jack;
        this.releaseDate = releaseDate;
    }

    public String getFullName() {
        return getProducent() + getModel();
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public short getBattery() {
        return battery;
    }

    public short getRAM() {
        return RAM;
    }

    public short getMemory() {
        return memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public boolean isJack() {
        return jack;
    }

    public ReleaseDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", battery=" + battery +
                ", RAM=" + RAM +
                ", memory=" + memory +
                ", processor='" + processor + '\'' +
                ", jack=" + jack +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }

    public boolean isNewerThan(Phone other) {
        return this.getReleaseDate().isNewerThan(other.getReleaseDate());
    }

    public boolean isBatteryBiggerThan(Phone other) {
        return this.getBattery() > other.getBattery();
    }

    public ProcessorProducent getProcessorProducent() {
        return getProcessor().getProducent();
    }

    public static class PhoneBuilder {
        private String producent;
        private String model;
        private String size;
        private short battery;
        private short RAM;
        private short memory;
        private Processor processor;
        private ReleaseDate releaseDate;
        private boolean jack = false;

        public static PhoneBuilder builder() {
            return new PhoneBuilder();
        }

        public PhoneBuilder producent(String producent) {
            this.producent = producent;
            return this;
        }

        public PhoneBuilder model(String model) {
            this.model = model;
            return this;
        }

        public PhoneBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PhoneBuilder battery(short battery) {
            this.battery = battery;
            return this;
        }

        public PhoneBuilder RAM(short RAM) {
            this.RAM = RAM;
            return this;
        }

        public PhoneBuilder memory(short memory) {
            this.memory = memory;
            return this;
        }

        public PhoneBuilder processor(Processor processor) {
            this.processor = processor;
            return this;
        }

        public PhoneBuilder releaseDate(ReleaseDate releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public PhoneBuilder jack(boolean jack) {
            this.jack = jack;
            return this;
        }

        public Phone build() {
            return new Phone(this.producent, this.model, this.size, this.battery, this.RAM,
                    this.memory, this.processor, this.jack, this.releaseDate);
        }

    }

}

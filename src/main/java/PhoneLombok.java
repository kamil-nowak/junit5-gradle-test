import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class PhoneLombok {

    private String producent;
    private String model;
    private String size;
    private short battery;
    private short RAM;
    private short memory;
    private String processor;
    private boolean jack;
    private ReleaseDate releaseDate;

    public String getFullName() {
        return getProducent() + getModel();
    }

    public boolean isNewerThan(PhoneLombok other) {
        return this.getReleaseDate().isNewerThan(other.getReleaseDate());
    }

    public boolean isBatteryBiggerThan(PhoneLombok other) {
        return this.getBattery() > other.getBattery();
    }

    public ProcessorProducent getProcessorProducent() {
        if (isProcessorProducentMatch(ProcessorProducent.QUALCOMM)) {
            return ProcessorProducent.QUALCOMM;
        }
        if (isProcessorProducentMatch(ProcessorProducent.SAMSUNG_EXYNOS)) {
            return ProcessorProducent.SAMSUNG_EXYNOS;
        }
        return ProcessorProducent.MEDIA_TEK;
    }

    private boolean isProcessorProducentMatch(ProcessorProducent processorProducent) {
        return replaceNotImportantCharacters(this.getProcessor())
                .contains(replaceNotImportantCharacters(processorProducent.toString()));
    }

    private String replaceNotImportantCharacters(String value){
        return value.toLowerCase().replace("_", "").replace(" ", "");
    }
}

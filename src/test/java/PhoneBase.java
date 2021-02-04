import component.Processor;
import component.ProcessorProducent;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;

public abstract class PhoneBase {

    protected static final String XIAOMI_PRODUCENT = "Xiaomi";
    protected static final String LG_PRODUCENT = "LG";
    protected static final String SAMSUNG_PRODUCENT = "Samsung";
    protected static final String REALME_PRODUCENT = "Realme";

    protected static final String MI_9T_MODEL = "Mi 9T";
    protected static final String G6_MODEL = "G6";
    protected static final String GALAXY_S21PLUS_MODEL = "GALAXY S21+";
    protected static final String V15_MODEL = "V15";

    protected static final String SIZE_6_39 = "6.39";
    protected static final String SIZE_5_7 = "5.7";
    protected static final String SIZE_6_7 = "6.7";

    protected static final short BATTERY_4000 = 4000;
    protected static final short BATTERY_3300 = 3300;
    protected static final short BATTERY_4800 = 4800;
    protected static final short BATTERY_4310 = 4310;

    protected static final short MEMORY_32 = 32;
    protected static final short MEMORY_128 = 128;
    protected static final short MEMORY_256 = 256;

    protected static final short RAM_4 = 4;
    protected static final short RAM_6 = 6;
    protected static final short RAM_8 = 8;

    protected static final Processor QUALCOMM_SNAPDRAGON_730 =
            new Processor(ProcessorProducent.QUALCOMM_SNAPDRAGON, "730");
    protected static final Processor QUALCOMM_SNAPDRAGON_821 =
            new Processor(ProcessorProducent.QUALCOMM_SNAPDRAGON, "821");
    protected static final Processor SAMSUNG_EXYNOS_2100 =
            new Processor(ProcessorProducent.SAMSUNG_EXYNOS, "2100");
    protected static final Processor MEDIA_TEK_DIMENSITY_720 =
            new Processor(ProcessorProducent.MEDIATEK, "Dimensity 720");

    protected Phone xiaomiMi9T;
    protected Phone lGG6;
    protected Phone samsungGalaxyS21Plus;
    protected Phone realmeV15;

    @BeforeEach
    void setUpBase() {
        System.out.println("A:"+ DateTime.now());
        xiaomiMi9T = Phone.PhoneBuilder.builder()
                .producent(XIAOMI_PRODUCENT)
                .model(MI_9T_MODEL)
                .size(SIZE_6_39)
                .battery(BATTERY_4000)
                .memory(MEMORY_128)
                .RAM(RAM_6)
                .processor(QUALCOMM_SNAPDRAGON_730)
                .releaseDate(new ReleaseDate(2, 2019))
                .jack(true)
                .build();

        lGG6 = Phone.PhoneBuilder.builder()
                .producent(LG_PRODUCENT)
                .model(G6_MODEL)
                .size(SIZE_5_7)
                .battery(BATTERY_3300)
                .memory(MEMORY_32)
                .RAM(RAM_4)
                .processor(QUALCOMM_SNAPDRAGON_821)
                .releaseDate(new ReleaseDate(1, 2017))
                .jack(true)
                .build();

        samsungGalaxyS21Plus = Phone.PhoneBuilder.builder()
                .producent(SAMSUNG_PRODUCENT)
                .model(GALAXY_S21PLUS_MODEL)
                .size(SIZE_6_7)
                .battery(BATTERY_4800)
                .memory(MEMORY_256)
                .RAM(RAM_8)
                .processor(SAMSUNG_EXYNOS_2100)
                .releaseDate(new ReleaseDate(1, 2021))
                .build();

        realmeV15 = Phone.PhoneBuilder.builder()
                .producent(REALME_PRODUCENT)
                .model(V15_MODEL)
                .size(SIZE_6_7)
                .battery(BATTERY_4310)
                .memory(PhoneTest.MEMORY_128)
                .RAM(PhoneTest.RAM_8)
                .processor(MEDIA_TEK_DIMENSITY_720)
                .releaseDate(new ReleaseDate(1, 2021))
                .build();
    }

}

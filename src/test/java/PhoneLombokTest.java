import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneLombokTest {

    public static final String XIAOMI_PRODUCENT = "Xiaomi";
    public static final String LG_PRODUCENT = "LG";
    public static final String SAMSUNG_PRODUCENT = "Samsung";
    public static final String REALME_PRODUCENT = "Realme";

    public static final String MI_9T_MODEL = "Mi 9T";
    public static final String G6_MODEL = "G6";
    public static final String GALAXY_S21PLUS_MODEL = "GALAXY S21+";
    public static final String V15_MODEL = "V15";

    public static final String SIZE_6_39 = "6.39";
    public static final String SIZE_5_7 = "5.7";
    public static final String SIZE_6_7 = "6.7";

    public static final short BATTERY_4000 = (short) 4000;
    public static final short BATTERY_3300 = (short) 3300;
    public static final short BATTERY_4800 = (short) 4800;
    public static final short BATTERY_4310 = (short) 4310;

    public static final short MEMORY_32 = (short) 32;
    public static final short MEMORY_128 = (short) 128;
    public static final short MEMORY_256 = (short) 256;

    public static final short RAM_4 = (short) 4;
    public static final short RAM_6 = (short) 6;
    public static final short RAM_8 = (short) 8;

    public static final String QUALCOMM_SNAPDRAGON_730 = "Qualcomm Snapdragon 730";
    public static final String QUALCOMM_SNAPDRAGON_821 = "Qualcomm Snapdragon 821";
    public static final String SAMSUNG_EXYNOS_2100 = "Samsung Exynos 2100";
    public static final String MEDIA_TEK_DIMENSITY_720 = "MediaTek Dimensity 720";

    private PhoneLombok xiaomiMi9T;
    private PhoneLombok lGG6;
    private PhoneLombok samsungGalaxyS21Plus;
    private PhoneLombok realmeV15;

    @BeforeEach
    void setUp() {
        xiaomiMi9T = PhoneLombok.builder()
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

        lGG6 = PhoneLombok.builder()
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

        samsungGalaxyS21Plus = PhoneLombok.builder()
                .producent(SAMSUNG_PRODUCENT)
                .model(GALAXY_S21PLUS_MODEL)
                .size(SIZE_6_7)
                .battery(BATTERY_4800)
                .memory(MEMORY_256)
                .RAM(RAM_8)
                .processor(SAMSUNG_EXYNOS_2100)
                .releaseDate(new ReleaseDate(1, 2021))
                .build();

        realmeV15 = PhoneLombok.builder()
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

    @Test
    void getFullName() {
        //given
        String xiaomiMi9TFullName = XIAOMI_PRODUCENT + MI_9T_MODEL;
        String lGG6FullName = LG_PRODUCENT + G6_MODEL;
        String samsungGalaxyS21PlusFullName = SAMSUNG_PRODUCENT + GALAXY_S21PLUS_MODEL;
        String realmeV15FullName = REALME_PRODUCENT + V15_MODEL;

        //when
        String xiaomiMi9TFullNameMethod = xiaomiMi9T.getFullName();
        String lGG6FullNameMethod = lGG6.getFullName();
        String samsungGalaxyS21PlusFullNameMethod = samsungGalaxyS21Plus.getFullName();
        String realmeV15FullNameMethod = realmeV15.getFullName();

        //then
        assertEquals(xiaomiMi9TFullName, xiaomiMi9TFullNameMethod);
        assertEquals(lGG6FullName, lGG6FullNameMethod);
        assertEquals(samsungGalaxyS21PlusFullName, samsungGalaxyS21PlusFullNameMethod);
        assertEquals(realmeV15FullName, realmeV15FullNameMethod);
    }

    @Test
    void getProducent() {
        //given

        //when
        String xiaomiMi9TProducent = xiaomiMi9T.getProducent();
        String lGG6Producent = lGG6.getProducent();
        String samsungGalaxyS21PlusProducent = samsungGalaxyS21Plus.getProducent();
        String realmeV15Producent = realmeV15.getProducent();

        //then
        assertEquals(XIAOMI_PRODUCENT, xiaomiMi9TProducent);
        assertEquals(LG_PRODUCENT, lGG6Producent);
        assertEquals(SAMSUNG_PRODUCENT, samsungGalaxyS21PlusProducent);
        assertEquals(REALME_PRODUCENT, realmeV15Producent);
    }

    @Test
    void getModel() {
        //given

        //when
        String xiaomiMi9TModel = xiaomiMi9T.getModel();
        String lGG6Model = lGG6.getModel();
        String samsungGalaxyS21PlusModel = samsungGalaxyS21Plus.getModel();
        String realmeV15Model = realmeV15.getModel();

        //then
        assertEquals(MI_9T_MODEL, xiaomiMi9TModel);
        assertEquals(G6_MODEL, lGG6Model);
        assertEquals(GALAXY_S21PLUS_MODEL, samsungGalaxyS21PlusModel);
        assertEquals(V15_MODEL, realmeV15Model);
    }

    @Test
    void getSize() {
        //given

        //when
        String xiaomiMi9TSize = xiaomiMi9T.getSize();
        String lGG6Size = lGG6.getSize();
        String samsungGalaxyS21PlusSize = samsungGalaxyS21Plus.getSize();
        String realmeV15Size = realmeV15.getSize();

        //then
        assertEquals(SIZE_6_39, xiaomiMi9TSize);
        assertEquals(SIZE_5_7, lGG6Size);
        assertEquals(SIZE_6_7, samsungGalaxyS21PlusSize);
        assertEquals(SIZE_6_7, realmeV15Size);
    }

    @Test
    void getBattery() {
        //given

        //when
        short xiaomiMi9TBattery = xiaomiMi9T.getBattery();
        short lGG6Battery = lGG6.getBattery();
        short samsungGalaxyS21PlusBattery = samsungGalaxyS21Plus.getBattery();
        short realmeV15Battery = realmeV15.getBattery();

        //then
        assertEquals(BATTERY_4000, xiaomiMi9TBattery);
        assertEquals(BATTERY_3300, lGG6Battery);
        assertEquals(BATTERY_4800, samsungGalaxyS21PlusBattery);
        assertEquals(BATTERY_4310, realmeV15Battery);
    }

    @Test
    void getRAM() {
        //given

        //when
        short xiaomiMi9TRAM = xiaomiMi9T.getRAM();
        short lGG6RAM = lGG6.getRAM();
        short samsungGalaxyS21PlusRAM = samsungGalaxyS21Plus.getRAM();
        short realmeV15RAM = realmeV15.getRAM();

        //then
        assertEquals(RAM_6, xiaomiMi9TRAM);
        assertEquals(RAM_4, lGG6RAM);
        assertEquals(RAM_8, samsungGalaxyS21PlusRAM);
        assertEquals(RAM_8, realmeV15RAM);
    }

    @Test
    void getMemory() {
        //given

        //when
        short xiaomiMi9TMemory = xiaomiMi9T.getMemory();
        short lGG6Memory = lGG6.getMemory();
        short samsungGalaxyS21PlusMemory = samsungGalaxyS21Plus.getMemory();
        short realmeV15Memory = realmeV15.getMemory();

        //then
        assertEquals(MEMORY_128, xiaomiMi9TMemory);
        assertEquals(MEMORY_32, lGG6Memory);
        assertEquals(MEMORY_256, samsungGalaxyS21PlusMemory);
        assertEquals(MEMORY_128, realmeV15Memory);
    }

    @Test
    void getProcessor() {
        //given

        //when
        String xiaomiMi9TProcessor = xiaomiMi9T.getProcessor();
        String lGG6Processor = lGG6.getProcessor();
        String samsungGalaxyS21PlusProcessor = samsungGalaxyS21Plus.getProcessor();
        String realmeV15Processor = realmeV15.getProcessor();

        //then
        assertEquals(QUALCOMM_SNAPDRAGON_730, xiaomiMi9TProcessor);
        assertEquals(QUALCOMM_SNAPDRAGON_821, lGG6Processor);
        assertEquals(SAMSUNG_EXYNOS_2100, samsungGalaxyS21PlusProcessor);
        assertEquals(MEDIA_TEK_DIMENSITY_720, realmeV15Processor);
    }

    @Test
    void isJack() {
        //given

        //when
        boolean xiaomiMi9TJack = xiaomiMi9T.isJack();
        boolean lGG6Jack = lGG6.isJack();
        boolean samsungGalaxyS21PlusJack = samsungGalaxyS21Plus.isJack();
        boolean realmeV15Jack = realmeV15.isJack();

        //then
        assertTrue(xiaomiMi9TJack);
        assertTrue(lGG6Jack);
        assertFalse(samsungGalaxyS21PlusJack);
        assertFalse(realmeV15Jack);
    }

    @Test
    void getReleaseDate() {
        //given
        String xiaomiMi9TReleaseDateExpected = "ReleaseDate{Q2/2019}";
        String lGG6ReleaseDateExpected = "ReleaseDate{Q1/2017}";
        String samsungGalaxyS21PlusReleaseDateReleaseDateExpected = "ReleaseDate{Q1/2021}";
        String realmeV15ReleaseDateReleaseDateExpected = "ReleaseDate{Q1/2021}";

        //when
        ReleaseDate xiaomiMi9TReleaseDate = xiaomiMi9T.getReleaseDate();
        ReleaseDate lGG6ReleaseDate = lGG6.getReleaseDate();
        ReleaseDate samsungGalaxyS21PlusReleaseDate = samsungGalaxyS21Plus.getReleaseDate();
        ReleaseDate realmeV15ReleaseDate = realmeV15.getReleaseDate();

        //then
        assertEquals(xiaomiMi9TReleaseDateExpected, xiaomiMi9TReleaseDate.toString());
        assertEquals(lGG6ReleaseDateExpected, lGG6ReleaseDate.toString());
        assertEquals(samsungGalaxyS21PlusReleaseDateReleaseDateExpected, samsungGalaxyS21PlusReleaseDate.toString());
        assertEquals(realmeV15ReleaseDateReleaseDateExpected, realmeV15ReleaseDate.toString());
    }

    @Test
    void testToString() {
        //given
        String xiaomiMi9TStringExpected = "PhoneLombok(producent=Xiaomi, model=Mi 9T, size=6.39, battery=4000, RAM=6, memory=128, processor=Qualcomm Snapdragon 730, jack=true, releaseDate=ReleaseDate{Q2/2019})";
        String lGG6StringExpected = "PhoneLombok(producent=LG, model=G6, size=5.7, battery=3300, RAM=4, memory=32, processor=Qualcomm Snapdragon 821, jack=true, releaseDate=ReleaseDate{Q1/2017})";
        String samsungGalaxyS21PlusStringExpected = "PhoneLombok(producent=Samsung, model=GALAXY S21+, size=6.7, battery=4800, RAM=8, memory=256, processor=Samsung Exynos 2100, jack=false, releaseDate=ReleaseDate{Q1/2021})";
        String realmeV15StringExpected = "PhoneLombok(producent=Realme, model=V15, size=6.7, battery=4310, RAM=8, memory=128, processor=MediaTek Dimensity 720, jack=false, releaseDate=ReleaseDate{Q1/2021})";

        //when
        String xiaomiMi9TString = xiaomiMi9T.toString();
        String lGG6String = lGG6.toString();
        String samsungGalaxyS21PlusString = samsungGalaxyS21Plus.toString();
        String realmeV15String = realmeV15.toString();

        //then
        assertEquals(xiaomiMi9TStringExpected, xiaomiMi9TString);
        assertEquals(lGG6StringExpected, lGG6String);
        assertEquals(samsungGalaxyS21PlusStringExpected, samsungGalaxyS21PlusString);
        assertEquals(realmeV15StringExpected, realmeV15String);
    }

    @Test
    void isNewerThan() {
        assertTrue(realmeV15.isNewerThan(xiaomiMi9T));
        assertFalse(xiaomiMi9T.isNewerThan(realmeV15));

        assertTrue(xiaomiMi9T.isNewerThan(lGG6));
        assertFalse(lGG6.isNewerThan(xiaomiMi9T));

        assertFalse(lGG6.isNewerThan(samsungGalaxyS21Plus));
        assertTrue(samsungGalaxyS21Plus.isNewerThan(lGG6));

        assertFalse(samsungGalaxyS21Plus.isNewerThan(realmeV15));
        assertFalse(realmeV15.isNewerThan(samsungGalaxyS21Plus));
    }

    @Test
    void isBatteryBiggerThan() {
        assertTrue(realmeV15.isBatteryBiggerThan(xiaomiMi9T));
        assertFalse(xiaomiMi9T.isBatteryBiggerThan(realmeV15));

        assertTrue(xiaomiMi9T.isBatteryBiggerThan(lGG6));
        assertFalse(lGG6.isBatteryBiggerThan(xiaomiMi9T));

        assertFalse(lGG6.isBatteryBiggerThan(samsungGalaxyS21Plus));
        assertTrue(samsungGalaxyS21Plus.isBatteryBiggerThan(lGG6));

        assertTrue(samsungGalaxyS21Plus.isBatteryBiggerThan(realmeV15));
        assertFalse(realmeV15.isBatteryBiggerThan(samsungGalaxyS21Plus));
    }

    @Test
    void getProcessorProducent() {
        //given
        ProcessorProducent xiaomiMi9TProcessorProducentExpected = ProcessorProducent.QUALCOMM;
        ProcessorProducent lGG6ProcessorProducentExpected = ProcessorProducent.QUALCOMM;
        ProcessorProducent samsungGalaxyS21PlusProcessorProducentExpected = ProcessorProducent.SAMSUNG_EXYNOS;
        ProcessorProducent realmeV15ProcessorProducentExpected = ProcessorProducent.MEDIA_TEK;

        //when
        ProcessorProducent xiaomiMi9TProcessorProducent = xiaomiMi9T.getProcessorProducent();
        ProcessorProducent lGG6ProcessorProducent = lGG6.getProcessorProducent();
        ProcessorProducent samsungGalaxyS21PlusProcessorProducent = samsungGalaxyS21Plus.getProcessorProducent();
        ProcessorProducent realmeV15ProcessorProducent = realmeV15.getProcessorProducent();

        //then
        assertEquals(xiaomiMi9TProcessorProducentExpected, xiaomiMi9TProcessorProducent);
        assertEquals(lGG6ProcessorProducentExpected, lGG6ProcessorProducent);
        assertEquals(samsungGalaxyS21PlusProcessorProducentExpected, samsungGalaxyS21PlusProcessorProducent);
        assertEquals(realmeV15ProcessorProducentExpected, realmeV15ProcessorProducent);
    }
}
import component.Processor;
import component.ProcessorProducent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest extends PhoneBase {

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
        Processor xiaomiMi9TProcessor = xiaomiMi9T.getProcessor();
        Processor lGG6Processor = lGG6.getProcessor();
        Processor samsungGalaxyS21PlusProcessor = samsungGalaxyS21Plus.getProcessor();
        Processor realmeV15Processor = realmeV15.getProcessor();

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
        String xiaomiMi9TStringExpected = "Phone{producent='Xiaomi', model='Mi 9T', size='6.39', battery=4000, RAM=6, memory=128, processor='Qualcomm Snapdragon 730', jack=true, releaseDate='ReleaseDate{Q2/2019}'}";
        String lGG6StringExpected = "Phone{producent='LG', model='G6', size='5.7', battery=3300, RAM=4, memory=32, processor='Qualcomm Snapdragon 821', jack=true, releaseDate='ReleaseDate{Q1/2017}'}";
        String samsungGalaxyS21PlusStringExpected = "Phone{producent='Samsung', model='GALAXY S21+', size='6.7', battery=4800, RAM=8, memory=256, processor='Samsung Exynos 2100', jack=false, releaseDate='ReleaseDate{Q1/2021}'}";
        String realmeV15StringExpected = "Phone{producent='Realme', model='V15', size='6.7', battery=4310, RAM=8, memory=128, processor='Mediatek Dimensity 720', jack=false, releaseDate='ReleaseDate{Q1/2021}'}";

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
        ProcessorProducent xiaomiMi9TProcessorProducentExpected = ProcessorProducent.QUALCOMM_SNAPDRAGON;
        ProcessorProducent lGG6ProcessorProducentExpected = ProcessorProducent.QUALCOMM_SNAPDRAGON;
        ProcessorProducent samsungGalaxyS21PlusProcessorProducentExpected = ProcessorProducent.SAMSUNG_EXYNOS;
        ProcessorProducent realmeV15ProcessorProducentExpected = ProcessorProducent.MEDIATEK;

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
import com.google.common.collect.Lists;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneDatabaseTest extends PhoneBase {

    private PhoneDatabase phoneDatabase;

    @BeforeEach
    void setUp() {
        phoneDatabase = new PhoneDatabase(Lists.newArrayList(xiaomiMi9T, lGG6, samsungGalaxyS21Plus, realmeV15));
        System.out.println("B:" + DateTime.now());
    }

    @Test
    void getPhones() {
        //given
        List<Phone> phones = Lists.newArrayList(xiaomiMi9T, lGG6, samsungGalaxyS21Plus, realmeV15);

        //when
        List<Phone> phonesInDatabase = phoneDatabase.getPhones();

        //then
        assertArrayEquals(phones.toArray(), phonesInDatabase.toArray());
    }

    @RepeatedTest(2)
    void add() {
        //given
        Phone realmeV25 = Phone.PhoneBuilder.builder()
                .producent(PhoneTest.REALME_PRODUCENT)
                .model(PhoneTest.V15_MODEL)
                .size(PhoneTest.SIZE_6_7)
                .battery(PhoneTest.BATTERY_4310)
                .memory(PhoneTest.MEMORY_128)
                .RAM(PhoneTest.RAM_8)
                .processor(PhoneTest.MEDIA_TEK_DIMENSITY_720)
                .releaseDate(new ReleaseDate(1, 2021))
                .build();

        List<Phone> phones = phoneDatabase.getPhones();
        assertFalse(phones.contains(realmeV25));

        //when
        boolean added = phoneDatabase.add(realmeV25);
        phones = phoneDatabase.getPhones();

        //then
        assertTrue(added);
        assertTrue(phones.contains(realmeV25));
    }

    @RepeatedTest(2)
    void emptyPhoneDatabase() {
        //given
        PhoneDatabase empty = new PhoneDatabase();

        //when
        List<Phone> phones = empty.getPhones();

        //then
        assertTrue(phones.isEmpty());
    }

    @Test
    void filterByProcessorProducent() {
        //given

        //when
        List<Phone> phonesWithQualcom = phoneDatabase.filterByProcessorProducent(ProcessorProducent.QUALCOMM);

        //then
        assertTrue(phonesWithQualcom.contains(xiaomiMi9T));
        assertTrue(phonesWithQualcom.contains(lGG6));
        assertFalse(phonesWithQualcom.contains(samsungGalaxyS21Plus));
        assertFalse(phonesWithQualcom.contains(realmeV15));
    }

    @Test
    void filterByProcessorProducentAssertAll() {
        //given

        //when
        List<Phone> phonesWithQualcom = phoneDatabase.filterByProcessorProducent(ProcessorProducent.QUALCOMM);

        //then
        assertAll(
                () -> assertTrue(phonesWithQualcom.contains(xiaomiMi9T)),
                () -> assertTrue(phonesWithQualcom.contains(lGG6)),
                () -> assertFalse(phonesWithQualcom.contains(samsungGalaxyS21Plus)),
                () -> assertFalse(phonesWithQualcom.contains(realmeV15)));
    }

    @Test
    void filterByProcessorProducentIsFast() {
        //given
        ThrowingSupplier<List<Phone>> filterByProcessorProducentSupplier =
                () -> phoneDatabase.filterByProcessorProducent(ProcessorProducent.QUALCOMM);

        //when

        //then
        List<Phone> phonesWithQualcom = assertTimeout(Duration.ofMillis(100), filterByProcessorProducentSupplier);

        assertTrue(phonesWithQualcom.contains(xiaomiMi9T));
        assertTrue(phonesWithQualcom.contains(lGG6));
        assertFalse(phonesWithQualcom.contains(samsungGalaxyS21Plus));
        assertFalse(phonesWithQualcom.contains(realmeV15));
    }

}
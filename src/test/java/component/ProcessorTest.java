package component;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProcessorTest {

    private static final String QUALCOMM_SNAPDRAGON_730_MODEL = "730";
    private static final String QUALCOMM_SNAPDRAGON_821_MODEL = "821";
    private static final String SAMSUNG_EXYNOS_2100_MODEL = "2100";
    private static final String MEDIA_TEK_DIMENSITY_720_MODEL = "Dimensity 720";

    private Processor qualcommSnapdragon730;
    private Processor qualcommSnapdragon821;
    private Processor samsungExynos2100;
    private Processor mediaTekDimensity720;

    @BeforeEach
    void setUp() {
        qualcommSnapdragon730 = new Processor(ProcessorProducent.QUALCOMM_SNAPDRAGON, QUALCOMM_SNAPDRAGON_730_MODEL);
        qualcommSnapdragon821 = new Processor(ProcessorProducent.QUALCOMM_SNAPDRAGON, QUALCOMM_SNAPDRAGON_821_MODEL);
        samsungExynos2100 = new Processor(ProcessorProducent.SAMSUNG_EXYNOS, SAMSUNG_EXYNOS_2100_MODEL);
        mediaTekDimensity720 = new Processor(ProcessorProducent.MEDIATEK, MEDIA_TEK_DIMENSITY_720_MODEL);
    }

    @Test
    void testToString() {
        //given
        String qualcommSnapdragon730ExpectedName = "Qualcomm Snapdragon 730";
        String qualcommSnapdragon821ExpectedName = "Qualcomm Snapdragon 821";
        String samsungExynos2100ExpectedName = "Samsung Exynos 2100";
        String mediaTekDimensity720ExpectedName = "Mediatek Dimensity 720";

        //when
        String qualcommSnapdragon730Name = qualcommSnapdragon730.toString();
        String qualcommSnapdragon821Name = qualcommSnapdragon821.toString();
        String samsungExynos2100Name = samsungExynos2100.toString();
        String mediaTekDimensity720Name = mediaTekDimensity720.toString();

        //then
        assertEquals(qualcommSnapdragon730ExpectedName, qualcommSnapdragon730Name);
        assertEquals(qualcommSnapdragon821ExpectedName, qualcommSnapdragon821Name);
        assertEquals(samsungExynos2100ExpectedName, samsungExynos2100Name);
        assertEquals(mediaTekDimensity720ExpectedName, mediaTekDimensity720Name);

    }

    @Test
    void getProducent() {
        //given

        //when
        ProcessorProducent qualcommSnapdragon730Producent = qualcommSnapdragon730.getProducent();
        ProcessorProducent qualcommSnapdragon821Producent = qualcommSnapdragon821.getProducent();
        ProcessorProducent samsungExynos2100Producent = samsungExynos2100.getProducent();
        ProcessorProducent mediaTekDimensity720Producent = mediaTekDimensity720.getProducent();

        //then
        assertEquals(ProcessorProducent.QUALCOMM_SNAPDRAGON, qualcommSnapdragon730Producent);
        assertEquals(ProcessorProducent.QUALCOMM_SNAPDRAGON, qualcommSnapdragon821Producent);
        assertEquals(ProcessorProducent.SAMSUNG_EXYNOS, samsungExynos2100Producent);
        assertEquals(ProcessorProducent.MEDIATEK, mediaTekDimensity720Producent);
    }

    @Test
    void getModel() {
        //given

        //when
        String qualcommSnapdragon730Model = qualcommSnapdragon730.getModel();
        String qualcommSnapdragon821Model = qualcommSnapdragon821.getModel();
        String samsungExynos2100Model = samsungExynos2100.getModel();
        String mediaTekDimensity720Model = mediaTekDimensity720.getModel();

        //then
        assertEquals(QUALCOMM_SNAPDRAGON_730_MODEL, qualcommSnapdragon730Model);
        assertEquals(QUALCOMM_SNAPDRAGON_821_MODEL, qualcommSnapdragon821Model);
        assertEquals(SAMSUNG_EXYNOS_2100_MODEL, samsungExynos2100Model);
        assertEquals(MEDIA_TEK_DIMENSITY_720_MODEL, mediaTekDimensity720Model);
    }
}
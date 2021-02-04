import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReleaseDateTest {

    ReleaseDate Q3_2018;
    ReleaseDate Q4_2019;
    ReleaseDate Q1_2020;
    ReleaseDate Q2_2021;

    @BeforeEach
    void setUp() {
        Q3_2018 = new ReleaseDate(3, 2018);
        Q4_2019 = new ReleaseDate(4, 2019);
        Q1_2020 = new ReleaseDate(1, 2020);
        Q2_2021 = new ReleaseDate(2, 2021);
    }

    @Test
    void getQuarter() {
        //given

        //when
        int quarter3 = Q3_2018.getQuarter();
        int quarter4 = Q4_2019.getQuarter();
        int quarter1 = Q1_2020.getQuarter();
        int quarter2 = Q2_2021.getQuarter();

        //then
        assertEquals(3, quarter3);
        assertEquals(4, quarter4);
        assertEquals(1, quarter1);
        assertEquals(2, quarter2);
    }

    @Test
    void getYear() {
        //given

        //when
        int year2018 = Q3_2018.getYear();
        int year2019 = Q4_2019.getYear();
        int year2020 = Q1_2020.getYear();
        int year2021 = Q2_2021.getYear();

        //then
        assertEquals(year2018, 2018);
        assertEquals(year2019, 2019);
        assertEquals(year2020, 2020);
        assertEquals(year2021, 2021);
    }

    @Test
    void isNewerThan() {
        //given

        //when

        //then
        assertFalse(Q3_2018.isNewerThan(Q4_2019));
        assertFalse(Q3_2018.isNewerThan(Q1_2020));
        assertFalse(Q3_2018.isNewerThan(Q2_2021));

        assertTrue(Q4_2019.isNewerThan(Q3_2018));
        assertFalse(Q4_2019.isNewerThan(Q1_2020));
        assertFalse(Q4_2019.isNewerThan(Q2_2021));

        assertTrue(Q1_2020.isNewerThan(Q3_2018));
        assertTrue(Q1_2020.isNewerThan(Q4_2019));
        assertFalse(Q1_2020.isNewerThan(Q2_2021));

        assertTrue(Q2_2021.isNewerThan(Q3_2018));
        assertTrue(Q2_2021.isNewerThan(Q4_2019));
        assertTrue(Q2_2021.isNewerThan(Q1_2020));
    }

    @Test
    void isNewerThanOnSameYear() {
        //given
        ReleaseDate Q1_2020 = new ReleaseDate(1, 2020);
        ReleaseDate Q2_2020 = new ReleaseDate(2, 2020);
        ReleaseDate Q3_2020 = new ReleaseDate(3, 2020);
        ReleaseDate Q4_2020 = new ReleaseDate(4, 2020);

        //when

        //then
        assertFalse(Q1_2020.isNewerThan(Q2_2020));
        assertFalse(Q1_2020.isNewerThan(Q3_2020));
        assertFalse(Q1_2020.isNewerThan(Q4_2020));

        assertTrue(Q2_2020.isNewerThan(Q1_2020));
        assertFalse(Q2_2020.isNewerThan(Q3_2020));
        assertFalse(Q2_2020.isNewerThan(Q4_2020));

        assertTrue(Q3_2020.isNewerThan(Q1_2020));
        assertTrue(Q3_2020.isNewerThan(Q2_2020));
        assertFalse(Q3_2020.isNewerThan(Q4_2020));

        assertTrue(Q4_2020.isNewerThan(Q1_2020));
        assertTrue(Q4_2020.isNewerThan(Q2_2020));
        assertTrue(Q4_2020.isNewerThan(Q3_2020));
    }

    @Test
    void testToString() {
        //given
        String Q3_2018Expected = "ReleaseDate{Q" + 3 + "/" + 2018 + '}';
        String Q4_2019Expected = "ReleaseDate{Q" + 4 + "/" + 2019 + '}';
        String Q1_2020Expected = "ReleaseDate{Q" + 1 + "/" + 2020 + '}';
        String Q2_2021Expected = "ReleaseDate{Q" + 2 + "/" + 2021 + '}';

        //when
        String quarter3_2018 = Q3_2018.toString();
        String quarter4_2019 = Q4_2019.toString();
        String quarter1_2020 = Q1_2020.toString();
        String quarter2_2021 = Q2_2021.toString();

        //then
        assertEquals(Q3_2018Expected, quarter3_2018);
        assertEquals(Q4_2019Expected, quarter4_2019);
        assertEquals(Q1_2020Expected, quarter1_2020);
        assertEquals(Q2_2021Expected, quarter2_2021);
    }

    @Test
    void releaseDateWrongQuarter() {
        ReleaseDateException releaseDateException =
                assertThrows(ReleaseDateException.class, () -> new ReleaseDate(0, 2020));
        assertEquals("Release date no valid: Quarter 0 is not correct.",
                releaseDateException.getMessage());
    }

    @Test
    void releaseDateWrongQuarter2() {
        ReleaseDateException releaseDateException =
                assertThrows(ReleaseDateException.class, () -> new ReleaseDate(5, 2020));
        assertEquals("Release date no valid: Quarter 5 is not correct.",
                releaseDateException.getMessage());
    }
}
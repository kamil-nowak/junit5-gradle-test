public class ReleaseDate {

    private final int quarter;
    private final int year;

    public ReleaseDate(int quarter, int year) {
        if (quarter < 1 || quarter > 4) {
            throw new ReleaseDateException("Quarter " + quarter + " is not correct.");
        }
        this.quarter = quarter;
        this.year = year;
    }

    public int getQuarter() {
        return quarter;
    }

    public int getYear() {
        return year;
    }

    public boolean isNewerThan(ReleaseDate other) {
        if (this.year > other.year) {
            return true;
        } else if ((this.year == other.year) && (this.quarter > other.quarter)) {
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "ReleaseDate{Q" + quarter + "/" + year + '}';
    }
}

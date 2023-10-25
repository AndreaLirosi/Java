 class Trangolo implements Forma{
    private double base;
    private double altezza;

    public Trangolo (double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public double calcolaArea(double base, double altezza) {
        return (base * altezza)/2;
    }
}
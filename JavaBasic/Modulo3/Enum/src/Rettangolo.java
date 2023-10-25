enum tipoRettangolo {
    rettangolo
}

class Rettangolo implements Forma {
    private double base;
    private double altezza;

    private tipoRettangolo tipo;

    public Rettangolo(double base, double altezza, tipoRettangolo tipo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = tipo;
    }

    public tipoRettangolo getTipo() {
        return tipo;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    @Override
    public double calcolaArea(double base, double altezza) {
        return base * altezza;
    }
}
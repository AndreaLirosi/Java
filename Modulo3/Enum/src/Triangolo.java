enum tipoTriangolo {
    triangolo
}
class Triangolo implements Forma{
    private double base;
    private double altezza;
    private tipoTriangolo tipo;

    public Triangolo (double base, double altezza, tipoTriangolo tipo) {
        this.base = base;
        this.altezza = altezza;
        this.tipo = tipo;
    }
    public tipoTriangolo getTipo() {
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
        return (base * altezza)/2;
    }
}

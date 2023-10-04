public class Auto {     // creo le variabili private
    private int cilindrata;
    private String targa;
    private String marca;

    private String modello;

    // vado a creare i setter e i getter (che hanno la stessa sintassi)
    //i Get mi permatto di prendere la variabile dalla classe
    public String getTarga() {
        return targa;
    }
// i set mi permettono di settare il valore della variabile, andando così, nel main,
    // a evitare possibili errori
    public void setTarga(String newTarga) {
        this.targa = newTarga;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String newModello) {
        this.modello = newModello;
    }

    public void setCilindrata(int newCilindrata) {
        this.cilindrata = newCilindrata;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
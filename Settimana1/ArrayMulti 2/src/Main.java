public class Main {
    public static void main(String[] args) {
        int[][] matrice = { {1, 2, 3}, {4, 5, 6}};
        //stampa matrice di partenza
        CreaMatrice(matrice);
    //nuova matrice invertita dalla funzione InvertiColonneRighe
        int [][] NueMatrix = InvertiColonneRighe(matrice);
    //Mostra il risultato
        System.out.println("Matrice risultato:");
        CreaMatrice(NueMatrix);

    }
    //Funzione che crea la matrice di partenza e stampa a schermo
    public static void CreaMatrice (int [][] Mat) {
        for (int i = 0; i < Mat.length; i++) {
            for (int j = 0; j<Mat[i].length; j++){
                System.out.print(Mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    //poichè la matrice di partenza ha 2 righe (num di {}) e 3 colonne (lunghezza delle{})
    //imposto e colonne e le righe di modo da poterle invertire nel nuovo array
    public static int[][] InvertiColonneRighe (int [][] Mat) {
        //dichiaro le righe e le colonne
        int righe = Mat.length; //la lunghezza di un array multidimensionale rappresenta il numero di righe
        int colonne = Mat[0].length; // imposto le colonne lunghe come la lunghezza dell primo elemento
        int[][] newMatrix = new int[colonne][righe]; // nuova matrice con righe lunge come le colonne e viceversa
        //il ciclo porta a trasporre gli indici; il primo attraverso le righe, il secondo attraverso le colonne
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
        //copio l'elemento dalla matrice originale, nella posizione [i][j], nella posizione [j][i] nella nuova matrice.
                newMatrix[j][i] = Mat[i][j];
            }
        }
        return newMatrix;
    }
}


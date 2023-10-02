public class Main {
    public static void main(String[] args) {
        int[][] matrice = { {1, 2, 3}, {4, 5, 6}};
        //stampa matrice di partenza
        creaMatrice(matrice);
    //nuova matrice invertita dalla funzione InvertiColonneRighe
        int [][] nueMatrix = invertiColonneRighe(matrice);
    //Mostra il risultato
        System.out.println("Matrice risultato:");
        creaMatrice(nueMatrix);

    }
    //Funzione che crea la matrice di partenza e stampa a schermo
    public static void creaMatrice (int [][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    //poichè la matrice di partenza ha 2 righe (num di {}) e 3 colonne (lunghezza delle{})
    //imposto e colonne e le righe di modo da poterle invertire nel nuovo array
    public static int[][] invertiColonneRighe (int [][] mat) {
        //dichiaro le righe e le colonne
        int righe = mat.length; //la lunghezza di un array multidimensionale rappresenta il numero di righe
        int colonne = mat[0].length; // imposto le colonne lunghe come la lunghezza dell primo elemento
        int[][] newMatrix = new int[colonne][righe]; // nuova matrice con righe lunge come le colonne e viceversa
        //il ciclo porta a trasporre gli indici; il primo attraverso le righe, il secondo attraverso le colonne
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
        //copio l'elemento dalla matrice originale, nella posizione [i][j], nella posizione [j][i] nella nuova matrice.
                newMatrix[j][i] = mat[i][j];
            }
        }
        return newMatrix;
    }
}


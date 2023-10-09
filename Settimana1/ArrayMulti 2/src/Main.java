public class Main {
    public static void main(String[] args) {
        int[][] matrice = {
                {1, 2, 3},
                {4, 5, 6}};
        //stampa matrice di partenza
        creaMatrice(matrice);
//nuova matrice invertita dalla funzione InvertiColonneRighe
        int [][] nueMatrix = invertiColonneRighe(matrice);

        if (righeUguali(matrice)) {
//Mostra il risultato
            System.out.println("Matrice risultato:");
            creaMatrice(nueMatrix);
        } else {
            System.out.println("The matrix has different dimensions for the rows.");
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
    //dobbiamo verificare se la matrice ha lo stesso numero di elementi per ogni riga
    public static boolean righeUguali (int [][] matrix) {
        //partendo dalla riga 0, andiamo a girare su ognuna delle righe della matrice
        int righe = 0;
        for (int i = 0; i < matrix.length; i++) {
            righe++;
        }
    //useremo un array che avrà una sola dimensione (lunga quanto le righe della matrice)
    //alla quale assegneremo un valore ad ogni elemento pari al numero di elementi di ogni riga di matrix
        int [] elementiOgniColonna = new int[righe];
    // nel ciclo andiamo ad assegnare, quindi, un valore all'iesimo elemento dell'array,
    //pari al numero di elementi di ogni sottomatrice (cioè matrix[i].length)
        for (int i =0; i < matrix.length; i++) {
            elementiOgniColonna[i] = matrix[i].length;
        }

        return tutteUguali (elementiOgniColonna);
    }
    // qui andiamo a gestire l'array creato sopra e andiamo a verificare se gli elementi
    //sono tutti uguali.
public static boolean tutteUguali (int [] arr) {
    if (arr == null || arr.length == 0) {   //se l'array ha valore null o è uguale a 0 darà falso
        return false;
    }
    for (int i = 1; i< arr.length; i++) {
        if (arr[0] != arr[i]) {
            return false;
        }

    }
    return true;

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
}


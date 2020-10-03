package javaapplication76;

import java.io.*;
import java.util.*;
//Recuerde cambiar la ruta
public class JavaApplication76 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
JavaApplication76 metodo = new JavaApplication76();
        List<String> Cadena = new ArrayList<String>();
        Cadena.add("Estrutura De Datos unidad dos");
        
        String Linea;
        String cade = "Esto,es,una,xd";
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String[] palabras;
        String[] palabras2;
        String[] palabras3;
        
        archivo = new File("C:\\Users\\HP\\Desktop\\XD.txt");

        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        palabras = cade.split(",");
        palabras2 = Cadena.get(0).split(" ");
        metodo.Mostrar(palabras);
        metodo.Mostrar(palabras2);
        Linea = br.readLine();
        palabras3 = Linea.split(" ");
        metodo.Mostrar(palabras3);
        metodo.Intercalacion(palabras2, palabras3);
        try {
            if (null != fr) {
                fr.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Intercalacion(String A[], String B[]) {
        String C[];
        int i, j, k;
        int tam = 0, R = 0, M = 0;
        if (A.length > B.length) {
            R = A.length;
            M = B.length;
        } else {
            R = B.length;
            M = A.length;
        }
        C = new String[R];
        for (i = j = k = 0; i < R && k < M; i++) {
            System.out.println(A[i] + "=" + B[k]);
            if (A[i].equals(B[k])) {
                C[j] = A[i];
                j++;
                k++;
            }

        }
        Mostrar(C);
    }

    public void Mostrar(String M[]) {
        for (int i = 0; i < M.length; i++) {
            if (M[i] != null) {
                System.out.println("[" + i + "]" + M[i]);

            }
        }
        System.out.println("");
    }

}

package javaapplication76;

import java.io.*;
import java.util.*;

public class JavaApplication76 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        JavaApplication76 metodo = new JavaApplication76();
        List<String> Cadena = new ArrayList<String>();
        Cadena.add("Estructura De Datos unidad dos");

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
        ArrayList<String> C = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i].equals(B[j])) {
                    C.add(A[i]);
                }
            }
        }
        String c[] = new String[C.size()];
        for (int i = 0; i < C.size(); i++) {
            c[i] = C.get(i);

        }
        Mostrar(c);
    }

    public void Mostrar(String M[]) {
        for (int i = 0; i < M.length; i++) {
            System.out.println("[" + i + "]" + M[i]);
        }
        System.out.println("");
    }

}

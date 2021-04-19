package SalvarArquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarArquivo {


    public static void escreverCSV( String delimit,String texto, String caminhoArquivo)
            throws IOException {

        String nomeArquivo = "CapturaDados.csv";
        File file = new File(caminhoArquivo+nomeArquivo);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        if (!file.exists()) {
            file.createNewFile();
        } else {

        }
        bw.write(texto + delimit);
        bw.newLine();
        bw.flush();
        bw.newLine();
        bw.close();
    }

}

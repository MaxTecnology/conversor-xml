package br.com.maxtecnology.conversorxml.convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ReadXml {

    @Autowired
    private PaisXml paisXml;

    public void start(){
        System.out.println("Read XML");
        File diretorio = new File( System.getProperty("user.dir") + "/src/dadosxml");
        File[] files = diretorio.listFiles();
        assert files != null;
        int count = 0;
        for (File file : files) {
            count++;
            if (file.isFile() && file.getName().equalsIgnoreCase("pais.xml")) {
                System.out.println("O nome do arquivo: " + file.getName());
                paisXml.convert(file);
            }
        }
        System.out.println("Temos: "+count+" arquivo(s) no diretorio.");
    }
}

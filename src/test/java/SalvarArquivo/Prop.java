package SalvarArquivo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {

    public static Properties getProp() throws IOException {

        Properties props = new Properties();
        FileInputStream file = new FileInputStream("config.properties");
        props.load(file);
        return props;
    }

}

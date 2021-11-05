
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.*;
import java.net.URISyntaxException;


public class Main {

    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

            ObjectMapper mapper = new ObjectMapper();
        try {
            Empresa empresa = mapper.readValue(new File(Main.class.getResource("/Empresa.json").toURI()), Empresa.class);
            log.info(empresa.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }



    }

}

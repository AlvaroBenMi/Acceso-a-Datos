import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class InstitutoPrograma {

    private static Logger log = LoggerFactory.getLogger(InstitutoPrograma.class);

    private File file;
    private InstitutoReader reader;
    private  InstitutoWriter writer;

    public InstitutoPrograma(File file, InstitutoReader reader, InstitutoWriter writer) {
        this.file = file;
        this.reader = reader;
        this.writer = writer;
    }

    public void ejecutar(){
        Instituto instituto = reader.leeInstituto(file);

        if (instituto == null){
            log.error("No se ha encontrado el insituto");
        } else {
            writer.imprimeNombre(instituto);
        }
    }
}

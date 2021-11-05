import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstitutoWriter {

    private static Logger log = LoggerFactory.getLogger(InstitutoWriter.class);

    public void imprimeNombre(Instituto instituto){
        log.info(instituto.getNombre());
    }
}

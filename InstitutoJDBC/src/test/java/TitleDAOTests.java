import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;



public class TitleDAOTests {
    @Autowired
    private TitleDAO titleDAO;


    @Test
    public void insert(){
        Title title = new Title(
                null,
                "Finanzas",
                "GS",
                "Admmin",
                "Cosas administrativas"
        );
    }

    @Test
    public void get(){
        Assert.assertNotNull(titleDAO.get("DAM"));
        Assert.assertNotNull(titleDAO.get("DAM2"));
    }
}

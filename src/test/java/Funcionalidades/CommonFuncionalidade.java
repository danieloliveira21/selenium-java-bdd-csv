package Funcionalidades;

import commons.BaseTest;

public class CommonFuncionalidade extends BaseTest {

    public void acessarSite(String site){
        webDriver.navigate().to(site);
    }

}

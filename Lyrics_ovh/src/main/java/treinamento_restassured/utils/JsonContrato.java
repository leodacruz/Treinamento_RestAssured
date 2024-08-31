package treinamento_restassured.utils;

import java.io.File;

public class JsonContrato {

    private static final String DIR_PATH_PROPERTIES = System.getProperty("user.dir") + File.separator + "src"
            + File.separator +
            "test" + File.separator + "resources" + File.separator + "Contratos" + File.separator;

    public static File getFile(String fileName) {

        try {
            File file = new File(DIR_PATH_PROPERTIES + fileName + ".json");
            return file;
        } catch (Exception e) {
            System.out.println("Não foi possível carregar o arquivo" + e.getMessage());
        }

        return null;
    }

}

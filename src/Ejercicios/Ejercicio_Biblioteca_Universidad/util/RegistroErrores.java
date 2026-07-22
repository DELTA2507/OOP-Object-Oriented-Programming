package util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class RegistroErrores {
    private static final String ARCHIVO_LOG = "errores.log";
    private static final DateTimeFormatter FORMATO =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private RegistroErrores() {
    }

    public static void registrar(Exception e) {
        try (FileWriter fileWriter = new FileWriter(ARCHIVO_LOG, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            String fecha = LocalDateTime.now().format(FORMATO);
            printWriter.println(
                    "[" + fecha + "] "
                            + e.getClass().getSimpleName()
                            + " - " + e.getMessage()
            );
        } catch (IOException ioException) {
            System.out.println(
                    "No se pudo registrar el error en el archivo: "
                            + ioException.getMessage()
            );
        }
    }
}

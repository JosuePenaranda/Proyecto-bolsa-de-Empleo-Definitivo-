package Services;

import Modelo.Nacionalidad;
import org.apache.poi.ss.usermodel.*;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class NacionalidadService {

    public static List<Nacionalidad> obtenerNacionalidades() {

        List<Nacionalidad> lista = new ArrayList<>();

        try {

            InputStream file = NacionalidadService.class
                    .getResourceAsStream("/nacionalidades.xlsx");

            Workbook workbook = WorkbookFactory.create(file);

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                if (row.getRowNum() == 0) {
                    continue;
                }

                String iso = getString(row.getCell(0));
                String nombre = getString(row.getCell(1));
                String descripcion = getString(row.getCell(2));
                String iso3 = getString(row.getCell(3));

                Integer codigoNumero = getInteger(row.getCell(4));
                Integer codigoTelefono = getInteger(row.getCell(5));

                Nacionalidad n = new Nacionalidad(
                        iso,
                        nombre,
                        descripcion,
                        iso3,
                        codigoNumero,
                        codigoTelefono
                );

                lista.add(n);
            }

            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    // ==============================
    // METODOS AUXILIARES
    // ==============================

    private static String getString(Cell cell) {

        if (cell == null) {
            return null;
        }

        if (cell.getCellType() == CellType.STRING) {
            return cell.getStringCellValue();
        }

        return null;
    }

    private static Integer getInteger(Cell cell) {

        if (cell == null) {
            return null;
        }

        if (cell.getCellType() == CellType.NUMERIC) {
            return (int) cell.getNumericCellValue();
        }

        return null;
    }
}
package Services;

import Modelo.Tipocambio;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TipoCambioService {

    public static Tipocambio obtenerTipoCambio() {

        try {

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.hacienda.go.cr/indicadores/tc/dolar"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            String body = response.body();

            // buscar valor de venta
            int ventaIndex = body.indexOf("\"valor\":", body.indexOf("\"venta\""));
            int ventaInicio = ventaIndex + 8;
            int ventaFin = body.indexOf("}", ventaInicio);

            String ventaStr = body.substring(ventaInicio, ventaFin).replaceAll("[^0-9.]", "");
            double venta = Double.parseDouble(ventaStr);

            // buscar valor de compra
            int compraIndex = body.indexOf("\"valor\":", body.indexOf("\"compra\""));
            int compraInicio = compraIndex + 8;
            int compraFin = body.indexOf("}", compraInicio);

            String compraStr = body.substring(compraInicio, compraFin).replaceAll("[^0-9.]", "");
            double compra = Double.parseDouble(compraStr);

            return new Tipocambio(venta, compra, "CRC");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

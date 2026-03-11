package una.bolsadeempleoproyecto;


import Modelo.Tipocambio;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {
    //Servlet camuflado
    @GetMapping("escribir")
    @ResponseBody
    public String escribirNombre(HttpServletRequest req) {
        var nombre = req.getParameter("nombre");
        var apellido = req.getParameter("apellido");
        return "Su nombre es " + nombre + " y apellido es " + apellido;
    }

    @GetMapping("sumar")
    @ResponseBody
    public double sumar(double a, double b) {
        return a+b;
    }

    @GetMapping("tipocambio")
    @ResponseBody
    public Tipocambio tipocambio() {
        return new Tipocambio(500,475,"USO");
    }

    //Devuelve html y siempre poner String
    @GetMapping("index")
    public String index(Model modelo) {
        modelo.addAttribute("valor1");
        return "index";
    }
}

package parcial3.aa;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import parcial3.aa.Models.Articulos;
import parcial3.aa.Services.ArticulosDB;

@RestController
public class ArticulosControllers {
    
    @GetMapping("/articulos/all")
    public List<Articulos> ObtenerArticulos(){
        return new ArticulosDB().obtenerArticulos();
    }
}

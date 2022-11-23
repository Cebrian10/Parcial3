package parcial3.aa.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import parcial3.aa.Models.Articulos;
import parcial3.aa.Services.ArticulosDB;

@RestController
public class ArticulosControllers {
    
    @GetMapping("/articulos/all")
    public List<Articulos> ObtenerArticulos(){
        return new ArticulosDB().obtenerArticulos();
    }

    @PostMapping("/articulo")
    public int InsertarArticulo(@RequestBody Articulos articulos){
        return new ArticulosDB().GuardarArticulos(articulos);
    }

    @PutMapping("/articulo")
    public int ActualizarArticulo(@RequestBody Articulos articulos){
        return new ArticulosDB().ActualizarArticulos(articulos);
    }

    @DeleteMapping("/articulo/{BailesT}")
    public int Delete(@PathVariable("BailesT") String bailT){
        return new ArticulosDB().EliminarProducto(bailT);
    }
}

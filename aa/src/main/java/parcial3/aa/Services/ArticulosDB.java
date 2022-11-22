package parcial3.aa.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import parcial3.aa.Models.Articulos;

public class ArticulosDB {
    Connection cn;

    public ArticulosDB(){
        cn = new Conexion().openDB();
    }

    public List<Articulos> obtenerArticulos(){
        try{
            Statement stnt = cn.createStatement();
            String query = "select * from articulos";

            List<Articulos> artic = new ArrayList<>();

            ResultSet resul = stnt.executeQuery(query);

            while(resul.next()){
                Articulos articulos = new Articulos(
                    resul.getString("Foto"),
                    resul.getString("BailesT"),
                    resul.getString("Descripcion")
                );
                artic.add(articulos);
            }
            resul.close();
            stnt.close();
            return artic;
        }catch (Exception e) {
            System.out.println("ocurrio una excepcion en mascotasDB");
            int x = 1;
        }
        return null;
    }
}

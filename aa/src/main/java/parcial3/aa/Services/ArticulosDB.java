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

    public int GuardarArticulos(Articulos articulo){
        int resultado = 0;
        try {
            Statement stm = cn.createStatement();
            String query = "insert into articulos values('"
            +articulo.getFoto()+"','"
            +articulo.getBailesT()+"','"
            +articulo.getDescripcion()+"')";

            resultado = stm.executeUpdate(query);

            return resultado;
        } catch (Exception e) {
            int x = 1;
        }
        return resultado;
    }

    public int ActualizarArticulos(Articulos articulo){
        int resultado = 0;
     /*    try {
            Statement stm = cn.createStatement();
            String query = "update articulos set BailesT = 'Conguito' Where BailesT = 'Congo'";
            String query = "insert into articulos values('"
            +articulo.getFoto()+"','"
            +articulo.getBailesT()+"','"
            +articulo.getDescripcion()+"')";

            resultado = stm.executeUpdate(query);

            return resultado;
        } catch (Exception e) {
            int x = 1;
        }*/
        return resultado;
    }

    public int EliminarProducto(String bailT){
        int resultado = 0;
        try {
            Statement stm = cn.createStatement();
            String query = "Delete from articulos where BailesT = '"+bailT+"'";
        } catch (Exception e) {
            int x = 1;
        }
        return resultado;
    }

}
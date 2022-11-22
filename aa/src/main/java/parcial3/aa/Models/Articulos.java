package parcial3.aa.Models;

public class Articulos {
    private  String Foto, BailesT, Descripcion;

    public Articulos() {
    }

    public Articulos(String foto, String bailesT, String descripcion) {
        Foto = foto;
        BailesT = bailesT;
        Descripcion = descripcion;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    public String getBailesT() {
        return BailesT;
    }

    public void setBailesT(String bailesT) {
        BailesT = bailesT;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}

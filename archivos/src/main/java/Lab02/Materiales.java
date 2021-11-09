package Lab02;

import Access.Usuario;

public class Materiales implements Comparable<Materiales>{
    private String Nombre;
    private String tipo;
    private String pathImagen;
    private int TDegradacion; 
    static String usuario_transaccion;
    private String fecha_transaccion;
    private int estatus;


    public Materiales(String nombre, String tipo, String Path, int degradacion, String fecha_transaccion, String usuario_transaccion, int estatus) {
        this.Nombre = nombre;
        this.tipo = tipo;
        this.pathImagen = Path;
        this.TDegradacion = degradacion;
        this.usuario_transaccion = usuario_transaccion;
        this.fecha_transaccion = fecha_transaccion;
        this.estatus = estatus;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

     public String path() {
        return pathImagen;
    }

    public void setpath(String path) {
        this.pathImagen = path;
    }
    
     public int getDegradarse() {
        return TDegradacion;
    }

    public void setDegradarse(int degradarse) {
        this.TDegradacion = degradarse;
    }
    public String getFecha_transaccion() {
        return fecha_transaccion;
    }

    public void setFecha_transaccion(String fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    static String getUsuario_transaccion() {
        return usuario_transaccion;
    }

    public void setUsuario_transaccion(String usuario_transaccion) {
        this.usuario_transaccion = usuario_transaccion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public String toString(){
        return this.getNombre() + "|" + this.getTipo() + "|"+this.path()+"|"+this.getDegradarse()+"|" + this.getUsuario_transaccion() + "|" + this.getFecha_transaccion() + "|" + this.getEstatus();
    }
    

    /**
     * Override para comparar por medio de la llave compuesta {usuario, contacto}
     * @param o
     * @return
     */
    @Override
    public int compareTo(Materiales o) {
        int material = this.getNombre().compareToIgnoreCase(o.getNombre());        

        if (material == 0) {
            return 0;
        } else {
            return material;
        }
    }
}

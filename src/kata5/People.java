package kata5;

class People {
    private final String nombre;
    private final String apellidos;
    private final String dep;

    public People(String nombre,String apellidos,String dep) {
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dep = dep;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDep() {
        return dep;
    }
    
    
    
    
}

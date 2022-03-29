public class Persona {
    private String Nombre;
    private String Telefono;
    private String Correo;
    private String Cumple;
    
    public Persona(){
    
    }
    
    public Persona(String nom, String tel, String corr, String cump){
    Nombre=nom;
    Telefono=tel;
    Correo=corr;
    Cumple=cump;
    }
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
    
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    
    public String getCorreo(){
     return Correo ;
    }
    
    public String getCumple(){
     return Cumple;
    }
    
    public void setCumple(String Cumple){
        this.Cumple = Cumple;
    }
    
    

   
}
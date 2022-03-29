import java.util.*;

public class MPersona
{
  static int ind = 0  ;
  static ArrayList<Persona> Arrpersona = new ArrayList<Persona>();
  private Persona objPersona;
  
  public MPersona()
  {}

  
  
  public void agregar(String nom, String tel, String corr, String cump)
  {
    objPersona = new Persona();
    objPersona.setNombre(nom);
    objPersona.setTelefono(tel);
    objPersona.setCorreo(corr);
    objPersona.setCumple(cump);
   
    Arrpersona.add(objPersona);//Agrega el objeto al arrayList
    ind++;
  }
  public void desplegar()
  {
     System.out.println("...PERSONAS EN LA AGENDA...");
     
     Iterator<Persona> itrPersona = Arrpersona.iterator();
     while(itrPersona.hasNext()){
     Persona persona = itrPersona.next();
     System.out.println("Nombre: " + persona.getNombre());
     System.out.println("Telefono: " + persona.getTelefono());
     System.out.println("Correo: " + persona.getCorreo());
     System.out.println("Cumpleaños " + persona.getCumple());
     }
   }
   
   public int getCasilla(String nombre) {
   if (ind == 0) {
    return -1;
    } else { 
      for (int x=0; x< ind; x++) {
        if (Arrpersona.get(x).getNombre().equals(nombre)) {
           return x;
         }
       }
     }
    return -1;
    }
    
    public Persona consultar (int ind) {
      return Arrpersona.get(ind);
    }
    
    public void modificar(int ind, Persona p) {
     Arrpersona.set(ind,p);
    }
    
    public void eliminar(int ind){
      Arrpersona.remove(ind);
      this.ind--;
    } 
   
  public ArrayList Datos()
  {
     return Arrpersona;
  }
  
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamantenedorhospital;

/**
 *
 * @author Usuario
 */
public class Paciente {

    static void buscar(String buscar) {
      
            
        
    }
    String nombre;
    String edad;
    String rut;
    int telefono;
    String sexo;
    
public Paciente(String nombre,String edad,String rut,int telefono,String sexo){
     this.nombre = nombre;
     this.edad = edad;
     this.rut = rut;
     this.telefono = telefono;
     this.sexo = sexo;
}
    public void mostrarInformacion(){
        System.out.println("nombre: " + this.nombre);
        System.out.println("edad: " + this.edad);
        System.out.println("rut: " + this.rut);
        System.out.println("telefono: " + this.telefono);
        System.out.println("sexo: " + this.sexo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
  
        
    
    
}

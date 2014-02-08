/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@DiscriminatorValue("Correspondencia")
public class Correspondencia extends Documento implements Serializable{

    
    private Propietario propietario;
    @Enumerated(EnumType.STRING)
    private Prefijo prefijo;
    private String consecutivo;
    private String memorandu;

    public Correspondencia() {

    }

    public Prefijo getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(Prefijo prefijo) {
        this.prefijo = prefijo;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

  
    public Propietario getPropietario() {
        return propietario;
    }

    
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

   
    public String getMemorandu() {
        return memorandu;
    }

    
    public void setMemorandu(String memorandu) {
        this.memorandu = memorandu;
    }

    
}

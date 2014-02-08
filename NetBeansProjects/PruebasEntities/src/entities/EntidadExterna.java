/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidades_externas")
public class EntidadExterna implements Serializable {

    @Id
    private Long idEntidadExterna;
    private String nombre;

    public Long getIdEntidadExterna() {
        return idEntidadExterna;
    }

    public void setIdEntidadExterna(Long idEntidadExterna) {
        this.idEntidadExterna = idEntidadExterna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebasentities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DESPACHOS
 */
@Entity
@Table(name = "documentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d"),
    @NamedQuery(name = "Documentos.findByIdDocumento", query = "SELECT d FROM Documentos d WHERE d.idDocumento = :idDocumento"),
    @NamedQuery(name = "Documentos.findByDescripcion", query = "SELECT d FROM Documentos d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Documentos.findByAsunto", query = "SELECT d FROM Documentos d WHERE d.asunto = :asunto"),
    @NamedQuery(name = "Documentos.findByEstado", query = "SELECT d FROM Documentos d WHERE d.estado = :estado"),
    @NamedQuery(name = "Documentos.findByTipoDocumento", query = "SELECT d FROM Documentos d WHERE d.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Documentos.findByPrefijo", query = "SELECT d FROM Documentos d WHERE d.prefijo = :prefijo"),
    @NamedQuery(name = "Documentos.findByConsecutivo", query = "SELECT d FROM Documentos d WHERE d.consecutivo = :consecutivo"),
    @NamedQuery(name = "Documentos.findByPropietario", query = "SELECT d FROM Documentos d WHERE d.propietario = :propietario"),
    @NamedQuery(name = "Documentos.findByMemorandu", query = "SELECT d FROM Documentos d WHERE d.memorandu = :memorandu")})
public class Documentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDocumento")
    private Integer idDocumento;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "asunto")
    private String asunto;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "tipoDocumento")
    private String tipoDocumento;
    @Column(name = "prefijo")
    private String prefijo;
    @Column(name = "consecutivo")
    private String consecutivo;
    @Column(name = "propietario")
    private String propietario;
    @Column(name = "memorandu")
    private String memorandu;

    public Documentos() {
    }

    public Documentos(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Documentos(Integer idDocumento, String descripcion, String asunto, String estado, String tipoDocumento) {
        this.idDocumento = idDocumento;
        this.descripcion = descripcion;
        this.asunto = asunto;
        this.estado = estado;
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(String consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getMemorandu() {
        return memorandu;
    }

    public void setMemorandu(String memorandu) {
        this.memorandu = memorandu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumento != null ? idDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebasentities.Documentos[ idDocumento=" + idDocumento + " ]";
    }
    
}

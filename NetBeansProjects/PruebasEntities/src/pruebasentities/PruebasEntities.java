/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasentities;

import entities.Correspondencia;
import entities.Documento;
import entities.Empleado;
import entities.EntidadExterna;
import entities.EstadoDocumento;
import entities.Prefijo;
import entities.Propietario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PruebasEntities {

    public static void main(String[] args) {

        PruebasEntities nuevaPrueba = new PruebasEntities();
        nuevaPrueba.agregarDocumento();

    }

    public void agregarEmpleado() {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("PruebasEntitiesPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Empleado empleado = new Empleado();
        empleado.setHola("YESSSS");
        tx.begin();
        em.persist(empleado);
        tx.commit();
    }

    public void agregarEntidadExterna() {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("PruebasEntitiesPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        EntidadExterna empleado = new EntidadExterna();
        empleado.setNombre("LINA");
        tx.begin();
        em.persist(empleado);
        tx.commit();
    }

    public void agregarDocumento() {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("PruebasEntitiesPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        Documento nuevaCorrespondencia = new Correspondencia();
        Correspondencia nuevaCorrespondenciForzada = (Correspondencia) nuevaCorrespondencia;
        nuevaCorrespondenciForzada.setAsunto("HOLAAA");
        nuevaCorrespondenciForzada.setDescripcion("HOLAAAAAAAAAA");
        nuevaCorrespondenciForzada.setEstado(EstadoDocumento.ENVIADO);
        nuevaCorrespondenciForzada.setPrefijo(Prefijo.FI);
        nuevaCorrespondenciForzada.setPropietario(Propietario.IVAN_ALTAMAR);
        nuevaCorrespondenciForzada.setMemorandu("AJAAAAA");
        
        tx.begin();
        em.persist(nuevaCorrespondenciForzada);
        tx.commit();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Itzel Rios
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Integer>{

    @Override
    public Empleado create(Empleado p) {
        Session session=HibernateUtil.getSession();
        Transaction t=session .beginTransaction();
        
        session.save(p);
        
        t.commit();
        session.close();
        return p;
    }

    @Override
    public boolean delete(Integer id) {
        Session session=HibernateUtil.getSession();
        Transaction t=session .beginTransaction();
        
        Empleado empleado = new Empleado();
        empleado.setId(id);
        session.delete(empleado);
        
        t.commit();
        session.close();
        return true;
    }

    @Override
    public Empleado update(Integer id, Empleado p) {
        Session session=HibernateUtil.getSession();
        Transaction t=session.beginTransaction();
        Empleado empleado=findById(id);
        if(empleado!=null && p.getId()==id) {
            session.update(p);
        }
        t.commit();
        session.close();
        return empleado;
    }
    /*public Empleado update(Integer id, Empleado p) {
        Session session=HibernateUtil.getSession();
        Transaction t=session .beginTransaction();
        
        
        session.save(p);
        t.commit();
        session.close();
        return p;*/
    

    @Override
    public List<Empleado> findAll() {
        Session session = HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        List <Empleado>lstEmpleado;
        lstEmpleado= session.createCriteria(Empleado.class).list();

        transaction.commit();
        session.close();
        return lstEmpleado;
        
        /*
        public List<Empleado> finAll(){
            Session session=Hibernate 
        
        
        
        
        */
    }

    @Override
    public Empleado findById(Integer id) {
        Session session = HibernateUtil.getSession();
        Transaction transaction=session.beginTransaction();
        Empleado empleado = (Empleado)session.get(Empleado.class, id);
        transaction.commit();
        session.close();
        return empleado;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.test;

import java.util.List;

/**
 *
 * @author Itzel Rios
 */
public class main {

    public static void main(String[] args) {
         /*Session  session=   HibernateUtil.getSession();*/
        /*Empleado empleado= new Empleado();
        empleado.setNombre(nombre);
        empleado.setDireccion(direccion);
        empleado.setTelefono(telefono);
        
        System.out.println("Hello World!");*/
        DAOEmpleado dao = new DAOEmpleado();
//        System.out.println("Se inicia sesion");
//        //Session session = HibernateUtil.getSessionFactory().openSession();
        Empleado empleado = new Empleado();
//
//        empleado.setId(1);
//        empleado.setNombre("Sandra");
//        empleado.setDireccion("Av zapata");
//        empleado.setTelefono("271145781");
//
//        dao.create(empleado);
//
//        dao.delete(1);
//        
//        empleado.setId(2);
//        empleado.setNombre("Sandra");
//        empleado.setDireccion("Av zapata");
//        empleado.setTelefono("271145781");
//        
//        dao.update(2,empleado);

        
//       Empleado empleados = (Empleado) dao.findById(9);
//       System.out.println(empleados.getId() +  " " + empleados.getNombre() + " "+ empleados.getDireccion()
//     + " " + empleados.getTelefono());

        
        List<Empleado> lista = dao.findAll();
        for(Empleado emp : lista){
        System.out.println(emp.getId() + " " + emp.getNombre()+ " "+ emp.getDireccion()
        + " "+ emp.getTelefono());
}
    }
}

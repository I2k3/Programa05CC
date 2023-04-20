/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.test;

import java.util.List;

/**
 *
 * @author Itzel Rios
 */
public interface IDAOGeneral<T, ID>{
    public T create(T p);
    public boolean delete(ID id);
    public T update(ID id, T p);
    
    public List<T> findAll();
    public T findById(ID id);
}

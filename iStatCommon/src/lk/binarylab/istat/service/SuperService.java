/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.service;

import java.rmi.Remote;
import lk.binarylab.istat.observers.Subject;

/**
 *
 * @author Dilshan
 */

public interface SuperService<T> extends Remote,Subject{

    public boolean save(T t) throws Exception;

    public boolean update(T t) throws Exception;

    public boolean delete(String id) throws Exception;

    public T getbyId(String id) throws Exception;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.controller;

import java.rmi.Remote;
import java.util.ArrayList;

import lk.binarylab.istat.dto.SuperDTO;
import lk.binarylab.istat.observers.Subject;


/**
 *
 * @author student
 */
public interface SuperController<T extends SuperDTO> extends Remote,Subject{

    public boolean save(T t) throws Exception;

    public boolean update(T t) throws Exception;

    public boolean delete(String id) throws Exception;

    public T getbyId(String id) throws Exception;

    
    
}

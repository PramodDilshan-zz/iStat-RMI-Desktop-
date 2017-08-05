/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.service;

import java.rmi.Remote;

/**
 *
 * @author Dilshan
 */

public interface ServiceFactory extends Remote{
    
    public enum ServiceTypes{
        STUDENT;
    }
    
    public SuperService getService(ServiceTypes serviceType) throws Exception;
    
}

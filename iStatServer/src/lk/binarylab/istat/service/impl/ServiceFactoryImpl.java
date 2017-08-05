/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.service.impl;

import java.rmi.server.UnicastRemoteObject;
import lk.binarylab.istat.service.ServiceFactory;
import lk.binarylab.istat.service.SuperService;
import lk.binarylab.istat.service.custom.impl.StudentServiceImpl;

/**
 *
 * @author Dilshan
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl() throws Exception {
    }

    public static ServiceFactory getInstance() throws Exception {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactoryImpl();
        }
        return serviceFactory;
    }

    @Override
    public SuperService getService(ServiceTypes serviceType) throws Exception {
        switch (serviceType) {

            case STUDENT:
                return new StudentServiceImpl();
            
            
            default:
                return null;
        }

    }
    
}

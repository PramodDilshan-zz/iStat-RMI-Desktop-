/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.controller;

import java.rmi.Naming;
import lk.binarylab.istat.service.ServiceFactory;
import lk.binarylab.istat.service.SuperService;
import lk.binarylab.istat.service.custom.StudentService;


/**
 *
 * @author Pramod Dilshan
 */
public class ServerConnectorFactory {
    
    private static ServerConnectorFactory serverConnector;
    private static ServiceFactory serviceFactory;
    private static StudentService studentService;


    private  ServerConnectorFactory() throws Exception {
        serviceFactory = (ServiceFactory) Naming.lookup("rmi://localhost:5050/ThogakadeServer");
        studentService = (StudentService) serviceFactory.getService(ServiceFactory.ServiceTypes.STUDENT);
        
    }
    
    public static ServerConnectorFactory getInstance() throws Exception{
        if (serverConnector==null) {
            serverConnector = new ServerConnectorFactory();
        }
        return serverConnector;
    
    }
    
    public SuperService getService(ServiceFactory.ServiceTypes serviceType){
        switch(serviceType){
            case STUDENT:
                return studentService;
            
            default:
                return null;
        }
    }
    
   
}

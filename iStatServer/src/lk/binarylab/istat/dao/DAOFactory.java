/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.dao;

import lk.binarylab.istat.dao.custom.impl.StudentDAOImpl;

/**
 *
 * @author Pramod Dilshan
 */
public class DAOFactory {
    private static DAOFactory daoFactory;
    
    public enum DAOTypes{
        STUDENT;
    }
    
    private DAOFactory(){
        
    }
    
    public static DAOFactory getInstance(){
        if (daoFactory == null){
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    
    public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case STUDENT:
                return new StudentDAOImpl();
            
            default:
                return null;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.business;

import lk.binarylab.istat.business.custom.impl.StudentBOImpl;



/**
 *
 * @author Dilshan
 */
public class BOFactory {

    public enum BOType {
        STUDENT;
    }
    private static BOFactory bOFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (bOFactory == null) {
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }

    public static SuperBO getBOTypes(BOType doType) throws Exception {
        switch (doType) {
            case STUDENT:
                return new StudentBOImpl();
            
            default:
                return null;
        }

    }

}

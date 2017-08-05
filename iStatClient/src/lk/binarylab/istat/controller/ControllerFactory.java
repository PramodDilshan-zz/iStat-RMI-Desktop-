/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.controller;

import lk.binarylab.istat.controller.custom.impl.StudentControllerImpl;




/**
 *
 * @author student
 */
public class ControllerFactory {

    public enum ControllerTypes {
        STUDENT; 
    }

    private static ControllerFactory controllerFactory;

    private ControllerFactory() {

    }

    public static ControllerFactory getInstance() {
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }

    public SuperController getController(ControllerTypes controllerType) throws  Exception {
        switch (controllerType) {
            case STUDENT:
                return new StudentControllerImpl();
            
            default:
                return null; 
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.controller.custom.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import lk.binarylab.istat.controller.ServerConnectorFactory;
import lk.binarylab.istat.controller.custom.StudentController;
import lk.binarylab.istat.dto.StudentDTO;
import lk.binarylab.istat.observers.Observer;
import lk.binarylab.istat.service.ServiceFactory;
import lk.binarylab.istat.service.custom.StudentService;

/**
 *
 * @author student
 */
public class StudentControllerImpl implements StudentController {

    private StudentService studentService;
    
    public StudentControllerImpl() throws Exception {
        studentService = (StudentService) ServerConnectorFactory.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);
    }

    @Override
    public boolean save(StudentDTO t) throws Exception {
//        System.out.println("con");
        boolean result = studentService.save(t);
        return result;
    }

    @Override
    public boolean update(StudentDTO t) throws Exception {
        boolean result = studentService.update(t);
        return result;
    }

    @Override
    public boolean delete(String id) throws Exception {
        boolean result = studentService.delete(id);
        return result;
    }

    @Override
    public StudentDTO getbyId(String id) throws Exception {
        StudentDTO student = studentService.getbyId(id);
        return  student;
    }


    @Override
    public void registerObserver(Observer observer) throws RemoteException {
        studentService.registerObserver(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws RemoteException {
        studentService.unregisterObserver(observer);
    }

    @Override
    public void notifyAllObservers() throws RemoteException {
        studentService.notifyAllObservers();
    }
}

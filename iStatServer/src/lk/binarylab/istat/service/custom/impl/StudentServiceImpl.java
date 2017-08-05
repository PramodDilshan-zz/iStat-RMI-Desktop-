/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import lk.binarylab.istat.business.BOFactory;
import lk.binarylab.istat.business.custom.StudentBO;
import lk.binarylab.istat.dto.StudentDTO;
import lk.binarylab.istat.observers.Observer;
import lk.binarylab.istat.service.custom.StudentService;

/**
 *
 * @author Pramod Dilshan
 */
public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {

    private StudentBO studentBO;
    private static ArrayList<Observer> alObservers = new ArrayList<>();

    public StudentServiceImpl() throws Exception {
        System.out.println("BO - Constrtor");
        try {
            studentBO = (StudentBO) BOFactory.getInstance().getBOTypes(BOFactory.BOType.STUDENT);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean save(StudentDTO t) throws Exception {
        System.out.println("BO");
        boolean result = studentBO.save(t);
        System.out.println("BO-Out");
//            notifyAllObservers();
        return result;
    }

    @Override
    public boolean update(StudentDTO t) throws Exception {
        boolean result = studentBO.update(t);
//        notifyAllObservers();
        return result;
    }

    @Override
    public boolean delete(String id) throws Exception {
        boolean result = studentBO.delete(id);
//        notifyAllObservers();
        return result;
    }

    @Override
    public StudentDTO getbyId(String id) throws Exception {
        return studentBO.getbyId(id);
    }

    @Override
    public void registerObserver(Observer observer) throws RemoteException {
        alObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) throws RemoteException {
        alObservers.remove(observer);
    }

    @Override
    public void notifyAllObservers() throws RemoteException {
        for (Observer alObserver : alObservers) {
            alObserver.update();
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.business.custom.impl;

import java.sql.Connection;
import lk.binarylab.istat.business.custom.StudentBO;
import lk.binarylab.istat.dao.ConnectionFactory;
import lk.binarylab.istat.dao.DAOFactory;
import lk.binarylab.istat.dao.custom.StudentDAO;
import lk.binarylab.istat.dto.StudentDTO;



/**
 *
 * @author Pramod Dilshan
 */
public class StudentBOImpl implements StudentBO{
    StudentDAO studentDAO;
    Connection connection;

    public StudentBOImpl() throws Exception {
        System.out.println("BO awa Con");
        studentDAO = (StudentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.STUDENT);
        connection = ConnectionFactory.getInstance().getConnection();
        
    }

    @Override
    public boolean save(StudentDTO t) throws Exception {
        studentDAO.setConnection(connection);
        boolean result = studentDAO.save(t);
        System.out.println("BO");
//        connection.close();
        return result;
    }

    @Override
    public boolean update(StudentDTO t) throws Exception {
        studentDAO.setConnection(connection);
        boolean result = studentDAO.update(t);
//        connection.close();
        return result;

    }

    @Override
    public boolean delete(String id) throws Exception {
        studentDAO.setConnection(connection);
        boolean result = studentDAO.delete(id);
//        connection.close();
        return result;
    }

    @Override
    public StudentDTO getbyId(String id) throws Exception {
        studentDAO.setConnection(connection);
        StudentDTO studentDTO = studentDAO.getById(id);
//        connection.close();
        return studentDTO;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.dao.custom;

import java.sql.Connection;
import lk.binarylab.istat.dao.SuperDAO;
import lk.binarylab.istat.dto.StudentDTO;

/**
 *
 * @author Pramod Dilshan
 */
public interface StudentDAO extends SuperDAO{
 
    public void setConnection(Connection connection) throws Exception;

    public Connection getConnection() throws Exception;
    
    public boolean save(StudentDTO student) throws Exception;

    public boolean update(StudentDTO student) throws Exception;

    public boolean delete(String id) throws Exception;

    public StudentDTO getById(String id) throws Exception;

    

    
}

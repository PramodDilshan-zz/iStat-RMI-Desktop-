/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import lk.binarylab.istat.dao.custom.StudentDAO;
import lk.binarylab.istat.dto.StudentDTO;

/**
 *
 * @author Pramod Dilshan
 */
public class StudentDAOImpl implements StudentDAO{
    
    private Connection connection;

     public boolean save(StudentDTO student) throws Exception {
         System.out.println("dao");
        PreparedStatement pst = connection.prepareStatement("INSERT INTO Student VALUES(?,?,?,?)");
        pst.setObject(1, student.getRegNo());
        pst.setObject(2, student.getName());
        pst.setObject(3, student.geteMail());
        pst.setObject(4, student.getStudentPhoto());
        int result = pst.executeUpdate();
         System.out.println("dao");
        return (result > 0);
    }
    
    public boolean update(StudentDTO student) throws Exception {
        PreparedStatement pst = connection.prepareStatement("Update Student set name=?, address=?, salary=? where id=?");
        pst.setObject(4, student.getRegNo());
        pst.setObject(1, student.getName());
        pst.setObject(2, student.geteMail());
        pst.setObject(3, student.getStudentPhoto());
        int result = pst.executeUpdate();
        return (result > 0);

    }

    
    public boolean delete(String id) throws Exception {
        PreparedStatement pst = connection.prepareStatement("Delete From Student where id='" + id + "'");
        int result = pst.executeUpdate();
        return (result > 0);
    }
    
    @Override
    public StudentDTO getById(String id) throws Exception {
        StudentDTO student = null;
        String sql = "SELECT * FROM Customer WHERE id = '" + id + "' ";
        Statement stm = connection.createStatement();
        ResultSet rset = stm.executeQuery(sql);
        if (rset.next()) {
            student = new StudentDTO(
                    rset.getString(1),
                    rset.getString(2),
                    rset.getString(3),
                    rset.getString(4));
        }
        return student;
    }
    
    

    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection = connection;
    }

    @Override
    public Connection getConnection() throws Exception {
        return this.connection;
    }

   

   
        

    
    

    
    
}

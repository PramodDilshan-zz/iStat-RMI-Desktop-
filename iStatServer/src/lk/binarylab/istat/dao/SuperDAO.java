/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.dao;

import java.sql.Connection;

/**
 *
 * @author Pramod Dilshan
 */
public interface SuperDAO {
    
    public void setConnection(Connection connection) throws Exception;

    public Connection getConnection() throws Exception;
}

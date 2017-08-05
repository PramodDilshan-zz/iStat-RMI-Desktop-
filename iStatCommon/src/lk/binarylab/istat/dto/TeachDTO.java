/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.binarylab.istat.dto;

/**
 *
 * @author Pramod Dilshan
 */
public class TeachDTO extends SuperDTO{
    
    private String lecID;
    private String modID;
    private boolean isModuleCoordinate;

    public TeachDTO() {
    }

    public TeachDTO(String lecID, String modID, boolean isModuleCoordinate) {
        this.lecID = lecID;
        this.modID = modID;
        this.isModuleCoordinate = isModuleCoordinate;
    }

    public String getLecID() {
        return lecID;
    }

    public void setLecID(String lecID) {
        this.lecID = lecID;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public boolean isIsModuleCoordinate() {
        return isModuleCoordinate;
    }

    public void setIsModuleCoordinate(boolean isModuleCoordinate) {
        this.isModuleCoordinate = isModuleCoordinate;
    }
    
    
    
}

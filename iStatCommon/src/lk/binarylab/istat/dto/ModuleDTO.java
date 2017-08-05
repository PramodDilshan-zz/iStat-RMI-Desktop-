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
public class ModuleDTO extends SuperDTO{
    
    private String modID;
    private String name;

    public ModuleDTO() {
    }

    public ModuleDTO(String modID, String name) {
        this.modID = modID;
        this.name = name;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

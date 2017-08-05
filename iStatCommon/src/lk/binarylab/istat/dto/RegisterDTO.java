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
public class RegisterDTO extends SuperDTO{
    
    private String regNo;
    private String modID;
    private String result;
    private boolean gpaNonGpa;

    public RegisterDTO() {
    }

    public RegisterDTO(String regNo, String modID, String result, boolean gpaNonGpa) {
        this.regNo = regNo;
        this.modID = modID;
        this.result = result;
        this.gpaNonGpa = gpaNonGpa;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isGpaNonGpa() {
        return gpaNonGpa;
    }

    public void setGpaNonGpa(boolean gpaNonGpa) {
        this.gpaNonGpa = gpaNonGpa;
    }
    
    
    
}

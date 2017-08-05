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
public class StudentDTO extends SuperDTO{

    private String regNo;
    private String name;
    private String eMail;
    private String studentPhoto;

    public StudentDTO() {
    }

    public StudentDTO(String regNo, String name, String eMail, String studentPhoto) {
        this.regNo = regNo;
        this.name = name;
        this.eMail = eMail;
        this.studentPhoto = studentPhoto;
    }
    
    

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(String address) {
        this.studentPhoto = address;
    }
    
   
    
}

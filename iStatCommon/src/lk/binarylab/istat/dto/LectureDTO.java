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
public class LectureDTO extends SuperDTO{
    private String lecID;
    private String name;
    private String eMail;
    private String mobileNo;
    private String lecPhoto;

    public LectureDTO() {
    }

    public LectureDTO(String lecID, String name, String eMail, String mobileNo, String lecPhoto) {
        this.lecID = lecID;
        this.name = name;
        this.eMail = eMail;
        this.mobileNo = mobileNo;
        this.lecPhoto = lecPhoto;
    }

    public String getLecID() {
        return lecID;
    }

    public void setLecID(String lecID) {
        this.lecID = lecID;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getLecPhoto() {
        return lecPhoto;
    }

    public void setLecPhoto(String lecPhoto) {
        this.lecPhoto = lecPhoto;
    }
    
    
    
    
}

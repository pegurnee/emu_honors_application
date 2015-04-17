package edu.emich.honors.emuhonorscollege.datatypes;

import java.util.ArrayList;

import edu.emich.honors.emuhonorscollege.datatypes.enums.HonorsType;

public class User {

    private String email;
    private char[] password;
    private String firstName;
    private String lastName;
    private ArrayList<HonorsType> honorsTypes;
    private String eID;
    private FieldOfStudy fieldOfStudy;
    private GraduationDate graduationDate;


    public User(String email, char[] password, String firstName, String lastName, ArrayList<HonorsType> honorsTypes, String eID, FieldOfStudy fieldOfStudy, GraduationDate graduationDate) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.honorsTypes = honorsTypes;
        this.eID = eID;
        this.fieldOfStudy = fieldOfStudy;
        this.graduationDate = graduationDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEID() {
        return eID;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public char[] getPassword() {return password;}

    public ArrayList<HonorsType> getHonorsTypes() {
        return honorsTypes;
    }

    public void setHonorsTypes(ArrayList<HonorsType> honorsTypes) {
        this.honorsTypes = honorsTypes;
    }

    public FieldOfStudy getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(FieldOfStudy fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GraduationDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(GraduationDate graduationDate) {
        this.graduationDate = graduationDate;
    }
}
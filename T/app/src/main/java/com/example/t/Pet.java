package com.example.t;

import java.io.Serializable;

public class Pet implements Serializable {
    private String announcerName;
    private String announcerPhone;
    private String announcerEmail;
    private String animalType;
    private String description;
    private String location;
    private boolean waiting;
    private int logo;

    public Pet(String announcerName, String announcerPhone, String announcerEmail, String animalType, String location,
               boolean waiting) {
        this.announcerName = announcerName;
        this.announcerPhone = announcerPhone;
        this.announcerEmail = announcerEmail;
        this.animalType = animalType;
        this.location = location;
        this.waiting = waiting;
        if (this.animalType.equals("bird"))logo = R.drawable.black_bird_profile;
        else if (this.animalType.equals("cat"))logo = R.drawable.cat_icon;
        else logo = R.drawable.dog_icon;
        this.description = "لا يوجد";
    }

    public Pet(String announcerName, String announcerPhone, String announcerEmail, String animalType, String location,
               boolean waiting, String description){
        this(announcerName,announcerPhone,announcerEmail,animalType,location,waiting);
        this.setDescription(description);
    }

    public String getAnnouncerName() {
        return announcerName;
    }

    public void setAnnouncerName(String announcerName) {
        this.announcerName = announcerName;
    }

    public String getAnnouncerPhone() {
        return announcerPhone;
    }

    public void setAnnouncerPhone(String announcerPhone) {
        this.announcerPhone = announcerPhone;
    }

    public String getAnnouncerEmail() {
        return announcerEmail;
    }

    public void setAnnouncerEmail(String announcerEmail) {
        this.announcerEmail = announcerEmail;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    public boolean isWaiting() {
        return waiting;
    }

    public void setWaiting(boolean waiting) {
        this.waiting = waiting;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}

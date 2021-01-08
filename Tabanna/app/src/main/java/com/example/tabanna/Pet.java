package com.example.tabanna;

import java.io.Serializable;

public class Pet implements Serializable {
    private String announcerName;
    private String announcerPhone;
    private String announcerEmail;
    private String animalType;
    private String description;
    private boolean waiting;
    private String location;

    public Pet(String announcerName, String announcerPhone, String announcerEmail, String animalType) {
        this.announcerName = announcerName;
        this.announcerPhone = announcerPhone;
        this.announcerEmail = announcerEmail;
        this.animalType = animalType;
        this.waiting = true;
    }

    public String getAnnouncerName() { return announcerName; }

    public void setAnnouncerName(String announcerName) { this.announcerName = announcerName; }

    public String getAnnouncerPhone() { return announcerPhone; }

    public void setAnnouncerPhone(String announcerPhone) { this.announcerPhone = announcerPhone; }

    public String getAnnouncerEmail() { return announcerEmail; }

    public void setAnnouncerEmail(String announcerEmail) { this.announcerEmail = announcerEmail; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public boolean isWaiting() { return waiting; }

    public void setWaiting(boolean waiting) { this.waiting = waiting; }

    public String getAnimalType() { return animalType; }

    public void setAnimalType(String animalType) { this.animalType = animalType; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }
}

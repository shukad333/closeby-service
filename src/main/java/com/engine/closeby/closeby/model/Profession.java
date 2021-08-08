package com.engine.closeby.closeby.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity(name = "profession")
public class Profession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private ProfessionType professionType;
    private boolean isActive;
    private boolean isHourly;
    private float ratePerHour;
    private float ratePerDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="professional_id",nullable = false)
    @JsonBackReference(value = "professional_profession_ref")
    private Professional professional;

    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProfessionType getProfessionType() {
        return professionType;
    }

    public void setProfessionType(ProfessionType professionType) {
        this.professionType = professionType;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isHourly() {
        return isHourly;
    }

    public void setHourly(boolean hourly) {
        isHourly = hourly;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public float getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(float ratePerDay) {
        this.ratePerDay = ratePerDay;
    }
}

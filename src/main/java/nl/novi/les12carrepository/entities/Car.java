package nl.novi.les12carrepository.entities;

import jakarta.persistence.*;

@Entity
@Table(name="cars")
public class CarEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column (name="carBrand")
    private String brand;
    private String model;

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

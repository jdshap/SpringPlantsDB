package io.github.jdshap.plants;

import jakarta.persistence.*;

@Entity
public class Plant{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sku;
    @Column(name="common_name")
    private String commonName;
    private String family;
    private String genus;
    private String species;
    @Column(name="water_interval")
    private short waterInterval;
    private short price;

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getCommonName() {
        return commonName;
    }
    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getGenus() {
        return genus;
    }
    public void setGenus(String genus) {
        this.genus = genus;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public short getWaterInterval() {
        return waterInterval;
    }
    public void setWaterInterval(short waterInterval) {
        this.waterInterval = waterInterval;
    }
    public short getPrice() {
        return price;
    }
    public void setPrice(short price) {
        this.price = price;
    }
}
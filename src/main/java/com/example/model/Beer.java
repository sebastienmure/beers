package com.example.model;

import javax.persistence.*;

/**
 * Created by sebas on 12/02/2017.
 */
@Entity
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private float price;

    @Column(nullable=false)
    private Color color;

    @Column(nullable=false)
    private Strenght strenght;

    @Column(nullable=false)
    private float proof;

    @Column(nullable=false)
    private Country country;

    @Column(nullable = false)
    private String imgUrl;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Strenght getStrenght() {
        return strenght;
    }

    public void setStrenght(Strenght strenght) {
        this.strenght = strenght;
    }

    public float getProof() {
        return proof;
    }

    public void setProof(float proof) {
        this.proof = proof;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color=" + color +
                ", strenght=" + strenght +
                ", proof=" + proof +
                ", country=" + country +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}

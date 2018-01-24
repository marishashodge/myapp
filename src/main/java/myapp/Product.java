package myapp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String productName;

    @Column(length=1000)
    private HashMap<String, String> imageUris;

    @Column(length=500)
    private ArrayList<String> informationDetails;

    private Double pricePerUnit;
    private String brandName;

    private Category productCategory;
    private ArrayList<String> sizes;
    private ArrayList<String> colors;
    private ArrayList<String> flavors;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public HashMap<String, String> getImageUris() {
        return imageUris;
    }

    public void setImageUris(HashMap<String, String> imageUris) {
        this.imageUris = imageUris;
    }

    public ArrayList<String> getInformationDetails() {
        return informationDetails;
    }

    public void setInformationDetails(ArrayList<String> informationDetails) {
        this.informationDetails = informationDetails;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    public ArrayList<String> getSizes() {
        return sizes;
    }

    public void setSizes(ArrayList<String> sizes) {
        this.sizes = sizes;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public ArrayList<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(ArrayList<String> flavors) {
        this.flavors = flavors;
    }

}

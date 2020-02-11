package Bakatkin.Internetshop.persist.model;

import javax.persistence.*;

@Entity
@Table (name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "name")
    private String name;

    @Column (name = "price")
    private Double price;

    @Column (name = "description")
    private String description;

    @Column (name = "units")
    private String units;

    public Product(){

    }

    public Product(String name, Double price, String description, String units){
        this.name = name;
        this.price = price;
        this.description = description;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString(){
        return "Product {" + "id=" + id + ", name=" + name + "price=" + price + " " + units + "}";
    }
}

package springboot.api.tutorial.model;

import java.util.Objects;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener; 

@Entity
@Table(name = "products")
@EntityListeners(AuditingEntityListener.class)
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column(name = "title")
  private String title;
  @Column(name = "description")
  private String description;
  @Column(name = "price")
  private float price;
  private String category;
  public Product() {}
  public Product(Integer id, String title, String description, float price, String category) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.price = price;
    this.category = category;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public float getPrice() {
    return price;
  }
  public void setPrice(float price) {
    this.price = price;
  }
  /*public Date getCreated_at() {
    return created_at;
  }
  public Date getUpdated_at() {
    return updated_at;
  }*/
  @Override
  public boolean equals(Object p) {

    if (this == p)
      return true;
    if (!(p instanceof Product))
      return false;
    Product product = (Product) p;
    return Objects.equals(this.id, product.id) && Objects.equals(this.title, product.title) && Objects.equals(this.description, product.description)
        && Objects.equals(this.price, product.price) && Objects.equals(this.category, product.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.title, this.description, this.price, this.category);
  }

  @Override
  public String toString() {
    return "Product{" + "id=" + this.id + ", title="+ this.title + ", description='" + this.description + '\'' + ", price=" + this.price + ", category=" + this.category+ '}';
  }
}

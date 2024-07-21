package am.itspace.cafemanagementsystem.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY) // don't load all categories when load all products, but load only that categories that products' refer to.
    @JoinColumn(name = "category_fk", nullable = false)
    private Category category;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "status")
    private String status;
}

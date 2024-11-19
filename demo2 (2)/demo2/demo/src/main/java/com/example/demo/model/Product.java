package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 
import jakarta.persistence.Column;
@Entity
@Table(name = "product") // Mapea la tabla 'product'
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment para el ID
    @Column(name = "ID") // Mapea la columna 'ID'
    private Long id;

    @Column(name = "Nonmbre", nullable = false, length = 100) // Mapea 'Nombre'
    private String name;

    @Column(name = "Precio", nullable = false, precision = 10, scale = 2) // Mapea 'Precio'
    private Double price;

    @Column(name = "Existencias") // Mapea 'Existencias'
    private Integer existencias;

    @Column(name = "Descripcion", length = 255) // Mapea 'Descripcion'
    private String descripcion;

    @Column(name = "NombreProv", length = 128) // Mapea 'NombreProv'
    private String nombreProv;

    // Constructores
    public Product() {
    }

    public Product(String name, Double price, Integer existencias, String descripcion, String nombreProv) {
        this.name = name;
        this.price = price;
        this.existencias = existencias;
        this.descripcion = descripcion;
        this.nombreProv = nombreProv;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getExistencias() {
        return existencias;
    }

    public void setExistencias(Integer existencias) {
        this.existencias = existencias;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }
}


/*
@Entity
public class Product{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long ID;
private String name;
private Double price;

// Constructores
public Product() {
}

public Product(String name, Double price) {
    this.name = name;
    this.price = price;
}

// Getters y Setters
public Long getId() {
    return ID;
}

public void setId(Long id) {
    this.ID= id;
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
}*/
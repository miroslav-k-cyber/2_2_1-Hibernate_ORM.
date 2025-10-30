package hiber.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "series")
    private int series;
    
    public Car() {}
    
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getSeries() {
        return series;
    }
    
    public void setSeries(int series) {
        this.series = series;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return series == car.series &&
                Objects.equals(id, car.id) &&
                Objects.equals(model, car.model);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, model, series);
    }
    
    @Override
    public String toString() {
        return String.format("Car{model='%s', series=%d}", model, series);
    }
    
}


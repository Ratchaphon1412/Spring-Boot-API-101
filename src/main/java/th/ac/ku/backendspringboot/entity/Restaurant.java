package th.ac.ku.backendspringboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@ToString
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String rating;
    private String location;



}

package timdev.eventmanager.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "users")
public class User {

    private Long id;

    private String email;

    private String name;
}

package web.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class User {

    public User() {
    }

    public User(String name, String lastName, int ago) {
        this.name = name;
        this.lastName = lastName;
        this.ago = ago;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_last_name")
    private String lastName;

    @Column(name = "user_ago")
    private int ago;


}

package com.mountblue.RestApi.Entity;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
@Entity(name = "UserData")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(nullable=false)
    @NotEmpty()
    private String username;

    @Email(message ="{errors.invalid_email}")
    private String email;

    @Column(nullable=false)
    @Size(min=4)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "l_id",referencedColumnName = "l_id")
    private Laptop laptop;


    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public UserData() {

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}

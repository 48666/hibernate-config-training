package pl.wozniak.michal.hibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "CLIENTS")
public class ClientEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(length = 99,nullable = false)
    private int age;

    private ClientType clientType;

    @Column(nullable = false)
    private String emailAdress;



    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public ClientEntity() {
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", clientType=" + clientType +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }
}

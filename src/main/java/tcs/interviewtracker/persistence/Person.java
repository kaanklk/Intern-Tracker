package tcs.interviewtracker.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name = "person")
public class Person {

    @Id
    @NonNull
    private Long id;

    @Column(name = "fname", columnDefinition = "varchar(256)")
    @NonNull

    private String firstName;

    @Column(name = "mname", columnDefinition = "varchar(256)")
    @Nullable
    private String middleName;

    @Column(name = "lname", columnDefinition = "varchar(256)")
    @NonNull
    private String lastName;

    @Column(name = "email", columnDefinition = "varchar(256)")
    @NonNull
    private String email;

    @Column(name = "phone", columnDefinition = "varchar(256)")
    @Nullable
    private String phone;

    @Nullable
    private Date dateOfBirth;

    @Column(name = "profile_picture_url", columnDefinition = "varchar(256)")
    @Nullable
    private Date profilePictureUrl;

}

package tcs.interviewtracker.persistence;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.Data;

@Entity
@Data
@Table(name = "language")
public class Language {

    @Id
    private Long id;

    @Column(name="uuid")
    private UUID uuid;

    @ManyToOne
    private Candidate candidate;

    @NonNull
    private String language;

    @NonNull
    private String level;

}

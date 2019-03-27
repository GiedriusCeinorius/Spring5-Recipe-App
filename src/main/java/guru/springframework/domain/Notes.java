package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(exclude="recipe")
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //@Lob annotation for very long string = CLOB
    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;


}

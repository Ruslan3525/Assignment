package kz.kalybayevv.Test.animals;

import kz.kalybayevv.Test.abilities.Swimable;
import kz.kalybayevv.Test.abilities.Walkable;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Turtle extends Animal implements Walkable, Swimable {
    private Double comfortSize;
    private String name = Turtle.class.getName().substring(19);

    public Turtle(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

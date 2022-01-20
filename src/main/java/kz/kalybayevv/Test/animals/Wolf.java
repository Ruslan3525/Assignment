package kz.kalybayevv.Test.animals;

import kz.kalybayevv.Test.abilities.Moveable;
import kz.kalybayevv.Test.abilities.Swimable;
import kz.kalybayevv.Test.abilities.Walkable;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Wolf extends Animal implements Moveable, Walkable, Swimable {
    private Double comfortSize;
    private String name = Wolf.class.getName().substring(19);

    public Wolf(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

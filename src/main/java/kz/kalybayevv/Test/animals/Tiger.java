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
public class Tiger extends Animal implements Walkable, Moveable, Swimable {
    private Double comfortSize;
    private String name = Tiger.class.getName().substring(19);

    public Tiger(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

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
public class Fox extends Animal implements Moveable, Walkable, Swimable {
    private Double comfortSize;
    private String name = Fox.class.getName().substring(19);

    public Fox(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

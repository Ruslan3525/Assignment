package kz.kalybayevv.Test.birds;

import kz.kalybayevv.Test.abilities.Flyable;
import kz.kalybayevv.Test.abilities.Moveable;
import kz.kalybayevv.Test.abilities.Walkable;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Crow extends Bird implements Flyable, Walkable, Moveable {
    private Double comfortSize;
    private String name = Crow.class.getName().substring(19);

    public Crow(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

package kz.kalybayevv.Test.birds;

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
public class Ostrich extends Bird implements Moveable, Walkable, Swimable {
    private Double comfortSize;
    private String name = Ostrich.class.getName().substring(19);

    public Ostrich(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

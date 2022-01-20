package kz.kalybayevv.Test.birds;

import kz.kalybayevv.Test.abilities.Flyable;
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
public class Sparrow extends Bird implements Swimable, Flyable, Moveable, Walkable {
    private Double comfortSize;
    private String name = Sparrow.class.getName().substring(19);

    public Sparrow(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

package kz.kalybayevv.Test.birds;

import kz.kalybayevv.Test.abilities.Swimable;
import kz.kalybayevv.Test.abilities.Walkable;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Penguin extends Bird implements Walkable, Swimable {
    private Double comfortSize;
    private String name = Penguin.class.getName().substring(19);

    public Penguin(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

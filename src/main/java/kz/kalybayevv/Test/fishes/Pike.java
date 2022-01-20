package kz.kalybayevv.Test.fishes;


import kz.kalybayevv.Test.abilities.Moveable;
import kz.kalybayevv.Test.abilities.Swimable;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pike extends Fish implements Swimable, Moveable {
    private Double comfortSize;
    private String name = Pike.class.getName().substring(19);

    public Pike(Double comfortSize) {
        this.comfortSize = comfortSize;
    }

    @Override
    public Double getComfortableSpace() {
        return comfortSize;
    }
}

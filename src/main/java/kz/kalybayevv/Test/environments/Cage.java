package kz.kalybayevv.Test.environments;

import kz.kalybayevv.Test.abilities.Walkable;
import kz.kalybayevv.Test.exceptions.OutOfBound;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cage<T extends Walkable> extends Habitat {
    private Double size;
    private List<Walkable> objects = new ArrayList<>();

    public Cage(Double size) {
        this.size = size;
    }

    public <T extends Walkable> String addObj(T obj) throws OutOfBound {
        this.size = getSize() - obj.getComfortableSpace();
        if (size < 0) {
            throw new OutOfBound("Not have enough space for your animal");
        }
        objects.add(obj);
        return "Your animal is delighted";
    }
}

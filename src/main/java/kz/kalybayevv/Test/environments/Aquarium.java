package kz.kalybayevv.Test.environments;

import kz.kalybayevv.Test.abilities.Swimable;
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
public class Aquarium<T extends Swimable> extends Habitat {
    private Double size;
    private List<Swimable> objects = new ArrayList<>();

    public Aquarium(Double size) {
        this.size = size;
    }

    public <T extends Swimable> String addObj(T obj) throws OutOfBound {
        this.size = getSize() - obj.getComfortableSpace();
        if (size < 0) {
            throw new OutOfBound("Not have enough space for your fish");
        }
        objects.add(obj);
        System.out.println("Your fish is delighted");
        return "Your fish is delighted";
    }
}

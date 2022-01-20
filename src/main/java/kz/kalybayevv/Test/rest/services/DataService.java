package kz.kalybayevv.Test.rest.services;

import kz.kalybayevv.Test.animals.Fox;
import kz.kalybayevv.Test.animals.Tiger;
import kz.kalybayevv.Test.animals.Turtle;
import kz.kalybayevv.Test.animals.Wolf;
import kz.kalybayevv.Test.birds.Crow;
import kz.kalybayevv.Test.birds.Ostrich;
import kz.kalybayevv.Test.birds.Penguin;
import kz.kalybayevv.Test.birds.Sparrow;
import kz.kalybayevv.Test.environments.Aquarium;
import kz.kalybayevv.Test.environments.Cage;
import kz.kalybayevv.Test.environments.Cell;
import kz.kalybayevv.Test.exceptions.OutOfBound;
import kz.kalybayevv.Test.fishes.Pike;
import kz.kalybayevv.Test.fishes.Shark;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DataService {
    public static Cage cage = new Cage(50D);
    public static Cell cell = new Cell(50D);
    public static Aquarium aquarium = new Aquarium(50D);


    public ResponseEntity getAnimalsInCage() {
        return ResponseEntity.status(HttpStatus.OK).body(cage.getObjects());
    }

    public ResponseEntity getFishesInAquarium() {
        return ResponseEntity.status(HttpStatus.OK).body(aquarium.getObjects());
    }

    public ResponseEntity getBirdsInCell() {
        return ResponseEntity.status(HttpStatus.OK).body(cell.getObjects());
    }

    public ResponseEntity addAnimal(Double animalSize, Integer animalId) throws OutOfBound {
        if (animalId == 1) {
            Fox fox = new Fox(animalSize);
            return ResponseEntity.status(HttpStatus.OK).body(cage.addObj(fox));
        } else if (animalId == 2) {
            Tiger tiger = new Tiger(animalSize);
            return ResponseEntity.status(HttpStatus.OK).body(cage.addObj(tiger));
        } else if (animalId == 3) {
            Turtle turtle = new Turtle(animalSize);
            return ResponseEntity.status(HttpStatus.OK).body(cage.addObj(turtle));
        } else if (animalId == 4) {
            Wolf wolf = new Wolf(animalSize);
            return ResponseEntity.status(HttpStatus.OK).body(cage.addObj(wolf));
        }
        return ResponseEntity.badRequest().body("Bad Request");
    }

    public ResponseEntity addFish(Double fishSize, Integer fishId) throws OutOfBound {
        if (fishId == 1) {
            Pike pike = new Pike(fishSize);
            return ResponseEntity.status(HttpStatus.OK).body(aquarium.addObj(pike));
        } else if (fishId == 2) {
            Shark shark = new Shark(fishSize);
            return ResponseEntity.status(HttpStatus.OK).body(aquarium.addObj(shark));
        }
        return ResponseEntity.badRequest().body("Bad Request");
    }

    public ResponseEntity addBird(Double birdSize, Integer birdId) throws OutOfBound {
        if (birdId == 1) {
            Crow crow = new Crow(birdSize);
            return ResponseEntity.status(HttpStatus.OK).body(cell.addObj(crow));
        } else if (birdId == 2) {
            Ostrich ostrich = new Ostrich(birdSize);
            return ResponseEntity.status(HttpStatus.OK).body(cell.addObj(ostrich));
        } else if (birdId == 3) {
            Penguin penguin = new Penguin(birdSize);
            return ResponseEntity.status(HttpStatus.OK).body(cell.addObj(penguin));
        } else if (birdId == 4) {
            Sparrow sparrow = new Sparrow(birdSize);
            return ResponseEntity.status(HttpStatus.OK).body(cell.addObj(sparrow));
        }
        return ResponseEntity.badRequest().body("Bad Request");
    }

    public ResponseEntity getAnimals() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Fox");
        map.put(2, "Tiger");
        map.put(3, "Turtle");
        map.put(4, "Wolf");
        return new ResponseEntity(map, HttpStatus.OK);
    }

    public ResponseEntity getBirds() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Crow");
        map.put(2, "Ostrich");
        map.put(3, "Penguin");
        map.put(4, "Sparrow");
        return new ResponseEntity(map, HttpStatus.OK);
    }

    public ResponseEntity getFishes() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Pike");
        map.put(2, "Shark");
        return ResponseEntity.status(HttpStatus.OK).body(map);
    }
}

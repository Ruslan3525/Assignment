package kz.kalybayevv.Test.rest;

import kz.kalybayevv.Test.exceptions.OutOfBound;
import kz.kalybayevv.Test.rest.services.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/data/manipulation")
public class DataController {
    private final DataService dataService;


    @GetMapping("/animals")
    public ResponseEntity getAnimals() {
        return dataService.getAnimals();
    }


    @GetMapping("/fishes")
    public ResponseEntity getFishes() {
        return dataService.getFishes();
    }

    @GetMapping("/birds")
    public ResponseEntity getBirds() {
        return dataService.getBirds();
    }

    @PostMapping("/addAnimal")
    public ResponseEntity addAnimal(@RequestParam("animalSize") Double animalSize,
                                    @RequestParam("animalId") Integer animalId) throws OutOfBound {
        return dataService.addAnimal(animalSize, animalId);
    }

    @PostMapping("/addFish")
    public ResponseEntity addFish(@RequestParam("fishSize") Double fishSize,
                                  @RequestParam("fishId") Integer fishId) throws OutOfBound {
        return dataService.addFish(fishSize, fishId);
    }

    @PostMapping("/addBird")
    public ResponseEntity addBird(@RequestParam("birdSize") Double birdSize,
                                  @RequestParam("birdId") Integer birdId) throws OutOfBound {
        return dataService.addBird(birdSize, birdId);
    }

    @GetMapping("/getAnimalsInCage")
    public ResponseEntity getAnimalsInCage() {
        return dataService.getAnimalsInCage();
    }

    @GetMapping("/getFishesInAquarium")
    public ResponseEntity getFishesInAquarium() {
        return dataService.getFishesInAquarium();
    }

    @GetMapping("/getBirdsInCell")
    public ResponseEntity getBirdsInCell() {
        return dataService.getBirdsInCell();
    }
}

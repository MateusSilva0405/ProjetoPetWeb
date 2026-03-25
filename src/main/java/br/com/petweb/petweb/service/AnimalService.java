package br.com.petweb.petweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.petweb.petweb.entity.Animal;
import br.com.petweb.petweb.repository.AnimalRepository;
import br.com.petweb.petweb.entity.Animal;

@Service
public class AnimalService {
    
    @Autowired
    private AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public Animal save(Animal animal){
        return animalRepository.save(animal);
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

    // Método para excluir um cliente por ID
    public void deleteById(Integer id) {
        animalRepository.deleteById(id);
    }

    // Método para encontrar um cliente por ID
    public Animal findById(Integer id) {
        return animalRepository.findById(id).orElse(null);
    }
}

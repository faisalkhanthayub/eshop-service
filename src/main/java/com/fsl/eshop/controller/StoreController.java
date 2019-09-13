package com.fsl.eshop.controller;

import com.fsl.eshop.model.Store;
import com.fsl.eshop.repository.StoreRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/api/stores")
public class StoreController {

    private StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository){
        this.storeRepository = storeRepository;
    }

    @GetMapping("/")
    public List<Store> getAllStores(){
        return (List<Store>) storeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Store> getStore(@PathVariable String id){
        return storeRepository.findById(id);
    }

    @PostMapping("/save")
    public Store save(@RequestBody Store store){
        return storeRepository.save(store);
    }

}

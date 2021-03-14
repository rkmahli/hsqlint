package com.elpsycongroo.controller;

import java.util.Optional;

import com.elpsycongroo.entity.Table;
import com.elpsycongroo.repository.TableRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppController {

    @Autowired
    private TableRepository tableRepository;

    @GetMapping("/get/data/{id}")
    public String getData(@PathVariable("id") Long id) {
        Optional<Table> opt = tableRepository.findById(id);
        if  (opt.isPresent()) return opt.get().getData();
        return "Not Found";
    }

    @GetMapping("/save/data/{data}")
    public String saveData(@PathVariable("data") String data) {
        Table table = new Table();
        table.setData(data);
        tableRepository.save(table);
        return "Saved";
    }

}

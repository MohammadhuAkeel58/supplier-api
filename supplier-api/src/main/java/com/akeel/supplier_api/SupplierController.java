package com.akeel.supplier_api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class SupplierController {
    private SupplierDaoService service;

    public SupplierController(SupplierDaoService service) {
        this.service = service;
    }


    @GetMapping("/supplier")
    public List <Supplier> retreiveAllSuppliers(){
        return service.findAll();
    }


    @GetMapping("/supplier/{supplierid}")
    public Supplier retreiveSpecificSuppliers(@PathVariable int supplierid){
        return service.findSpecific(supplierid);
    }

    @PostMapping("/supplier")
    public ResponseEntity<Supplier> createSupplier(@Validated @RequestBody Supplier supplier){
        Supplier savedSupplier =service.save(supplier);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{supplierId}")
                .buildAndExpand(savedSupplier.
                        getSupplierId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/supplier/{supplierid}")
    public void deleteSpecificSuppliers(@PathVariable int supplierid){
        service.deleteSpecificID(supplierid);

    }
}

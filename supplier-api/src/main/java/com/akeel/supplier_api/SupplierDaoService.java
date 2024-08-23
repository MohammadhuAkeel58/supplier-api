package com.akeel.supplier_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class SupplierDaoService {

    public static List<Supplier> suppliers= new ArrayList<>();
    @Autowired
    SupplierRepository supplierRepository;
    private static int suppliersCount=0;
    static {
        suppliers.add(new Supplier(++suppliersCount,ManfacturingProcess.moulding,NatureOfBusiness.large_Scale,"colombo","https//ascentic.lk",
                "ascentic" ));
        suppliers.add(new Supplier(++suppliersCount,ManfacturingProcess.casting,NatureOfBusiness.medium_scale,"colombo","https//ascentic.lk",
                "IFS" ));
        }

    public List <Supplier> findAll(){
        return supplierRepository.findAll();
    }

    public Supplier findSpecific(int supplierid){
        supplierRepository.findById(supplierid);
        Predicate<? super Supplier>predicate=supplier -> supplier.getSupplierId().equals(supplierid);
        return suppliers.stream().filter(predicate).findFirst().get();
    }

    public Supplier save(Supplier supplier){
        supplier.setSupplierId(++suppliersCount);
        supplierRepository.save(supplier);
        return supplier;
    }

    public void deleteSpecificID(int supplierid) {
        supplierRepository.deleteById(supplierid);
        Predicate<? super Supplier> predicate = supplier -> supplier.getSupplierId().equals(supplierid);
        suppliers.removeIf(predicate);
    }


}

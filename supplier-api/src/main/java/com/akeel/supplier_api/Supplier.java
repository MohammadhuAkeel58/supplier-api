package com.akeel.supplier_api;

import jakarta.persistence.*;

@Entity(name="supplier_details")
public class Supplier {
    @Id
    @GeneratedValue
    private Integer supplierId;
    private String companyName;
    private String website;
    private String location;
    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;
    @Enumerated(EnumType.STRING)
    private ManfacturingProcess manufacturingProcesses;

    public Supplier() {
    }

    public Supplier(Integer supplierId, ManfacturingProcess manufacturingProcesses, NatureOfBusiness natureOfBusiness, String location, String website, String companyName) {
        this.supplierId = supplierId;
        this.manufacturingProcesses = manufacturingProcesses;
        this.natureOfBusiness = natureOfBusiness;
        this.location = location;
        this.website = website;
        this.companyName = companyName;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public ManfacturingProcess getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(ManfacturingProcess manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    public NatureOfBusiness getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(NatureOfBusiness natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierId=" + supplierId +
                ", companyName='" + companyName + '\'' +
                ", website='" + website + '\'' +
                ", location='" + location + '\'' +
                ", natureOfBusiness=" + natureOfBusiness +
                ", manufacturingProcesses=" + manufacturingProcesses +
                '}';
    }
}

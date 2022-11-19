package edu.ntnu.ofplarsen;

public class Property {

    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double area;
    private String ownerName;

    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String ownerName) {
        if (municipalityNumber < 101 || municipalityNumber > 5054){
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
        }
        if (lotNumber <= 0){
            throw new IllegalArgumentException("Lot number must be a positive number");
        }
        if (sectionNumber <= 0){
            throw new IllegalArgumentException("Section number must be a positive number");
        }
        if(area <= 0){
            throw new IllegalArgumentException("Area must be a positive number");
        }
        if(municipalityName.isBlank()){
            throw new IllegalArgumentException("Municipality name can't be blank");
        }
        if(name.isBlank()){
            throw new IllegalArgumentException("Name can't be blank");
        }
        if(ownerName.isBlank()){
            throw new IllegalArgumentException("Owner name can't be blank");
        }


        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName.trim();
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name.trim();
        this.area = area;
        this.ownerName = ownerName.trim();
    }

    public Property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String ownerName, double area) {
        if (municipalityNumber < 101 || municipalityNumber > 5054){
            throw new IllegalArgumentException("Municipality number must be between 101 and 5054");
        }
        if (lotNumber <= 0){
            throw new IllegalArgumentException("Lot number must be a positive number");
        }
        if (sectionNumber <= 0){
            throw new IllegalArgumentException("Section number must be a positive number");
        }
        if(area <= 0){
            throw new IllegalArgumentException("Area must be a positive number");
        }
        if(municipalityName.isBlank()){
            throw new IllegalArgumentException("Municipality name can't be blank");
        }
        if(ownerName.isBlank()){
            throw new IllegalArgumentException("Owner name can't be blank");
        }
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.ownerName = ownerName;
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        if(area <= 0){
            throw new IllegalArgumentException("Area must be a positive number");
        }
        this.area = area;
    }

    public void setOwnerName(String ownerName) {
        if(ownerName.isBlank()){
            throw new IllegalArgumentException("Owner name can't be blank");
        }
        this.ownerName = ownerName;
    }

    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    public String getMunicipalityName() {
        return municipalityName;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public String getOwnerName() {
        return ownerName;
    }
}

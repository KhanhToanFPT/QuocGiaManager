
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Manager {
    ArrayList<Country> country;
private final static int MAX_COUNTRIES = 11;
    public Manager() {
        country = new ArrayList<Country>();
    }
    public ArrayList<Country> getList() {
        return new ArrayList<>(country);
    }

    public void addCountry(Country add) throws Exception {
    
    for (Country ct : country) {
        if (ct.getCountryCode().equalsIgnoreCase(add.getCountryCode())) {
            throw new Exception("Country code already exists.");
        }
        
        if (ct.getCountryName().equalsIgnoreCase(add.getCountryName())) {
            throw new Exception("Country name already exists.");
        }
        
    }

   
    if (country.size() < MAX_COUNTRIES) {
        country.add(add);
    } else {
        throw new Exception("Cannot add more countries, limit reached.");
    }
}
    public void display() {
        
        for (Country country : country) {
            System.out.println(country.toString());
        }
    }
    public Country searchCountry(String name){
        for(Country ct : country){
            if(ct.countryName.equalsIgnoreCase(name)){
                System.out.println(ct.toString());
                return ct;
            }
        }
        return null;
    }
    public void sortInformationByArea() {
   country.sort((c1, c2) -> Float.compare(c1.getTotalArea(), c2.getTotalArea()));
}
    
    
    
}

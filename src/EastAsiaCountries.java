/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class EastAsiaCountries extends Country {
     private String countryTerrain;
//     public EastAsiaCountries() {
//        super();
//    }
     public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    
}

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
            return String.format("%-10s %-20s %-15.1f%-20s\n", super.getCountryCode(), super.getCountryName(), 
                    super.getTotalArea(),getCountryTerrain());

    }
    
  
}

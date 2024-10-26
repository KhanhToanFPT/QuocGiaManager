
;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Controller {
    Manager mng = new Manager();
    Validation vl = new Validation();
    public void addCountry(){
        String code = vl.inputString("Enter code of country:  ", Constant.countrycode);
        String name = vl.inputString("Enter name of country: ", Constant.countryname);
        float total = vl.inputFloat("Enter total Area: ", Constant.totalArea);
        String terrain = vl.inputString("Enter terrain of country: ", Constant.countryTerrain);
        
        EastAsiaCountries add = new EastAsiaCountries(code, name, total, terrain);
        try {
            mng.addCountry(add);
            System.out.println("Add successfully");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
//    "%-10s %-20s %-15.2f %-20s\n
    public void display() {
         System.out.printf("%-10s%-20s%-15s%-20s\n", "Country", "Name", "Total Area", "Terrain");
         mng.display();
        
    }
   public void searchCountry(){
       String Name = vl.inputString("Enter name : ", Constant.countryname);
       System.out.printf("%-10s%-20s%-15s%-20s\n", "Country", "Name", "Total Area", "Terrain");
       Country found = mng.searchCountry(Name);
       if(found!=null){
           System.out.println("Search succesfully");
       }else{
           System.err.println("Not found name:");
       }
   }
   public void sortInformationByAscendingOrder(){
       mng.sortInformationByArea();
       mng.display();
   }
   public void addDefaultCountries() {
//        try {
//            EastAsiaCountries country1 = new EastAsiaCountries("VN", "Vietnam", 331212.0f, "Mountainous");
//            EastAsiaCountries country2 = new EastAsiaCountries("CN", "China", 9596961.0f, "Diverse");
//            EastAsiaCountries country3 = new EastAsiaCountries("JP", "Japan", 377975.0f, "Island");
//            EastAsiaCountries country4 = new EastAsiaCountries("KR", "South Korea", 100032.0f, "Hilly");
//            EastAsiaCountries country5 = new EastAsiaCountries("PH", "Philippines", 300000.0f, "Island");
//            EastAsiaCountries country6 = new EastAsiaCountries("LL", "lon", 300000.0f, "Island");
//            EastAsiaCountries country7 = new EastAsiaCountries("BB", "buoi", 300000.0f, "Island");
//            EastAsiaCountries country8 = new EastAsiaCountries("AA", "buom", 300000.0f, "Island");
//            EastAsiaCountries country9 = new EastAsiaCountries("EE", "my", 300000.0f, "Island");
//            EastAsiaCountries country10 = new EastAsiaCountries("00", "cut", 300000.0f, "Island");
//            
//            // Thêm các quốc gia vào manager
//            mng.addCountry(country1);
//            mng.addCountry(country2);
//            mng.addCountry(country3);
//            mng.addCountry(country4);
//            mng.addCountry(country5);
//            mng.addCountry(country6);
//            mng.addCountry(country7);
//            mng.addCountry(country8);
//            mng.addCountry(country9);
//            mng.addCountry(country10);
//            
//            System.out.println("Default countries added successfully.");
//        } catch (Exception e) {
//            System.err.println("Error adding default countries: " + e.getMessage());
//        }
    }
}
    


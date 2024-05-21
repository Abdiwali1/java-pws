package day12_5_21;

import java.util.*;

public class ContinentRunner {
    public static void main(String[] args) {

        Map<String, List<String>> continents = new HashMap<>();
        // key: String -> continents
        // value: List<String> -> all of the countries
        List<String> naCountries = new ArrayList<>(Arrays.asList("United States", "Canada", "Mexico"));
        continents.put("North America", naCountries);
        continents.put("Europe", new ArrayList<>(Arrays.asList("France", "Germany", "United Kingdom")));
        continents.put("Asia", new ArrayList<>(Arrays.asList("South Korea", "Japan", "Pakistan")));
        //continents.put("Asia", List.of("South Korea", "Japan", "Pakistan"));

        //  a. check if a given country is in the map

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a country name");
        String inputCountry = input.nextLine();
        boolean isContained = false;

        for(List<String> eachCountryByContinent : continents.values()){
            for(String eachCountry : eachCountryByContinent){
                if (eachCountry.equalsIgnoreCase(inputCountry)) {
                    isContained = true;
                    break;
                }
            }
        }

        System.out.println(inputCountry + (isContained ? " information available" : " not found"));


       // b. print all the countries that are made up of multiple words and what continent they are from
        System.out.println("============================================");
        for(Map.Entry<String, List<String>> eachContinent : continents.entrySet()){
            System.out.print("In " + eachContinent.getKey() + " these are the countries: ");
            for(String eachCountry : eachContinent.getValue()){
                if(eachCountry.contains(" ")){
                    System.out.print(eachCountry + " | ");
                }
            }
            System.out.println();
        }

        System.out.println("============================================");
        // c. ask the user to enter a continent and print that you are visiting each country in that continent
        System.out.println("Enter the continent you would like to visit? " + continents.keySet());
        String inputContinent = input.nextLine();

        if(continents.containsKey(inputContinent)){
            for(String eachCountry : continents.get(inputContinent)){
                System.out.println("Traveling to... " + eachCountry);
            }
        } else {
            System.out.println(inputContinent + " does not have data");
        }
    }
}

/*
    create a Map to group countries based on the continent they are in
    use continent as the key
    there is multiple countries so the values will be a List of countries

    sample data:

        North America - United States, Canada, Mexico
        Europe - France, Germany, United Kingdom
        Asia - South Korea, Japan, Pakistan

    mini tasks:
        a. check if a given country is in the map
        b. print all the countries that are made up of multiple words
        c. ask the user to enter a continent and print that you are visiting each country in that continent

 */
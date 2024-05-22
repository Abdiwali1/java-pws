package day12_5_21;

import com.sun.tools.javac.Main;

import java.util.*;

public class BonusRunner {
    public static void main(String[] args) {

        Country us = new Country("United States", "English", 331, 37.09, 95.71);
        List<Country> naCountries;

       // Map<String, List<String>> continents = new HashMap<>(); // this is the original we did
        Map<String, List<Country>> continents = new HashMap<>();

        continents.put("North America", new ArrayList<>(Arrays.asList(
                us,
                new Country("Canada", "French", 38, 56.13, 106.34),
                new Country("Mexico","Spanish", 129, 23.63, 102.55)
        )));

        continents.put("Europe", new ArrayList<>(Arrays.asList(
                new Country("France", "French", 67, 46.60, 1.89),
                new Country("Germany", "German", 83, 51.17, 10.45),
                new Country("United Kingdom", "English", 68, 55.38, 3.43),
                new Country("Netherlands", "English", 65, 0, 0)
        )));

        /* Which countries have a population of less than 80 million

            1. we want to all check the countries, so we can check the values from the map
            2. go through each country -> iterate through the eachContinent
            3. check the populations and find the ones with less than 80 million
         */

        for(List<Country> eachContinent: continents.values()){
            for(Country eachCountry: eachContinent){
                if(eachCountry.getPopulation() < 80){
                    System.out.println(eachCountry.getName() + " " + eachCountry.getPopulation());
                }
            }
        }

        // extra: don't worry about it too much. same as above using stream

        continents.values().stream()
                .flatMap(List::stream)
                .filter(country -> country.getPopulation() < 80)
                .forEach(country -> System.out.println(country.getName() + " " + country.getPopulation()));

        // find the total number of unique languages in each continent

        for(Map.Entry<String, List<Country>> eachEntry : continents.entrySet()){
            Set<String> uniqueLanguage = new HashSet<>();

            for(Country eachCountry : eachEntry.getValue()){ // getValue method will return List<Country>
                uniqueLanguage.add(eachCountry.getMainLanguage());
            }

            System.out.println("In " + eachEntry.getKey() + " there are " + uniqueLanguage.size() + " unique languages. They are: " + uniqueLanguage);

        }

    }

}
/*
        North America - United States, Canada, Mexico
        Europe - France, Germany, United Kingdom
        Asia - South Korea, Japan, Pakistan
 Bonus:
        improve the data by making the countries into objects

        Data:
            United States:
                Main Language: English
                Population: Approximately 331 million
                Latitude and Longitude: 37.0902° N, 95.7129° W
            Canada:
                Main Language: English, French
                Population: Approximately 38 million
                Latitude and Longitude: 56.1304° N, 106.3468° W
            Mexico:
                Main Language: Spanish
                Population: Approximately 129 million
                Latitude and Longitude: 23.6345° N, 102.5528° W
            France:
                Main Language: French
                Population: Approximately 67 million
                Latitude and Longitude: 46.6034° N, 1.8883° E
            Germany:
                Main Language: German
                Population: Approximately 83 million
                Latitude and Longitude: 51.1657° N, 10.4515° E
            United Kingdom:
                Main Language: English
                Population: Approximately 68 million
                Latitude and Longitude: 55.3781° N, 3.4360° W
            South Korea:
                Main Language: Korean
                Population: Approximately 52 million
                Latitude and Longitude: 35.9078° N, 127.7669° E
            Japan:
                Main Language: Japanese
                Population: Approximately 126 million
                Latitude and Longitude: 36.2048° N, 138.2529° E
            Pakistan:
                Main Language: Urdu
                Population: Approximately 225 million
                Latitude and Longitude: 30.3753° N, 69.3451° E
 */
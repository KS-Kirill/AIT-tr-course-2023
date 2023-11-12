package practice.ilist;

public class IListOfCities {
    public static void main(String[] args) {
        //create list of cities
        IList <String> listOfCities = new IListImpl<>();
        //fill list of cities
        listOfCities.add("Frankfurt");
        listOfCities.add("Köln");
        listOfCities.add("Düsseldorf");
        listOfCities.add("München");
        listOfCities.add("Hamburg");

        //print the size of a list and check, if is it empty
        System.out.println("Size of the city list: " + listOfCities.size());
        System.out.println("Is the list of cities empty? " + listOfCities.isEmpty());

        //print the list using 'foreach'
        System.out.println("Cities in the list:");
        for (String city : listOfCities) {
            System.out.println(city);
        }

        // checking methods
        System.out.println("Index of 'Frankfurt': " + listOfCities.indexOf("Frankfurt"));
        System.out.println("Last Index of 'Köln': " + listOfCities.lastIndexOf("Köln"));

        //add and remove from the list of the cities
        listOfCities.add("Berlin");
        System.out.println("Index of 'Berlin': " + listOfCities.indexOf("Berlin"));
        listOfCities.remove("Düsseldorf");
        System.out.println("Index of 'Düsseldorf' after removal: " + listOfCities.indexOf("New York"));

        // Get and set the city
        System.out.println("City at index 2: " + listOfCities.get(2));
        listOfCities.set(2, "Düsseldorf");
        System.out.println("City at index 2 after set: " + listOfCities.get(2));

    }
}




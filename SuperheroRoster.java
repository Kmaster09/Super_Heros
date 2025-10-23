public class SuperheroRoster {

    public static void main(String[] args) {
        // 1. Declare and initialize arrays for hero names, abilities, and power levels
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "Thor", "Hulk"};
        String[] abilities = {
            "Web-slinging and agility",
            "Flying and high-tech armor",
            "Stealth and combat",
            "God of Thunder",
            "Super strength and regeneration"
        };
        int[] powerLevels = {85, 90, 80, 95, 92};

        // 2. Print each hero's details using a loop
        System.out.println("=== Marvel Superhero Roster ===");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Hero: " + heroNames[i]);
            System.out.println("Ability: " + abilities[i]);
            System.out.println("Power Level: " + powerLevels[i]);
            System.out.println("--------------------------");
        }

        // 3. Call the searchHero method to find a specific hero by name
        System.out.println("\n=== Searching for a Hero ===");
        searchHero(heroNames, abilities, powerLevels, "Iron Man");
        searchHero(heroNames, abilities, powerLevels, "Captain America"); // Example not found

        // 4. Calculate and display the average power level by calling calculateAveragePower method
        double avgPower = calculateAveragePower(powerLevels);
        System.out.println("\nAverage Power Level: " + avgPower);

        // 5. Demonstrate using Superhero objects
        System.out.println("\n=== Superhero Objects ===");
        Superhero[] heroes = new Superhero[heroNames.length];

        for (int i = 0; i < heroes.length; i++) {
            heroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
        }

        for (Superhero hero : heroes) {
            hero.displayHero();
            System.out.println("--------------------------");
        }
    }

    // Method: searchHero
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i]);
                System.out.println("Ability: " + abilities[i]);
                System.out.println("Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Hero not found: " + target);
        }
    }

    // Method: calculateAveragePower
    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}






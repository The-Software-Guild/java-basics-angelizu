package Exercise2;

import java.util.*;

public class DogGenetics {

    private static final Random r = new Random();
    public static void main(String[] args) {

        // array that will hold randomly generated percentages
        int[] percent = new int[5];

        // holds the individual percentages for each breed
        int breed1, breed2, breed3, breed4, breed5 ;

        //sum of percentage for breed1 to breed4
        int sumB1ToB4;

        String dogName;
        System.out.print("What is your dog's name? ");
        Scanner scanner = new Scanner(System.in);
        dogName = scanner.nextLine();

        // makes sure that user input doesn't include any integers
        int tries = 5;
        while(!dogName.matches("[a-zA-Z ]+")){
            if (tries > 0){
                System.out.println(tries + " attempts left");
                System.out.println("ERROR! Please enter a name with only letters");
                System.out.println("Re-enter your dog's name");
                dogName = scanner.nextLine();
                tries--;
            } else {
                System.out.println("You have not provided the correct format" +
                        "the dog's name. Program ending now.....");
                System.exit(0);
            }
        }

        System.out.println("Well then, I have this highly reliable report on " +
                dogName + "'s prestigious background right here.");

        System.out.println(dogName + " is: ");

        // creates randomly generated percentages less than 100
        // and adds them to an array
        breed1 = r.nextInt(101);
        percent[0] = breed1;

        breed2 = r.nextInt(101 - breed1);
        percent[1] = breed2;

        breed3 = r.nextInt(101 - breed2 - breed1);
        percent[2] = breed3;

        breed4 = r.nextInt(101 - breed3 - breed2 - breed1);
        percent[3] = breed4;

        sumB1ToB4 = breed4 + breed3 + breed2 + breed1;
        breed5 = 100 - sumB1ToB4;
        percent[4] = breed5;


        // set holding 5 randomly generated breeds from randomBreed method, with no duplicates
        Set<String> set = new HashSet<String>();
        while (set.size() <= 5) {
            set.add(randomBreed());
        }

        // converting a set to a list to be able to access it for for-loop
        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < percent.length ; i++){
            System.out.printf("%d %% %3s %n", percent[i], list.get(i));
        }

        System.out.println();
        System.out.printf("Wow, that's %S the dog!", "quite");
    }
    // method that randomly generates breed from given array
    public static String randomBreed() {
        String[] breed = new String[]{"French Bulldog", "German Shepherd", "Golden Retriever",
                "Poodle", "Siberian Husky", "Pomeranian", "Airedale Terrier"};
        int index = r.nextInt(breed.length);
        String randBreed = breed[index];

        return randBreed;
    }
}

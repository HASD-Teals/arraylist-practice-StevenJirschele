import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) throws Exception {
        // Add Array List methods from the worksheet here
        List<String> myList = new ArrayList<String>();

        System.out.println(myList);

        myList.add("Ant");
        myList.add("Bear");
        myList.add("Dog");

        System.out.println(myList);

        myList.add(2, "Cat");

        System.out.println(myList);

        myList.add(2, "Crab");

        System.out.println(myList);

        myList.remove(0);

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));

        int lengthAnimalname = (myList.get(1).toString().length());
        System.out.println(lengthAnimalname);

        System.out.println("\n");
        System.out.println(removeEvenLength(myList));

        System.out.println("\n");
        System.out.println(averageVowels(myList));
    }

    public static List<String> removeEvenLength(List<String> myList) {
        List<String> temp = myList;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() % 2 == 0) {
                temp.remove(i);
            }
        }
        return temp;
    }

    public static double averageVowels(List<String> myList) {
        double counter = 0;
        for (int i = 0; i < myList.size(); i++) {
            for (char c : myList.get(i).toLowerCase().toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    counter++;
                }
            }
        }
        return counter / myList.size();
    }
}

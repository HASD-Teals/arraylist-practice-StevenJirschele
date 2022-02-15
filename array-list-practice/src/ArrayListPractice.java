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

        myList.add("Crab");
        myList.add(1, "Dog");

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));

        int lengthAnimalname = (myList.get(1).toString().length());
        System.out.println(lengthAnimalname);

        System.out.println("\n");
        System.out.println(removeEvenLength(myList));

        System.out.println("\n");
        System.out.println(averageVowels(myList));

        System.out.println(myList);

        System.out.println("\n");
        System.out.println(removeDuplicates(myList));

        System.out.println("\n");
        System.out.println(doubleList(myList));

        List<Integer> myList2 = new ArrayList<Integer>();

        myList2.add(1);
        myList2.add(2);
        myList2.add(3);
        myList2.add(2);

        System.out.println("\n");
        System.out.println(myList2);

        System.out.println("\n");
        System.out.println(minToFront(myList2));
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
    public static List<String> removeDuplicates(List<String> myList) {
        for(int i = 0; i < myList.size(); i++) {
            for(int j = i + 1; j < myList.size(); j++) {
                if(myList.get(i).equals(myList.get(j))) {
                    myList.remove(j);
                    j--;
                }
            }
        }
        return myList;
    }
    public static List<String> doubleList(List<String> myList) {
        int temp = myList.size();
        for(int i = 0; i < myList.size(); i++) {
            myList.add(i + 1, myList.get(i));
            i++;
            if(myList.size() >= temp * 2) {
                break;
            }
        }
        return myList;
    }
    public static List<Integer> minToFront(List<Integer> myList2) {
        for(int i = 0; i < myList2.size(); i++) {
            if(myList2.get(i) > myList2.get(i + 1)) {
                myList2.remove(i);
                myList2.set(0, i);
            }
        }
        return myList2;
    }
}

import java.util.*;

public class GreatestNumber {
    public List getMostRepeatingNumbers(int[] arr) {
        int counter = 1, tempCounter = 1;
        // Use a Set for validating that we have Integer duplicates in input array
        Set<Integer> duplicateCheck = new HashSet<>();
        // Use a List to store the most repeating Integers
        List<Integer> mostRepeatNum = new ArrayList<>();
        // Sorting input array to prepare for duplicate count
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // Counting Integer duplicates, if an Integer exists in a Set we will increase the counter by 1
            if (duplicateCheck.add(arr[i]) == false) {
                counter++;
                // If we found greater number of duplicates than we found previously or found the first time Integers that repeating more than twice,
                // we clear the List and add that Integer to the List
                if (counter > tempCounter) {
                    mostRepeatNum.clear();
                    tempCounter = counter;
                    mostRepeatNum.add(arr[i - 1]);
                }
                // If Integer's duplicates number is equal to previous Integer duplicates number we add that new Integer to the List
                else if (counter == tempCounter && tempCounter > 1) {
                    tempCounter = counter;
                    mostRepeatNum.add(arr[i - 1]);
                }
            }
            else {
                // If we do not find Integer's duplicates, we reset the counter to 1
                counter = 1;
            }
        }
        // Cover the scenario when all integers are unique, will return all of them
        if (mostRepeatNum.isEmpty()) {
            mostRepeatNum.addAll(duplicateCheck);
        }
        return mostRepeatNum;
    }
}

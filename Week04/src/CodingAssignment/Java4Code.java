package CodingAssignment;

public class Java4Code {

			    public static void main(String[] args) {
			        // 1. Array Operations
			        // a. Subtract the first element from the last element
			        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			        int difference = ages[ages.length - 1] - ages[0];
			        System.out.println("Difference: " + difference);
			        // b. Create a new array ages2 and repeat the subtraction
			        int[] ages2 = new int[9];  // New array with 9 elements
			        // Fill ages2 with some values
			        for (int i = 0; i < ages.length; i++) {
			            ages2[i] = ages[i];
			        }
			        ages2[ages2.length - 1] = 100; // Adding a new value
			        // Subtract the first element from the last element
			        int differenceAges2 = ages2[ages2.length - 1] - ages2[0];
			        System.out.println("Difference in ages2: " + differenceAges2);
			        // c. Calculate the average age
			        int sum = 0;
			        for (int age : ages) {
			            sum += age;
			        }
			        double average = (double) sum / ages.length;
			        System.out.println("Average Age: " + average);
			        // 2. String Array Operations
			        // a. Calculate the average number of letters per name
			        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			        int totalLetters = 0;
			        for (String name : names) {
			            totalLetters += name.length();
			        }
			        double averageLetters = (double) totalLetters / names.length;
			        System.out.println("Average Number of Letters per Name: " + averageLetters);
			        // b. Concatenate all names together separated by spaces
			        StringBuilder concatenatedNames = new StringBuilder();
			        for (String name : names) {
			            concatenatedNames.append(name).append(" ");
			        }
			        System.out.println("Concatenated Names: " + concatenatedNames.toString().trim());
			        // 3. Accessing Array Elements
			        // Access the last element
			        int lastElement = ages[ages.length - 1];
			        System.out.println("Last Element: " + lastElement);
			        // Access the first element
			        int firstElement = ages[0];
			        System.out.println("First Element: " + firstElement);
			        // 5. Create nameLengths Array
			        int[] nameLengths = new int[names.length];
			        for (int i = 0; i < names.length; i++) {
			            nameLengths[i] = names[i].length();
			        }
			        // Print nameLengths to verify
			        System.out.print("Name Lengths: ");
			        for (int length : nameLengths) {
			            System.out.print(length + " ");
			        }
			        System.out.println();
			        // 6. Sum of nameLengths
			        int sumOfNameLengths = 0;

			        for (int length : nameLengths) {
			            sumOfNameLengths += length;
			        }
			        System.out.println(sumOfNameLengths);
					System.out.println("Sum of Name Lengths: " + sumOfNameLengths);
			        // 7. Concatenate Word
			        System.out.println("Concatenated Word: " + concatenateWord("Hello", 3));
			        // 8. Full Name
			        System.out.println("Full Name: " + getFullName("John", "Doe"));
			        // 9. Sum Greater Than 100
			        int[] numbers = {20, 30, 40, 15};
			        System.out.println("Is Sum Greater Than 100: " + isSumGreaterThan100(numbers));
			        // 10. Average of Doubles
			        double[] doubleArray = {10.5, 20.0, 30.5};
			        System.out.println("Average: " + average(doubleArray));
			        // 11. Compare Averages
			        double[] array1 = {10.0, 20.0, 30.0};
			        double[] array2 = {5.0, 15.0, 25.0};
			        System.out.println("Is First Average Greater: " + isFirstAverageGreater(array1, array2));
			        // 12. Will Buy Drink
			        System.out.println("Will Buy Drink: " + willBuyDrink(true, 15.00));
			        // 13. Custom Method
			        double[] temperatures = {72.5, 85.3, 78.1, 91.4, 88.2, 77.6, 93.0};
			        double threshold = 80.0;
			        
			        // Call the method and get the count of days above the threshold
			        int daysAboveThreshold = countDaysAboveThreshold(temperatures, threshold);
			        
			        // Print the result
			        System.out.println("Number of days above " + threshold + " degrees: " + daysAboveThreshold);
			    }
			        // 7. Concatenate Word Method
			    public static String concatenateWord(String word, int n) {
			        StringBuilder result = new StringBuilder();
			        for (int i = 0; i < n; i++) {
			            result.append(word);
			        }
			        return result.toString();
			    }
			    // 8. Full Name Method
			    public static String getFullName(String firstName, String lastName) {
			        return firstName + " " + lastName;
			    }
			    // 9. Sum Greater Than 100 Method
			    public static boolean isSumGreaterThan100(int[] numbers) {
			        int sum = 0;
			        for (int number : numbers) {
			            sum += number;
			        }
			        return sum > 100;
			    }
			    // 10. Average of Doubles Method
			    public static double average(double[] numbers) {
			        double sum = 0;
			        for (double number : numbers) {
			            sum += number;
			        }
			        return sum / numbers.length;
			    }
			    // 11. Compare Averages Method
			    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
			        return average(arr1) > average(arr2);
			    }
			    // 12. Will Buy Drink Method
			    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			        return isHotOutside && moneyInPocket > 10.50;
			    }
			    // 13. Custom Method
			    /**
			     * This method calculates the number of days with temperatures above a specified threshold.
			     * It helps in analyzing how many days in a period had temperatures exceeding a certain limit.
			     * 
			     * @param temperatures An array of temperatures recorded over several days.
			     * @param threshold The temperature threshold to compare against.
			     * @return The count of days where the temperature was above the threshold.
			     */
			    public static int countDaysAboveThreshold(double[] temperatures, double threshold) {
			        int count = 0;
			        
			        // Iterate through each temperature
			        for (double temp : temperatures) {
			            // Check if the temperature is above the threshold
			            if (temp > threshold) {
			                count++;
			            }
			        }
			        
			        // Return the number of days with temperatures above the threshold
			        return count;
			    }    
			









	}


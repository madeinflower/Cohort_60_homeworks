package homework18;

public class StringArray {

    public static void main(String[] args) {
        String[] array = {"apple", "banana", "kiwi", "pear", "grape"};

        String[] result = findShortestAndLongest(array);

        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }

    public static String[] findShortestAndLongest(String[] array) {
        if (array == null || array.length == 0) {
            return new String[0];
        }

        String shortest = array[0];
        String longest = array[0];

        for (String str : array) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }
}

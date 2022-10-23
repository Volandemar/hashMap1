import java.util.HashMap;
import java.util.Map;

public class Main {


    private final static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {

        int maxValue = 0;
        char maxChar = ' ';
        int minValue = Integer.MAX_VALUE;
        char minChar = ' ';

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char selectSymbol = text.toLowerCase().charAt(i);
            if (Character.isLetter(selectSymbol)) {
                if (map.get(selectSymbol) == null) {
                    map.put(selectSymbol, 1);
                } else {
                    int value = map.get(selectSymbol);
                    map.put(selectSymbol, value + 1);
                }

            }
        }

        for (Map.Entry<Character, Integer> allMap : map.entrySet()) {
            char key = allMap.getKey();
            int value = allMap.getValue();
            if (value > maxValue) {
                maxValue = value;
                maxChar = key;
            }
            if (value < minValue) {
                minValue = value;
                minChar = key;
            }
        }
        System.out.println("Символ: " + maxChar + " повторяется " + maxValue + ". Это максимально повторяющееся значение в тексте.");
        System.out.println("Символ: " + minChar + " повторяется " + minValue + ". Это миниммально повторяющееся  значение в тексте.");

    }
}
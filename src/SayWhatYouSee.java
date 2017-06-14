import java.util.*;

/**
 * Dropbox sample programming assignment
 * Given an input string of numbers, output a string of numbers the way you would read it
 * Example: "11122" > Three 1's Two 2's > "3122"
 *
 * Created by Christie on 6/14/2017.
 */
public class SayWhatYouSee {

    public static String[] say_what_you_see(String[] input_strings){
        List<String> output = new ArrayList<>();
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int i=0; i< input_strings.length; i++){
            String str = input_strings[i];
            for (int j=0; j<str.length(); j++){
                char c = str.charAt(j);
                if (count.containsKey(c)){
                    int num = count.get(c);
                    num+=1;
                    count.put(c, num);
                } else {
                    count.put(c, 1);
                }
            }

            //create the output string
            String out = "";
            for (Map.Entry<Character, Integer> entry : count.entrySet()){
                out += entry.getValue().toString() + entry.getKey();
            }
            output.add(out);
            count = new LinkedHashMap<>();
        }


        String[] outputArr = output.toArray(new String[output.size()]);

        return outputArr;
    }
    public static void main(String[] args) {
        String[] input = new String[]{"2", "12", "21"};
        String[] output = say_what_you_see(input);
        for (int i=0; i<output.length; i++){
            System.out.println(output[i]);
        }
    }
}

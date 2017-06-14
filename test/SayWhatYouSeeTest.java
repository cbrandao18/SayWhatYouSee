import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test cases
 *
 * Created by Christie on 6/14/2017.
 */
public class SayWhatYouSeeTest {
    @Test
    public void test1(){
        String[] input = new String[]{"2", "12", "21"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"12", "1112", "1211"};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void test2(){
        String[] input = new String[]{"3", "215", "5", "0"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"13", "121115", "15", "10"};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void test3(){
        String[] input = new String[]{"1", "05"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"11", "1015"};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void test4(){
        String[] input = new String[]{"2", "2222", "888888888"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"12", "42", "98"};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void test5(){
        String[] input = new String[]{"1", "1111111111"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"11", "101"};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void test6(){
        String[] input = new String[]{"112223"};
        String[] output = SayWhatYouSee.say_what_you_see(input);
        String[] expected = new String[]{"213213"};
        Assert.assertArrayEquals(expected, output);
    }

}
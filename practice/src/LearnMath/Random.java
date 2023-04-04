package LearnMath;
import java.util.concurrent.ThreadLocalRandom;

public class Random {
    public static void main(String[] args) {
        String[] color ={"red","pink","orange"};
        int random = ThreadLocalRandom.current().nextInt(1,3);
        System.out.println(color[random]);
    }

}

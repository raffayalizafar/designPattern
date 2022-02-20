package ThreadPool;
import java.util.concurrent.Callable;

public class CountTask implements Callable<Integer> {
    private final String str;

    public CountTask(String input) {
        this.str = input;
    }

    public Integer call() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            switch (ch) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                	count++;
                    break;
            }
        }
        return count;
    }
}
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(6);
        String intInWord = "";
        
        if(randomNum == 0){
            intInWord = "zero";
        } else if (randomNum == 1){
            intInWord = "one";
        } else if (randomNum == 2){
            intInWord = "two";
        } else if (randomNum == 3){
            intInWord = "three";
        } else if (randomNum == 4){
            intInWord = "four";
        } else if (randomNum == 5){
            intInWord = "five";
        }

        System.out.printf("%d is %s\n", randomNum, intInWord);
    }
}

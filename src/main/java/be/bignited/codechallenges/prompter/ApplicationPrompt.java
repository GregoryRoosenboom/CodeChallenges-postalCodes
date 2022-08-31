package be.bignited.codechallenges.prompter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationPrompt {
    public static String getCorrectUserInput() throws IOException {
        String input = ensureNumericInput(getUserInput("Please enter a partial postal code"));
        return input;
    }

    private static String getUserInput(String message) throws IOException {
        System.out.println(message);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        return reader.readLine();
    }
    private static String ensureNumericInput(String input) throws IOException {
        while(! input.matches("^[0-9]*$")){
            input = getUserInput("Please enter a partial postal code");
        }
        return input;
    }

    public static String getUserRetry() throws IOException {
        String tryAgain = getUserInput("do you want to try again? (yes/no)");
        if(tryAgain.equalsIgnoreCase("y") || tryAgain.equalsIgnoreCase("yes")){
            return "y";
        }
        else {
            return "n";
        }
    }
}

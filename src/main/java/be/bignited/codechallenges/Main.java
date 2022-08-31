package be.bignited.codechallenges;

import be.bignited.codechallenges.printers.PostalCodePrinter;
import be.bignited.codechallenges.prompter.ApplicationPrompt;
import be.bignited.codechallenges.searchers.PostalCodeSearcher;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String tryAgain = "y";
        do{
            String input = ApplicationPrompt.getCorrectUserInput();
            PostalCodePrinter.printPostalCodes(new PostalCodeSearcher().findMatchingLocalities(input));
            tryAgain = ApplicationPrompt.getUserRetry();
        }
        while(tryAgain.equalsIgnoreCase("y"));

    }
}
package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        // Processor processor = new Processor();
        // processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subAFromB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("\nBeautifying strings.");
        poemBeautifier.beautify("Never Give up!",(string) -> "ABC." + string + ".ABC");
        poemBeautifier.beautify("Don't Worry, Be Happy", (string) -> string.toUpperCase());
        poemBeautifier.beautify("Once upon a midnight dreary, while I pondered, weak and weary,",
                (string) -> "*** " + string + " ***");
        poemBeautifier.beautify("Over many a quaint and curious volume of forgotten lore -", (string) -> string + " :)");
        poemBeautifier.beautify("While I nodded, nearly napping, suddenly there came a tapping,", (string) -> "..." + string + "...");
        poemBeautifier.beautify("As of some one gently rapping, rapping at my chamber door.", (string) -> "_ " + string + " _");

        System.out.println("\nUsing stream to generate even numbers from 1 to 20:");
        NumbersGenerator.generateEven(20);

    }
}

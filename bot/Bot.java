package bot;

public class Bot {
    private final String name;
    private final String yearOfCreation;

    public Bot(String name, String yearOfCreation) {
        this.name = name;
        this.yearOfCreation = yearOfCreation;
    }

    public void askForName() {
        System.out.println("Please, remind me your name.");
        String name = UserInterface.inputString();
        System.out.printf("What a great name you have, %s!\n", name);
    }

    public void askForAge() {
        System.out.print("""
                Let me guess your age.
                Enter remainders of dividing your age by 3, 5 and 7.
                """);
        int rem3 = UserInterface.inputPositiveNumberOrZero();
        int rem5 = UserInterface.inputPositiveNumberOrZero();
        int rem7 = UserInterface.inputPositiveNumberOrZero();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.printf("Your age is %d; that's a good time to start programming!\n", age);
    }

    public void askForNumberToCountTo() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = UserInterface.inputPositiveNumber();
        for (int i = 0; i <= number; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public void askForQuestion() {
        System.out.print("""
                Let's test your programming knowledge.
                Why do we use methods?
                1. To repeat a statement multiple times.
                2. To decompose a program into several small subroutines.
                3. To determine the execution time of a program.
                4. To interrupt the execution of a program.
                """);
        while (true) {
            String answer = UserInterface.inputString();
            if (answer.equals("2")) {
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
        System.out.println("Congratulations, have a nice day!");
    }

    @Override
    public String toString() {
        return """
                Hello! My name is %s.
                I was created in %s.""".formatted(this.name, this.yearOfCreation);
    }
}


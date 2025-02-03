package bot;

public class SimpleBot {

    public static void main(String[] args) {
        Bot bot = new Bot("Aid", "2023");
        System.out.println(bot);
        bot.askForName();
        bot.askForAge();
        bot.askForNumberToCountTo();
        bot.askForQuestion();
    }
}

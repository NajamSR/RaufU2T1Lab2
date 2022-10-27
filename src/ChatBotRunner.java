public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot chatter = new ChatBot("Siri", 2010);
        chatter.greeting("Najam");
        chatter.weather();
        chatter.favoriteNumber(15);
        System.out.println(chatter.convertFeetToMeters(5));
        System.out.println(chatter.addNumbers(15, 2010, -6));
        System.out.println(chatter.goodbye());
    }
}

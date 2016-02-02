package test;

public class VarArgs {
    public static void showMessages(String ... messages) {
        for (int i = 0; i < messages.length; i++) {
            String s = messages[i];
            System.out.println("> " + s);
        }
    }
    
    public static void main(String [] args) {
//        String [] messages = { "Hello", "Bonjour", "Wilkommen" };
        showMessages("Hello", "Bonjour", "Wilkommen", "What?");
    }
}

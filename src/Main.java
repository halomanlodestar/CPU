import parser.Token;

public class Main {
    public static void main(String[] args) {
        Memory memory = new Memory(1024);

        Token token = new Token("1 2 3 4 5");
        byte[] bytes = token.getBytes();

        memory.write(0, bytes);

        System.out.println(memory);
    }
}

package parser;

public class Token {

    private final String instruction;
    private String[] tokens;

    public Token(String instruction) {
        this.instruction = instruction;
        tokenize();
    }

    public byte[] getBytes() {
        return toByte();
    }

    private void tokenize() {
        tokens = instruction.split(" ");
    }

    private byte[] toByte() {
        byte[] bytes = new byte[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            bytes[i] = Byte.parseByte(tokens[i]);
        }

        return bytes;
    }

}

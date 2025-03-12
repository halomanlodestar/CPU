public class Memory {
    byte[] memory;

    public Memory(int memorySize) {
        int cellCount = memorySize / 8;
        memory = new byte[cellCount];

    }

    public byte read(int address) {
        return memory[address];
    }

    public void write(int address, byte value) {
        memory[address]=value;
    }

    public void write(int address, byte[] bytes) {
        System.arraycopy(bytes, 0, memory, 0, bytes.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b : memory) {
            sb.append(b);
            sb.append(" ");
        }
        return sb.toString();
    }
}

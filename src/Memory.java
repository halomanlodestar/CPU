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

}

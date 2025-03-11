public class Memory {
    byte[] memory;

    public Memory(int memorySize) {
        int cellCount = memorySize / 8;
        memory = new byte[cellCount];
    }
}

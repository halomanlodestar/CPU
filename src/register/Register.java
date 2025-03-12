package register;

public abstract class Register {
    protected byte[] register;

    public Register() {
        register = new byte[8];
    }

    public void methodFromRegister() {}
}

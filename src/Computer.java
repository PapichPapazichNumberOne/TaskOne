public class Computer implements Lockable {
    private boolean locked;
    private String password;

    public Computer(String password) {
        this.password = password;
    }

    public void start() {
        System.out.println("The computer is starting");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void lock() {
        locked = true;
        System.out.println("The computer is locked");
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean tryPassword(String password) {
        if (!locked) {
            System.out.println("The computer is not locked");
            return false;
        }
        if (this.password.equals(password)) {
            System.out.println("The password is correct");
            return true;
        } else {
            System.out.println("The password is incorrect");
            return false;
        }
    }

    public Lockable getLockable() {
        return new Lockable() {
            @Override
            public void lock() {
                System.out.println("The computer is locked with a password");
            }
        };
    }
}
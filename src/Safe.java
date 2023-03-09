public class Safe implements Lockable {
    private boolean locked;
    private String password;

    public Safe(String password) {
        this.password = password;
    }

    public void open() {
        System.out.println("The safe is opened");
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void lock() {
        locked = true;
        System.out.println("Сейф заперт");
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean tryPassword(String password) {
        if (!locked) {
            System.out.println("Сейф не заперт");
            return false;
        }
        if (this.password.equals(password)) {
            System.out.println("Пароль правильный");
            return true;
        } else {
            System.out.println("Неправильный пароль");
            return false;
        }
    }
    public Lockable getLockable() {
        return new Lockable() {
            @Override
            public void lock() {
                System.out.println("Сейф заперт на кодовый замок");
            }
        };
    }
}
public class House implements Lockable {
    private boolean locked;

    public void openDoor() {
        System.out.println("The door of the house is opened");
    }

    @Override
    public void lock() {
        locked = true;
        System.out.println("Дом заперт");
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public void breakIn() {
        if (!locked) {
            System.out.println("Кто-то вломился в дом!");
        } else {
            System.out.println("Дом заперт");
        }
    }

    public Lockable getLockable() {
        return new Lockable() {
            @Override
            public void lock() {
                System.out.println("Дом запирается на ключ");
            }
        };
    }
}
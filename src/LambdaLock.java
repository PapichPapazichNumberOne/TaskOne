public class LambdaLock {
    public static void main(String[] args) {
        House house = new House();
        Safe safe = new Safe("4444");
        Computer computer = new Computer("Aboba");
        Lockable lockable = () -> System.out.println("Блокировка активирована");
        house.lock();
        safe.lock();
        computer.lock();
        lockable.lock();

    }
}
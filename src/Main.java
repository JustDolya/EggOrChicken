public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Создаем поток для "Курицы"
        Thread chickenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Курица");
            }
        });

        // Создаем поток для "Яйца"
        Thread eggThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Яйцо");
            }
        });

        // Запускаем потоки
        chickenThread.start();
        eggThread.start();

        // Ждем завершения потоков с использованием метода join()
        chickenThread.join();
        eggThread.join();

        // Проверяем, какой поток завершился последним
        if (!chickenThread.isAlive()) {
            System.out.println("Спор выиграла Курица!");
        } else if (!eggThread.isAlive()) {
            System.out.println("Спор выиграло Яйцо!");
        }
    }
}

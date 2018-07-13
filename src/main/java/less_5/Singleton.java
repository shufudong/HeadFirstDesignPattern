package less_5;

/**
 * 使用“双重检查加锁”机制实现的单例模式
 * @author shufd
 * @version 1.0
 * @date 2018-2-23 1:10
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
    }
}

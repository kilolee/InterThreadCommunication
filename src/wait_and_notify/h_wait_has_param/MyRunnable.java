package wait_and_notify.h_wait_has_param;

/**
 * 调用wait(long),等待某一时间内是否有线程对锁进行唤醒，如果等待超时则自动唤醒
 * Created by kilo on 2019/7/8.
 */
public class MyRunnable {
	static private Object lock = new Object();
	static private Runnable waitThread = new Runnable() {
		@Override
		public void run() {
			try {
				synchronized (lock) {
					System.out.println("wait begin timer="
							+ System.currentTimeMillis());
					lock.wait(5000);
					System.out.println("wait   end timer="
							+ System.currentTimeMillis());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	static private Runnable notifyThread = new Runnable() {
		@Override
		public void run() {
			synchronized (lock) {
				System.out.println("notify begin timer="
						+ System.currentTimeMillis());
				lock.notify();
				System.out.println("notify   end timer="
						+ System.currentTimeMillis());
			}
		}
	};

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(waitThread);
		t1.start();

//		未超时等待
//		Thread.sleep(3000);
//		Thread t2 = new Thread(notifyThread);
//		t2.start();
	}

}

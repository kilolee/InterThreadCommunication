package threadLocal.b_isolation;

/**
 * 验证线程变量的隔离性
 */
public class Main {

	public static void main(String[] args) {

		try {
			ThreadA a = new ThreadA();
			ThreadB b = new ThreadB();
			a.start();
			b.start();

			for (int i = 0; i < 100; i++) {
					Tools.tl.set("Main" + (i + 1));
					System.out.println("Main get Value=" + Tools.tl.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

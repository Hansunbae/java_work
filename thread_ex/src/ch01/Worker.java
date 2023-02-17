package ch01;

class Worker extends Thread {
	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분
	// start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run메서드 안에 있는 부분을 수행 시킨다. -- 약속
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker " + name + " : " + i + "\t" + Thread.currentThread());
			try {
				Thread.sleep(200); // 스태틱 메서드?
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end of run

}

package this_is_java_2;

public class S1_multi_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ThreadExample {
	public static void main(String[] args) {
		//스레드 생성 방법 1. 스레드 클래스를 상속받은 클래스의 객체를 대입
		Thread thread1 = new MovieThread();
		thread1.start();
		
		//스레드 생성 방법 2. Runnable 인스턴스를 상속받은 클래스를 Thread의 매개값으로 대입.
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		for(int i =0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
		}
	}
}

class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for(int i =0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {}
		}
	}
}

//

class ThreadExample1 {
	public static void main(String[] args) {
		Thread thread = new MovieThread1();
		thread.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		
		thread.interrupt();
	}
}

class MovieThread1 extends Thread{
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("동영상을 재생합니다.");
			Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("시스템 종료.");
		}
	}
}

/** 
 * 멀티 프로세스
 * - 애플리케이션 단위의 멀티태스킹
 * 멀티 스레드
 * - 애플리케이션 내부에서의 멀티태스킹
 * 
 * Thread 객체 생성
 * 1.
 * - 인터페이스인 Runnable을 매개값으로 갖는 생성자 호출이 필요하다.
 * - Thread thread = new Thread(Runnable target)
 * - Runnable은 구현 객체(run(){})를 만들어 대입해야 한다(오버라이딩).
 * - Runnable은 작업 내용을 지닌 객체일 뿐이다. 반드시 Runnable을 매개값으로 한 생성자를 호출해야 Thread를 생성할 수 있다.
 * 2.
 * - Thread 클래스를 상속한 후 run() 메소드를 오버라이딩하는 것이 필요하다.
 * 
 * 스레드 우선순위(MAX_PRIORITY=10, MIN_PRIORITY=1)
 * - Priority: 우선순위
 * - setPriority(우선순위(디폴트 5));
 * - Round_Robin
 * - 자바 자체에서 각 스레드의 실행 시간을 제한해 실행시키도록 한다.
 * 
 *  Critical_section: 임계 영역
 *  - 단 하나의 스레드만 실행 가능한 영역.
 *  Synchronized: 동기화
 *  - 임계 영역을 지정하기 위한 메소드, 블록.
 *  - 스레드가 동기화 메소드, 블록에 들어가면 즉시 잠금상태로 만들어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 한다.
 *  
 *  스레드 상태
 *  - new > start() >  Runnable > TIME_WAITING > Runnable > TERMINATED
 *  
 *  스레드 상태 제어
 *  1. Thread methods
 *  sleep(): 호출한 스레드 주어진 시간동안 일시 정지.
 *  yield(): 다른 스레드에게 실행 양보.
 *  join(): 다른 스레드의 종료를 기다림.
 *  
 *  2. Object methods
 *  - 동기화 블록 내에서만 실행 가능하다.
 *  wait(): 현재 스레드 일시 정지.
 *  notify(): 일시 정지 상태에 있는 스레드 실행 대기 상태로 전환.
 *  notifyAll(): 일시 정지 상태에 있는 모든 스레드 실행 대기 상태로 전환.
 *  
 *  스레드의 안전한 종료
 *  - interrupt(): 스레드가 일시 정지 상태가 되면 InterruptedExaption을  발생시킨다.
 *  - interrupted(): 정적 메소드, interrupt()가 호출되면 true 리턴.
 *  - isInterrupted(): 인스턴스 메소드, interrupt()가 호출되면 true 리턴.
 *  
 *  데몬 스레드
 *  - 주 스레드를 보조하는 보조 스레드.
 *  - .setDaemon(true) 호출 > 데몬 스레드로 설정.
 *  
 *  스레드 그룹
 *  - 같은 스레드 그룹에 속한 스레드들에 일괄적으로 interrupt() 등을 실행할 수 있다.
 *  - 하지만 일괄적으로 예외 처리를 할 수 없기에 개별 스레드에서 예외 처리가 필요하다.
 *  - 스레드 그룹 이름 얻기: ThreadGroup group = Thread.currentThread().getThreadGroup();
 *  - 스레드 그룹 이름 얻기: String groupName = group.getName();
 *  
 *  스레드풀
 *  - 작업에 사용되는 스레드의 개수를 제한함.
 *  1. 스레드풀 생성
 *  - ExecutorService 구현 객체를 생성해야 한다.
 *  - Executors 클래스의 메소드
 *  > newCachedThreadPool()
 *  > newFixdedThreadPool(int n Threads) - n Threads: 최대 스레드 수.
 *  2. 스레드풀 종료
 *  - shutdown: 남아있는 작업 완료 후 종료.
 *  - shutDownNow: 즉시 강제 종료.
 *  3. 작업 생성
 *  - Runnable: 리턴값 없음. > submit()
 *  - Callable<T>: 리턴값 있음. > submit()
 *  4. 블로킹 방식의 작업 완료 통보
 *  - submit()
 *  > 매개값을 작업 큐에 저장하고 즉시 Future 객체를 리턴한다.
 *  - Future: 작업이 완료될 때까지 기다렸다가 처리 결과를 리턴한다.
 *  5. 작업 처리 결과를 외부 객체에 저장
 *  - submit(Runnable task, V result) > Future(V) 리턴.
 */



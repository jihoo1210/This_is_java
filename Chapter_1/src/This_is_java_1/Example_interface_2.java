package This_is_java_1;

public class Example_interface_2 {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}

interface DataAccessObject {
	// 인테페이스는 기본적으로 public 추상 메소드를 가진다.
	void select();
	void insert();
	void update();
	void delete();
}

class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	};
	@Override
	public void insert(){
		System.out.println("Oracle DB에서 삽입");
	};
	@Override
	public void update(){
		System.out.println("Oracle DB에서 수정");
	};
	@Override
	public void delete(){
		System.out.println("Oracle DB에서 삭제");
	};
}

class MySqlDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	};
	@Override
	public void insert(){
		System.out.println("MySql DB에서 삽입");
	};
	@Override
	public void update(){
		System.out.println("MySql DB에서 수정");
	};
	@Override
	public void delete(){
		System.out.println("MySql DB에서 삭제");
	};
}

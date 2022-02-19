package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Ana"));
		System.out.println(dao.incluir(sql, "Bia"));
		System.out.println(dao.incluir(sql, "Gui"));
		
		dao.close();
	}
}

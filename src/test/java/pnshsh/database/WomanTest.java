package pnshsh.database;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import pnshsh.database.bean.Woman;
import pnshsh.database.util.DatabaseUtil;
import pnshsh.database.util.StringUtil;

public class WomanTest {

	@Test
	public void addTest() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.womanMapper.addWoman";
		String queryStmt = "pnshsh.database.mapping.womanMapper.getLastId";
		String unitNO = "001";
		System.out.println("数据添加开始...");
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			String lastId = session.selectOne(queryStmt);
			String next = StringUtil.intToString(Long.parseLong(lastId.substring(3))+1, 16);
			String ID = unitNO + next;
			Woman woman = new Woman(ID, "qinyuan000");
			session.insert(statement, woman);
        }
		session.commit();
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("添加完成，共用时"+expend+"毫秒");
	}
	
	
	@Test
	public void testQuery() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.womanMapper.getWoman";
		long start = System.currentTimeMillis();
		String name = session.selectOne(statement, "0010000000000005013");
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("查找完成，结果为"+name+"，共用时"+expend+"毫秒");
	}
	
	@Test
	public void testQueryList() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.womanMapper.getWomanList";
		long start = System.currentTimeMillis();
		session.selectList(statement,5013L);
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("查找完成，共用时"+expend+"毫秒");
	}
}

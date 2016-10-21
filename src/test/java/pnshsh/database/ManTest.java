package pnshsh.database;



import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import pnshsh.database.util.DatabaseUtil;

public class ManTest {
	
	@Test
	public void testAdd() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.manMapper.addMan";
		System.out.println("数据添加开始...");
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
        	session.insert(statement,"qinyuan001");
        }
		session.commit();
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("添加完成，共用时"+expend+"毫秒");
	}
	
	@Test
	public void testQuery() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.manMapper.getMan";
		long start = System.currentTimeMillis();
		String name = session.selectOne(statement, 1000000000000005013L);
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("查找完成，结果为"+name+"，共用时"+expend+"毫秒");
	}
	
	@Test
	public void testQueryList() {
		SqlSession session = DatabaseUtil.getSession();
		String statement = "pnshsh.database.mapping.manMapper.getManList";
		long start = System.currentTimeMillis();
		session.selectList(statement,5013L);
		long end = System.currentTimeMillis();
		long expend = end - start;
		System.out.println("查找完成，共用时"+expend+"毫秒");
	}
}

package pnshsh.database;

import org.apache.ibatis.session.SqlSession;

import pnshsh.database.util.DatabaseUtil;

public class App 
{
    public static void main( String[] args )
    {
    	
        SqlSession session = DatabaseUtil.getSession();
        /**
         * 映射sql的标识字符串，
         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
         */
        /*String statement = "pnshsh.database.mapping.manMapper.getMan";//映射sql的标识字符串
        //执行查询返回一个唯一user对象的sql
        String name = session.selectOne(statement, 1000000000000000002L);
        System.out.println(name);*/
        
        
        /*
         * 为man表构造数据
         */
        String addStat = "pnshsh.database.mapping.manMapper.addMan";
        for(int i=0; i<10000; i++) {
        	session.insert(addStat,"qinyuan001");
        }
        session.commit();
        session.close();
    }
    
}

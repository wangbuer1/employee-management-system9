package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class BaseDao {

	public static String driver="com.mysql.jdbc.Driver";
	public static String url="jdbc:mysql:///ks?characterEncoding=utf-8";
	public static String username="root";
	public static String pwd="root";
	static Connection conn=null;
	static Statement sm=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	//��ʼ�������캯�� (��ʹ������ˣ�Ϊ������ֻ����һ��)
	//ʹ�þ�̬�飬��̬���еĴ���ִֻ��һ�Σ���̬����ֻ���Ǿ�̬��Ա
	public BaseDao() {
		try {
			// 1.����������1��������������2�����������ַ���
			Class.forName(driver);
			//2.��������
			if(conn==null||conn.isClosed())
			conn=DriverManager.getConnection(url, username, pwd);
			//3.ִ��SQL���
			sm=conn.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   


	//��ѯ
	public ResultSet getResultSet(String sql,Object param[]){//sql��̬����?ռλ��param[]�����б�
		try {
			ps=(PreparedStatement) conn.prepareStatement(sql);
			if(param!=null){
				for(int i=0;i<param.length;i++){
					ps.setObject(i+1, param[i]);//������������������
				}
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
    //��������
    public int executeUpdata(String sql, List<Object> list){        
        try {
            ps = conn.prepareStatement(sql);
            if(list == null)
                return ps.executeUpdate();
            int i = 1;
            for(Object obj:list){
                ps.setObject(i, obj);
                i++;
            }
            return ps.executeUpdate();
        } catch (SQLException e) {            
            e.printStackTrace();
        }finally{
           // closeResource();
        }
        return 0;
    }
    
    //�ر���
    protected void closeResource(){        
    try {
        if(rs != null)
            rs.close();
        if(ps != null)
            ps.close();
        if(conn != null)
            conn.close();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
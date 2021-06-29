import com.yaozhou.dao.UserDao;
import com.yaozhou.pojo.User;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/30 0:45
 */
public class UserTest {
    @Test
    public void Test1(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
        //关闭sqlsession流
        sqlSession.close();
    }
}
import com.yaozhou.dao.UserMapper;
import com.yaozhou.pojo.User;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
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
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user.getUserName());
        }
        //关闭sqlsession流
        sqlSession.close();
    }
    @Test
    public void add(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        User user = new User();
        user.setUserName("潘安");
        user.setUserPassword("1234557");
        user.setId(9);
        mapper.addUser(user);
        sqlSession.commit();
        //关闭sqlsession流
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        User user = new User();
        user.setUserName("test");
        user.setAddress("大石王川");
        user.setId(2);
        mapper.updateUserById(user);
        sqlSession.commit();
        //关闭sqlsession流
        sqlSession.close();
    }
    @Test
    public void delUserById(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
       mapper.delUserById(9);
        sqlSession.commit();
        //关闭sqlsession流
        sqlSession.close();
    }
    @Test
    public void getUserListLike(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        List<User> userList = mapper.getUserListLike("孙");
        for (User user : userList) {
            System.out.println(user.getUserName());
        }

        //关闭sqlsession流
        sqlSession.close();
    }
}
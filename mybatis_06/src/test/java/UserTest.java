import com.yaozhou.dao.TeacherMapper;
import com.yaozhou.pojo.Teacher;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/30 0:45
 */
public class UserTest {
    static Logger logger = Logger.getLogger(UserTest.class);
    @Test
    public void Test1() {
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //getMapper
        //方法1：
        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
        //方法2：
        //List<User> userList = sqlSession.selectList("com.yaozhou.dao.UserDao.getUserList");
        List<Teacher> teacher = teacherMapper.getTeachetById(1);
        System.out.println(teacher);
        //关闭sqlsession流
        sqlSession.close();
    }
}
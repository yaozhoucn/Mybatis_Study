import com.yaozhou.dao.UserMapper;
import com.yaozhou.pojo.User;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/5 10:49
 * Desc：
 */
public class Mybatis05_Test {
    @Test
    public void test01(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList2 = mapper.getUserList2();
        for (User user : userList2) {
            System.out.println(user.getAddress());
        }
        sqlSession.close();
    }
}

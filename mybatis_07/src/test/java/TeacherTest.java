import com.yaozhou.dao.TeacherMapper;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by WXHang on HANG at 2021/7/6 10:43
 * Desc：
 */
public class TeacherTest {
    @Test
    public void getTeacherList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        System.out.println(mapper.getTeacherAndAtudent2(1));
        sqlSession.close();
    }
}

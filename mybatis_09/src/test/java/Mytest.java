import com.yaozhou.dao.BlogMapper;
import com.yaozhou.pojo.Blog;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by WXHang on HANG at 2021/7/6 16:20
 * Desc：
 */
public class Mytest {
    @Test
    public void quertBlogById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.quertBlogById(1);
        sqlSession.close();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        BlogMapper mapper2 = sqlSession2.getMapper(BlogMapper.class);
        Blog blog2 = mapper2.quertBlogById(1);
        System.out.println(blog2);
        System.out.println(blog == blog2);
        sqlSession2.close();
    }
}

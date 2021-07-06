import com.yaozhou.dao.BlogMapper;
import com.yaozhou.pojo.Blog;
import com.yaozhou.utils.IDUtils;
import com.yaozhou.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/6 12:41
 * Desc：
 */
public class BlogTest {
    @Test
    public void getBlogTest1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);
        blog.setId(IDUtils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);
        blog.setId(IDUtils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        //HashMap map = new HashMap();
       map.put("title","Mybatis如此简单");
       map.put("author","尧神");
       //map.put("views",10001);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void getBlog(){
        HashMap<String, Object> map = new HashMap<String, Object>();
        //HashMap map = new HashMap();
        map.put("title","Mybatis如此简单");
        map.put("author","尧神");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList = mapper.getBlog(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.commit();
        sqlSession.close();

    }
    @Test
    public void queryBlogByForEach(){
        HashMap map = new HashMap();
        //HashMap map = new HashMap();
        List ids = new ArrayList();
//        ids.add(0,1);
//        ids.add(1,2);
//        ids.add(2,3);
//        ids.add(3,4);
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        map.put("ids",ids);
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogList = mapper.queryBlogByForEach(map);
        for (Blog blog : blogList) {
            System.out.println(blog);
        }
        sqlSession.commit();
        sqlSession.close();

    }
}

import dao.IUserDao;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ranhuo.vt.edu.MapperProxyFactory;

import java.util.HashMap;
import java.util.Map;
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_MapperProxyFactory(){
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        Map<String,String> sqlSession = new HashMap<>();
        sqlSession.put("dao.IUserDao.queryUserName", "模拟查找姓名");
        IUserDao userDao = factory.newInstance(sqlSession);
        String res = userDao.queryUserName("1001");
        logger.info(res);
    }
}

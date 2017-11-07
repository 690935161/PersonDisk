package disktest;

import java.util.List;

import javax.annotation.Resource;

import org.hfly.app.persondisk.domain.User;
import org.hfly.app.persondisk.domain.UserExample;
import org.hfly.app.persondisk.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-database.xml" })
public class MainTest
{
	@Resource
	UserMapper userMapper;

	@Test
	public void test()
	{
		List<User> users = userMapper.selectByExample(new UserExample());
		for (User u : users)
		{
			System.out.println(u);
		}
	}

}

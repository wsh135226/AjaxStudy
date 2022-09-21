package wsh.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wsh.test.mapper.UserMapper;
import wsh.test.pojo.User;

import java.util.List;

@SpringBootTest
class LoginDemoApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
		/*QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.select("name");
		List<User> list = userMapper.selectList(queryWrapper);
		list.forEach(System.out::println);*/
		/*User name = userMapper.getName("Jone");
		System.out.println(name);*/
	}

}

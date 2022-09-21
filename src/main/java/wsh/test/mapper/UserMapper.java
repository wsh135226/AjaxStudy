package wsh.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import wsh.test.pojo.User;

/**
 * @author:wsh
 * @date 2022/9/20 15:45
 * return
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    //根据用户名称查询用户信息
    @Select("select name,password from user where name = #{name}")
    String getName(@Param("name") String name);

}

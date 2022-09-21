package wsh.test.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author:wsh
 * @date 2022/9/20 15:45
 * return
 */
@Data
public class User {

    @TableId
    private Long id;

    private String name;

    private Integer age;

    private String email;

    private Integer password;
}

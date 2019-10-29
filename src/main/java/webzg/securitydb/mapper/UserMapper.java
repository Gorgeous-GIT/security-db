package webzg.securitydb.mapper;

import org.apache.ibatis.annotations.Mapper;
import webzg.securitydb.bean.Role;
import webzg.securitydb.bean.User;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/10/29 0029
 * @Version V1.0
 **/
@Mapper
public interface UserMapper {
    User loadUserByUsername(String username);

    List<Role> getUsersById(Integer id);
}

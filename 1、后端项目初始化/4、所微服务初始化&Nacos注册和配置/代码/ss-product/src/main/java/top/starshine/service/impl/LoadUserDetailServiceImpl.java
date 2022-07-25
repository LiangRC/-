package top.starshine.service.impl;

import org.springframework.stereotype.Service;
import top.starshine.commons.entity.user.User;
import top.starshine.commons.model.token.LoadUserDetailService;

/**
 * <h3>令牌用户加载</h3>
 *
 * @author: starshine
 * @email: 183101655@qq.com
 * @version: 1.0
 * @since: 2022/7/24  下午 9:37  周日
 * @Description: hello world
 */
@Service
public class LoadUserDetailServiceImpl implements LoadUserDetailService {

    @Override
    public User getById(String id) {
        return new User();
    }

}

package top.dingjm.zhxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.dingjm.zhxy.mapper.AdminMapper;
import top.dingjm.zhxy.pojo.Admin;
import top.dingjm.zhxy.service.AdminService;

@Service("adminServiceImpl")
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {

}

package top.dingjm.zhxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.dingjm.zhxy.mapper.ClazzMapper;
import top.dingjm.zhxy.pojo.Clazz;
import top.dingjm.zhxy.service.ClazzService;

@Service("clazzServiceImpl")
@Transactional
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {
}

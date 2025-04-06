package top.dingjm.zhxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.dingjm.zhxy.mapper.GradeMapper;
import top.dingjm.zhxy.pojo.Grade;
import top.dingjm.zhxy.service.GradeService;

@Service("gradeServiceImpl")
@Transactional
public class GradeServiceImpl extends ServiceImpl<GradeMapper, Grade> implements GradeService {
}

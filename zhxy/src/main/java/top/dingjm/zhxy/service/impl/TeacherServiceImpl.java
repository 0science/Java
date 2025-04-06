package top.dingjm.zhxy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.dingjm.zhxy.mapper.TeacherMapper;
import top.dingjm.zhxy.pojo.Teacher;
import top.dingjm.zhxy.service.TeacherService;

@Service("teacherServiceImpl")
@Transactional
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {

}

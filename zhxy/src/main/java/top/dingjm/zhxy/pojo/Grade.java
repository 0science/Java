package top.dingjm.zhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_grade")
public class Grade {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private Integer name;
    private String manager;
    private String email;
    private String telephone;
    private String introducation;
}

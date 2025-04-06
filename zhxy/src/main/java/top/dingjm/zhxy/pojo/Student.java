package top.dingjm.zhxy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_student")
public class Student {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sno;
    private Character gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String introducation;
    private String clazzName;
    private String portraitPath; //头图路径
}

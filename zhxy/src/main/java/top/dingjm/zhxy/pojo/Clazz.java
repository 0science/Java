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
@TableName("tb_clazz")
public class Clazz {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    private String name;
    private Number number;
    private String headmaster;
    private String introducation;
    private String email;
    private String telephone;
    private String gradeName;
}

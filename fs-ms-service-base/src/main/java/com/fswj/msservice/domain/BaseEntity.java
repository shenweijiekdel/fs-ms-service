package com.fswj.msservice.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author fswj
 * @version : BaseEntity, v 0.1 2020/2/23 下午9:12 fswj Exp$
 */
@Data
@Accessors(chain = true)
public class BaseEntity {
    @TableId
    private Long id;
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateDate;
    private Integer deleted;
}

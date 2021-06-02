package com.forever.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lin
 * @since 2021-05-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Tag对象", description="")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "//标签id")
    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    @ApiModelProperty(value = "//标签名称")
    private String tagName;

    @ApiModelProperty(value = "//创建时间")
    private Date createTime;

    @ApiModelProperty(value = "//更新时间")
    private Date updateTime;


}

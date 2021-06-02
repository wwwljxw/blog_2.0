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
@ApiModel(value="FriendLink对象", description="")
public class FriendLink implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友链主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "链接名")
    private String linkName;

    @ApiModelProperty(value = "链接头像")
    private String linkAvatar;

    @ApiModelProperty(value = "链接地址")
    private String linkAddress;

    @ApiModelProperty(value = "链接简介")
    private String linkIntro;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}

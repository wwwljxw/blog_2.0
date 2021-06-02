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
@ApiModel(value="Message对象", description="")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "//ip")
    private String ipAddress;

    @ApiModelProperty(value = "//ip地理位置")
    private String ipSource;

    @ApiModelProperty(value = "//昵称")
    private String nickname;

    @ApiModelProperty(value = "//头像")
    private String avatar;

    @ApiModelProperty(value = "//留言内容")
    private String messageContent;

    @ApiModelProperty(value = "//弹幕速度")
    private Boolean time;

    @ApiModelProperty(value = "//发布时间")
    private Date createTime;


}

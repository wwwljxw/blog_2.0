package com.forever.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

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
@ApiModel(value="UserLogin对象", description="")
public class UserLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_login_id", type = IdType.AUTO)
    private Integer userLoginId;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "登录的ip地址")
    private String ipAddress;

    @ApiModelProperty(value = "ip地址来源")
    private String ipSources;

    @ApiModelProperty(value = "登录类型")
    private String loginType;

    @ApiModelProperty(value = "登录时间")
    private Date loginTime;

    @ApiModelProperty(value = "上次登录时间")
    private Date lastLoginTime;

    @ApiModelProperty(value = "登录头像")
    private String avatar;

    @ApiModelProperty(value = "用户角色")
    private String roleName;


}

package com.forever.blogserver.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName UserDTO
 * @Description
 * @Author Lin
 * @Date 2021/6/2 23:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户表主键")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "0:可用  1：逻辑删除")
    private Boolean isDelete;

    @ApiModelProperty(value = "0：不禁言  1：禁言")
    private Boolean isSilence;
}

package com.forever.blogserver.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserQueryVO
 * @Description
 * @Author Lin
 * @Date 2021/6/2 23:26
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryVO {
    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "角色名")
    private String roleName;
}

package com.forever.blogserver.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName UserQueryVO
 * @author Lin
 * @date 2021/6/5 14:36
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryVO {

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "第几页")
    private Integer current;

    @ApiModelProperty(value = "每页数据数量")
    private Integer size;
}

package com.forever.blogserver.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName RoleDTO
 * @Description
 * @Author Lin
 * @Date 2021/6/3 11:05
 **/
@Data
public class RoleDTO {

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty("角色个数")
    private Integer total;
}

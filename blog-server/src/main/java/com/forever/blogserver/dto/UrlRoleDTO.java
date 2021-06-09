package com.forever.blogserver.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName UrlRoleDTO
 * @Description
 * @Author Lin
 * @Date 2021/6/9 16:03
 **/
@Data
public class UrlRoleDTO {


    @ApiModelProperty(value = "API ID")
    private Integer id;

    @ApiModelProperty(value = "路径")
    private String url;

    @ApiModelProperty(value = "请求方式")
    private String requestMethod;

    @ApiModelProperty(value = "角色名")
    private String roleName;
}

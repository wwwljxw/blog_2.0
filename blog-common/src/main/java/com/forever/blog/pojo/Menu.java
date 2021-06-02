package com.forever.blog.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
@ApiModel(value="Menu对象", description="")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "//后台菜单id")
    @TableId(value = "menu_id", type = IdType.AUTO)
    private Integer menuId;

    @ApiModelProperty(value = "//菜单列表名字")
    private String menuName;

    @ApiModelProperty(value = "//菜单的url")
    private String menuUrl;

    @ApiModelProperty(value = "//菜单的父ID")
    private Integer parentId;

    @ApiModelProperty(value = "//菜单排序")
    private Integer menuSort;

    @ApiModelProperty(value = "//描述")
    private String description;

    @ApiModelProperty(value = "//按钮图标")
    private String menuIcon;

    @ApiModelProperty("//子级菜单列表")
    private List<Menu> children = new ArrayList<>();


}

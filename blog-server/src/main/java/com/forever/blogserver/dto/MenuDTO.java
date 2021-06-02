package com.forever.blogserver.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.forever.blog.pojo.Menu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName MenuDTO
 * @Description
 * @Author Lin
 * @Date 2021/6/1 16:08
 **/
@Data
public class MenuDTO {

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
    private List<MenuDTO> children;

    public MenuDTO isParent(Menu menu){
        this.menuId = menu.getMenuId();
        this.menuName = menu.getMenuName();
        this.menuUrl = menu.getMenuUrl();
        this.parentId = menu.getParentId();
        this.menuSort = menu.getMenuSort();
        this.description = menu.getDescription();
        this.menuIcon = this.getMenuIcon();
        return this;
    }
}

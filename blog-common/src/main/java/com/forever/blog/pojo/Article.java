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
@ApiModel(value="Article对象", description="")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "//文章主键id")
    @TableId(value = "article_id", type = IdType.AUTO)
    private Integer articleId;

    @ApiModelProperty(value = "//文章标题")
    private String articleTitle;

    @ApiModelProperty(value = "//文章内容")
    private String articleContent;

    @ApiModelProperty(value = "//文章封面")
    private String articleCover;

    @ApiModelProperty(value = "//分类id")
    private Integer categoryId;

    @ApiModelProperty(value = "//是否置顶 0：不置顶 1：置顶")
    private Boolean isTop;

    @ApiModelProperty(value = "//是否草稿 0：不是草稿 1:草稿")
    private Boolean isDraft;

    @ApiModelProperty(value = "//创建时间")
    private Date createTime;

    @ApiModelProperty(value = "//更新时间")
    private Date updateTime;


}

package com.forever.blogserver.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * @ClassName CodeGenerator
 * @Description MyBatisPlus代码生成器
 * @Author Lin
 * @Date 2021/5/26 16:14
 **/
public class CodeGenerator {
    public static void main(String[] args) {
        // 1、创建代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = "D:\\UserData\\Desktop\\project\\get-projiect\\blog_2.0\\blog-server";
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("Lin");
//        生成后是否打开资源管理器
        gc.setOpen(false);
//        重新生成时文件是否覆盖
        gc.setFileOverride(false);
//        去掉Service接口的首字母I
        gc.setServiceName("%sService");
        gc.setMapperName("%sDao");
//        主键策略
        gc.setIdType(IdType.ID_WORKER_STR);
//        定义生成的实体类中日期类型
        gc.setDateType(DateType.ONLY_DATE);
//        开启Swagger2模式
        gc.setSwagger2(true);
        gc.setXmlName("%sDao");

        mpg.setGlobalConfig(gc);

        // 3、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3307/blog?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("1111");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 4、包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("forever.blogserver/**/");
        pc.setParent("com");
        pc.setController("controller");
        pc.setEntity("pojo");
        pc.setService("service");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);

        // 5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        //设置要映射的表名（news）  如果是多个用逗号隔开("news","user")
        strategy.setInclude("about","api","article","article_tag","category","comment","friend_link","menu","message","role","role_api","role_menu","role_user","tag","user","user_login");
//        数据库表映射到实体的命名策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
//        数据库表字段映射到实体的命名策略
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        lombok 模型 @Accessors(chain = true) setter链式操作
        strategy.setEntityLombokModel(true);
//        restful api风格控制器
        strategy.setRestControllerStyle(true);
//        url中驼峰转连字符
        strategy.setControllerMappingHyphenStyle(true);

        mpg.setStrategy(strategy);

        // 6、执行
        mpg.execute();
    }
}

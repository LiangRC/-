# 公共项目初始



## 必须安装

- Nacos 2.x 以上
- RabbitMQ
- Redis
- MySql



## 创建包路径

> top.starshine.cloud.commons

需要注意的是，公共包必要比其他模块的包路径要多层，防止有冲突

## pom.xml 导入包

```xml
 <dependencies>

        <!--分布式锁，Redis版本 -->
        <dependency>
            <groupId>org.redisson</groupId>
            <artifactId>redisson</artifactId>
        </dependency>

        <!-- Ok http-->
        <dependency>
            <groupId>com.squareup.okhttp3</groupId>
            <artifactId>okhttp</artifactId>
        </dependency>

        <!--Rabbit MQ 消息管理-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-amqp</artifactId>
        </dependency>

        <!-- 服务健发现与注册 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
            <!-- 排除ribbon的依赖 -->
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!--上下文-->
        <dependency>
            <groupId>com.alibaba.spring</groupId>
            <artifactId>spring-context-support</artifactId>
        </dependency>

        <!--Dubbo RPC 远程调用 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-dubbo</artifactId>
        </dependency>

        <!-- 配置中 nacos -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
        </dependency>

        <!--最新的 alibabacloud 在加载 bootstrap.yml文件的会报错-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bootstrap</artifactId>
        </dependency>

        <!--pojo类偷懒注释支持-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>

        <!-- spring Boot web 包  -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- 测试工具包 -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <scope>test</scope>
        </dependency>

        <!--数据库驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>

        <!-- druid 德鲁伊 数据库链接池 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <!--排除-->
            <exclusions>
                <exclusion>
                    <groupId>com.sun</groupId>
                    <artifactId>tools</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>com.sun</groupId>
                    <artifactId>jconsole</artifactId>
                </exclusion>
            </exclusions>
        </dependency>

        <!--MyBatisPlus-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
        </dependency>

        <!-- Bean 转化使用工具类 -->
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <scope>compile</scope>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct-processor</artifactId>
        </dependency>

        <!-- @Test 注解 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
        </dependency>


        <!-- JR303校验 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- yml/yaml/properties 提示-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
        </dependency>

        <!-- JWT生成器 -->
        <dependency>
            <groupId>com.auth0</groupId>
            <artifactId>java-jwt</artifactId>
        </dependency>

        <!--日期和时间库-->
        <dependency>
            <groupId>joda-time</groupId>
            <artifactId>joda-time</artifactId>
        </dependency>

        <!-- Redis 缓存 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>

        <!--阿帕奇 http 请求-->
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
        </dependency>

        <!-- AOP 依赖 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>

        <!-- UserAgentUtils 解析请求中的信息 -->
        <dependency>
            <groupId>eu.bitwalker</groupId>
            <artifactId>UserAgentUtils</artifactId>
        </dependency>

    </dependencies>
```



## 公共模块包含如下

![image-20220725142458769](image-20220725142458769.png)



> 比较简单，所以略过，我已为大家准备好，在同级文件夹目录中




# SpringFramework 源码构建

## 一、GitHub 下载源码

源码地址： https://github.com/spring-projects/spring-framework.git 。

## 二、下载 Gradle（可选）

参考：https://www.qinweizhao.com/?p=25 。

## 三、导入 IntelliJ IDEA

预编译 spring-oxm。进入项目路径，执行以下命令编译命令：

```sh
gradlew :spring-oxm:compileTestJava
```

## 四、测试

创建 qwz-spring-test 模块

```java
package com.qinweizhao.test.bean;

import org.springframework.stereotype.Component;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
@Component
public class TestBean {

	public void test(){
		System.out.println("test 方法执行。。。");
	}
}

```

```java
package com.qinweizhao.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
@Configuration
@ComponentScan("com.qinweizhao.test.**")
public class ContextConfig {
}

```

```java
package com.qinweizhao.test;

import com.qinweizhao.test.bean.TestBean;
import com.qinweizhao.test.config.ContextConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qinweizhao
 * @since 2022/3/17
 */
public class TestMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
		TestBean testBean = (TestBean) context.getBean("testBean");
		testBean.test();

	}
}
```

```gradle
plugins {
    id 'java'
}

group 'com.qinweizhao'
version '5.3.17-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":spring-context"))
    implementation(project(":spring-instrument"))
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
}

test {
    useJUnitPlatform()
}
```

结果

```text
test 方法执行。。。
```


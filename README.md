## community

## 资料
[Spring 文档](https://spring.io/guides/gs/)
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[es](https://elasticsearch.cn/explore)
[BootStrap](https://v3.bootcss.com/getting-started/)
[Github Oauth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
[Spring](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/reference/html/spring-boot-features.html#boot-features-embedded-database-support)

## 工具
[Git](https://git-scm.com/downloads)
[Visual Paradigm](https://www.visual-paradigm.com/cn/download/)
[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

## 脚本
```sql
CREATE CACHED TABLE "PUBLIC"."USER"(
    "ID" INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    "ACCOUNT_ID" VARCHAR(100),
    "NAME" VARCHAR(50),
    "TOKEN" CHAR(36),
    "GMT_CREATE" BIGINT,
    "GMT_MODIFIED" BIGINT
);
```
```bash
mvn flyway:migrate
```
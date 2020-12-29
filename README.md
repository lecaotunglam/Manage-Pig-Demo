# Manage-Pig-Demo
#Tạo table 'pig' trong MySql
```sql
create table `pig`(
`id` int(11) not null auto_increment,
`pigid` varchar(45) not null,
`weight` varchar(45) not null,
`remain` varchar(45) not null,
`eat` varchar(45) not null,
primary key(`id`)
)engine=InnoDB auto_increment=1 default charset=utf8;
```

#Vào application.properties sửa datasource

spring.datasource.url=jdbc:mysql://localhost:3306/{tên của database sử dụng}?useUnicode=yes&characterEncoding=UTF-8&useSSL=false

spring.datasource.username=root

spring.datasource.password={password vào server trong MySql}

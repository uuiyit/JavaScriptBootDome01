//package com.example.javascriptbootdome01.SQL.JpaCache;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
///**
// * @author mrr
// * @date 2023/9/23 11:10
// * @description:
// */
//@Entity(name = "t_article")//设置ORM实体类，并指定映射的表名
//public class JpaArticle implements Serializable {
//    @Id //表明映射对应的主键id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)  //设置主键自增策略
//     @Column(name = "id") //指定映射的表名字段
//    private Integer id;
//    private String content;
//    private String title;
//
//
//
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public String toString() {
//        return "JpaArticle{" +
//                "content='" + content + '\'' +
//                ", title='" + title + '\'' +
//                ", id=" + id +
//                '}';
//    }
//
//}
//

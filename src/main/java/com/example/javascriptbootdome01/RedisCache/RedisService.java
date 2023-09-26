//package com.example.javascriptbootdome01.RedisCache;
//
//import com.example.javascriptbootdome01.SQL.jpa.Discuss;
//import com.example.javascriptbootdome01.SQL.jpa.DiscussRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.CachePut;
//import org.springframework.cache.annotation.Cacheable;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
///**
// * @author mrr
// * @date 2023/9/23 10:56
// * &#064;description:使用@Cacheable、@CachePut、@CacheEvict注解定制缓存管理
// */
//
//@Service
//public class RedisService {
//    @Autowired
//    private DiscussRepository mDiscussRepository;
//
//    //根据评论id查询评论信息
//    //@Cacheable(cacheNames = "comment")
//    @Cacheable(cacheNames = "comment",unless = "#result==null")
//    public Discuss findById(int comment_id){
//        Optional<Discuss> optional = mDiscussRepository.findById(comment_id);
//        if (optional.isPresent()){
//            return optional.get();
//        }
//        return null;
//    }
//
//    //更新评论信息
//    //2、把数据更新到Redis数据库，comment表
//    @CachePut(cacheNames = "comment",key = "#result.id")
//    public Discuss updateComment(Discuss comment){
//        //1、把数据更新到mysql数据库
//        mDiscussRepository.updateDiscuss(comment.getAuthor(), comment.getId());
//        return comment;
//    }
//
//    //删除评论信息
//    //2、删除Redis服务里面的comment表里面的数据
//    @CacheEvict(cacheNames = "comment")  //删除Redis服务器里面的comment表里面的数据
//    public void deleteComment(int comment_id){
//        //1、先去mysql数据库里面查id号是 comment_id的数据，在删除
//        mDiscussRepository.deleteDiscuss(comment_id);//只会删除mysql里面的数据
//    }
//}

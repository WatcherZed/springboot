package com.example.demo.design.proxy;

/**
 * @Description:代理查询类
 * @Author: lyk
 * @Date: 2020/10/30 19:26
 */
public class ProxySearcher implements Searcher{
    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;
    @Override
    public String doSearch(String userId, String keyword) {
        if (this.validate(userId)){
            String result = searcher.doSearch(userId,keyword);
            this.log(userId);
            return result;
        }
        return null;
    }
    public void log(String userId){
        logger = new Logger();
        logger.log(userId);
    }
    public boolean validate(String userId){
        validator = new AccessValidator();
        return validator.validate(userId);
    }
}

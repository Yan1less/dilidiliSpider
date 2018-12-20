package com.yan1less;

import com.yan1less.bean.Animate;
import com.yan1less.mapper.AnimateMapper;
import com.yan1less.utill.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class xx {
    @Test
    public void xxx() throws Exception {

        SqlSession sqlSession = null;

        try {
            sqlSession = SqlSessionFactoryUtil.openSession();

            AnimateMapper animateMapper = sqlSession.getMapper(AnimateMapper.class);
            Animate animate = new Animate();
            animate.setAnimate_id("5455");
            int res = animateMapper.InsertDatas(animate);
            System.out.println(res);
            sqlSession.commit();

        } catch (Exception e) {
            System.out.println(e);
            sqlSession.rollback();
        }finally{
            if(sqlSession != null){
                sqlSession.close();
            }
        }
    }

}
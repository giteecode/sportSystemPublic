package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.GuanggaoxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.GuanggaoxinxiView;


/**
 * 广告信息
 *
 * @author 
 * @email 
 * @date 2024-01-15 09:49:33
 */
public interface GuanggaoxinxiService extends IService<GuanggaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuanggaoxinxiView> selectListView(Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	GuanggaoxinxiView selectView(@Param("ew") Wrapper<GuanggaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuanggaoxinxiEntity> wrapper);
   	

}


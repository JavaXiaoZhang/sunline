
package cn.sunline.edsp.busi.MyDemo.serviceimpl;

import cn.sunline.ltts.demo.api.DemoTableOperate;

/**
  * 服务实现示例
  * 服务实现示例
  *
  */
@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyServiceImpl", longname="服务实现示例", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)
public class MyServiceImpl implements cn.sunline.edsp.busi.MyDemo.servicetype.MyService{
 /**
  * 插入示例
  *
  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoInsert.Output insertDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoInsert.Input input){
		DemoTableOperate.insert(input);
		return null;
		
	}
 /**
  * 更新示例
  *
  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoUpdate.Output updateDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoUpdate.Input input){
		DemoTableOperate.update(input);
		return null;
		
	}
 /**
  * 查询示例
  *
  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoSelect.Output selectDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoSelect.Input input){
		DemoTableOperate.select(input);
		return null;
		
	}
}


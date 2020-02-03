
package cn.sunline.edsp.busi.MyDemo.servicetype;
import cn.sunline.edsp.international.constant.InternationalConstantDef;
import cn.sunline.ltts.core.api.lang.IString;
import cn.sunline.ltts.core.api.lang.Params;
	 /**
	  * 服务类型示例
	  * 服务类型示例
	  */

@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyService", longname="服务类型示例", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.service)
public interface MyService {
	 /**
	  * 插入示例
	  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoInsert.Output insertDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoInsert.Input input);
	
	 /**
	  * 插入示例
	  */
	public static interface DemoInsert {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoInsert.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 插入参数
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="插入参数")
		public cn.sunline.edsp.busi.MyDemo.type.MyComplexType.MyComplexInfo getField();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoInsert.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 插入参数
	  */
		public void setField(cn.sunline.edsp.busi.MyDemo.type.MyComplexType.MyComplexInfo field);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoInsert.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoInsert.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 更新示例
	  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoUpdate.Output updateDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoUpdate.Input input);
	
	 /**
	  * 更新示例
	  */
	public static interface DemoUpdate {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoUpdate.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 职工号
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="职工号")
		public Long getUserno();
	 /**
	  * 薪资
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="薪资")
		public java.math.BigDecimal getSalary();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoUpdate.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 职工号
	  */
		public void setUserno(Long userno);
	 /**
	  * 薪资
	  */
		public void setSalary(java.math.BigDecimal salary);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoUpdate.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	

	}
	
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoUpdate.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
	 /**
	  * 查询示例
	  */
	public cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoSelect.Output selectDemo(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoSelect.Input input);
	
	 /**
	  * 查询示例
	  */
	public static interface DemoSelect {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoSelect.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Input {
 	
	 /**
	  * 职工号
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="职工号")
		public Long getUserno();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoSelect.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 职工号
	  */
		public void setUserno(Long userno);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoSelect.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	 /**
	  * 输出参数
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="输出参数")
		public cn.sunline.edsp.busi.MyDemo.type.MyComplexType.MyComplexInfo getField();
	 /**
	  * 输出参数
	  */
		public void setField(cn.sunline.edsp.busi.MyDemo.type.MyComplexType.MyComplexInfo field);
		
		public String toString();
	

	}
	
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="DemoSelect.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
	}
}


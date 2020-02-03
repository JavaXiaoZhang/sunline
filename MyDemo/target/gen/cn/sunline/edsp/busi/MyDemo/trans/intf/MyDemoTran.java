
package cn.sunline.edsp.busi.MyDemo.trans.intf;
import cn.sunline.edsp.international.constant.InternationalConstantDef;
import cn.sunline.ltts.core.api.lang.IString;
import cn.sunline.ltts.core.api.lang.Params;

@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
public interface MyDemoTran {
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyDemoTran.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
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
	 /**
	  * 发薪日期
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="发薪日期")
		public String getPay_day();
	 /**
	  * 是否发薪
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="是否发薪")
		public String getPay_state();
	 /**
	  * 系统标识号
	  */
		@cn.sunline.ltts.frw.model.annotation.Element(longname="系统标识号")
		public String getSystem_code();
		public String toString();
	

	}
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyDemoTran.Input", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface InputSetter extends Input {
	 /**
	  * 职工号
	  */
		public void setUserno(Long userno);
	 /**
	  * 薪资
	  */
		public void setSalary(java.math.BigDecimal salary);
	 /**
	  * 发薪日期
	  */
		public void setPay_day(String pay_day);
	 /**
	  * 是否发薪
	  */
		public void setPay_state(String pay_state);
	 /**
	  * 系统标识号
	  */
		public void setSystem_code(String system_code);
	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyDemoTran.Output", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Output {
 	
	

	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyDemoTran.Property", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Property {
 	
	

	}
	
	@cn.sunline.ltts.frw.model.annotation.Index
	@cn.sunline.ltts.frw.model.annotation.ConfigType(value="MyDemoTran.Printer", type=cn.sunline.ltts.frw.model.annotation.ConfigType.Type.javaBean)
	public static interface Printer {
 	
	

	}
	
}


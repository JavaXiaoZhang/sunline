
package cn.sunline.edsp.busi.MyDemo.type;
import cn.sunline.edsp.international.constant.InternationalConstantDef;
import cn.sunline.ltts.core.api.lang.IString;
import cn.sunline.ltts.core.api.lang.Params;
	 /**
	  * 枚举类型示例
	  * 枚举类型示例
	  */

@cn.sunline.ltts.frw.model.annotation.Generated
@cn.sunline.ltts.frw.model.annotation.Index
public interface MyEnum {
	 /**
	  * 是否支付工资
	  */
		public static enum  E_ISPAID implements cn.sunline.ltts.core.api.model.dm.internal.DefaultEnum<String>{
			 /**
			  * 0 - 未支付
			  */
			state_0("state_0","0","未支付"),
			 /**
			  * 1 - 已支付
			  */
			state_1("state_1","1","已支付");
			private E_ISPAID(String __id__ ,String __value__,String __longName__){
				this.__id__ = __id__;
				this.__value__ = __value__;
				this.__longName__ = __longName__;
				this.KEY="MyEnum.E_ISPAID."+__id__+".longname";
			}
			
			private String __id__;
			private String __value__;
			private String __longName__;
			private final String KEY;
			public String getId(){
				return this.__id__;
			}
			
			public String getValue(){
				return this.__value__;
			}
			
			public String getLocalLongName() {
				return new IString(KEY,__longName__).getLocalString();
			}
			
			public String getLongName() {
				return new IString(KEY,__longName__).getString();
			}
			
			public String toString(){
				return String.valueOf(this.__value__);
			} 
			
			public static boolean isIn(Object value){
				return cn.sunline.ltts.biz.global.CommUtil.isInEnum(cn.sunline.edsp.busi.MyDemo.type.MyEnum.E_ISPAID.class, value);
			}
			
			public static E_ISPAID get(Object value){
				return cn.sunline.ltts.biz.global.CommUtil.toEnum(cn.sunline.edsp.busi.MyDemo.type.MyEnum.E_ISPAID.class, value);
			}
			
		}

}


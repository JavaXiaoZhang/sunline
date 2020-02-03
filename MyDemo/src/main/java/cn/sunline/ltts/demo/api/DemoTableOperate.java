package cn.sunline.ltts.demo.api;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import cn.sunline.edsp.busi.MyDemo.errors.MyError.ErrorDemo;
import cn.sunline.edsp.busi.MyDemo.tables.MyTable.T_demoDao;
import cn.sunline.edsp.busi.MyDemo.tables.MyTable.t_demo;
import cn.sunline.ltts.biz.global.SysUtil;

public class DemoTableOperate {
	/**
	 * @param input
	 *            输入参数与服务中insertT_demoInfo方法的输入参数相同
	 */
	public static void insert(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoInsert.Input input) {
		// 获取到表对象t_demo的实例
		t_demo t_demo = SysUtil.getInstance(t_demo.class);

		// 给实例赋值
		t_demo.setUserno(input.getField().getUserno());
		t_demo.setSalary(input.getField().getSalary());
		// 判断日期格式是否正确
		String pay_day = input.getField().getPay_day();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		try {
			simpleDateFormat.parse(pay_day);
		} catch (ParseException e) {
			// 日期格式错误，则抛出之前定义的E0003错误
			throw ErrorDemo.E0003(pay_day);
		}
		t_demo.setPay_day(pay_day);
		t_demo.setPay_state(input.getField().getPay_state());
		t_demo.setSystem_code(input.getField().getSystem_code());
		// T_demoDao是创建表文件时自动生成的Dao类，包含odbindex中勾选的dao操作
		T_demoDao.insert(t_demo);
	}

	/**
	 * @param input	输入参数与服务中insertT_demoInfo方法的输入参数相同
	 * @return 
	 */
	public static t_demo select(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoSelect.Input input) {
		Long userno = input.getUserno();
		if (userno == null) {
			throw ErrorDemo.E0002(userno); // 抛出查询条件不能为空异常
		}
		try {
			t_demo demo = T_demoDao.selectOne_odb1(userno, true);	//不存在记录时是否抛出异常，true为抛出，false为不抛出
			return demo;
		} catch (Exception e) {
			throw ErrorDemo.E0001(); // 抛出数据不存在异常
		}
	}

	/**
	 * @param input
	 *            输入参数与服务中updateT_demoInfo方法的输入参数相同
	 */
	public static void update(final cn.sunline.edsp.busi.MyDemo.servicetype.MyService.DemoUpdate.Input input) {
		// 做更新操作的时候必须先查出来，然后在更新到数据库，这样可以保证数据的一致性。
		Long userno = input.getUserno();
		BigDecimal salary = input.getSalary();
		// 先把数据查询出来
		if (userno == null) {
			throw ErrorDemo.E0002(userno); // 抛出查询条件不能为空异常
		}
		t_demo demo = T_demoDao.selectOne_odb1(userno, true);
		if (demo == null) {
			throw ErrorDemo.E0001(); // 抛出数据不存在异常
		}
		// 再对数据做修改
		demo.setSalary(salary);
		// 将修改写入数据库中
		T_demoDao.updateOne_odb1(demo);
	}
}

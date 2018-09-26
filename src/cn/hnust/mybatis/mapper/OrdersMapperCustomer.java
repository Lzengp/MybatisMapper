package cn.hnust.mybatis.mapper;

import java.util.List;

import cn.hnust.mybatis.po.Orders;
import cn.hnust.mybatis.po.OrdersCustomer;
import cn.hnust.mybatis.po.User;

/**
 * OrdersMapperCustomer接口
 * @author 龙伟
 * 2018年8月1日
 */
public interface OrdersMapperCustomer {
	//用resultType实现一对一映射查询
	public List<OrdersCustomer> findOrderUser() throws Exception;
	
	//用resultMap实现一对一映射查询
	public  List<Orders>  findOrderUserResultMap() throws Exception;
	
	//用resultMap实现一对多映射查询
	public  List<Orders>  findOrdersAndOrderdetailResultMap() throws Exception;
	
	//用resultMap实现多对多映射查询
	public  List<User>  findUserAndItemsResultMap() throws Exception;
}

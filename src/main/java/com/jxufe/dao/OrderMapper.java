package com.jxufe.dao;

import java.util.List;

import com.jxufe.entity.Order;
import com.jxufe.entity.OrderItem;

public interface OrderMapper {

	public void addOrder(Order order);
	public void addOrderItem(OrderItem orderItem);
	public int findCountByUid(int uid);
	public List<Order> findPageByUid(int uid, int begin, int count);
	public Order findByOid(int oid);
	public List<OrderItem> getOrderItems(int oid);
	public void update(String oid, String username, String phone, String addr);
	public void updateState(String oid);
}

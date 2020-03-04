package com.example.ecommerce_d.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce_d.domain.Order;
import com.example.ecommerce_d.repository.OrderRepository;

@Service
public class OrderConfirmService {

	@Autowired
	private OrderRepository orderRepository;

	/**
	 * 
	 * 注文情報を取得する.
	 * 
	 * @param userId ユーザーid
	 * @return 注文リスト
	 */
	public List<Order> showOrderedList(Integer userId) {
		List<Order> orderList = orderRepository.findByUserIdAndStatus(userId, 0);
		return orderList;
	}

}

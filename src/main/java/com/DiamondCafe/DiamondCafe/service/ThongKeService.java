package com.DiamondCafe.DiamondCafe.service;

import com.DiamondCafe.DiamondCafe.bean.ThongKe;

public interface ThongKeService {

	ThongKe ThongKeNgay(int day);
	
	ThongKe ThongKeThang(int month);
	
//	ThongKe ThongKeQuy(int quarter);
	
}

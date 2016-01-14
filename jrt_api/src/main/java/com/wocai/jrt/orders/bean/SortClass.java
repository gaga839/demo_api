package com.wocai.jrt.orders.bean;

import java.util.Comparator;
import java.util.Date;

import com.wocai.jrt.investor.bean.InvestorCountBean;

public class SortClass implements Comparator<InvestorCountBean>{
	
	public int compare(InvestorCountBean o, InvestorCountBean ot) {
		Date d1 = o.getDate();
		Date d2 = ot.getDate();
		if (d1 == null && d2 == null)
			return 0;
		if (d1 == null)
			return -1;
		if (d2 == null)
			return 1;
		return  d1.compareTo(d2);
	}
}

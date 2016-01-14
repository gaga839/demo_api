package com.wocai.jrt.employee.bean;

import java.util.Comparator;

public class GroupRankingComparator implements Comparator<GroupRanking> {
	@Override
	public int compare(GroupRanking o1, GroupRanking o2) {
		if(o1.getOrdersAmount()-o2.getOrdersAmount() > 0){
			return -1;
		}else {
			return 1;
		}
	}
}

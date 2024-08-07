package com.green.Shop.admin.service;


import com.green.Shop.item.vo.CategoryVO;
import com.green.Shop.item.vo.ItemVO;

import java.util.List;

public interface AdminService {
    //카테고리 목록 조회
    List<CategoryVO> getCategoryList();

    //상품 등록
    void itemList(ItemVO itemVO);
}

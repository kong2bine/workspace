package com.green.Shop.item.service;

import com.green.Shop.item.vo.ItemVO;

import java.util.List;

public interface ItemService {
    //상품 목록 조회
    List<ItemVO> getItemList();
}

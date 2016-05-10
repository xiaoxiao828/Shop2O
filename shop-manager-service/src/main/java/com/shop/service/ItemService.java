package com.shop.service;

import com.shop.pojo.TbItem;

import java.util.List;

/**
 * Created by xiao.lai on 16/5/4.
 */
public interface ItemService {

    TbItem getItemById(Long itemId);


    List<TbItem> getItemList(Long itemId);

}

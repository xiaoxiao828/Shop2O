package com.shop.service.impl;

import com.shop.mapper.TbItemMapper;
import com.shop.pojo.TbItem;
import com.shop.pojo.TbItemExample;
import com.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xiao.lai on 16/5/4.
 */
@Service
public class ItemServiceImpl implements ItemService{


    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list!=null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<TbItem> getItemList(Long itemId) {
        TbItemExample example = new TbItemExample();
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
       /* example.
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list!=null && list.size() > 0) {
            return list.get(0);
        }
        itemMapper.selectByExample()*/
        return null;
    }

}
